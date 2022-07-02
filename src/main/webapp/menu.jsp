<!DOCTYPE html>
<html>
<head>
<img src="logo.jpg" height=20% width=20%"/>

<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a, .dropbtn {
	display: inline-block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
	background-color: red;
}

li.dropdown {
	display: inline-block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

.dropdown-content a:hover {
	background-color: #f1f1f1;
}

.dropdown:hover .dropdown-content {
	display: block;
}
</style>
</head>

<ul>
		<li class="dropdown"><a href="javascript:void(0)" class="dropbtn">Add</a>
			<div class="dropdown-content">
				<a href="addTeacher.jsp"> Teachers</a> <a href="addStudent.jsp">
					Students</a> <a href="addSubject.jsp"> Subjects</a> <a
					href="addClass.jsp"> Classes</a> <a href="addGrade.jsp"> Grades</a>
			</div></li>

		<li class="dropdown"><a href="javascript:void(0)" class="dropbtn">Reports</a>
			<div class="dropdown-content">
				<a href="tblclassController"> Classes</a> <a
					href="TeacherController"> Instructors</a> <a
					href="SubjectController"> Subjects</a> <a href="StudentController">
					Students</a> <a href="GradeController"> Students' Grades</a> <a
					href="DetailsController"> Details</a>
			</div></li>
			<li><form action="SignOut">
			<input type="submit" value="Sign Out">
		</form>
<body></li>
		
	</ul>

</body>
</html>


