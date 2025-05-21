package pruebas;

public class TEST {
	public static void main(String[] args) {
		// java es una lenguaje altamente tipido y debes colocar el tipo de dato de la variable
		// si la variable no tiene valores la pone en adbertencia
		String nombre;
		
		nombre= "David";
		// nombre = 5;
		//no se puede canbiar el tipo de dato, errores de copilacion 
		Empleado emp1 = new Empleado();
		Director dir = new Director();
	}
}


class Empleado{
	private String nombre;
	private int edad;
	private double salario;	
	public void Trabaja() {
		System.out.println("Realiza las tareas tipicas de un empleado");	
		}
}

class Director{
	private String nombre;
	private int edad;
	private double salario;	
	private double incentivo;
	public void Trabaja() {
		System.out.println("Realiza las tareas tipicas de un Director");	
		}
}