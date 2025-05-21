package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
import java.awt.Toolkit;
public class PruebaTemporizador2 {
	public static void main(String[] args) {	
		Reloj miReloj = new Reloj();
		miReloj.enMarcha(3000, true);
		System.out.println("-----------------------------------------------------");
		System.out.println("Apliacion Iniciada");
		System.out.println("-----------------------------------------------------");
		JOptionPane.showInternalMessageDialog(null, "Pulsa Aceptar para detener");		
		System.out.println("-----------------------------------------------------");
		System.out.println("Apliacion Terninada");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		System.exit(0);		
	}
}

class Reloj{	
	/*public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;	}*/	
	public void enMarcha(int intervalo, final boolean sonido) {
		class DameLaHora2 implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 Segundos: " + ahora);				
				if(sonido) {					Toolkit.getDefaultToolkit().beep();			}			
			}		
		}		
		ActionListener oyente = new DameLaHora2();		
		Timer miTempo = new Timer(intervalo, oyente);
		miTempo.start();
	}	
}
