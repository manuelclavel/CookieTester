package eiu.cti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet2lk", urlPatterns = { "/servlet2lk" }, loadOnStartup = 1)
public class Servlet2lk extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		try {
			response.setContentType("text/plain");
			//CookieHeader.createSetCookieHeader(response, "servlet2", "servlet2 cookie", "www.tanbinhtech.com", "/",
			//		"Lax", true, false, 900);
			response.setHeader("Set-Cookie", "servlet2=servlet2; Domain=www.tanbinhtech.com; Path=/cookietester; SameSite=Lax; Secure; Max-Age=600;");
			
			response.addHeader("Access-Control-Allow-Credentials", "true");
			response.addHeader("Access-Control-Allow-Origin", "http://localhost:8080");
			
			response.setContentType("text/plain");

			StringBuilder reqCookies = new StringBuilder();

			Cookie ck[] = request.getCookies();
			if (ck != null) {
				for (int i = 0; i < ck.length; i++) {
					//reqCookies.append("Some cookies: ");
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
			} else {
				reqCookies.append("No cookies");
			}
			PrintWriter writer = response.getWriter();
			// writer.println(Integer.valueOf(ck.length) + reqCookies.toString());
			writer.println(reqCookies.toString());

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}