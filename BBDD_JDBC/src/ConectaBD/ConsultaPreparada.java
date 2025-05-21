package ConectaBD;

import java.sql.*;


public class ConsultaPreparada {

	public static void main(String[] args) {
		/* ejemplo de la api java 17 de la pagina ofcial
		 * BigDecimal sal = new BigDecimal("153833.00");
		   PreparedStatement pstmt = con.prepareStatement("UPDATE EMPLOYEES
		                                     SET SALARY = ? WHERE ID = ?");
		   pstmt.setBigDecimal(1, sal);
		   pstmt.setInt(2, 110592);*/
		
		
		// 1 .- crear connexion		
		Connection myConex;
		try {
			myConex = DriverManager.getConnection("jdbc:mysql://localhost:3306/jugos_ventas", "root" , "dBd#C4rt0$202A");
			// 2.- crear objeto statement
			PreparedStatement psmt = myConex.prepareStatement("SELECT CODIGO_DEL_PRODUCTO, NOMBRE_DEL_PRODUCTO, ENVASE FROM tabla_de_productos WHERE NOMBRE_DEL_PRODUCTO = ? AND ENVASE = ? ");
			
			// 3.- ESTABLECER PARAMETROS DE CONSULTA
			psmt.setString(1, "Clean");
			psmt.setString(2, "Botella PET");
			
			// 4.- EJECUTAR Y RECORRER CONSULTA
			ResultSet rs = psmt.executeQuery();
			
			// 4.- LEER EL RESULSET	
			System.out.println("************************************************************ ");
			System.out.println("***************** CONSULTA************************** ");
			System.out.println("************************************************************ ");
						while(rs.next()) {
							
							System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
						}
			
					rs.close();
					
			//  REUTILIZACION DE CONSUTLA SQL
					System.out.println(" ");
					System.out.println("************************************************************ ");
					System.out.println("***************** SEGUNDA CONSULTA************************** ");
					System.out.println("************************************************************ ");
					
					psmt.setString(1, "Verano");
					psmt.setString(2, "Lata");			
					rs = psmt.executeQuery();
					
					while(rs.next()) {
								System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
							}					
					rs.close();
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
