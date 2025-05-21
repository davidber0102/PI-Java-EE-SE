package es.pildorasinformaticas.servletPruebas;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class RegistroUsuarios
 */
@WebServlet("/RegistroUsuarios")
public class RegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Especificamos formato de respuesta
			PrintWriter salida = response.getWriter();
		// generar respuesta de la peticion
			salida.println("<html><body>");
			salida.println("<h1 style= 'text-align: center'> Formulario</h1>");
			salida.println("Nombre Introducido: " + request.getParameter("nombre"));
			salida.println("<br> <br> ");
			salida.println("Apellido Introducido: " + request.getParameter("apellido"));
			salida.println("<br> <br> ");
			salida.println(" ");
			salida.println(" Fecha y hora actual: " + new Date());
			salida.println("</body> </html>");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
