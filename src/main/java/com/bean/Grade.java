package com.bean;

public class Grade {
private int studentId;
private int classId;
private float finalGrade;
public Grade() {
	super();
	// TODO Auto-generated constructor stub
}
public Grade(int studentId, int classId, float finalGrade) {
	super();
	this.studentId = studentId;
	this.classId = classId;
	this.finalGrade = finalGrade;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public int getClassId() {
	return classId;
}
public void setClassId(int classId) {
	this.classId = classId;
}
public float getFinalGrade() {
	return finalGrade;
}
public void setFinalGrade(float finalGrade) {
	this.finalGrade = finalGrade;
}

}
