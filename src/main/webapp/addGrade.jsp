<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
label {
	display: table-cell;
	text-align: right;
}

input {
	display: table-cell;
}

div.row {
	display: table-row;
}
</style>
<meta charset="ISO-8859-1">
<title>Learners Academy</title>
</head>
<header>
	<%@include file="menu.jsp"%>
</header>
<body>
	<h2>Add Student's Grade</h2>
	<form action="GradeController" method="post">
		<table>
			<tr>
				<td>Student ID</td>
				<td><input type="text" name="studentId" /></td>
			</tr>
			<td>Class ID</td>
			<td><input type="text" name="classId" /></td>
			</tr>
			<td>Final Grade</td>
			<td><input type="text" name="finalGrade" /></td>
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