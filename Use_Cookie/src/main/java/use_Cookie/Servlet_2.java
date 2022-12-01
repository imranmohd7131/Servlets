package use_Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class Servlet_2 extends HttpServlet{

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie[] cookies =req.getCookies();
		int age = 0;
		String n="";
		for(Cookie c : cookies) {
			if(c.getName().equals("key2")) {
				//n=c.getValue();
				age =Integer.parseInt(c.getValue());
			}
		}
		for(Cookie c : cookies) {
			if(c.getName().equals("key1")) {
				n=c.getValue();
				//age =Integer.parseInt(c.getValue());
			}
		}
		
		PrintWriter writer = res.getWriter();
		writer.print("Your name is :"+n);
		writer.print("Your age is :"+age);
		
	}
}
