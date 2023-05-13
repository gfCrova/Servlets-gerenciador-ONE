
<%@page import="java.util.List, com.alura.gerenciador.servlet.Empresa"%>
<%@page taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
<!DOCTYPE html>

<html>
	
	<head>
		<meta charset="UTF-8">
		<title>Lista De Empresas</title>
	</head>
	
	<body>
	
		<h3><strong>Lista de Empresas: </strong></h3>
		
		<ul>
		
			<c:forEach items="${ empresas }" var="empresa">
				<li> ${ empresa.nombre } </li>
			</c:forEach>
		
		</ul>
		
	</body>
</html>