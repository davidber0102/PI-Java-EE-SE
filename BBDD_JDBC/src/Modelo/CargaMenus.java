package Modelo;
import java.sql.*;


public class CargaMenus {
	public CargaMenus() {
		Conex2 = new Conexion();
	}
	
	public String ejecutaConsulta() {
		Productos miProducto = null;
		Connection accesoBBDD = Conex2.dameConexion();
		try {
			Statement secciones = accesoBBDD.createStatement();
			Statement paises = accesoBBDD.createStatement();
			//String consulta = "SELECT DISTINCTROW NOMBRE_DEL_PRODUCTO FROM tabla_de_productos";
			rs = secciones.executeQuery("SELECT DISTINCTROW NOMBRE_DEL_PRODUCTO FROM tabla_de_productos");	
			rs2 = paises.executeQuery("SELECT DISTINCTROW ENVASE FROM tabla_de_productos");
				//while(rs.next()) {
					//rs.previous();
			//rs.next();
			//rs2.next();
			
					miProducto = new Productos();
					miProducto.setNomProducto(rs.getString(1));
					//return miProducto.getNomProducto();
					miProducto.setEnvase(rs2.getString(1));
					
				//}		
			rs.close();
			rs2.close();
			accesoBBDD.close();
		}catch(SQLException e){
			System.out.println("Error!");
			e.printStackTrace();
		}
		//System.out.println("Va bien 5!");
		return miProducto.getNomProducto();
		
	}
	
	
	/*public ResultSet ejecutaConsultas() {
		
		try {
			Connection accesoBBDD = Conex2.dameConexion();
			Statement secciones = accesoBBDD.createStatement();
			return rs = secciones.executeQuery("SELECT DISTINCTROW NOMBRE_DEL_PRODUCTO FROM tabla_de_productos");
		}catch(Exception e){
			System.out.println("Error!");
			e.printStackTrace();
		}
		return null;
	}
	
	*/
	public Conexion Conex2;
	public ResultSet rs, rs2;

}
