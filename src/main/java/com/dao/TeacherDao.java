package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Teacher;
import com.resource.DbResource;

public class TeacherDao {
	public int addTeacher(Teacher teacher) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into tbl_teacher values(?,?,?,?,?)");
			pstmt.setInt(1, teacher.getTeacherId());
			pstmt.setString(2, teacher.getTeacherName());
			pstmt.setString(3, teacher.getEmail());
			pstmt.setInt(4,teacher.getAge());
			pstmt.setString(5, teacher.getFaculty());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public int deleteTeacher(Teacher teacher) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from tbl_teacher where teacher_id = ?");
			pstmt.setInt(1, teacher.getTeacherId());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
	}}
	
	
	public int updateTeacher (Teacher teacher) {
		try{
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("update tbl_teacher set teacherName = ? email =? dob =? email =? grade= ? where id = ?");
		pstmt.setInt(1, teacher.getTeacherId());
		pstmt.setString(2, teacher.getTeacherName());
		pstmt.setString(3, teacher.getEmail());
		pstmt.setInt(4,  teacher.getAge());
		pstmt.setString(5, teacher.getFaculty());
		
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
	 	
	public 	List<Teacher> getAllTeachers() {
		List<Teacher> listOfTeacher = new ArrayList<Teacher>();
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from tbl_teacher");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Teacher s = new Teacher();
				s.setTeacherId(rs.getInt(1));
				s.setTeacherName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setAge(rs.getInt(4));
				s.setFaculty(rs.getString(5));		
				listOfTeacher.add(s);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return listOfTeacher;
}
}
