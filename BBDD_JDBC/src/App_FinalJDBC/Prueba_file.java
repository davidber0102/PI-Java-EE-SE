package App_FinalJDBC;

import javax.swing.*;
import javax.swing.filechooser.*;

public class Prueba_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Marco m = new Marco();
			m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		   JFileChooser chooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "File Texto", "txt", "csv");
		    chooser.setFileFilter(filter);
		    int returnVal = chooser.showOpenDialog(m);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		            chooser.getSelectedFile().getAbsolutePath());
		    }

	}

}

class Marco extends JFrame{
	public Marco() {
		setTitle ("Aplicacion JDBC");		
		setBounds(300,300,400,400);	
		setVisible(true);
	}
}
