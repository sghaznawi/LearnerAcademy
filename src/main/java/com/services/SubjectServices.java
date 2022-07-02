package com.services;

	
import java.util.List;

import com.bean.Subject;
import com.dao.SubjectDao;

public class SubjectServices {

	SubjectDao sd = new SubjectDao();
	public String addSubject(Subject subject) {
		int a= sd.addSubject(subject);
		if (a==0) {
			return "record not added!";
		}else {
			return "record added!";			
		}
	}
	public int deleteSubject(Subject subject) {
		sd.deleteSubject(subject);
		return 0;
	}
	
	
	public int updateSubject (Subject subject) {

		sd.updateSubject(subject);
		return 0;
	}
	 	
	public 	List<Subject> getAllSubjects() {
		List<Subject> listOfSubject = sd.getAllSubjects();
		return listOfSubject;
}
}
