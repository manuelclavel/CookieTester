package eiu.cti;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet2", urlPatterns = { "/servlet2" }, loadOnStartup = 1)
public class Servlet2 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		try {
			response.setContentType("text/html");
			//CookieHeader.createSetCookieHeader(response, "servlet2", "servlet2 cookie", "www.tanbinhtech.com", "/",
			//		"Lax", true, false, 900);
			response.setHeader("Set-Cookie", "cookie2=cookie2 cookie; Domain=www.tanbinhtech.com; Path=/cookietester; SameSite=Lax; Secure; Max-Age=600;");
			
			response.addHeader("Access-Control-Allow-Credentials", "true");
			response.addHeader("Access-Control-Allow-Origin", "http://localhost:8080");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}