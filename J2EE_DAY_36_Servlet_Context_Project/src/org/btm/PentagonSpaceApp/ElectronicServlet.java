package org.btm.PentagonSpaceApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/ep")
public class ElectronicServlet extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException
	{
		//fetch context Parameter//
		ServletContext ctx=getServletContext();
		String offmsg=ctx.getInitParameter("ofm");
		String offper=ctx.getInitParameter("ofp");
		Product p=new Product();
		//Add Context Object Into Scope//
		ctx.setAttribute("prd", p);
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='green' "
				+ "<h1>Electronic Product details</h1><p> "
				+ offmsg+" "+offper+"% Discount"
				+ "<br><a href=\"Product.html\">Back</a>"+" "
						+ "</body></html>");
		out.flush();
		out.close();
	}
}
