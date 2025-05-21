package Modelo;
import java.sql.*;


public class Conexion {
	public Conexion() {	
	}
	
	public Connection dameConexion() {
		Connection Conex = null;
		try {				
			Conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/jugos_ventas", "root" , "dBd#C4rt0$202A");
			System.out.println("connection established");
		} catch(Exception e){
			System.out.println("SIN CONECCION!!");
			e.printStackTrace();
		}
		//System.out.println("Va bien 2!");
		return Conex;
		
		
	}
}
