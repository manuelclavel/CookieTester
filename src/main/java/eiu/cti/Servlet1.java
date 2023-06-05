package eiu.cti;

import java.io.IOException;
import java.io.PrintWriter;

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

public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{  
	
	 // Set response content type
    response.setContentType("text/html");
 
    try{  
 
  
    	//response.addHeader("Access-Control-Allow-Origin", "*");
		CookieHeader.createSetCookieHeader(response, "servlet1", "servlet1 cookie", "www.tanbinhtech.com", "/", "None", false, false, 900);
    	response.addHeader("Access-Control-Allow-Credentials", "true");
    	//httpServletResponse.addHeader("Access-Control-Allow-Origin", "*");
    	//httpServletResponse.addHeader("Access-Control-Allow-Origin", "https://localhost:8443");
    	response.addHeader("Access-Control-Allow-Origin", "https://localhost:8080");
        }catch(Exception e){
        	System.out.println(e);}  
  } 
  
}