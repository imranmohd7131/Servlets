package use_Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/send")
public class Servlet_1 extends HttpServlet{

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int age=Integer.parseInt(req.getParameter("age"));
		String name=req.getParameter("username");
		
		/*PrintWriter writer = res.getWriter();
		if(age>18)
		{
			writer.print(name+"you cast your vote");
		}else
		{
			writer.print(name+"you cannot cast your vote");	
		}*/
		
		Cookie cookie1=new Cookie("key1",name);
		Cookie cookie2=new Cookie("key2",age+"");
		res.addCookie(cookie1);
		res.addCookie(cookie2);
		res.sendRedirect("redirect");
		/*RequestDispatcher dispatcher = req.getRequestDispatcher("views/first.jsp");
		dispatcher.forward(req, res);*/
	}
	
}
