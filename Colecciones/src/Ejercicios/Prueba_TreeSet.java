package Ejercicios;
import java.util.*;

public class Prueba_TreeSet {
	public static void main(String[] args) {
		/*TreeSet <String> ordenaPersonas = new TreeSet<String>();
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		
		for(String s : ordenaPersonas) {
			System.out.println(s);
		}*/
		
		Articulo primero = new Articulo(1, "Primer articulo");
		Articulo segundo = new Articulo(2, "Segundo articulo");
		Articulo tercer = new Articulo(3, "Tercer articulo");
		
		TreeSet<Articulo> ordenarArticulo = new TreeSet<Articulo>();
		ordenarArticulo.add(tercer);
		ordenarArticulo.add(primero);
		ordenarArticulo.add(segundo);
		System.out.println("---------------------------");
		for(Articulo a : ordenarArticulo) {
			
			System.out.println(a.getDescripcion());

		}	
		
		//Articulo comparadorArticulo = new Articulo();
		
		//TreeSet<Articulo> ordenarArticulo2 = new TreeSet<Articulo>(comparadorArticulo);
		
		//ComparadorArticulos compara = new ComparadorArticulos();
		TreeSet<Articulo> ordenarArticulo2 = new TreeSet<Articulo>( new Comparator<Articulo>() {
			@Override
			public int compare(Articulo o1, Articulo o2) {
				String descripcionA = o1.getDescripcion();
				String descripcionB = o2.getDescripcion();
				
				return descripcionA.compareTo(descripcionB);
			}
			
		}
				
				);
		
		ordenarArticulo2.add(segundo);
		ordenarArticulo2.add(tercer);
		ordenarArticulo2.add(primero);
		System.out.println("---------------------------");
		for(Articulo a : ordenarArticulo2) {
			
			System.out.println(a.getDescripcion());
		}	
	}
	
}

//class Articulo implements Comparable<Articulo>, Comparator<Articulo>{
class Articulo implements Comparable<Articulo>{
	
	//public Articulo() { 	}
	
	public Articulo(int num, String desc) {
		numero_articulo = num;
		descripcion = desc;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public int compareTo(Articulo o) {		
		return numero_articulo - o.numero_articulo;
	}
	
	private int numero_articulo;
	private String descripcion;	
	
	/*@Override
	public int compare(Articulo o1, Articulo o2) {
		String descripcionA = o1.getDescripcion();
		String descripcionB = o2.getDescripcion();
		
		return descripcionA.compareTo(descripcionB);
	}*/
	
}

/*
class ComparadorArticulos implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		String descripcionA = o1.getDescripcion();
		String descripcionB = o2.getDescripcion();
		
		return descripcionA.compareTo(descripcionB);
	}
	
}*/



