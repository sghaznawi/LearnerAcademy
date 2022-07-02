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
<h2>Add Classes</h2>
<form action="tblclassController" method="post">
 <label>Class ID</label> <input type="number" name="classId"/><br/>
 <label>Subject ID</label> <input type="number" name="subjectId"/><br/>
 <label>Teacher ID </label> <input type="number" name="teacherId"/><br/>
 <label>Room Num </label> <input type="number" name="roomNum"/><br/>
 <label>Period </label> <input type="text" name="period"/><br/>

 <input type="submit" value="Add"/> <input type="reset" value="reset"/>
</form>
</body>
</html>