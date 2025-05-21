package poo;
import javax.swing.*;
public class Uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche renault = new Coche(); /// INSTANCAIR UNA CLASE, EJEMPLAR DE CLASE
		
		Coche miCoche = new Coche();
		
		miCoche.setColor(JOptionPane.showInputDialog("Introduce color de carro"));
		
	
		
		System.out.println("*************************************************************************");
		System.out.println("------------------aprendiendo Programacion Orientada a Objetos-----------------");
		
		System.out.println(miCoche.dimeDatosGenerales());
		System.out.print(miCoche.getColor() + "\n");
		
		miCoche.setAsientos_cuero(JOptionPane.showInputDialog("¿Cuenta con asientos de cuero el carro?"));
		System.out.print(miCoche.dimeAsientos_cuero());
		
		miCoche.configura_climatizador(JOptionPane.showInputDialog("¿Cuenta con climatizador de cuero el carro?"));
		System.out.println(miCoche.dimeClimatizador());
		
		System.out.println(miCoche.dimePesoCoche());
		System.out.println("El precio final del coche es: " + miCoche.precio_coche());
		
		System.out.println("\n ------------------------Finalizado----------------------------");
		System.out.println("***************************************************************************");

	}

}
