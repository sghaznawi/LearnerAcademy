package com.services;

import java.util.List;

import com.bean.tblclass;
import com.dao.tblclassDao;

public class tblclassServices {
	tblclassDao cd = new tblclassDao();
	public String addClass(tblclass tblclass) {
		int a= cd.addClass(tblclass);
		if (a==0) {
			return "record not added!";
		}else {
			return "record added!";			
		}	}
	public int deleteClass(tblclass tblclass) {
		cd.deleteClass(tblclass);
		return 0;
	}
	
	
	public int updateClass (tblclass tblclass) {

		cd.updateClass(tblclass);
		return 0;
	}
	 	
	public 	List<tblclass> getAllClasses() {
		List<tblclass> listOfClasses = cd.getAllClasses();
		return listOfClasses;
}
}
