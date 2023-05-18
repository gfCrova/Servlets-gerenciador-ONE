<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
    
<!DOCTYPE html>

<html>
s
	<head>
		<meta charset="UTF-8">
		<title>Nueva Empresa</title>
	</head>
	
	<body>
	
		<!-- Verificar -->
		<c:if test="${ not empty empresa }">
			Empresa ${ empresa } registrada!
		</c:if>
		<c:if test="${ empty empresa }">
			Ninguna empresa registrada!
		</c:if>
		
		<c:import url="LogoutParcial.jsp"></c:import>
		
	</body>

</html>