package poo;
import javax.swing.*;
public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche miCoche1 = new Coche();
		miCoche1.setColor("Rojo");
		
		
		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);
		miFurgoneta1.setColor("Blanco");
		miFurgoneta1.setAsientos_cuero("si");
		miFurgoneta1.configura_climatizador("si");
		
		
		System.out.println(miCoche1.dimeDatosGenerales() + " " + miCoche1.getColor());
		System.out.println(miFurgoneta1.dimeDatosGenerales() + " " + miFurgoneta1.dimeDatosFurgoneta());
		
		
		
		
	}

}
