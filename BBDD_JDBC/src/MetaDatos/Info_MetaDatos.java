package MetaDatos;
import java.sql.*;


public class Info_MetaDatos {
	public static void main(String[] args) {
		//mostrarInfo_BBDD();
		mostrarInfo_Tablas();
	}
	
	static void mostrarInfo_BBDD() {	
		try {
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebaspi", "root" , "dBd#C4rt0$202A");
			// ----------------- OBTENCION DE METADATOS-----------------------------
			datos = miConexion.getMetaData();
			// ---------------------- Se muestra informacion de la bbdd
			System.out.println("Nombre de Gestor de BBDD " + datos.getDatabaseProductName());
			System.out.println("Version Gestor de BBDD " + datos.getDatabaseProductVersion());
			System.out.println("Nombre del dirver de BBDD " + datos.getDriverName());
			System.out.println("Version del dirver de BBDD " + datos.getDriverVersion());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
				try {
					miConexion.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}		
	}
	
	static void mostrarInfo_Tablas() {
		try {
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebaspi", "root" , "dBd#C4rt0$202A");
			// ----------------- OBTENCION DE METADATOS-----------------------------
			 datos = miConexion.getMetaData();
			// ---------------------- Se muestra informacion de las tablas			
			System.out.println("Lista de Tablas "  );
			
			rs =  datos.getTables(null, null, null, null);
		
			while(rs.next()) {
				System.out.println("--- " + rs.getString("TABLE_NAME"));
			}
			// LISTA DE COLUMNAS DE PRODUCTOS
			System.out.println("************************************************************* "  );
			System.out.println("Columnas de la Tabla Productos");
			rs =  datos.getColumns(null, null, "clientes", null);
			
			while(rs.next()) {
				System.out.println("--- " + rs.getString("COLUMN_NAME"));
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
				try {
					miConexion.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	 static Connection miConexion = null;	
	 static DatabaseMetaData datos;
	 static ResultSet rs = null;
}
