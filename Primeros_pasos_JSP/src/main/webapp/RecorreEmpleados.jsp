<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page import ="java.util.*, java.sql.*,  pildorasinformaticas.com.jsptags.*" %>
 
 <%
  ArrayList<Empleados1> datos = new ArrayList<>();
  		String className = "com.mysql.jdbc.Driver";
  		Class.forName(className);	
  	 		try{
  	 			Connection myConex = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_jsp", "root" , "dBd#C4rt0$202A");		
  	 			Statement st = myConex.createStatement();		
  	 			String instSql = "SELECT * FROM empleados";		
  	 			ResultSet rs = st.executeQuery(instSql);
  	 			
  	 				while(rs.next()){
  	 					datos.add(new Empleados1(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
  	 				}
  	 				rs.close();
  	 				myConex.close();
  	 			 
  	 			 out.println(" Registrado con Exito");
  	 		}catch(Exception e){
  	 			out.print("Ocurrio un error de coneccion con la base de datos");
  	 			e.printStackTrace();
  	 		}
  	 		
  	 		
  	 		pageContext.setAttribute("losEmpleados", datos); 
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
	.cabecera{ 
		font-weigth: bold;
	}

</style>
</head>
<body>
	<table border = "1">
		<tr class = "cabecera">	
			<td>Nombre </td> <td> Apellido</td> <td> Puesto</td>     <td> Salario</td>
			<!-- <td> Bonus</td> --> 
		 </tr>

		<c:forEach var="temEmpleados" items="${losEmpleados}">		
			<tr> 
				<td>${temEmpleados.nombre}</td> <td>${temEmpleados.apellido}</td> <td>${temEmpleados.puesto}</td> 
				<td>
					<c:choose>
							<c:when test="${temEmpleados.salario<40000}">  ${temEmpleados.salario+5000} </c:when>
							<c:when test="${temEmpleados.salario>40000 && temEmpleados.salario <=50000}">  ${temEmpleados.salario+2000} </c:when>
							<c:otherwise> ${temEmpleados.salario} </c:otherwise>
					</c:choose>
				</td>
				<!--<td>
					
					<c:if test="${temEmpleados.salario<40000}"> ${temEmpleados.salario+5000}</c:if>
					<c:if test="${temEmpleados.salario>=40000}"> ${temEmpleados.salario}</c:if>
				</td>-->
				<!-- <td> <c:if test="${temEmpleados.salario<40000}">5000</c:if>
					<c:if test="${temEmpleados.salario>=40000}">---</c:if>
				</td> -->
			</tr>
		</c:forEach>
	</table>
</body>
</html>