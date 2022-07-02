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
<h2>Add Student's Grade</h2>
<form action="GradeController" method="post">
 <label>Student ID</label>
 <input type="number" name="studentId"/><br/>
 <label>Class ID</label>
 <input type="number" name="classId"/><br/>
 <label>Final Grade </label>
 <input type="number" name="finalGrade"/><br/>
 <input type="submit" value="Add"/>
 <input type="reset" value="reset"/>
</form>
</body>
</html>