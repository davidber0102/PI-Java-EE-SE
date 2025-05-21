
public class ArraysBidimensionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int [] [] matriz = {
		{10,15,18,19,21},
		{5,25,37,41,15},
		{7,19,32,14,90},
		{85,2,7,40,27} };
		
		
		
		System.out.println("*************************************************************************");
		System.out.println("------------------Ejemplo Generando Array Bidimensional-----------------");
		
		
		for(int[] fila:matriz ) {
			System.out.println("");
			for(int z:fila)
				System.out.print(z + ", ");
		}
		

				
		
		System.out.println("\n ------------------------Finalizado----------------------------");
		System.out.println("***************************************************************************");
		

	}

}
