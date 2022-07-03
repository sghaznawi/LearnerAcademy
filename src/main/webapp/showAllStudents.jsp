<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Teacher"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<style>
th, td {
  padding: 15px;
  text-align: left;
  
}
</style>
<meta charset="ISO-8859-1">
<title> Student Information ...</title>
</head>
<header>
	<%@include file="menu.jsp" %>
</header>
<body>
<table border="1">
  <caption><h1>Registered Students' Information</h1></caption>

	<tr>
		<th>Student ID</th> 
		<th>Name</th>
		<th>Email</th> 
		<th>Age</th> 
		<th>Grade</th> 
	</tr>
	<core:forEach items="${sessionScope.listOfStudent}" var="student">
	<tr>
    	<td><core:out value="${student.studentId}"></core:out>
    	<td><core:out value="${student.studentName}"></core:out>
    	<td><core:out value="${student.email}"></core:out>
    	<td><core:out value="${student.age}"></core:out>
    	<td><core:out value="${student.grade}"></core:out>

	</tr>
</core:forEach>

</table>
</body>
</html>