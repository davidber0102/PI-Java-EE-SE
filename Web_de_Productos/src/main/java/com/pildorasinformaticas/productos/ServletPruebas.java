package com.pildorasinformaticas.productos;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.sql.DataSource;
import java.sql.*;


/**
 * Servlet implementation class ServletPruebas
 */
@WebServlet("/ServletPruebas")
public class ServletPruebas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// Definir o establecer el SataSource
		@Resource(name = "jdbc/Productos")
		
	// se declarsa la varible de tipo DataSource para alamcenar 
			private DataSource miPool;       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPruebas() {
        super();
        // TODO Auto-generated constructor stub 
        // auth="Container"
         }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Crear objeto prinwriter
			PrintWriter salida = response.getWriter();
			response.setContentType("text/plain");
		// crear conexion con BBDD
				Connection miConex = null;
				Statement st = null;
				ResultSet res = null;
				
				try {
					miConex= miPool.getConnection();
					String sql = "SELECT * FROM PRODUCTOS";
					st = miConex.createStatement();
					
					res = st.executeQuery(sql);
					
					while(res.next()) {
						String nombre_articulo = res.getString(3);
						salida.println(nombre_articulo);
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
