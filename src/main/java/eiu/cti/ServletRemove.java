package eiu.cti;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletRemove", urlPatterns = { "/remove" }, loadOnStartup = 1)
public class ServletRemove extends HttpServlet {


	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			response.addHeader("Access-Control-Allow-Credentials", "true");
			response.addHeader("Access-Control-Allow-Origin", "http://localhost:8080");
			response.addHeader("Set-Cookie",
					"cookie1=cookie1;Domain=www.tanbinhtech.com;Path=/cookietester;SameSite=None;Max-Age=0;");
			response.addHeader("Set-Cookie",
					"cookie1b=cookie1b;Domain=www.tanbinhtech.com;Path=/cookietester;SameSite=None;Secure;Max-Age=0;");
			response.addHeader("Set-Cookie",
					"cookie2=; Max-Age=0;");
			response.addHeader("Set-Cookie",
					"cookie3=; Max-Age=0;");
			response.addHeader("Set-Cookie",
					"cookie2lk=; Max-Age=0;");
			response.addHeader("Set-Cookie",
					"cookie3lk=;Max-Age=0;");
			// response.addCookie(cookie);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
