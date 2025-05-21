package poo;
import java.util.*;
public class UsoEmpleado {
	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		/*Empleado empleado1 = new Empleado("David Bernal", 5000, 2015, 05,16);
		Empleado empleado2 = new Empleado("Ana Lopez", 7500, 2016, 11,02);
		Empleado empleado3 = new Empleado("Maia Martin", 12500, 205, 01,16);
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);		
		System.out.println("Nombre: " + empleado1.dameNombre() + ",  Sueldo: " 
							+ empleado1.dameSueldo() + ",  Fecha de Alta: " + empleado1.dameFechaContrato());		
		System.out.println("Nombre: " + empleado2.dameNombre() + ",  Sueldo: " 
				+ empleado2.dameSueldo() + ",  Fecha de Alta: " + empleado2.dameFechaContrato());		
		System.out.println("Nombre: " + empleado3.dameNombre() + ",  Sueldo: " 
				+ empleado3.dameSueldo() + ",  Fecha de Alta: " + empleado3.dameFechaContrato());*/
		
		Jefatura jefeRrhh =  new Jefatura("Enrique", 12000, 2020, 9, 25);
		jefeRrhh.estableceIncentivo(1750);
	
		
		
		Empleado [] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("David Bernal", 5000, 2015, 05,16);
		misEmpleados[1] = new Empleado("Ana Lopez", 7500, 2016, 11,02);
		misEmpleados[2] = new Empleado("Maria Martin", 12500, 2005, 01,16);
		misEmpleados[3] = new Empleado("Juan Perez");
		misEmpleados[4] = jefeRrhh; //poliformismo en accion . Principio de sustitucion
		misEmpleados[5] = new Jefatura("Maria", 9500, 1999, 5, 26);
		Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];
		jefaFinanzas.estableceIncentivo(5000);
		
		Empleado directorComercial = new Jefatura("Daiel Marquez", 52500, 2015,6,11);
		Comparable ejemplo = new Empleado("Antonio Lopez", 9000, 2005, 10,26);
		
		if(directorComercial instanceof Empleado ) { 			System.out.println("Es de tipo Jefatura");		}
		if(ejemplo instanceof Comparable ) { 			System.out.println("Implementa la interfaz comparable");		}	
		
		
		
		System.out.println(jefaFinanzas.TomaDesiciones("Dar mas dias de vaciones a los empleados"));
		
		System.out.println(" Jefe " + jefaFinanzas.dameNombre() + " tiene un bonus de: " + jefaFinanzas.estableceBonus(500));
		
		System.out.println(misEmpleados[2].dameNombre()  + " tiene un bonus de: " + misEmpleados[2].estableceBonus(500));
		/*for(int i=0; i<3; i++) {
			misEmpleados[i].subeSueldo(5);
		}		
		for(int i=0; i<3; i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + ",  Sueldo: " 
					+ misEmpleados[i].dameSueldo() + ",  Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
		}*/
		for(Empleado e:misEmpleados) {			e.subeSueldo(5);		}
		
		Arrays.sort(misEmpleados);
		
		for (Empleado e:misEmpleados) {			System.out.println("Nombre: " + e.dameNombre() + ",  Sueldo: " 
					+ e.dameSueldo() + ",  Fecha de Alta: " + e.dameFechaContrato());		}
	}

}

class Empleado implements Comparable, Trabajadores{
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		this.nombre=nom;
		this.sueldo=sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		this.altaContrato=calendario.getTime();	}
	
	public Empleado (String nom) {
		this(nom, 3000, 2000,01,01);	}
	
	public String dameNombre(){//getter
		return nombre;	}
	
	public double dameSueldo() {//getter
		return sueldo;	}
	
	public Date dameFechaContrato() {//getter
		return altaContrato;	}	
	
	public void subeSueldo(double porcentaje) {//setter
		double aumento = sueldo * porcentaje/100;
		sueldo+=aumento;	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	@Override
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado)  miObjeto;
		if(this.sueldo<otroEmpleado.sueldo) {			return -1;		}
		if(this.sueldo>otroEmpleado.sueldo) {			return 1;		}
		return 0;
		
	}

	@Override
	public double estableceBonus(double g) {
		return Trabajadores.bonusBase + g;
	}	
}

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);		}
	
	private double incentivo;
	
	//setter
	public void estableceIncentivo(double b) {		this.incentivo = b;	}	
	
	//getter
	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();
		return sueldoJefe + incentivo;	}

	@Override
	public String TomaDesiciones(String decision) {		return "Un miembro de la direccion ha tomado la decision de: " + decision;	}

	@Override
	public double estableceBonus(double g) {
		double prima=2000;
		return Trabajadores.bonusBase + g + prima;
	}
}




