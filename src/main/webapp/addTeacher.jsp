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
<h2>Add Instructors	</h2>
<form action="TeacherController" method="post">
 <label>Teacher ID</label> <input type="number" name="teacherId"/><br/>
 <label>Teacher Name</label> <input type="text" name="teacherName"/><br/>
 <label>Email </label> <input type="text" name="email"/><br/>
 <label>Age </label> <input type="number" name="age"/><br/>
 <label>Faculty </label> <input type="text" name="faculty"/><br/>

 <input type="submit" value="Add"/> <input type="reset" value="reset"/>
</form>
</body>
</html>