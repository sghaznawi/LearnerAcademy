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

	<h2>Add Classes</h2>
	<table>
		<form action="tblclassController" method="post">
			<tr>
				<td>Class ID</td>
				<td><input type="text" name="classId" /></td>
			</tr>
			<tr>
				<td><label>Subject ID</td>
				<td><input type="text" name="subjectId" /></td>
			</tr>
			<tr>
				<td>Teacher ID</td>
				<td><input type="text" name="teacherId" /></td/>
			</tr>
			<tr>
				<td>Room Num</td>
				<td><input type="text" name="roomNum" /></td>
			</tr>
			<tr>
				<td>Period</td>
				<td>
				
				<select name="period" id="period">
				  <option value="Morning">Morning</option>
				  <option value="Noon">Noon</option>
				  <option value="After Noon">After Noon</option>
				  <option value="Evening">Evening</option>
				</select> 
				</td>
				
				
				
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add" /><input type="reset"
					value="Reset" /></td>
		</form>
	</table>

</body>
</html>