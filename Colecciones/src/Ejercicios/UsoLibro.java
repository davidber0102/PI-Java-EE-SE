package Ejercicios;

public class UsoLibro {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VIDEO 181 MINUTO 16
		
		Libro l1 = new Libro("P en Java", "Juan", 25);
		Libro l2 = new Libro("P en Java", "Juan", 25);
		
		if(l1.equals(l2)) {
			System.out.println("Es el mismo libro");
			System.out.println(l1.hashCode());
			System.out.println(l2.hashCode());
		}else {
			System.out.println("NO es el mismo libro");
			System.out.println(l1.hashCode());
			System.out.println(l2.hashCode());

			
		}

	}

}
