<%@page import="java.util.Iterator"%>
<%@page import="com.bean.tblclass"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Class Information ...</title>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<header>
	<%@include file="menu.jsp" %>
</header>
<body>
<table border="1">
	<tr>
		<th>Class ID</th> 
		<th>Subject ID</th>
		<th>Teacher ID</th> 
		<th>Room Num</th> 
		<th>Period</th> 
	</tr>
	<core:forEach items="${sessionScope.listOfClasses}" var="cls">
	<tr>
    	<td><core:out value="${cls.classId}"></core:out>
    	<td><core:out value="${cls.subjectId}"></core:out>
    	<td><core:out value="${cls.teacherId}"></core:out>
    	<td><core:out value="${cls.roomNum}"></core:out>
    	<td><core:out value="${cls.period}"></core:out>

	</tr>
</core:forEach>

</table>
</body>
</html>