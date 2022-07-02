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
<h2>Add Subjects</h2>
<form action="SubjectController" method="post">
 <label>Subject ID</label>
 <input type="number" name="subjectId"/><br/>
 <label>Subject</label>
 <input type="text" name="subject"/><br/>
 <label>Description </label>
 <input type="text" name="description"/><br/>
 <input type="submit" value="Add"/>
 <input type="reset" value="reset"/>
</form>
</body>
</html>