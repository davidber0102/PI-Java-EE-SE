
public class UsoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] miMatriz = new int[5];		
		miMatriz[0] = 5;
		miMatriz[1] = 38;
		miMatriz[2] = -15;
		miMatriz[3] = 91;
		miMatriz[4] = 71;				
		
		System.out.println("***********************************");
		
		for(int i=0; i<miMatriz.length; i++) {
			System.out.println("El valor de la posicion " + i + " de la matriz es: " + miMatriz[i]);
		}
		
		System.out.println("***********************************");
		
		
		int[] matrixValores = {10, 29, -78, 55, 125, 5};
		for(int j=0; j<matrixValores.length; j++) {
			System.out.println("El valor de la posicion " + j + " de la matriz es: " + matrixValores[j]);
		}
		
		System.out.println("***********************************");
		
		
		

	}

}
