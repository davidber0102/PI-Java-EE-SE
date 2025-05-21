package graficos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EjemploArea {
	public static void main(String[] args) {
		MarcoArea marco = new MarcoArea();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoArea extends JFrame{
	public MarcoArea() {
		super();
		setVisible(true);
		setBounds(500, 300, 500, 400);
		setTitle("---Bienvenido a Java --- TRABAJANDO CON CAMPO DE area de texto--");	
		LaminaArea lamina = new LaminaArea();
		add(lamina);
	}
}

class LaminaArea extends JPanel{
	private JTextArea miArea;
	public LaminaArea(){
		miArea = new JTextArea(8,20);
		JScrollPane laminaBarras = new JScrollPane(miArea); 		
		
		miArea.setLineWrap(true);
		add(laminaBarras);
		
		JButton miBoton = new JButton("Dale");
		miBoton.addActionListener(new GestionArea());
		add(miBoton);
	}
	
	private class GestionArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(miArea.getText());
		}

		
	}
}
