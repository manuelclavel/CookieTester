package eiu.cti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;  
  
  
public class Servlet1b extends HttpServlet {  
  
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{  
	
	 // Set response content type
    response.setContentType("text/html");
 
    try{  
 
  
    	//response.addHeader("Access-Control-Allow-Origin", "*");
		CookieHeader.createSetCookieHeader(response, "servlet1b", "servlet1b cookie", "www.tanbinhtech.com", "/", "None", false, false, 900);
    	response.addHeader("Access-Control-Allow-Credentials", "true");
        }catch(Exception e){System.out.println(e);}  
  } 
  
}