package ConectaBD;
import java.sql.*;

public class ModificaBBDD {
	public static void main(String[] args) {
		try {
			
			// 1 .- crear connexion			
				Connection myConex = DriverManager.getConnection("jdbc:mysql://localhost:3306/jugos_ventas", "root" , "dBd#C4rt0$202A");
				
			// 2.- crear objeto statement
				Statement s = myConex.createStatement();
			
			// 3.- ejecutar la instruccion sql
				// COMANDO SQL PARA INSERTAR EN TABLA Y BASE DE DATOS
				//String instruccionSql = 
					//	"INSERT INTO tabla_de_productos(CODIGO_DEL_PRODUCTO, NOMBRE_DEL_PRODUCTO, TAMANO, SABOR, ENVASE, PRECIO_DE_LISTA) VALUES('1001201','Sabor Pepsi','Cola','600 ml','Botella PET',8.50)";
				
				// COMANDO ACTUALIZAR TABLA PRODUCTOS
				//String instruccionSql = 
					//		"UPDATE jugos_ventas.tabla_de_productos SET PRECIO_DE_LISTA = PRECIO_DE_LISTA *1.2 WHERE CODIGO_DEL_PRODUCTO ='1001201' ";
				
				String instruccionSql = "DELETE FROM jugos_ventas.tabla_de_productos WHERE CODIGO_DEL_PRODUCTO ='1001201' ";
				
				
				s.executeUpdate(instruccionSql);
				
				
			// 4.- LEER EL RESULSET
				// MENSAJE DE INSERCCION CORRECTA
				//System.out.println("Datos insertados correctamente");
				
				// MENSAJE DE ACTUALIZACION CORRECTA
				//System.out.println("Datos ACTUALIZADOS correctamente");
				
				// MENSAJE DE ELIMINACION CORRECTA
				System.out.println("Datos ELIMINADOS correctamente");
			
				
			}catch(Exception e){
				System.out.println("NO CONECTA!!");
				e.printStackTrace();
			}


	}

}
