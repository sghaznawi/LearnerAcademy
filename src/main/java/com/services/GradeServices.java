package com.services;

import java.util.List;

import com.bean.Grade;
import com.dao.GradeDao;

public class GradeServices {

	GradeDao gd = new GradeDao();
	public String addGrade(Grade grade) {
		int a = gd.addGrade(grade);
		if (a==0) {
			return "record not added!";
		}else {
			return "record added!";			
		}	}
	public int deleteGrade(Grade grade) {
		gd.deleteGrade(grade);
		return 0;
	}
	
	
	public int updateGrade (Grade grade) {

		gd.updateGrade(grade);
		return 0;
	}
	 	
	public 	List<Grade> getAllGrades() {
		List<Grade> listOfGrade = gd.getAllGrades();
		return listOfGrade;
}
}
