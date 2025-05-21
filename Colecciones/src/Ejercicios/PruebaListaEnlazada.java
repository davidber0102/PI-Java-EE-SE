package Ejercicios;
import java.util.*;

public class PruebaListaEnlazada {
	public static void main(String[] args) {
		LinkedList<String> paises = new LinkedList<String>();
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");	
		
		
		LinkedList<String> capaitales = new LinkedList<String>();
		capaitales.add("Madrid");
		capaitales.add("Bogota");
		capaitales.add("Cd Mx");
		capaitales.add("Lima");

		//System.out.println(paises);
		//System.out.println(capaitales);
		
		ListIterator<String> it1 = paises.listIterator();
		ListIterator<String> it2 = capaitales.listIterator();
		
		while(it2.hasNext()) {
			if(it1.hasNext()) {
				it1.next();
			}
			it1.add(it2.next());
		}
		System.out.println(paises);
		
		it2 = capaitales.listIterator();
		while(it2.hasNext()) {
			it2.next();
				if(it2.hasNext()) {
					it2.next();
					it2.remove();;
				}
		}
		System.out.println(capaitales);
		paises.removeAll(capaitales);
		System.out.println(paises);
		
		
		// video 185 minuto 13
		
		
		
		
	}

}
