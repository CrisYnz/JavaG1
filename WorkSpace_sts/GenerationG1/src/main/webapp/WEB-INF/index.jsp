<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cristian Yañez</title>
</head>
<body>
	<h1>Hola <c:out value="${nombres}"></c:out> <c:out value="${apellidos}"></c:out></h1>
	<h2>Su apodo es <c:out value="${apodos}"></c:out></h2>
	<p>Su edad es <c:out value="${edad}"></c:out> </p>
	<br>
	<p><c:out value="${usuario.nombre}${usuario.apellido}${usuario.apodo}${usuario.edad}"></c:out></p>
</body>
</html>
