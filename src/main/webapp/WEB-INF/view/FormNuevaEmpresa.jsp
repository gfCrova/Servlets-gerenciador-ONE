<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Menú Formulario</title>
</head>

<body>

	<h2>Formulario de ingreso de nueva empresa</h2>

	<form action="${ linkEntradaServlet }" method="post">
	
		<div>
			<label>Nombre Empresa:</label> 
			<input type="text" name="nombre"/>
		</div>
		<br>
		<div>
			<label>Fecha Abertura:</label> 
			<input type="text" name="fecha"/>
		</div>
		<br>
		<input type="hidden" name="accion" value="NuevaEmpresa"/>
		<input type="submit"/>
	
	</form>
	
	<c:import url="LogoutParcial.jsp"></c:import>
	
	
</body>
</html>