import java.util.*;
import javax.swing.*;;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Elige una opcion:  \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo" );
		
		int figura = entrada.nextInt();
		
		switch(figura) {
		case 1: 
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del Cuadrado: " ));
			int areaCuadrado = (int) Math.pow(lado, 2);
			System.out.println("\n El area del cuadrado es: " + areaCuadrado);
			
			break;
			
		case 2: 
			int ladoBase = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del Rectangulo : " ));
			int ladoAltura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Altura del Rectangulo: " ));
			int areaRectangulo = ladoBase * ladoAltura;
			System.out.println("\n El area del rectangulo es: " + areaRectangulo);
			break;
			
		case 3: 
			int ladoBaseT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del Trangulo : " ));
			int ladoAlturaT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Altura del Trangulo : " ));
			int areaTriangulo = (ladoBaseT * ladoAlturaT)/2;
			System.out.println("\n El area del rectangulo es: " + areaTriangulo);
			break;
			
		case 4: 
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del Circulo : " ));
		
			double areaCirculo = Math.PI * (Math.pow(radio,2));
			System.out.print("\n El area del rectangulo es: " );
			System.out.printf("%1.2f", areaCirculo);
			break;
			
		default:
			System.out.print("\n La opcion no es correcta " );
	
		}

	}

}
