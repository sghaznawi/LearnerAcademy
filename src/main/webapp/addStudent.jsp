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
	<h2>Add Students Information...</h2>
	<form action="StudentController" method="post">
		<table>
			<tr>
				<td>Student ID</td>
				<td><input type="text" name="studentId" /></td>
			</tr>
			<td>Student Name</td>
			<td><input type="text" name="studentName" /></td>
			</tr>
			<td>Email</td>
			<td><input type="text" name="email" /></td>
			</tr>
			<td>Age</td>
			<td><input type="text" name="age" /></td>
			</tr>
			<td>Grade</td>
			<td><input type="text" name="grade" /></td>
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