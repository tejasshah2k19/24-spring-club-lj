<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Login</h2>
	<form action="authenticate" method="post">
 		Email:<input type="text" name="email"/><br><br>
		Password : <input type="password" name="password"/><br><br>
		<input type="submit" value="Login"/>
	</form>
	<br>
	<a href="signup">signup</a>
</body>
</html>