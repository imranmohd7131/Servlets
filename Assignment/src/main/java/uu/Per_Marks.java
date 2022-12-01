package uu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Per_Marks extends HttpServlet{
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession session=req.getSession();
		int sum=(int)session.getAttribute("key1");
		PrintWriter writer = res.getWriter();
		writer.print(sum);
		
		double dd=sum*100/500;
		//HttpSession session2=req.getSession();
		//double per=(double) session.getAttribute("key1")*100/500;
		session.setAttribute("key2", dd);
		res.sendRedirect("redirecting2");
	}
}
