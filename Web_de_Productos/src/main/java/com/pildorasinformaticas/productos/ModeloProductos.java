package com.pildorasinformaticas.productos;

import java.sql.*;
import java.util.*;
import java.util.Date;
import javax.sql.DataSource;

public class ModeloProductos {
	private DataSource origenDatos;
	
	public ModeloProductos(DataSource origenDatos) {
		this.origenDatos =  origenDatos;
	}
	
	public List<Productos> getProductos() throws Exception{
		
		List<Productos> productos = new ArrayList<>();
		Connection miCon = null;
		Statement miSt = null;
		ResultSet miRes = null;
		
		// -------------establecer a conexion----------------		
			miCon = origenDatos.getConnection();
		
		// -------------crear la sentencia sql  y statemet-------------------		
			String sql = "SELECT * FROM PRODUCTOS";
			miSt = miCon.createStatement();
		
		// ------------ ejecutar sql-------------------------------
			miRes = miSt.executeQuery(sql);
		
		
		// -------------------recorrer el resulset obtenido----------------------
			// CÓDIGOARTÍCULO, SECCIÓN, NOMBREARTÍCULO, PRECIO, FECHA, IMPORTADO, PAÍSDEORIGEN, FOTO
			while(miRes.next()) {
				String c_art = miRes.getString("CÓDIGOARTÍCULO");
				String seccion = miRes.getString("SECCIÓN");
				String n_art = miRes.getString("NOMBREARTÍCULO");
				double precio =miRes.getDouble("PRECIO");
				String fecha = miRes.getString("FECHA");
				String importado = miRes.getString("IMPORTADO");
				String p_orig = miRes.getString("PAÍSDEORIGEN");
				
				Productos temprod= new Productos(c_art, seccion, n_art, precio, fecha, importado, p_orig);
				productos.add(temprod);
			}
		
		return productos;
		
	}

	public void agregarElNuevoProducto(Productos nuevoProducto) throws Exception{
		// TODO Auto-generated method stub
		// obtner la conexxion con la bbddd
		 Connection miConexion = null;
		 PreparedStatement pst = null;
		 ResultSet miRes = null;
		
		
		 try {
			 miConexion = origenDatos.getConnection();
		
		// crear instruccion sql que inserte el producto .  crear la consulta preparada (statement)
		 String sqlInsert ="INSERT INTO PRODUCTOS(CÓDIGOARTÍCULO, SECCIÓN, NOMBREARTÍCULO, PRECIO, FECHA, IMPORTADO, PAÍSDEORIGEN)" + 
				 "VALUES(?, ?, ?, ?, ?, ?, ?)";
		 
		 pst = miConexion.prepareStatement(sqlInsert);
		 		 
		// establecer parametros para el producto
		 	pst.setString(1, nuevoProducto.getcArt());
		 	
		 	pst.setString(2, nuevoProducto.getSeccion());
		 	pst.setString(3, nuevoProducto.getnArt());
		 	pst.setDouble(4, nuevoProducto.getPrecio());
		 	pst.setString(5, nuevoProducto.getFecha());
		 	pst.setString(6, nuevoProducto.getImportado());
		 	pst.setString(7, nuevoProducto.getpOrigen());
		
		// ejecutar la isntruccuin sql
		 	pst.execute();
		 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 pst.close();
			 miConexion.close();
		 }
	}

	public Productos getProducto(String codigoArticulo) {
		Productos elProducto= null;		
		 Connection Conexion = null;
		 ResultSet miRes= null;
		 PreparedStatement prest = null;
		 String cArticulo =codigoArticulo;
		
		// VIDEO  260 MINIUTOT 18
		 
		// establecer la conexion con bbddd
		 try {
			 Conexion = origenDatos.getConnection();		
		
		// creaer sql que busque el producto
			 String slqBuscar = "SELECT * FROM PRODUCTOS WHERE CÓDIGOARTÍCULO = ?";
		
		// crear la consulta preparada
			 prest = Conexion.prepareStatement(slqBuscar);
			 
		//establecer los parametrros
			 prest.setString(1, cArticulo);		
		// Ejecutar consulta
			 miRes = prest.executeQuery();
		
		//obtener los datos de respues
				 if(miRes.next()) {
					 String c_art = miRes.getString("CÓDIGOARTÍCULO");
						String seccion = miRes.getString("SECCIÓN");
						String n_art = miRes.getString("NOMBREARTÍCULO");
						double precio =miRes.getDouble("PRECIO");
						String fecha = miRes.getString("FECHA");
						String importado = miRes.getString("IMPORTADO");
						String p_orig = miRes.getString("PAÍSDEORIGEN");
						
						elProducto= new Productos(c_art, seccion, n_art, precio, fecha, importado, p_orig);				 
				 } else {
					 throw new Exception("No hemos encontrado el producto con codigo articulo: " + cArticulo);
				 }			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return elProducto;
	}

	public void actualizarProducto(Productos productoActualizar) throws Exception {
		Productos ProductoActualizado= null;		
		 Connection Con2 = null;
		 ResultSet miRes2= null;
		 PreparedStatement prest2 = null;
		// establecer la vconexxion con bbdd
		 try {
		 	Con2 = origenDatos.getConnection();	
		// crear sentencia sql
		 	// Columns  CÓDIGOARTÍCULO, SECCIÓN, NOMBREARTÍCULO, PRECIO, FECHA, IMPORTADO, PAÍSDEORIGEN, FOTO
		 	 String slqActualizar = "UPDATE PRODUCTOS SET SECCIÓN= ?, NOMBREARTÍCULO =?, PRECIO=?, FECHA=?, IMPORTADO=?, PAÍSDEORIGEN=? WHERE CÓDIGOARTÍCULO = ?";
		// crear la consulta preparada
			 prest2 = Con2.prepareStatement(slqActualizar);
		// establecer los parametros
			 prest2.setString(1, productoActualizar.getSeccion());
			 prest2.setString(2, productoActualizar.getnArt());
			 prest2.setDouble(3, productoActualizar.getPrecio());
			 prest2.setString(4, productoActualizar.getFecha());
			 prest2.setString(5, productoActualizar.getImportado());
			 prest2.setString(6, productoActualizar.getpOrigen());
			 prest2.setString(7, productoActualizar.getcArt());
		
		
		// ejecutar la isntruccion sql
			 prest2.execute();
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
				prest2.close();
				Con2.close();
		 }
	}

	public void eliminarProducto(String codArticulo) throws Exception {
		// DELCARA VARIABLES
			Productos ProductoEliminar= null;		
			Connection Con3 = null;
			ResultSet miRes3= null;
			PreparedStatement prest3 = null;
		// eSTABLECER LA CONEXION CON BBDD
		try {	
			Con3 = origenDatos.getConnection();	
		
		// CREAR INSTRUCCION SQÑ DE ELIMINACION
			String slqEliminar = "DELETE FROM PRODUCTOS WHERE CÓDIGOARTÍCULO = ?";
			
		// PREPATRAR LA CONSULTA
			prest3 = Con3.prepareStatement(slqEliminar);
		
		//ESTABLECER PARAMETROS DE COSNULTA
			prest3.setString(1, codArticulo);
		
		// EJECUTAR SENETCNAI SQL
			prest3.execute();
		}finally {
			prest3.close();
			Con3.close();
		 }	
			
	}
}
