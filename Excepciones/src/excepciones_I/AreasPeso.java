package excepciones_I;
import java.util.Scanner;
import javax.swing.*;

/** * @author David bernal
 */
public class AreasPeso {
	public static void main(String[] args) {
		   //int figura = 0;
	        Scanner entrada = new Scanner(System.in);
	        
	        System.out.println("Elije una opcion:\n1. Cuadrado\n2. Rectangulo\n3. "
	                + "Triángulo\n4. Círculo");
	        
	        try {
	        	figura = entrada.nextInt();	        
	 	       	//entrada.close(); //Cierra la conexion de la consola
	        }catch(Exception e){
	        	System.out.println("El resultado no puede ser procesado, teclee solo numeros" );
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("Se ha generado un error de este tipo: " + e.getClass().getName());
	        }finally {
	        	entrada.close();
	        }
	        	
	        
	        switch(figura){	            
	            case 1: 	                
	                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:"));
	                System.out.println(Math.pow(lado, 2));	                
	                break;
	                
	            case 2:	                
	                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
	                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));	                
	                System.out.println("El área del rectángulo es: " + base*altura);
	                break;
	                
	            case 3:	                
	                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
	                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));	                
	                System.out.println("El área del triángulo es: " +  (base*altura)/2);	                
	                break;
	                
	            case 4:	                
	                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: "));
	                System.out.println("El área del círculo es: ");
	                System.out.println(Math.PI*(Math.pow(radio, 2)));	                
	                break;
	                
	            default:
	                System.out.println("La opción no es correcta.");
	        }
	 //-----------------------------------------------------------------------------
	 
	        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introducetu altura en cm: "));
	        
	        System.out.printf("Si eres hombre tu peso ideal es: %d kg.", altura-110);
	        System.out.printf("Si eres mujer tu peso ideal es: %d kg.", altura-120);	              
	    }
	static int figura;
	}