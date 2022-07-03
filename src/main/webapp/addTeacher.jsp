<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Learners Academy</title>
</head>
<header>
	<%@include file="menu.jsp"%>
</header>
<body>
	<h2>Add Instructors</h2>
	<form action="TeacherController" method="post">
		<table>
			<tr>
				<td>Teacher ID</td>
				<td><input type="text" name="teacherId" /></td>
			</tr>
			<td>Teacher Name</td>
			<td><input type="text" name="teacherName" /></td>
			</tr>
			<td>Email</td>
			<td><input type="text" name="email" /></td>
			</tr>
			<td>Age</td>
			<td><input type="text" name="age" /></td>
			</tr>
			<td>Faculty</td>
			<td><input type="text" name="faculty" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add" /> <input type="reset"
					value="Reset" /></td>
			</tr>
		</table>
	</form>
</body>
</html>