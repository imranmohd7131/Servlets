package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String s2=req.getParameter("user2");
		String s1=req.getParameter("user");
		PrintWriter pw=res.getWriter();
		pw.print("Username is:"+s1);
		pw.print("passowrd is:"+s2);
	}

}
