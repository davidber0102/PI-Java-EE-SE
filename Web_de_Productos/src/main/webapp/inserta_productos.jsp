<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario Insertar</title>
</head>
<body>

	<h2> Fomrularo</h2>
	<h3> <strong>Inserta Registro</strong></h3>
<form action="ControladorProductos" method="get">
<input type="hidden" name="instruccion" value="insertarBBDD">
  <table width="100%" border="3">
    <tr>
      <th width="29%" scope="col">Codigo Articulo</th>
      <th width="71%" scope="col"><label for="CArt"></label>
        <input type="text" name="CArt" id="CArt" /></th>
    </tr>
    <tr>
      <td>Seccion Articulo</td>
      <td><label for="seccion"></label>
        <input type="text" name="seccion" id="seccion" /></td>
    </tr>
    <tr>
      <td>Nombre Articulo</td>
      <td><label for="nomArt"></label>
        <input type="text" name="nomArt" id="nomArt" /></td>
    </tr>
    <tr>
      <td>Precio Articulo</td>
      <td><label for="precioArt"></label>
        <input type="text" name="precioArt" id="precioArt" /></td>
    </tr>
    <tr>
      <td>Fecha</td>
      <td><label for="fecha"></label>
        <input type="text" name="fecha" id="fecha" /></td>
    </tr>
    <tr>
      <td>Importado</td>
      <td><label for="importado"></label>
        <input type="text" name="importado" id="importado" /></td>
    </tr>
    <tr>
      <td>Pais de Origen</td>
      <td><label for="pOrigen"></label>
        <input type="text" name="pOrigen" id="pOrigen" /></td>
    </tr>
    <tr>
      <td><input type="submit" name="enviar" id="enviar" value="Enviar" /></td>
      <td><input type="submit" name="restablecer" id="restablecer" value="Restablecer" /></td>
    </tr>
  </table>
</form>

</body>
</html>