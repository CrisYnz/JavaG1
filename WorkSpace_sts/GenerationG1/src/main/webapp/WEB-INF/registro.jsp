<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>
	<div>
		<c:if test="${msgError!=null }">
			<c:out value="${msgError }"></c:out>
		</c:if>
		<form:form action="/registro/usuario" method="post"
			modelAttribute="usuario">
			<form:label path="nombre" class="form-label">Nombre</form:label>
			<form:input path="nombre" class="form-control" />
			<br>
			<form:label path="apellido" class="form-label">Apellido</form:label>
			<form:input path="apellido" class="form-control" />
			<br>
			<form:label path="apodo" class="form-label">Apodo</form:label>
			<form:input path="apodo" class="form-control" />
			<br>
			<form:label path="edad" class="form-label">Edad</form:label>
			<form:input type="number" path="edad" class="form-control" />
			<br>
			<form:label path="password" class="form-label">password</form:label>
			<form:input type="password" path="password" class="form-control" />
			<br>
			<input type="submit" value="registrar">
			<button type="submit" class="btn btn-primary">Guardar Auto</button>

		</form:form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>

</body>
</html>