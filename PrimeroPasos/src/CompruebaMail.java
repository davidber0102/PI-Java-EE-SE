import javax.swing.*;

public class CompruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba=0;
		boolean punto=false;
		
		String eMail=JOptionPane.showInputDialog("Introduce tu e-Mail");
		
		for (int i=0; i<eMail.length(); i++) {
			if(eMail.charAt(i)=='@') {
				arroba++;
			}
			
			if(eMail.charAt(i)=='.') {
				punto = true;
			}
		}
		
		if(arroba==1 && punto==true) {
			System.out.println("Es correcto su e-Mail");
			System.out.println("******************************");
		}else{
			System.out.println("No es correcto su eMail");
		}

	}

}
