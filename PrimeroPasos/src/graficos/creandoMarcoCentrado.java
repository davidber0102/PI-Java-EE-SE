package graficos;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
public class creandoMarcoCentrado {
	public static void main(String[] args) {
		MarcoCentrado marco1 = new MarcoCentrado();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoCentrado extends JFrame{
	public MarcoCentrado() {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		miPantalla.getScreenSize();
		
		Dimension tamaPantalla = miPantalla.getScreenSize();
		 int alturaPantala = tamaPantalla.height;
		 int anchoPantala = tamaPantalla.width;
		 
		 setSize(anchoPantala/2, alturaPantala/2);
		 setLocation(anchoPantala/4, alturaPantala/4);
		 setTitle("Bienvenido a Java");
		 
		 Image iconoInicio =  miPantalla.getImage("src/graficos/user.gif");
		 //setIconImage(iconoInicio);
		 
		
		
	}
	
}