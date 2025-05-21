<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejerccio practico CRUD</title>
	<style type="text/css">
		th{
			border-bottom: solid #f00 2px ;
			font-size:1.25em;
			font-weight: bold;
			color: #ffffff;
			background-color: #08088A;
		}
		
		.filas{
			text-align:center;
			background-color: #5882FA;
		}
		
		table{
			float:left;
		}
		
		#ontenedorBoton{
			margin-left:1000px;
		}
	-- video 255 minuto 8
	</style>
</head>	
<body>	
	<table>
		<tr>
			<th> Codigo Articulo </th>
			<th> Seccion del Articulo </th>
			<th> Nombre del Articulo </th>
			<th> Precio del Articulo </th>
			<th> Fecha </th>
			<th> Importado </th>
			<th> Pais de Origen del Articulo </th>
			<th> Accion </th>
		</tr>			
			<c:forEach var="temProd" items="${LISTAPRODUCTOS}">
			<!-- LINK PARA CADA PRODUCT CON SU CAMPO CLAVE -->
			<c:url var = "linkTemp" value="ControladorProductos">
				<c:param name="instruccion" value="cargar"></c:param>
				<c:param name="CArticulo" value="${ temProd.cArt}"></c:param>
			</c:url>
			
				<!-- LINK ELIMINAR REGISTRO CON SU CAMPO  CLAVE -->
			<c:url var = "linkTempEliminar" value="ControladorProductos">
				<c:param name="instruccion" value="eliminar"></c:param>
				<c:param name="CArticulo" value="${ temProd.cArt}"></c:param>
			</c:url>
			
				<tr> 
					<td class ="filas"> 	${ temProd.cArt } </td>
					<td class ="filas">  ${ temProd.seccion }  </td>
					<td class ="filas">  ${ temProd.nArt }  </td>
					<td class ="filas">  ${ temProd.precio }  </td>
					<td class ="filas">  ${ temProd.fecha }  </td>
					<td class ="filas">  ${ temProd.importado }  </td>
					<td class ="filas">  ${ temProd.importado }  </td>
					<td class ="filas"> <a href="${linkTemp}">Actualizar  </a> &nbsp;&#47;&nbsp; <a href="${linkTempEliminar}">Eliminar </a></td>
				</tr>
			</c:forEach>			
	</table>
	
	<div id="ContenedorBoton">
		<input type="button" value="Insertar Registro" onclick="window.location.href='inserta_productos.jsp'"/>
	</div>

</body>
</html>