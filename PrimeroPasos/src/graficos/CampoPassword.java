package graficos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
public class CampoPassword {

	public static void main(String[] args) {
		MarcoPassword marco = new MarcoPassword();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class MarcoPassword extends JFrame{
	public MarcoPassword(){
		super();
		setVisible(true);
		setBounds(400, 300, 500, 500);
		setTitle("---Bienvenido a Java --- TRABAJANDO CON CAMPO DE CONTRASEÑA--");	
		LaminaPassword lamina = new LaminaPassword();
		add(lamina);
	}	
}

class LaminaPassword extends JPanel{
	JPasswordField c_contrasenia;
	
	public LaminaPassword() {
		setLayout(new BorderLayout());
		
		JPanel laminaSuperior = new JPanel();
		laminaSuperior.setLayout(new GridLayout(2,2));
		add(laminaSuperior, BorderLayout.NORTH);
		
		JLabel eqtiqueta1 = new JLabel("Usuario");
		JLabel eqtiqueta2 = new JLabel("Contraseñas");
		
		JTextField cUsuario = new JTextField(15); 
		c_contrasenia = new JPasswordField(15);
		
		CompruebaPass miEvento = new CompruebaPass();
		
		c_contrasenia.getDocument().addDocumentListener(miEvento);
		
		laminaSuperior.add(eqtiqueta1);
		laminaSuperior.add(cUsuario);
		laminaSuperior.add(eqtiqueta2);
		laminaSuperior.add(c_contrasenia);
		
		JButton enviar = new JButton("Enviar");
		add(enviar, BorderLayout.SOUTH);
	}
	
	private class CompruebaPass implements DocumentListener{
		@Override
		public void insertUpdate(DocumentEvent e) {
			char [] contrasenia;			
			contrasenia = c_contrasenia.getPassword();
			if (contrasenia.length<8 || contrasenia.length>12){
				c_contrasenia.setBackground(Color.red);
			}else {
				c_contrasenia.setBackground(Color.white);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			char [] contrasenia;			
			contrasenia = c_contrasenia.getPassword();
			if (contrasenia.length<8 || contrasenia.length>12){
				c_contrasenia.setBackground(Color.red);
			}else {
				c_contrasenia.setBackground(Color.white);
			}
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			
		}
	}
}