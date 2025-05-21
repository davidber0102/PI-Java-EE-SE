package graficos;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {
	public static void main(String[] args) {
		MarcoTexto marco = new MarcoTexto();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoTexto extends JFrame{
	public MarcoTexto(){
		super();
		setVisible(true);
		setBounds(600, 400, 600, 400);
		setTitle("---Bienvenido a Java --- TRABAJANDO CON TEXTOS--");	
		LaminaTexto lamina = new LaminaTexto();
		add(lamina);
	}
}

class LaminaTexto extends JPanel{
	public LaminaTexto() {
		super();
		setLayout(new BorderLayout());
		
		JPanel lamina2 = new JPanel();
		lamina2.setLayout(new FlowLayout());
		
		resultado  = new JLabel("", JLabel.CENTER);
		JLabel etiquetaCorreo = new JLabel("Escriba Correo Electronico");
		lamina2.add(etiquetaCorreo);
		
		campo1 = new JTextField("Texto por Defecto", 15);
		lamina2.add(campo1);
		add(resultado, BorderLayout.CENTER);
		JButton miBoton = new JButton("Comprobar");
		
		DameTexto miEvento = new DameTexto();
		miBoton.addActionListener(miEvento);
		lamina2.add(miBoton);
		add(lamina2, BorderLayout.NORTH);
	}
	
	private class DameTexto implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int correcto =0;
			String email = campo1.getText().trim();
			
			for(int i =0; i<email.length(); i++) {
				if(email.charAt(i)=='@') {
					correcto++;
				}
			}
			
			if(correcto!=1) {
				resultado.setText("Incorrecto");
				System.out.println("Incorrecto");
			}else {
				resultado.setText("Correcto");
				System.out.println("Correcto");
			}
			
			
		}
	}
	private JTextField campo1;
	private JLabel resultado;
	
}