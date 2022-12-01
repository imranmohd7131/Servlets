package uu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Sum_Subjects extends HttpServlet{
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		int c=Integer.parseInt(req.getParameter("num3"));
		int d=Integer.parseInt(req.getParameter("num4"));
		int e=Integer.parseInt(req.getParameter("num5"));
		int sum=a+b+c+d+e;
		HttpSession session=req.getSession();
		session.setAttribute("key1", sum);
		res.sendRedirect("redirecting");
	}
}
