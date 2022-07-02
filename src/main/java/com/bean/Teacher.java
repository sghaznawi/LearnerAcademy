package com.bean;

public class Teacher {
private int teacherId;
private String teacherName;
private String email;
private int age;
private String faculty;
public Teacher(int teacherId, String teacherName, String email, int age, String faculty) {
	super();
	this.teacherId = teacherId;
	this.teacherName = teacherName;
	this.email = email;
	this.age = age;
	this.faculty = faculty;
}
public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}
public int getTeacherId() {
	return teacherId;
}
public void setTeacherId(int teacherId) {
	this.teacherId = teacherId;
}
public String getTeacherName() {
	return teacherName;
}
public void setTeacherName(String teacherName) {
	this.teacherName = teacherName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getFaculty() {
	return faculty;
}
public void setFaculty(String faculty) {
	this.faculty = faculty;
}

}
