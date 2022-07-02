package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Subject;
import com.resource.DbResource;

public class SubjectDao {
	public int addSubject(Subject subject) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into tbl_subject values(?,?,?)");
			pstmt.setInt(1, subject.getSubjectId());
			pstmt.setString(2, subject.getSubject());
			pstmt.setString(3, subject.getDescription());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public int deleteSubject(Subject subject) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from tbl_subject where subject_id = ?");
			pstmt.setInt(1, subject.getSubjectId());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
	}}
	
	
	public int updateSubject (Subject subject) {
		try{
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("update tbl_subject set subject = ? description =? where id = ?");
		pstmt.setInt(3, subject.getSubjectId());
		pstmt.setString(1, subject.getSubject());
		pstmt.setString(2, subject.getDescription());
		
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
	 	
	public 	List<Subject> getAllSubjects() {
		List<Subject> listOfSubject = new ArrayList<Subject>();
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from tbl_subject");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Subject s = new Subject();
				s.setSubjectId(rs.getInt(1));
				s.setSubject(rs.getString(2));
				s.setDescription(rs.getString(3));
				listOfSubject.add(s);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return listOfSubject;
}
}