package es.pildorasinformaticas.servletPruebas;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Servlet implementation class PrimerServlet
 */
@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimerServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());/
			// Especificamos formato de respuesta
				PrintWriter salida = response.getWriter();
			// generar respuesta de la peticion
				salida.println("<html><body>");
				salida.println("<h1 style= 'text-align: center'> Pruebas Servlet </h1>");
				salida.println(" ");
				salida.println(" ");
				salida.println(" ");
				salida.println(" Fecha y hora actual: " + new Date());
				salida.println("</body> </html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		response.setContentType("text/html");
		// Especificamos formato de respuesta
			PrintWriter salida = response.getWriter();
		// generar respuesta de la peticion
			salida.println("<html><body>");
			salida.println("<h1 style= 'text-align: center'> Pruebas Servlet </h1>");
			salida.println(" ");
			salida.println(" ");
			salida.println(" ");
			salida.println(" Fecha y hora actual: " + new Date());
			salida.println("</body> </html>");
	}

}
