import javax.swing.JOptionPane;

public class UsoArrays_Aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] matrizNumeroAleatorios = new int[150];
		for(int i=0; i<matrizNumeroAleatorios.length; i++) {
			matrizNumeroAleatorios[i] = (int)Math.round(Math.random()*100);
			
		}

		
		System.out.println("*************************************************************************");
		System.out.println("------------------Ejemplo con Generar Numero aleatori y guardarlo en matriz-----------------");
		
				
		for(int elemento:matrizNumeroAleatorios) {
			System.out.print("N es: " + elemento + " ");
		}
		System.out.println("\n ------------------------Finalizado----------------------------");
		System.out.println("***************************************************************************");
		

	}

}
