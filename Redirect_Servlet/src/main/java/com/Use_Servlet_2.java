package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Use_Servlet_2 extends HttpServlet{
		@Override
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
		{
			HttpSession hs=req.getSession();
			int sum=(int)hs.getAttribute("key1");
			PrintWriter writer = res.getWriter();
			writer.print(sum);
		}
}