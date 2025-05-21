
public class Arraysbidimensionales3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulado;
		double interes= 0.10;
		
		double [][] saldo = new double[6][5];
		
		
		
		for (int i =0; i <6; i++) {
			saldo [i][0] = 10000;
			acumulado = 10000;
			
			for(int j=1; j<5; j++) {
				acumulado=acumulado + (acumulado*interes);
				saldo[i][j] = acumulado;
			}
			interes = interes + 0.01;
			
		}
		System.out.println("*************************************************************************");
		System.out.println("------------------Ejemplo Generando Array Bidimensional-----------------");
		
		for(int z =0; z<6; z++) {
			System.out.println("");
			for(int x =0; x<5; x++) {
				System.out.printf("%1.2f", saldo[z][x]);
				System.out.print(" ");
			}
		}
		
		

		
		System.out.println("\n ------------------------Finalizado----------------------------");
		System.out.println("***************************************************************************");
		

	}

}
