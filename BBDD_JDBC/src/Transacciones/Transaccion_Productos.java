package Transacciones;
import java.sql.*;

import javax.swing.JOptionPane; 

public class Transaccion_Productos {
	public static void main(String[] args) {
		Connection miConexion = null;
		
		try{					
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebaspi", "root" , "dBd#C4rt0$202A");	
			miConexion.setAutoCommit(false);			
			Statement miStatement =miConexion.createStatement();
			
		    String instruccionSql_1="DELETE FROM clientes WHERE POBLACIÓN = 'ÁVILA;' ";		    
		    String instruccionSql_2="DELETE FROM clientes WHERE EMPRESA = 'LA MODERNA;' ";			    
		    String instruccionSql_3="UPDATE clientes  SET  RESPONSABLE = 'JUAN GARCÍA' WHERE RESPONSABLE = 'PEDRO SERRANO'; ";	
		    
		    boolean ejecutar = ejecutar_transaccion();
		    
		    if(ejecutar) {		    			    
			    miStatement.executeUpdate(instruccionSql_1);	
			    miStatement.executeUpdate(instruccionSql_2);	
			    miStatement.executeUpdate(instruccionSql_3);				    
			    miConexion.commit();			    
			    System.out.println("Datos INSERTADOS correctamente");
		    } else {
		    	System.out.println("Sin inserccion en Base de DAtos.....");
		    }
		}catch(Exception e){
				try {
					miConexion.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			System.out.println("ERROR EN LA INSERCION DE DATOS!!");		
				
				e.printStackTrace();
			}
	}

	private static boolean ejecutar_transaccion() {
		String ejecucion = JOptionPane.showInputDialog("¿Ejecutamos las Transacciones?");
		
		if (ejecucion.equals("SI")) return true;
		else return false;
	}
}
