package com.bean;

public class Subject {
private int subjectId;
private String subject;
private String description;
public Subject(int subjectId, String subject, String description) {
	super();
	this.subjectId = subjectId;
	this.subject = subject;
	this.description = description;
}
public Subject() {
	super();
	// TODO Auto-generated constructor stub
}
public int getSubjectId() {
	return subjectId;
}
public void setSubjectId(int subjectId) {
	this.subjectId = subjectId;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
