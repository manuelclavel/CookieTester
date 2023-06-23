package eiu.cti;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRemove {
	
	@WebServlet(name = "ServletRemove", urlPatterns = { "/remove" }, loadOnStartup = 1)
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
				response.setHeader("Set-Cookie", "cookie1=cookie1; Domain=www.tanbinhtech.com; Path=/cookietester; Max-Age=0;");
				response.setHeader("Set-Cookie", "cookie1b=cookie1b; Domain=www.tanbinhtech.com; Path=/cookietester; Max-Age=0;");
				response.setHeader("Set-Cookie", "cookie2=cookie2; Domain=www.tanbinhtech.com; Path=/cookietester; Max-Age=0;");
				response.setHeader("Set-Cookie", "cookie3=cookie3; Domain=www.tanbinhtech.com; Path=/cookietester; Max-Age=0;");
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
