<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>

	<div>
		<c:if test="${msgError!=null }">
			<c:out value="${msgError }"></c:out>
		</c:if>
		<form:form action="actualizar/${auto.id}" method="post" modelAttribute="auto">
			<form:label path="nombre" class="form-label">Nombre</form:label>
			<form:input path="nombre" class="form-control"/>
			<br>
			<form:label path="marca" class="form-label">Marca</form:label>
			<form:input path="marca" class="form-control"/>
			<br>
			<form:label path="color" class="form-label">Color</form:label>
			<form:input path="color" class="form-control"/>
			<br>
			<form:label path="velocidad" class="form-label">Velocidad</form:label>
			<form:input path="velocidad" class="form-control"/>
			<br>
			<button type="submit" class="btn btn-primary">Editar Auto</button>
			
		</form:form>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>