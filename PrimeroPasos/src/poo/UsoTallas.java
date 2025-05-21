package poo;

import java.util.*;

public class UsoTallas {
	//enum Talla{MINI, MEDIANO, GRANDE, EXTRAGRANDE};
	enum Talla{		
		MINI("S"), MEDIANO("M"), GRANDE("L"), EXTRAGRANDE("XL");
		
		private Talla(String abr) {			this.abreviatura= abr;		}
		
		private String abreviatura;
		
		//getter
		public String DameAbreviatura() {			return abreviatura;		}
	}
	
	public static void main(String[] args) {
		/*Talla s= Talla.MINI;
		Talla m = Talla.MEDIANO;
		Talla l = Talla.GRANDE;
		Talla xl = Talla.EXTRAGRANDE;*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, EXTRAGRANDE ");
		String tecladoDatos = teclado.next().toUpperCase();
		Talla laTalla = Enum.valueOf( Talla.class, tecladoDatos);
		System.out.println("Talla = " + laTalla);
		System.out.println("Abreviatura = " + laTalla.DameAbreviatura());
	
		
		


	}

}
