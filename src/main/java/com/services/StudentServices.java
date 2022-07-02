package com.services;

import java.util.List;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentServices {
	StudentDao sd = new StudentDao();
	public String addStudent(Student student) {
		int a = sd.addStudent(student);
		if (a==0) {
			return "record not added!";
		}else {
			return "record added!";			
		}
	}
	public int deleteStudent(Student student) {
		sd.deleteStudent(student);
		return 0;
	}
	
	
	public int updateStudent (Student student) {

		sd.updateStudent(student);
		return 0;
	}
	 	
	public 	List<Student> getAllStudents() {
		List<Student> listOfStudent = sd.getAllStudents();
		return listOfStudent;
}

}
