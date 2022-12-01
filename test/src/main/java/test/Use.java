package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/send")
public class Use extends HttpServlet{

	@Override
	public void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String s=arg0.getParameter("num1");
		PrintWriter writer = arg1.getWriter();
		writer.print("hello"+s);
	}
	
}
