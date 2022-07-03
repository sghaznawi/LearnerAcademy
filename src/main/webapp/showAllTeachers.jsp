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
<title> Teacher Information ...</title>
</head>
<header>
	<%@include file="menu.jsp" %>
</header>
<body>
<table border="1">
  <caption><h1>Teachers Information</h1></caption>

	<tr>
		<th>Teacher ID</th> 
		<th>Name</th>
		<th>Email</th> 
		<th>Age</th> 
		<th>Faculty</th> 
	</tr>
	<core:forEach items="${sessionScope.listOfTeacher}" var="teach">
	<tr>
    	<td><core:out value="${teach.teacherId}"></core:out>
    	<td><core:out value="${teach.teacherName}"></core:out>
    	<td><core:out value="${teach.email}"></core:out>
    	<td><core:out value="${teach.age}"></core:out>
    	<td><core:out value="${teach.faculty}"></core:out>

	</tr>
</core:forEach>

</table>
</body>
</html>