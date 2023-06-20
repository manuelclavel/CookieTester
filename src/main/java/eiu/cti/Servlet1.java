



package eiu.cti;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet1", urlPatterns = { "/servlet1" }, loadOnStartup = 1)
public class Servlet1 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		try {
			response.addHeader("Access-Control-Allow-Credentials", "true");
			// response.addHeader("Access-Control-Allow-Origin", "*");
			response.addHeader("Access-Control-Allow-Origin", "http://localhost:8080");
			response.setHeader("Set-Cookie", "servlet1=servlet1; Domain=www.tanbinhtech.com; Path=/cookietester; SameSite=None; Max-Age=600;");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
