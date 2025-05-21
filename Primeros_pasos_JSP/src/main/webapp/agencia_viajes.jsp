<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 style= "text-align:center">	Agencia de viajes</h2>
	<%
		// Valores por defecto
			String ciudad_favorita = "Madrid";
		// lee la cookkie de la peticion del navegador 
			Cookie[] ccs = request.getCookies();
		// buscar las preferencias, en este caso la ciudad favorita
			if(ccs!= null){
				for(Cookie ccTem : ccs){
					if("agencia_viajes.ciudad_favorita".equals(ccTem.getName())){
						ciudad_favorita = ccTem.getValue();
						break;
					}
				}
			}
	%>
	
	<h3>Vuelos a:  <%=  ciudad_favorita %></h3>
	<p> Esto es un texto de ejemplo	</p>
	<p> Esto es un texto de ejemplo	</p>
	<p> Esto es un texto de ejemplo	</p>
	<p> Esto es un texto de ejemplo	</p>
	
	<h3>Hoteles en: <%=  ciudad_favorita%></h3>
	<p> Esto es un texto de ejemplo	</p>
	<p> Esto es un texto de ejemplo	</p>
	<p> Esto es un texto de ejemplo	</p>
	<p> Esto es un texto de ejemplo	</p>
	
	<h3>Descuentos en restaurantes en:  <%=  ciudad_favorita%></h3>
	<p> Esto es un texto de ejemplo	</p>
	<p> Esto es un texto de ejemplo	</p>
	<p> Esto es un texto de ejemplo	</p>
	<p> Esto es un texto de ejemplo	</p>
	

</body>
</html>