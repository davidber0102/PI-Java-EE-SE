<html>
<body>
	
	<h1 style="text-align : center">
		Objetos Predifinos JSP
	</h1>
	 <br>	
		<span>
				Peticion datos del navegador: <%= request.getHeaders("User-Agent") %>
		</span>
	 <br> 
	 
	  <br>	
		<span>
				Peticion de idioma utiizado en el navegador: <%= request.getLocale() %>
		</span>
	 <br> 
</body>
</html>