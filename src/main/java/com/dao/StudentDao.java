package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Student;
import com.resource.DbResource;

public class StudentDao {
	public int addStudent(Student student) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into tbl_student values(?,?,?,?,?)");
			pstmt.setInt(1, student.getStudentId());
			pstmt.setString(2, student.getStudentName());
			pstmt.setString(3, student.getEmail());
			pstmt.setInt(4,student.getAge());
			pstmt.setInt(5, student.getGrade());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public int deleteStudent(Student student) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from tbl_student where student_id = ?");
			pstmt.setInt(1, student.getStudentId());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
	}}
	
	
	public int updateStudent (Student student) {
		try{
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("update tbl_student set studentName = ? email =? dob =? email =? grade= ? where id = ?");
		pstmt.setInt(1, student.getStudentId());
		pstmt.setString(2, student.getStudentName());
		pstmt.setString(3, student.getEmail());
		pstmt.setInt(4,  student.getAge());
		pstmt.setInt(5, student.getGrade());
		
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
	 	
	public 	List<Student> getAllStudents() {
		List<Student> listOfStudent = new ArrayList<Student>();
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from tbl_student");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				s.setStudentId(rs.getInt(1));
				s.setStudentName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setAge(rs.getInt(4));
				s.setGrade(rs.getInt(5));		
				listOfStudent.add(s);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return listOfStudent;
}
}
