<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<c:url value="/ModificarEmpresa" var="linkServletNuevaEmpresa" />

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Menú Actualizar</title>
</head>
<body>
	
	<h2>Modificar la empresa</h2>

	<form action="${ linkServletNuevaEmpresa }" method="post">
	
		<div>
			<label>Nombre Empresa:</label> 
			<input type="text" name="nombre" value="${ empresas.nombre }"/>
		</div>
		<br>
		<div>
			<label>Fecha Abertura:</label> 
			<input type="text" name="fecha" value="<fmt:formatDate value="${ empresas.fechaAbertura }" pattern="dd/MM/yyyy"/>" />
		</div>
		<br>
		<input type="hidden" name="id" value="${ empresas.id }"/>
		<input type="submit"/>
	
	</form>

</body>
</html>