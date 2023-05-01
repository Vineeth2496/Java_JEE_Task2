

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class servletamazon extends GenericServlet {
		
		String driver, URL, User_name, Pass;
		public void init(ServletConfig sc)
		{
			ServletContext ct=sc.getServletContext();
			driver=ct.getInitParameter("driver");
			URL=ct.getInitParameter("URL");
			User_name=ct.getInitParameter("User_name");
			Pass=ct.getInitParameter("Pass");
			
		}
	
	
		public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
			String f=request.getParameter("f");
			String l=request.getParameter("l");
			String user=request.getParameter("user");
			String pass=request.getParameter("pass");
			String phno=request.getParameter("phno");
			String email=request.getParameter("email");
			
			PrintWriter out=response.getWriter();
		
			if(user!=pass)
			{
				out.println("Registration Sucessfull");
				out.println("Driver		:	"+driver);
				out.println("URL		:	"+URL);
				out.println("Username	:	"+User_name);
				out.println("Password	:	"+Pass);
			}
			else
			{
				out.println("Username & Password should not be same");
			}

		}
		
		public void destroy()
		{
			
		}
		
		
}
