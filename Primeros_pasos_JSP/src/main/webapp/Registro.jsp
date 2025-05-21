<html>
<body>
	<h1 style="text-align : center">		Usuarios Registrados	</h1>
	 <br> 
	 
	 Usuario confirmado: <br> <br> 
	 
	 Nombre: <%= request.getParameter("nomReg") %><br> 
	 Apellido: <%= request.getParameter("appeReg") %>
	 <br>
		<br>
		<jsp:include page="Fecha.jsp"></jsp:include>
</body>
</html>