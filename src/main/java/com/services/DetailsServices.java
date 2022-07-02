package com.services;

import java.util.List;

import com.bean.Details;
import com.dao.DetailsDao;

public class DetailsServices {
	DetailsDao dt = new DetailsDao();

	 	
	public 	List<Details> getAllDetails() {
		List<Details> listDetails = dt.getDetails();
		return listDetails;
}
}
