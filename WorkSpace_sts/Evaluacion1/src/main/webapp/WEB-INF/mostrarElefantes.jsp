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
<title>Insert title here</title>
</head>
<body>


	<c:if test="${msgError!=null }">
		<c:out value="${msgError }"></c:out>
	</c:if>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Nombre</th>
					<th scope="col">Color</th>
					<th scope="col">Madurez</th>
					<th scope="col">Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="elefante" items="${elefantesCapturados}">
					<tr>

						<th scope="row">${elefante.id}</th>
						<td>${elefante.nombre}</td>
						<td>${elefante.color}</td>
						<td>${elefante.madurez}</td>
						<td><a class="btn btn-warning" href="/elefante/editar/${elefante.id}" role="button">Editar</a>
						</td>
						<td><a class="btn btn-danger" href="eliminar/${elefante.id}" role="button">Eliminar</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>

</body>
</html>