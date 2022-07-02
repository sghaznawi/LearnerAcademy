package com.bean;

public class tblclass {
private int classId;
private int subjectId;
private int teacherId;
private int roomNum;
private String period;
public tblclass(int classId, int subjectId, int teacherId, int roomNum, String period) {
	super();
	this.classId = classId;
	this.subjectId = subjectId;
	this.teacherId = teacherId;
	this.roomNum = roomNum;
	this.period = period;
}
public tblclass() {
	super();
}
public int getClassId() {
	return classId;
}
public void setClassId(int classId) {
	this.classId = classId;
}
public int getSubjectId() {
	return subjectId;
}
public void setSubjectId(int subjectId) {
	this.subjectId = subjectId;
}
public int getTeacherId() {
	return teacherId;
}
public void setTeacherId(int teacherId) {
	this.teacherId = teacherId;
}
public int getRoomNum() {
	return roomNum;
}
public void setRoomNum(int roomNum) {
	this.roomNum = roomNum;
}
public String getPeriod() {
	return period;
}
public void setPeriod(String period) {
	this.period = period;
}

}
