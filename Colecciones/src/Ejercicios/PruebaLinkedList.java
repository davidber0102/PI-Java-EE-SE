package Ejercicios;
import java.util.*;

public class PruebaLinkedList {
	public static void main(String[] args) {
		LinkedList<String> personas = new LinkedList<String>();
		personas.add("Pepe");
		personas.add("Sandra");
		personas.add("Ana");
		personas.add("Laura");
		personas.add("David");
		
		System.out.println(personas.size());
		//personas.add("Juan");
		
		ListIterator<String> it = personas.listIterator();
		it.next();
		it.add("Juan");
		for(String persona : personas) {
			System.out.println(persona);
		}

	}

}
