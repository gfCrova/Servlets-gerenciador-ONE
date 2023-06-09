<%@page import="java.util.List, com.alura.gerenciador.modelo.Empresa"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
    
<!DOCTYPE html>

<html>
	
	<head>
		<meta charset="UTF-8">
		<title>Lista De Empresas</title>
	</head>
	
	<body>
	
		Usuario Logueado: ${ LoginUsuario.login }
		
		<c:import url="LogoutParcial.jsp"></c:import>
	
		<c:if test="${ not empty empresa }">
			Empresa ${ empresa } registrada!
		</c:if>
		
		<h3><strong>Lista de Empresas: </strong></h3>
		
		<ul>
		
			<c:forEach items="${ empresas }" var="empresa">
				
				<li> ${ empresa.nombre } - <fmt:formatDate value="${ empresa.fechaAbertura }" pattern="dd/MM/yyyy"/>
					<a href="/gerenciador/entrada?accion=MostrarEmpresas&id=${ empresa.id }">Modificar</a>					
					<a href="/gerenciador/entrada?accion=EliminarEmpresa&id=${ empresa.id }">Eliminar</a>
					
				</li>
				
			</c:forEach>
		
		</ul>
		
	</body>
</html>