<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>añadir pedido</title>
</head>
<body>

<h4>Crear un nuevo pedido</h4>


<form:form action="crear" method="post" 
           modelAttribute="pedidoForm" >
   <br/>
   <form:label path="clave">Clave:</form:label>
   <form:password  path="clave" /> 
   <form:errors path="clave"></form:errors>
   <br/>
   <form:button>Login</form:button>
</form:form>

</body>
</html>