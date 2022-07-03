<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}style.css" />

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Learner's Academy</title>
</head>
<body>
	<h3>Please sign in...</h3>
	<form action="SignIn" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="user"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type=password name="pass"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Sign in"><input
					type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>