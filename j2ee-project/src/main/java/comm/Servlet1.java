package comm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/send")
public class Servlet1 extends HttpServlet{
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
//		PrintWriter write=res.getWriter();
		int age=Integer.parseInt(req.getParameter("age"));
		String name=req.getParameter("username");
		Cookie c=new Cookie("k1",age+"");
		res.addCookie(c);
		res.sendRedirect("redirecting");
		/*RequestDispatcher rd=req.getRequestDispatcher("views/first.jsp");
		rd.forward(req, res);*/
	}
	

}
