package eiu.cti;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet3", urlPatterns = { "/servlet3" }, loadOnStartup = 1)
public class Servlet3 extends HttpServlet {


	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			response.setContentType("text/html");
			//CookieHeader.createSetCookieHeader(response, "servlet3", "servlet3", "www.tanbinhtech.com", "/",
			//		"Strict", true, false, 900);
			response.setHeader("Set-Cookie", "cookie3=cookie3;Domain=www.tanbinhtech.com;Path=/cookietester;SameSite=Strict; Secure;Max-Age=6000;");
			
			response.addHeader("Access-Control-Allow-Credentials", "true");
			response.addHeader("Access-Control-Allow-Origin", "http://localhost:8080");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}