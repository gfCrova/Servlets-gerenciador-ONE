<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<c:url value="/NuevaEmpresa" var="linkServletNuevaEmpresa" />
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Menú Formulario</title>
</head>

<body>

	<h2>Formulario de ingreso de nueva empresa</h2>

	<form action="${ linkServletNuevaEmpresa }" method="post">
	
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
		<input type="submit"/>
	
	</form>
	
</body>
</html>