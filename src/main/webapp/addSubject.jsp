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
	<h2>Add Subjects</h2>
	<form action="SubjectController" method="post">
		<table>
			<tr>
				<td>Subject ID</td>
				<td><input type="text" name="subjectId" /></td>
			</tr>
			<tr>
				<td>Subject</td>
				<td><input type="text" name="subject" /></td>
			</tr>

			<tr>
				<td>Description</td>
				<td><input type="text" name="description" /></td>
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