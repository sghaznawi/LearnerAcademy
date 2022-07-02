package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Grade;
import com.resource.DbResource;

public class GradeDao {
	public int addGrade(Grade grade) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into tbl_grades values(?,?,?)");
			pstmt.setInt(1, grade.getStudentId());
			pstmt.setInt(2, grade.getClassId());
			pstmt.setFloat(3, grade.getFinalGrade());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public int deleteGrade(Grade grade) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from tbl_grades where student_id = ? and class_id=?");
			pstmt.setInt(1, grade.getStudentId());
			pstmt.setInt(2, grade.getClassId());

			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
	}}
	
	
	public int updateGrade (Grade grade) {
		try{
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("update tbl_grades set final_grade = ? class_id =? where student_id = ?");
		pstmt.setFloat(1, grade.getFinalGrade());
		pstmt.setInt(2, grade.getClassId());
		pstmt.setInt(3, grade.getStudentId());
		
		int res = pstmt.executeUpdate();
		if(res>0) {
			System.out.println("Record updated successfully");
		}else {
			System.out.println("Record not present");
		}
		return res;	  

		}catch(Exception e) {
			System.out.println(e);
			
		}
		return 0;
	}
	 	
	public 	List<Grade> getAllGrades() {
		List<Grade> listOfGrade = new ArrayList<Grade>();
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from tbl_grades");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Grade g = new Grade();
				g.setStudentId(rs.getInt(1));;
				g.setClassId(rs.getInt(2));
				g.setFinalGrade(rs.getFloat(3));
				listOfGrade.add(g);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return listOfGrade;
}}
