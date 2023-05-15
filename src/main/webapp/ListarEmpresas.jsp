<%@page import="java.util.List, com.alura.gerenciador.servlet.Empresa"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
    
<!DOCTYPE html>

<html>
	
	<head>
		<meta charset="UTF-8">
		<title>Lista De Empresas</title>
	</head>
	
	<body>
	
		<c:if test="${ not empty empresa }">
			Empresa ${ empresa } registrada!
		</c:if>
		
		<h3><strong>Lista de Empresas: </strong></h3>
		
		<ul>
		
			<c:forEach items="${ empresas }" var="empresa">
				
				<li> ${ empresa.nombre } - <fmt:formatDate value="${ empresa.fechaAbertura }" pattern="dd/MM/yyyy"/>
					<a href="/gerenciador/MostrarEmpresa?id=${ empresa.id }">Modificar</a>					
					<a href="/gerenciador/EliminarEmpresa?id=${ empresa.id }">Eliminar</a>
					
				</li>
				
			</c:forEach>
		
		</ul>
		
	</body>
</html>