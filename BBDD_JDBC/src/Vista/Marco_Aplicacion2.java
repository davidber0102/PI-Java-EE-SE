package Vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;

import javax.swing.*;
import Controlador.*;

public class Marco_Aplicacion2 extends JFrame{
	public Marco_Aplicacion2(){		
	
		setTitle ("Consulta BBDD-MVC");		
		setBounds(500,300,400,400);		
		setLayout(new BorderLayout());		
		JPanel menus=new JPanel();		
		menus.setLayout(new FlowLayout());		
		secciones=new JComboBox();		
		secciones.setEditable(false);		
		secciones.addItem("Todos");		
		paises=new JComboBox();		
		paises.setEditable(false);
		paises.addItem("Todos");		
		resultado= new JTextArea(4,50);		
		resultado.setEditable(false);		
		add(resultado);		
		menus.add(secciones);		
		menus.add(paises);			
		add(menus, BorderLayout.NORTH);		
		add(resultado, BorderLayout.CENTER);		
		JButton botonConsulta=new JButton("Consulta");	
		
		botonConsulta.addActionListener( new BotonEjecutaController(this));
		
		add(botonConsulta, BorderLayout.SOUTH);
		
		
		addWindowListener(new CargaMenusController(this));
		// vista carga bien
		//System.out.println("Va bien 1!");
	
	}
	public JComboBox secciones;	
	public JComboBox paises;	
	public JTextArea resultado;
}
