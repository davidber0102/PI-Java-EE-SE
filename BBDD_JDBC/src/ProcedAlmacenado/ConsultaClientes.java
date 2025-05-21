package ProcedAlmacenado;
import java.sql.*;
public class ConsultaClientes {
	public static void main(String[] args) {		
		 Connection Conex;
		 CallableStatement cst;
		try {
			Conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/jugos_ventas", "root" , "dBd#C4rt0$202A");
			 cst = Conex.prepareCall("{call muestra_clientes}");
			 ResultSet rs = cst.executeQuery();
			 
			 while(rs.next()) {
				 System.out.println("Nombre: " + rs.getString(2) + ", Ciudad: " + rs.getString(6) + ", Edad: "+ rs.getInt(10) + " años");
			 }
			 rs.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
				

	}

}
