package Modelo;
import java.sql.*;

public class EjecutaConsultas {
	
	public EjecutaConsultas() {
		Conex3 = new Conexion();
	}
	
	public ResultSet filtarBBDD(String seccion, String pais) {
		//pruebas= "";
		Connection conecta = Conex3.dameConexion();
		rs = null;
		
		
		try {
		if(!seccion.equals("Todos") && pais.equals("Todos")) {
			//pruebas = "haz escogido Seccion";
			enviaConsultaSeccion = conecta.prepareStatement(consultaSeccion);
			enviaConsultaSeccion.setString(1, seccion);
			rs = enviaConsultaSeccion.executeQuery();
		}else if (seccion.equals("Todos") && !pais.equals("Todos")) {
			//pruebas = "haz escogido pais";
			enviaConsultaPais = conecta.prepareStatement(consultaPais);
			enviaConsultaPais.setString(1, pais);
			rs = enviaConsultaPais.executeQuery();
		}else if (!seccion.equals("Todos") && !pais.equals("Todos")) {
			//pruebas = "haz escogido Seccion y Pais";
			enviaConsultaTodos = conecta.prepareStatement(consultaTodos);
			enviaConsultaTodos.setString(1, seccion);
			enviaConsultaTodos.setString(2, pais);
			rs = enviaConsultaTodos.executeQuery();	
			}
		}catch(Exception e){
			System.out.println("SIN CONECCION BBDD 23!!");
			e.printStackTrace();
		}
		//return pruebas;
		
		return rs;
	}
	
	//private String pruebas;
	private Conexion Conex3;
	private ResultSet rs;
	private PreparedStatement enviaConsultaSeccion;
	private PreparedStatement enviaConsultaPais;
	private PreparedStatement enviaConsultaTodos;
	private final String consultaSeccion = "SELECT * FROM tabla_de_productos WHERE NOMBRE_DEL_PRODUCTO = ? ";
	private final String consultaPais = "SELECT * FROM tabla_de_productos WHERE ENVASE = ? ";
	private final String consultaTodos = "SELECT * FROM tabla_de_productos WHERE NOMBRE_DEL_PRODUCTO = ? AND ENVASE = ? ";

}
