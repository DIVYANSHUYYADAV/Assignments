Forwarding Request and response in same Context

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ForwardingServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			RequestDispatcher rd=request.getRequestDispatcher("ForwardedServ");
			rd.forward(request,response);
		}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}
}

===========================================================================================================================================================

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ForwardedServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			
			PrintWriter pw=response.getWriter();
			pw.println("In ForwardedServlet");
		}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}
}













