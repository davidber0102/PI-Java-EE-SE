<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
 <%
 		String alumnos[] = { "Antonio", "Sandra", "Maria", "Paco"};
 		pageContext.setAttribute("losAlumnos", alumnos); 
 %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP--TAGS</title>
</head>
<body>
	<!--   <%
			for(String temAlumnos : alumnos){
				out.println(temAlumnos + "<br>");
			}
	%> -->
	
	<c:forEach var="temAlumnos" items="${ losAlumnos}">
		${temAlumnos} <br>
	</c:forEach>
	
	
</body>
</html>