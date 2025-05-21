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
		String usuario = request.getParameter("usuario");
		String contra = request.getParameter("contra");

		String className = "com.mysql.jdbc.Driver";
		Class.forName(className);		
		try{
			Connection myConex = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_jsp", "root" , "dBd#C4rt0$202A");	
			String sql1 = "SELECT * FROM USUARIOS WHERE USUARIO = ? AND CONTRASENA = ?";
			PreparedStatement enviaUsuario = myConex.prepareStatement(sql1,  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			enviaUsuario.setString(1, usuario);
			enviaUsuario.setString(2, contra);
			ResultSet rs = enviaUsuario.executeQuery();
			if(rs.absolute(1))	out.println(" Usuaro Correcto, ingreseando....");
			else out.println(" Usuaro Incorrecto, Verifique....");
		}catch(Exception e){
			e.printStackTrace();
			out.println(" Ocurrio un error en ejeccion");
		}

		PreparedStatement enviaConsultaContra;
%>
</body>
</html>