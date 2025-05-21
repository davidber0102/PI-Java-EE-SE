package com.pildorasinformaticas.productos;

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import javax.sql.DataSource;

/**
 * Servlet implementation class ControladorProductos
 */
@WebServlet("/ControladorProductos")
public class ControladorProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
		private ModeloProductos modelProductos;
		
		// Definir o establecer el SataSource
				@Resource(name = "jdbc/Productos")				
			// se declarsa la varible de tipo DataSource para alamcenar 
					private DataSource miPool;  
	@Override
	public void init() throws ServletException {
					// TODO Auto-generated method stub
					super.init();
					try {
						modelProductos = new ModeloProductos(miPool);
					}catch(Exception e) {
						e.printStackTrace();
						throw new ServletException(e);
					}
				}

	/**	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());	
		
		// leer el parametro que llega del formulario
		String elComando = request.getParameter("instruccion");
		
		// si no se envia el parametro, listar productos
		if(elComando == null) elComando="listar";
		
		/// redirigiri el flujo de ejecucion al metodo adecuado
		switch(elComando) {
			case "listar":
				obtenerProductos(request, response);
				break;
			case "insertarBBDD":
				agregarProductos(request, response);
				break;
				
			case "cargar":
					try {
						caragPrpductos(request, response);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				break;
				
			case "actualizarBBDD":
					try {
						actualizaProductos(request, response);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				break;
				
			case "eliminar":
					try {
						eliminarProducto(request, response);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				break;
			default:
				obtenerProductos(request, response);
		}	
	}

	private void eliminarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// capturar el codigo articulo
			String CodArticulo = request.getParameter("CArticulo");
		
		// borrar producto de la bdd
			modelProductos.eliminarProducto(CodArticulo);
		
		//vover a la lista de productos
			obtenerProductos(request, response);
			
	// video 263 minuto 13 
			
			
	}

	private void actualizaProductos(HttpServletRequest request, HttpServletResponse response) throws Exception {
			// leer los datos que le viene del formulario actualizar
				String CodArticulo = request.getParameter("CArt");
				String seccion = request.getParameter("seccion");
				String NombreArticulo = request.getParameter("nomArt");
				double Precio = Double.parseDouble(request.getParameter("precioArt"));
				String Fecha = request.getParameter("fecha");		
				String Importado = request.getParameter("importado");
				String PaisOrigen = request.getParameter("pOrigen");
		
			// crear un objeto de tipo Producto cpon la info del formulario
				Productos ProductoActualizar = new Productos(CodArticulo, seccion, NombreArticulo, Precio, Fecha, Importado,PaisOrigen);	
		
			// actualizar la BBBDcon la infor del obj Producto
				modelProductos.actualizarProducto(ProductoActualizar);
		
			// Volver al listado con la infor actualizada
				obtenerProductos(request, response);
		
	}

	private void caragPrpductos(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// leer el cod articulo que viene del listado
			String codigoArticulo = request.getParameter("CArticulo");
		
		
		//  Enviar c articulo a modelo
			Productos elProducto = modelProductos.getProducto(codigoArticulo);
			
		
		// Colocar atributo correpsondiete al c articulo
			request.setAttribute("ProductoActualizar", elProducto);
		
		    
		// enviar Producto al formulario de actualizar(jsp)
			RequestDispatcher disP2 = request.getRequestDispatcher("/actualizarProductro.jsp");
			disP2.forward(request, response);	
	}

	private void agregarProductos(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		// leer la informacion del producto que viene del formulario
		String CodArticulo = request.getParameter("CArt");
		String seccion = request.getParameter("seccion");
		String NombreArticulo = request.getParameter("nomArt");
		double Precio = Double.parseDouble(request.getParameter("precioArt"));
		String Fecha = request.getParameter("fecha");		
		String Importado = request.getParameter("importado");
		String PaisOrigen = request.getParameter("pOrigen");
		
		// creaer un objeto de tipo Producto
		Productos nuevoProducto = new Productos(CodArticulo, seccion, NombreArticulo, Precio, Fecha, Importado,PaisOrigen);
		
		// enviar el objeto al modelo y despues inertar el objeto Porducto en la BBDD
		try {
			modelProductos.agregarElNuevoProducto(nuevoProducto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// volver a listar de Productos
			obtenerProductos(request, response);
	}

	private void obtenerProductos(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//  ----------------obtener la lista de productos desde el modelo--------------
		List<Productos> productos;
		try {
			productos = modelProductos.getProductos();		
		
		// ------------------ agregar lista de productos al request
			request.setAttribute("LISTAPRODUCTOS", productos);
		
		// ------------------- enviar ese reques a la pagina JSP
			RequestDispatcher disp = request.getRequestDispatcher("/ListaProductos.jsp");
			disp.forward(request, response);			
		} catch(Exception e) {
			e.printStackTrace();		
		}
	}
}
