package ConectaBD;
import java.sql.*;

public class Conecta_Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear conexion
		// video 202 minuto 9
		
		try {
		
		// 1 .- crear connexion			
			Connection myConex = DriverManager.getConnection("jdbc:mysql://localhost:3306/jugos_ventas", "root" , "dBd#C4rt0$202A");
			
		// 2.- crear objeto statement
			Statement s = myConex.createStatement();
		
		// 3.- ejecutar la instruccion sql
			ResultSet r = s.executeQuery("SELECT * FROM facturas");
			
		// 4.- LEER EL RESULSET
			
			while(r.next()) {
				System.out.println(r.getString("DNI") + " " + r.getString("MATRICULA") + " "+ r.getDate("FECHA_VENTA") + " " + r.getFloat("IMPUESTO"));
			}
			
		}catch(Exception e){
			System.out.println("NO CONECTA!!");
			e.printStackTrace();
		}

	}

}
