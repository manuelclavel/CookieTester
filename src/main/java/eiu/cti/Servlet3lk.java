package eiu.cti;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet3lk", urlPatterns = { "/servlet3lk" }, loadOnStartup = 1)
public class Servlet3lk extends HttpServlet {


	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			response.setContentType("text/html");
			//CookieHeader.createSetCookieHeader(response, "servlet3", "servlet3", "www.tanbinhtech.com", "/",
			//		"Strict", true, false, 900);
			response.setHeader("Set-Cookie", "cookie3lk=cookie3lk;Domain=www.tanbinhtech.com;Path=/cookietester;SameSite=Strict;Secure;Max-Age=6000;");
			
			response.addHeader("Access-Control-Allow-Credentials", "true");
			response.addHeader("Access-Control-Allow-Origin", "http://localhost:8080");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}