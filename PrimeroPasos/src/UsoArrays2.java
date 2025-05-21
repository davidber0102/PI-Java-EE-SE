

public class UsoArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] paises = new String[8];
		paises[0]= "Mexico";
		paises[1]= "Canada";
		paises[2]= "Estados Unidos";
		paises[3]= "España";
		paises[4]= "Brazil";
		paises[5]= "Francia";
		paises[6]= "Italia";
		paises[7]= "Chile";
		
		System.out.println("*************************************************************************");
		System.out.println("------------------Ejemplo con ciclo For-----------------");
		
		for(int i=0; i<paises.length; i++) {
			System.out.println("Nombre de Pais " + (i+1) +  " es: " + paises[i]);
			
		}
		System.out.println("------------------------Finalizado----------------------------");
		System.out.println("***************************************************************************");
		System.out.println("------------------Ejemplo con ciclo For Each-----------------");
		
		for(String elemento:paises) {
			System.out.println("Nombre de Pais" +  " es: " + elemento);
		}
		System.out.println("------------------------Finalizado----------------------------");
		System.out.println("*************************************************************************");
		
		

	}

}
