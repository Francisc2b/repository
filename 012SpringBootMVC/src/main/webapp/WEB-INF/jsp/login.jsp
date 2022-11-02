<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

<h2>Login </h2>

<form:form action="login"  method="post" modelAttribute="usuario">
	<form:label path="nombre">Nombre usuario</form:label>
	<form:input path="nombre" />	</br>
	<form:label path="clave">Clave</form:label>
	<form:input path="clave" /> </br>
	<form:button>Login</form:button>
</form:form>

</body>
</html>