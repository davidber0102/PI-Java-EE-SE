
public class CalculosConMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raiz= Math.sqrt(9.3);
		
		double num1 = 5.85F;
		int resultado = (int)Math.round(num1);
		
		
		double base = 5;
		double exponente = 3;
		
		int resultado2 = (int)Math.pow(base, exponente);
		
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("UTILIZNADO LA CLASE MATH");
		System.out.println("******************************");
		System.out.println("La raiz cuadrada es: " + raiz);
		System.out.println("La resultado de redondear " + num1+ " es: " + resultado);
		System.out.println("La resultado de exponente de  " + base + " con exponente " + exponente  + " es: " + resultado2);
		System.out.println("******************************");
		System.out.println("******************************");

	}

}
