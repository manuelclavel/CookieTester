
package eiu.cti;

import java.io.IOException;
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
			for (int i = 0; i < ck.length; i++) {
				if (ck[i].getName().equals("servlet1")) {
					reqCookies.append("servlet1;");
				} else if (ck[i].getName().equals("servlet1b")) {
					reqCookies.append("servlet1b;");
				} else if (ck[i].getName().equals("servlet2")) {
					reqCookies.append("servlet2;");
				} else if (ck[i].getName().equals("servlet3")) {
						reqCookies.append("servlet3;");
				}
			}
			
			//CookieHeader.
			//    createSetCookieHeader(response,
			//			  "servlet1", "servlet1 cookie",
			//			  "www.tanbinhtech.com", "/", "None",
			//			  false, false, 900);
			response.addHeader("Access-Control-Allow-Credentials", "true");
			//response.addHeader("Access-Control-Allow-Origin", "*");
			//Cross-Origin Request Blocked: The Same Origin Policy disallows reading the remote resource at ‘https://www.tanbinhtech.com/cookietester/check’. 
			//	(Reason: Credential is not supported if the CORS header ‘Access-Control-Allow-Origin’ is ‘*’).
			response.addHeader("Access-Control-Allow-Origin",
					   "http://localhost:8080");
			
			Writer writer = response.getWriter();
			writer.write(reqCookies.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
