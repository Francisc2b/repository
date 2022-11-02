<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pedidos</title>
</head>
<body>

<h2>Lista de pedidos</h2>

<c:forEach items="${listaPedidos}" var="pedido">
	<li>${pedido.id } - ${pedido.desc} </li>
</c:forEach>

</body>
</html>