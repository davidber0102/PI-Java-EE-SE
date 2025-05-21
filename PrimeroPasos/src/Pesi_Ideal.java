import javax.swing.*;

public class Pesi_Ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero = "";
		do {
			genero = JOptionPane.showInputDialog("Introduce tu genero: (H / M)");
			
		}while(genero.equalsIgnoreCase("H") ==false && genero.equalsIgnoreCase("M")== false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centimentos"));
		int pesoIdeal = 0;
		
		if (genero.equalsIgnoreCase("H")) {
			pesoIdeal = altura - 110;
		}else if(genero.equalsIgnoreCase("M")) {
			pesoIdeal = altura - 120;
		}
		
		System.out.println("******************************");
		System.out.println("*Peso Ideal");		
		System.out.println("******************************");
		
		System.out.println("Tu peso ideal es  " + pesoIdeal);
		
		System.out.println("******************************");
		System.out.println("******************************");

	}

}
