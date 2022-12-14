package org.btm.PentagonSpaceApp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/cp")
public class ClothProduct extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException
	{
			//fetch context parameter//
			ServletContext ctx=getServletContext();
			String offmsg=ctx.getInitParameter("ofm");
			String offper=ctx.getInitParameter("ofp");
			//fetch context object back from the scope//
			Product p=(Product)ctx.getAttribute("prd");
			PrintWriter out=resp.getWriter();
			out.println("<html><body bgcolor='orange' "
					+ "<h1>Cloth Product Details</h1><p>"
					+ offmsg+" "+offper+"% Discount "
							+ "<br><a href=\"Product.html\">Back</a>"+" "
							+"</body></html>");
	out.flush();
	out.close();
	}

}
