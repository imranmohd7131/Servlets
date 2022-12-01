package comm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/redirecting")
public class Servlet2 extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		Cookie[] c1=req.getCookies();
		int age=0;
		for(Cookie c: c1)
		{
			if(c.getName().equals("k1"))
			{
				age=Integer.parseInt(c.getValue());
			}
		}
		PrintWriter pw=res.getWriter();
		pw.print("your age is "+age);
		
	}

}
