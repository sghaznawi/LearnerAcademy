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
<title>All Subjects</title>
</head>
<header>
	<%@include file="menu.jsp" %>
</header>
<body>
<table border="1">
	<tr>
		<th>Subject ID</th> 
		<th>Subject</th>
		<th>Description</th> 
		<th>Actions</th> 
	
	</tr>
	<core:forEach items="${sessionScope.listOfSubject}" var="sub">
	<tr>
    	<td><core:out value="${sub.subjectId}"></core:out>
    	<td><core:out value="${sub.subject}"></core:out>
    	<td><core:out value="${sub.description}"></core:out>
    	<form action="MyServlet" method="post">
       <td> <a value="Edit" name="Action"
            href="edit.jsp?id=${sub.subjectId} ">Edit</a> <input
            type="hidden" name="j" value="${sub.subjectId}">&nbsp;&nbsp;&nbsp;
            <a href="delete.jsp">Delete</a>&nbsp;&nbsp;&nbsp;</td>
	</tr>
</core:forEach>

</table>
</body>
</html>