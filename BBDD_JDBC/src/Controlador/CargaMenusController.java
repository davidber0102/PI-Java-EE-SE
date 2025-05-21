package Controlador;
import java.awt.event.*;
import Modelo.*;
import Vista.*;

public class CargaMenusController extends WindowAdapter{	
	
	public CargaMenusController(Marco_Aplicacion2 elmarco) {
		this.elmarco = elmarco;
	}
	
	public void windowOpened(WindowEvent e) {	
		obj.ejecutaConsulta();
		
		try {
			while(obj.rs.next()) {
				
				
				elmarco.secciones.addItem(obj.rs.getString(1));
			}
			//obj.rsSecc.close();
			
			while(obj.rs2.next()) {
				
				elmarco.paises.addItem(obj.rs2.getString(1));
			}
			
		}catch(Exception ex){
			System.out.println("SIN CONECCION BBDD!!");
			ex.printStackTrace();
		}
		
		//System.out.println("Va bien 2!");
	}


		
	CargaMenus obj = new CargaMenus();
	Marco_Aplicacion2 elmarco;
}


// video 214 minuto 1