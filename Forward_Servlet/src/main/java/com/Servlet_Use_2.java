package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_Use_2 extends HttpServlet{
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int sum=(int) req.getAttribute("key1");
		PrintWriter pw=res.getWriter();
		pw.print(sum);
	}
}
