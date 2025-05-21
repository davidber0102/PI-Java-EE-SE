package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class usoPersona {

	public static void main(String[] args) {
		Persona[] lasPersonas =  new Persona[2];
		lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 02,25);
		lasPersonas[1] = new Alumno("Juan Perez", "Ciencias");
		
		for (Persona p: lasPersonas) {
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
			
		}
		

	}

}


abstract class Persona{
	
	private String nombre;

	public Persona(String nom) {		this.nombre = nom;	}

	// getter o dame nombre
	public String dameNombre() {		return nombre;	}
	
	//metodo abtacto hace que la clase sea abr¡tracta 
	public abstract String dameDescripcion();

	
	
	
}

class Empleado2 extends Persona{
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		super(nom);
		this.sueldo=sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		this.altaContrato=calendario.getTime();			
		++idSiguiene;
		id = idSiguiene;}
	
	
	
	public double dameSueldo() {//getter
		return sueldo;	}
	
	public Date dameFechaContrato() {//getter
		return altaContrato;	}	
	
	public void subeSueldo(double porcentaje) {//setter
		double aumento = sueldo * porcentaje/100;
		sueldo+=aumento;	}
	

	private double sueldo;
	private Date altaContrato;	
	private static int idSiguiene;
	private int id;
	
	
	@Override
	public String dameDescripcion() {		return "Este empleado tiene un Id =" + id + " con un sueldo = " + sueldo;	}
}


class Alumno extends Persona {
	private String carrera;

	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;	}

	@Override
	public String dameDescripcion() {
		return "Este alumno esta estudiando la carrera de " + carrera;	}
	
}
