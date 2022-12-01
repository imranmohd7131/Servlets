package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Use_Servlet_1  extends HttpServlet{
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		int sum=a+b;
		HttpSession hs=req.getSession();
		hs.setAttribute("key1", sum);
		res.sendRedirect("redirecting");
	}
}
