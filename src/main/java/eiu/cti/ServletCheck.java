
package eiu.cti;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Check", urlPatterns = { "/check" }, loadOnStartup = 1)
public class ServletCheck extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			response.setContentType("text/plain");

			StringBuilder reqCookies = new StringBuilder();

			Cookie ck[] = request.getCookies();
			if (ck != null) {
				for (int i = 0; i < ck.length; i++) {
					reqCookies.append(ck[i].getName() + "; ");
					}
			} else {
				reqCookies.append("No cookies");
			}
			
			// CookieHeader.
			// createSetCookieHeader(response,
			// "servlet1", "servlet1 cookie",
			// "www.tanbinhtech.com", "/", "None",
			// false, false, 900);
			response.addHeader("Access-Control-Allow-Credentials", "true");
			// response.addHeader("Access-Control-Allow-Origin", "*");
			// Cross-Origin Request Blocked: The Same Origin Policy disallows reading the
			// remote resource at ‘https://www.tanbinhtech.com/cookietester/check’.
			// (Reason: Credential is not supported if the CORS header
			// ‘Access-Control-Allow-Origin’ is ‘*’).
			response.addHeader("Access-Control-Allow-Origin", "http://localhost:8080");

			PrintWriter writer = response.getWriter();
			// writer.println(Integer.valueOf(ck.length) + reqCookies.toString());
			writer.println(reqCookies.toString());
		} catch (Exception e) {
			PrintWriter writer = response.getWriter();
			writer.println(e.toString());
		}
	}

}
