<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
</head>
<body>

	<div>
		<c:if test="${msgError!=null }">
			<c:out value="${msgError }"></c:out>
		</c:if>
		<form:form action="licencia/guardar" method="post"
			modelAttribute="licencia">
			<form:label path="numero" class="form-label">Numero</form:label>
			<form:input path="numero" class="form-control" type="number" />
			<br>
			<form:label path="fechaVencimiento" class="form-label">fechaVencimiento</form:label>
			<form:input path="fechaVencimiento" class="form-control" type="date" />
			<br>
			<form:label path="clase" class="form-label">clase</form:label>
			<form:input path="clase" class="form-control" type="text" />
			<br>
			<form:label path="estado" class="form-label">Estado</form:label>
			<form:input path="estado" class="form-control" type="text" />
			<br>
			<!-- USUARIO -->
			<form:select path="usuario" class="form-select">
				<form:option value="0">Seleccione un usuario</form:option>

				<c:forEach items="${listaUsuarios}" var="usuario">
					<c:if test="${usuario.licencia.id == null}">
						<!-- en value pasamos la pk -->
						<form:option value="${usuario.id}">${usuario.nombre} ${usuario.apellido}</form:option>
					</c:if>
				</c:forEach>

			</form:select>
			<button type="submit" class="btn btn-primary">Guardar
				Licencia</button>

		</form:form>
		<br>
		<div class="container">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Numero</th>
						<th scope="col">fecha Vencimiento</th>
						<th scope="col">Clase</th>
						<th scope="col">Estado</th>
						<th scope="col">Usuario</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="licencia" items="${listaLicencias}">
						<tr>
							<th scope="row">${licencia.id}</th>
							<td>${licencia.numero}</td>
							<td>${licencia.fechaVencimiento}</td>
							<td>${licencia.clase}</td>
							<td>${licencia.estado}</td>
							<td>${licencia.usuario.nombre} ${licencia.usuario.apellido}</td>
							<!--Lazy -->
							<td><a class="btn btn-warning"
								href="/licencia/editar/${licencia.id}" role="button">Editar</a>
							</td>
							<td><a class="btn btn-danger"
								href="/licencia/eliminar/${licencia.id}" role="button">Eliminar</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
</body>
</html>