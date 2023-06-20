package eiu.cti;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet1b", urlPatterns = { "/servlet1b" }, loadOnStartup = 1)
public class Servlet1b extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		try {
			response.setContentType("text/html");
			//CookieHeader.createSetCookieHeader(response, "servlet1b", "servlet1b cookie", "www.tanbinhtech.com", "/",
			//		"None", true, false, 900);
			
			response.setHeader("Set-Cookie", "servlet1b=servlet1b; Domain=www.tanbinhtech.com; Path=/cookietester; SameSite=None; Secure; Max-Age=600;");
			response.addHeader("Access-Control-Allow-Credentials", "true");
			response.addHeader("Access-Control-Allow-Origin", "http://localhost:8080");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}