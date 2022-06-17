<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>
	<div>
	<!-- pasar informacion desde la vista a una url -->
	<!-- method "get" es por default, los parametros se ven en la ruta -->
	<!-- method "post", los parametros no se ven, van ocultos -->
	
		<form action="/registro/usuario" method="post">
		<label for="nombre">Nombre: </label>
		<input type="text" id="nombre" name="nombre">
		<br>
		<label for="apellido">Apellido: </label>
		<input type="text" id="apellido" name="apellido">
		<br>
		<label for="edad">Edad: </label>
		<input type="number" id="edad" name="edad">
		<br>
		<input type="submit" value ="Registrar">
		<br>
		<input type="button" value ="Enviar">
		<br>
		
		</form>
	</div>
</body>
</html>