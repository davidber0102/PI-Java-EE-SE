package excepciones_I;
import javax.swing.*;

public class CompruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		String eMail=JOptionPane.showInputDialog("Introduce tu e-Mail");
		try {
			examina_mail(eMail);
		} catch (Longitud_mail_erronea e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
	
	static void examina_mail(String eMail) throws Longitud_mail_erronea {
		int arroba=0;
		boolean punto=false;
		
		if(eMail.length()<=3) {
			throw new Longitud_mail_erronea("El correo es muy corto");
			//ArrayIndexOutOfBoundsException miExcepcion = new ArrayIndexOutOfBoundsException();
			//throw miExcepcion;
		}else {		
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

}

class Longitud_mail_erronea extends Exception{
	public Longitud_mail_erronea() {}
	public Longitud_mail_erronea(String msj_error) {
		
		super(msj_error);
	}
	
}
