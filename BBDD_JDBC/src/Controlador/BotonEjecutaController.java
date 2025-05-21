package Controlador;
import java.awt.event.*;
import java.sql.*;

import Modelo.*;
import Vista.*;

public class BotonEjecutaController implements ActionListener {
	
	public BotonEjecutaController(Marco_Aplicacion2 elmarco) {
		this.elmarco = elmarco;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String seleccionSeccion = (String) elmarco.secciones.getSelectedItem();
		String seleccionPais = (String) elmarco.paises.getSelectedItem();
		
		resultadoConsulta = obj.filtarBBDD(seleccionSeccion, seleccionPais);
		
		try {
			elmarco.resultado.setText("");
			while(resultadoConsulta.next()) {
				
				elmarco.resultado.append(resultadoConsulta.getString(1));
				elmarco.resultado.append(", ");
				
				elmarco.resultado.append(resultadoConsulta.getString(2));
				elmarco.resultado.append(", ");
				
				elmarco.resultado.append(resultadoConsulta.getString(3));
				elmarco.resultado.append(", ");
				
				elmarco.resultado.append(resultadoConsulta.getString(4));
				elmarco.resultado.append(", ");
				
				elmarco.resultado.append(resultadoConsulta.getString(5));
				elmarco.resultado.append(", ");
				
				elmarco.resultado.append(resultadoConsulta.getString(6));
				elmarco.resultado.append("\n");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	private Marco_Aplicacion2 elmarco;
	EjecutaConsultas obj = new EjecutaConsultas(); 
	private ResultSet resultadoConsulta;
}
