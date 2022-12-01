package uu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Res_Per extends HttpServlet{
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession session=req.getSession();
		double p=(double)session.getAttribute("key2");
		PrintWriter writer = res.getWriter();
		writer.print("Percentage is : "+p);
	}
}
