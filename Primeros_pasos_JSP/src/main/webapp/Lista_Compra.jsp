<%@ page import="java.util.*" %>
<html>

<body>
<form name="Formulario_Compra" action="Lista_Compra.jsp">
 
  <p>Articulos a comprar:</p>
  <p>
    <label>      <input type="checkbox" name="articulos" value="agua " >      Agua </label>
    <br>
    <label>      <input type="checkbox" name="articulos" value="leche" >      Leche </label>
    <br>
     <label>      <input type="checkbox" name="articulos" value="pan" >      Pan </label>
    <br>
     <label>      <input type="checkbox" name="articulos" value="mazanas" >      Manzanas </label>
    <br>
     <label>      <input type="checkbox" name="articulos" value="carne" >      Carne </label>
      <br>
       <label>      <input type="checkbox" name="articulos" value="pescado" >      Pescado </label>
  </p>
  <p>
    <input type="submit" name="button" id="button" value="Enviar">
    <br>
  </p>
</form>

<h2>Carro de la Compra</h2>

	<ul>
		<%
			List<String> ListaElementos = (List<String>)session.getAttribute("misElementos");
				if(ListaElementos == null){
					ListaElementos = new ArrayList<String>();
					session.setAttribute("misElementos", ListaElementos);
				}
		
			String [] elementos = request.getParameterValues("articulos");
		
		if (elementos != null){
			for (String elemen: elementos){
				//out.println(" <li>" + elemen + " </li>");
				ListaElementos.add(elemen);
			}
		}
		
		for(String lista : ListaElementos ){
			out.println(" <li>" + lista + " </li>");
		}
		
		%>
	</ul>
</body>
</html>