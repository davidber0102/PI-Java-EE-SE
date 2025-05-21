package ArrayList;

import java.util.*;
public class UsoEmpleado {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		  /*Empleado[] personal = new Empleado[3];
		  personal[0] = new Empleado("Ana", 45, 2500 );
		  personal[1] = new Empleado("Luis", 55, 2000);
		  personal[2] = new Empleado("Luis m", 35, 4000);*/
		ArrayList <Empleado> personal = new ArrayList <Empleado>();
		//personal.ensureCapacity(25);
		
		personal.add(new Empleado("Ana", 45, 2500));
		personal.add(new Empleado("Luis", 55, 2000));
		personal.add(new Empleado("LMaria", 38, 3500));
		personal.add(new Empleado("Antonio", 47, 2270));
		
		//personal.trimToSize();
		personal.set(1, new Empleado("Olga", 22, 2400));
		personal.set(2, new Empleado("Olga", 22, 2400));
		System.out.println(personal.size());
		System.out.println("Metodo get: " + personal.get(3));
		
		/*for (Empleado e:personal) {			
			System.out.println(e.getNombre());		}*/
		
		Iterator<Empleado> iter = personal.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next().getNombre());
		}
		
		/*for(int i=0; i<personal.size(); i++) {
			Empleado e = personal.get(i);
			System.out.println(e.getNombre());	
		}*/
		
	}

}

class Empleado{
	public Empleado(String n, int edad, double s){
		  this.nombre = n;
		  this.edad = edad;
		  this.sueldo = s;
	 }
	 
	 public String getNombre() {			 return nombre;		 }
	 
	 public void setNombre(String nombre) {			 this.nombre = nombre;		 }
	 
	 public double getSueldo() {		  return sueldo;		 }
	 
	 public void setSueldo(double sueldo) {		  this.sueldo = sueldo;		 }
	 
	 
	 public String toString(){		  return "Noombre = " + nombre + " ,sueldo = " + sueldo ;  }
	 	
	private String nombre;
	private int edad;
	private double sueldo;
	private Date altaContrato;

}


