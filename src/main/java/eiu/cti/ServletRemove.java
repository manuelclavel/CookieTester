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
					"cookie2=cookie2; Domain=www.tanbinhtech.com;Path=/cookietester;SameSite=Lax;Secure;Max-Age=0;");
			response.addHeader("Set-Cookie",
					"cookie3=cookie3lk;Domain=www.tanbinhtech.com;Path=/cookietester;SameSite=Strict;Secure;Max-Age=0;");
			response.addHeader("Set-Cookie",
					"cookie2lk=cookie2lk;Domain=www.tanbinhtech.com;Path=/cookietester;SameSite=Lax;Secure;Max-Age=0;");
			response.addHeader("Set-Cookie",
					"cookie3lk=cookie3lk;Domain=www.tanbinhtech.com;Path=/cookietester;SameSite=Strict;Secure;Max-Age=0;");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
