package graficos;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class MarcoSliuders {
	public static void main(String[] args) {
		MarcoSlider marco = new MarcoSlider();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoSlider extends JFrame{
	public MarcoSlider() {
		super();
		setVisible(true);
		setBounds(600, 200, 600, 300);
		setTitle("---Bienvenido a Java --- TRABAJANDO SLIDERS---");	
		LaminaSliders lamina = new LaminaSliders();
		add(lamina);
	}
}

class LaminaSliders extends JPanel{
	public LaminaSliders() {
		JSlider control = new JSlider(0, 100,25);
		control.setMajorTickSpacing(25);
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		
		control.setFont(new Font("serif", Font.ITALIC, 10));
		control.setPaintLabels(true);
		
		control.setSnapToTicks(true);
		
		
		add(control);
	}
}