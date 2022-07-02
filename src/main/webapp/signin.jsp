<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" type="text/css" rel="stylesheet" />
<img src="logo.jpg" height=40% width=40%"/>

<meta charset="ISO-8859-1">
<title>Learner's Academy</title>
</head>
<body>
	<h3>Please sign using credentials...</h3>
	<form action = "SignIn" method="post">
	<label> Username	</label>
	<input type="text" name="user">
	<label> Password	</label>
	<input type=password name="pass">
	<input type="submit" value="Sign in">
	<input type="reset" value= "Reset">
	
	</form>
</body>
</html>