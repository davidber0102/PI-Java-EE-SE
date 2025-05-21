package poo;

public class Pruebas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.cambiarSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() 
				+ "\n" + trabajador2.devuelveDatos()+ "\n" 
				+ trabajador3.devuelveDatos() + "\n" 
				+ trabajador4.devuelveDatos());			
		System.out.println(Empleados.dameIdSiguinte());
	}
}

class Empleados{
	private  final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente=1;
	
	public Empleados(String nom) {
		this.nombre = nom;
		seccion="Administracion";
		id=idSiguiente;
		idSiguiente++;	}
	
	public void cambiarSeccion(String seccion) {//setter
		this.seccion= seccion;	}
	
	public String devuelveDatos() {
		return "Id empleado " + id +", el nombre es " + nombre + " y la seccion es " + seccion;	}
	
	public static String dameIdSiguinte() {
		return "Id del siguiente empleado es " + idSiguiente;	}	
}
