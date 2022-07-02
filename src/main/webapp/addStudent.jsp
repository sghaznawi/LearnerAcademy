<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learners Academy</title>
</head>
<header>
	<%@include file="menu.jsp" %>
</header>
<body>
<h2>Add Students Information...</h2>
<form action="StudentController" method="post">
 <label>Student ID</label> <input type="number" name="studentId"/><br/>
 <label>Student Name</label> <input type="text" name="studentName"/><br/>
 <label>Email </label> <input type="text" name="email"/><br/>
 <label>Age </label> <input type="number" name="age"/><br/>
 <label>Grade </label> <input type="number" name="grade"/><br/>

 <input type="submit" value="Add"/> <input type="reset" value="reset"/>
</form>
</body>
</html>