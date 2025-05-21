package ClasesPropias;

public class MetodosGenericos {
	public static void main(String[] args) {		
		String nombres[] =  {"Jose", "Maria", "Pepe"};		
		System.out.println(MisMatrices.getMenor(nombres));
	}
}
// reacer el metodo para que siempre deveuevla por orden los elementos
class MisMatrices{
public static <T extends Comparable> T getMenor(T[]a){
	if(a==null || a.length==0) {
		return null;
		}
	T elementoMenor = a[0];
	for(int i=1; 1<a.length;i++) {
		if(elementoMenor.compareTo(a[i])>0) {
			elementoMenor = a[i];
		}
	}
	return elementoMenor;
	}
}

/*
 -- METODO GENERICO QUE DEVUELVE LA CANTIDAD DE REGISTROS EN EL ARRAY
 class MisMatrices{
	public static <T> String getElementos(T[]a){
		return "El array tiene: " + a.length + " elementos";
		
	}
}*/