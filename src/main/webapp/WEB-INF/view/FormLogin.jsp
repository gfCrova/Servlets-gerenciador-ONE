<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Log In</title>
</head>

<body>

	<h2>Log In</h2>

	<form action="${ linkEntradaServlet }" method="post">
	
		<div>
			<label>Login:</label> 
			<input type="text" name="login"/>
		</div>
		<br>
		<div>
			<label>Contraseña:</label> 
			<input type="password" name="password"/>
		</div>
		<br>
		<input type="hidden" name="accion" value="Login"/>
		<input type="submit"/>
	
	</form>
	
</body>
</html>