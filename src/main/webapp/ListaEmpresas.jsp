
<%@page import="java.util.List, com.alura.gerenciador.servlet.Empresa"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Lista De Empresas</title>
	</head>
	<body>
		<h3><strong>Lista de Empresas: </strong></h3>
		<ul>
			<% 
				List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
				for (Empresa empresa : lista) {
			%>
					<li> <%= empresa.getNombre()%> </li>
			<%
				} 
			 %>
		</ul>
	</body>
</html>