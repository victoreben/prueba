package net.rc.presentacion;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* @author Roberto Crespo
*
*/

public class SaludoServlet extends HttpServlet
{     

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
     
	      PrintWriter out = resp.getWriter();
	      out.println("<html>");
	      out.println("<body>");
	      out.println("Hello World Servlet");
	      out.println("</body>");
	      out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("entra en el dopost");
			processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			System.out.println("Hola Roberto");
	}
}