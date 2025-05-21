
public class ArrayasBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] matriz = new int[4][5];
		
		matriz[0][0]= 15;
		matriz[0][1]= 21;
		matriz[0][2]= 18;
		matriz[0][3]= 9;
		matriz[0][4]= 15;
		
		matriz[1][0]= 10;
		matriz[1][1]= 52;
		matriz[1][2]= 17;
		matriz[1][3]= 19;
		matriz[1][4]= 7;
		
		matriz[2][0]= 19;
		matriz[2][1]= 2;
		matriz[2][2]= 19;
		matriz[2][3]= 17;
		matriz[2][4]= 7;
		
		matriz[3][0]= 92;
		matriz[3][1]= 13;
		matriz[3][2]= 13;
		matriz[3][3]= 32;
		matriz[3][4]= 41;
		
		System.out.println("*************************************************************************");
		System.out.println("------------------Ejemplo Generando Array Bidimensional-----------------");
		
		
		for(int i=0; i<4; i++) {
			System.out.println("");
			for(int j=0; j<5; j++)
				System.out.print(matriz[i][j] + ", ");
		}
		
		
		
		
				
		
		System.out.println("\n ------------------------Finalizado----------------------------");
		System.out.println("***************************************************************************");
		

	}

}
