<html>
<body>
	
	<h1 style="text-align : center">
		Ejemplo Declaraciones
	</h1>
	 <br>	
		<%!
			private int resultado;
		
			public int metodoSuma(int num1, int num2){
				resultado = num1 + num2;
				return resultado;			}
			
			public int metodoResta(int num1, int num2){
				resultado = num1 - num2;
				return resultado;			}
			
			public int metodoMultiplica(int num1, int num2){
				resultado = num1 * num2;
				return resultado;			}				
		%>	 
	 <br> 
	 
	El resultado de la suma es:  <%=  metodoSuma(7,5) %> 
	 <br> 
	 
	 El resultado de la resta es:  <%=  metodoResta(7,5) %> 
	 <br> 
	 
	 El resultado de la multiplicacion es:  <%=  metodoMultiplica(7,5) %> 
	 <br> 
</body>
</html>