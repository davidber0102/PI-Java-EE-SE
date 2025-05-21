package poo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente = new DameLaHora();
		
		Timer miTempo = new Timer(5000, oyente);
		miTempo.start();
		
		JOptionPane.showInternalMessageDialog(null, "Pulsa Aceptar para detner");
		System.exit(0);
		

	}

}


class DameLaHora implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println("Te pongo la hora cada 5 Segundos: " + ahora);
		Toolkit.getDefaultToolkit().beep();
		
	}
	
}
