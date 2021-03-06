<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Details"%>
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
<title>Class Information ...</title>
</head>
<header>
	<%@include file="menu.jsp" %>
</header>
<body>

<table border="1">
  <caption><h1>Detailed Classes Report</h1></caption>

	<tr>
		<th>Class ID</th> 
		<th>Room Number</th>
		<th>Subject</th> 
		<th>Period</th> 
		<th>Teacher ID</th>
		<th>Teacher Name</th>
		<th>Student ID</th>
		<th>Student Name</th>
		<th>Final Grade</th>
		<th>Student Email</th>
	</tr>
	<core:forEach items="${sessionScope.listDetails}" var="dt">
	<tr>
    	<td><core:out value="${dt.classId}"></core:out>
    	<td><core:out value="${dt.roomNum}"></core:out>
    	<td><core:out value="${dt.subject}"></core:out>
    	<td><core:out value="${dt.period}"></core:out>
    	<td><core:out value="${dt.teacherId}"></core:out>
    	<td><core:out value="${dt.teacherName}"></core:out>	    	
    	<td><core:out value="${dt.studentId}"></core:out>
    	<td><core:out value="${dt.studentName}"></core:out>
    	<td><core:out value="${dt.finalGrade}"></core:out>
    	<td><core:out value="${dt.email}"></core:out>
	</tr>
</core:forEach>

</table>
</body>
</html>