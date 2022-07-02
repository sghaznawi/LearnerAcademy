<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Grade"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students Grades</title>
</head>
<header>
	<%@include file="menu.jsp" %>
</header>
<body>
<table border="1">
	<tr>
		<th>Student ID</th> 
		<th>Class ID</th>
		<th>Final Grade</th> 
	</tr>
	<core:forEach items="${sessionScope.listOfGrades}" var="grade">
	<tr>
    	<td><core:out value="${grade.studentId}"></core:out>
    	<td><core:out value="${grade.classId}"></core:out>
    	<td><core:out value="${grade.finalGrade}"></core:out>
	</tr>
</core:forEach>

</table>
</body>
</html>