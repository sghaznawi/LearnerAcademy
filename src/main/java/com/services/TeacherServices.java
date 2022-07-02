package com.services;

import java.util.List;

import com.bean.Teacher;
import com.dao.TeacherDao;

public class TeacherServices {

	TeacherDao td = new TeacherDao();
	public String addTeacher(Teacher teacher) {
		int a = td.addTeacher(teacher);
		if (a==0) {
			return "record not added!";
		}else {
			return "record added!";			
		}
	}
	public int deleteTeacher(Teacher teacher) {
		td.deleteTeacher(teacher);
		return 0;
	}
	
	
	public int updateTeacher (Teacher teacher) {

		td.updateTeacher(teacher);
		return 0;
	}
	 	
	public 	List<Teacher> getAllTeachers() {
		List<Teacher> listOfTeacher = td.getAllTeachers();
		return listOfTeacher;
}
}
