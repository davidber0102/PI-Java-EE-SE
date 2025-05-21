package ClasesPropias;

public class HerenciaGenericos {

	public static void main(String[] args) {
		/*Empleado Admin = new Empleado("Elena", 45, 1500 );
		Jefe dirComer = new Jefe("Ana", 27, 3500); 		
		Empleado nuevoEmpleado = dirComer;*/
		
		Pareja<Empleado> admin = new Pareja<Empleado>();
		Pareja<Jefe> dir1 = new Pareja<Jefe>();
		
		//Pareja<Empleado> nuevo1 = dir1;
		Pareja.imprimirTrabajdor(admin);
		Pareja.imprimirTrabajdor(dir1);
		

	}

}
