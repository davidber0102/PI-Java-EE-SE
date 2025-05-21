package ClasesPropias;

public class UsoPareja {
	public static void main(String[] args) {
		Pareja <String> una = new Pareja<String>();
		una.setPrimero("David");
		
		System.out.println(una.getPrimero());
		
		
		Persona dos = new Persona("Ana");
		Pareja <Persona> pers2 = new Pareja<Persona>();
		pers2.setPrimero(dos);
		System.out.println(pers2.getPrimero());
		

	}
}

class Persona{
	private String nombre;
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return nombre;
	}
}
