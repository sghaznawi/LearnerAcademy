<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Grade"%>
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
<title>All Subjects</title>
</head>
<header>
	<%@include file="menu.jsp" %>
</header>
<body>
<table border="1">
  <caption><h1>Subjects Offered</h1></caption>

	<tr>
		<th>Subject ID</th> 
		<th>Subject</th>
		<th>Description</th> 
	
	</tr>
	<core:forEach items="${sessionScope.listOfSubject}" var="sub">
	<tr>
    	<td><core:out value="${sub.subjectId}"></core:out>
    	<td><core:out value="${sub.subject}"></core:out>
    	<td><core:out value="${sub.description}"></core:out>
    	<form action="MyServlet" method="post">
       
	</tr>
</core:forEach>

</table>
</body>
</html>