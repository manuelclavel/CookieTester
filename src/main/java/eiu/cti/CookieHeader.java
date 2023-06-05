package eiu.cti;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Exposes method to create a Set-Cookie header with SameSite attributes
 * @author Ravinder
 */
public final class CookieHeader {

	public static final String DOMAIN = "Domain";
	public static final String PATH = "Path";
	public static final String SAME_SITE = "SameSite";
	public static final String SECURE = "Secure";
	public static final String HTTP_ONLY = "HttpOnly";
	public static final String MAX_AGE = "Max-Age";
	public static final String NONE = "none";
	public static final String SET_COOKIE = "Set-Cookie";
	public static final String SEPERATOR = "; ";
	public static final String ASSIGN = "=";

	public static String createSetCookieHeader(String cookieName, String cookieValue, String domain, String path,
											   String sameSite, boolean isSecure, boolean isHttpOnly, Integer maxAge) {
		/*
		String sameSiteValue = StringUtils.isBlank(sameSite) ? NONE : sameSite;
		*/
	    String sameSiteValue = sameSite;
		StringBuilder cookieString = new StringBuilder()
				.append(cookieName).append(ASSIGN).append(cookieValue).append(SEPERATOR)
				.append(DOMAIN).append(ASSIGN).append(domain).append(SEPERATOR)
				.append(PATH).append(ASSIGN).append(path).append(SEPERATOR)
				.append(SAME_SITE).append(ASSIGN).append(sameSiteValue).append(SEPERATOR);
		if (isSecure) {
			cookieString.append(SECURE + SEPERATOR);
		}
		if (isHttpOnly) {
			cookieString.append(HTTP_ONLY + SEPERATOR);
		}
		if (maxAge != null) {
			cookieString.append(MAX_AGE)
					.append(ASSIGN)
					.append(maxAge)
					.append(SEPERATOR);
		}
		
		return cookieString.toString();
	}


	public static String createSetCookieHeader(Cookie cookie, String sameSite) {
		return createSetCookieHeader(cookie.getName(), cookie.getValue(), cookie.getDomain(), cookie.getPath(),
				sameSite, cookie.getSecure(), cookie.isHttpOnly(), cookie.getMaxAge());
	}


	public static void createSetCookieHeader(HttpServletResponse httpServletResponse, Cookie cookie, String sameSite) {
		String cookieHeader = createSetCookieHeader(cookie.getName(), cookie.getValue(), cookie.getDomain(),
				cookie.getPath(), sameSite, cookie.getSecure(), cookie.isHttpOnly(), cookie.getMaxAge());

		httpServletResponse.addHeader(SET_COOKIE, cookieHeader);
	}


	public static void createSetCookieHeader(HttpServletResponse httpServletResponse, String cookieName,
											 String cookieValue, String domain, String path, String sameSite,
											 boolean isSecure, boolean isHttpOnly, Integer maxAge) {
		String cookieHeader = createSetCookieHeader(cookieName, cookieValue, domain, path, sameSite, isSecure,
				isHttpOnly, maxAge);
		httpServletResponse.addHeader(SET_COOKIE, cookieHeader);
	}
}
