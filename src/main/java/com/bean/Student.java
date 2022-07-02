package com.bean;


public class Student {
private int studentId;
private String studentName;
private String email;
private int age;
private int grade;
public Student(int studentId, String studentName, String email, int age, int grade) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.email = email;
	this.age = age;
	this.grade = grade;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
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
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}


}
