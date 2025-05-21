package graficos;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JFrame;

public class FrameSliders {
	public static void main(String[] args) {
		MarcoFrame marco = new MarcoFrame();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoFrame extends JFrame{
	public MarcoFrame() {
		super();
		setVisible(true);
		setBounds(600, 200, 600, 300);
		setTitle("---Bienvenido a Java --- TRABAJANDO SLIDERS 2---");	
		LaminaSFrame lamina = new LaminaSFrame();
		add(lamina);
	}
}

class LaminaSFrame extends JPanel{
	private JLabel rotulo;
	private JSlider control;
	private static int contador; 
	public LaminaSFrame() {
		setLayout(new BorderLayout());
		
		rotulo = new JLabel("En un lugar de la Mancha de cuyo nonbre no quiero acordarme...");
		rotulo.setFont(new Font("Serif", Font.PLAIN, 18));
		add(rotulo, BorderLayout.CENTER);
		
		control = new JSlider(8, 50, 12);
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);		
		control.setPaintTicks(true);		
		control.setFont(new Font("serif", Font.ITALIC, 10));
		control.setPaintLabels(true);
		
		EventoSlider evento2 = new EventoSlider();
		control.addChangeListener(evento2);
		
		JPanel laminaSlider1 = new JPanel();
		laminaSlider1.add(control);
		
		add(laminaSlider1, BorderLayout.NORTH);
	}
	
	private class EventoSlider implements ChangeListener{
		@Override
		public void stateChanged(ChangeEvent e) {
			/*contador++;
			System.out.println("Estas manipulando el Slider: " + contador + " veces" +" && numero :" + control.getValue());*/
			rotulo.setFont(new Font("serif", Font.PLAIN, control.getValue()));
			
		}
		
		
	}
}