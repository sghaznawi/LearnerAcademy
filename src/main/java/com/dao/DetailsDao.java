package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Details;
import com.resource.DbResource;

public class DetailsDao {
		 	
	public 	List<Details> getDetails() {
		List<Details> listDetails = new ArrayList<Details>();
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from details ORDER BY class_id, final_grade desc");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Details dt = new Details();

				dt.setClassId(rs.getInt(1));
				dt.setRoomNum(rs.getInt(2));
				dt.setSubject(rs.getString(3));
				dt.setPeriod(rs.getString(4));
				dt.setTeacherId(rs.getInt(5));
				dt.setTeacherName(rs.getString(6));
				dt.setStudentId(rs.getInt(7));
				dt.setStudentName(rs.getString(8));
				dt.setFinalGrade(rs.getFloat(9));
				dt.setEmail(rs.getString(10));
				listDetails.add(dt);
			}		
		} catch (Exception e) {
			System.out.println(e);
		}
		return listDetails;
}
}
