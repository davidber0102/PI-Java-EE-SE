<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String usuario = request.getParameter("usuario");
		String contra = request.getParameter("contra");
		String pais = request.getParameter("pais");
		String tecno = request.getParameter("tecnologias");
		String className = "com.mysql.jdbc.Driver";
		Class.forName(className);		
		try{
		Connection myConex = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_jsp", "root" , "dBd#C4rt0$202A");		
		Statement st = myConex.createStatement();		
		String instSql = "INSERT INTO usuarios( Nombre, Apellido, Usuario, Contrasena, Pais, Tecnologia) VALUES ('" + nombre + "', ' " + apellido +" ', ' " + usuario + " ', '" + contra +"', '" + pais +"', '" + tecno +"' ) ";		
		st.executeLargeUpdate(instSql);		 
		 out.println(" Registrado con Exito");
		}catch(Exception e){
			e.printStackTrace();
			out.println(" Ocurrio un error en ejeccion");
		}
%>
</body>
</html>