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
	PrintWriter out = null;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
     
		 processRequest(req, resp);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			System.out.println("Procesando petición.. ");
			String txtNombre = request.getParameter("txtNombre");


			  out = response.getWriter();
			  response.setContentType("text/html");
			  
			  out.println("<html>");
			  out.println("<body>");
			  out.println("<br>");
			  out.println("Hello " + txtNombre);			  
			  out.println("</body>");
			  out.println("</html>");

	}
}