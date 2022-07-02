package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.tblclass;
import com.resource.DbResource;

public class tblclassDao {
	public int addClass(tblclass tblclass) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into tbl_class values(?,?,?,?,?)");
			pstmt.setInt(1, tblclass.getClassId());
			pstmt.setInt(2, tblclass.getSubjectId());
			pstmt.setInt(3, tblclass.getTeacherId());
			pstmt.setInt(4,tblclass.getRoomNum());
			pstmt.setString(5, tblclass.getPeriod());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public int deleteClass(tblclass tblclass) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from tbl_class where class_id = ?");
			pstmt.setInt(1, tblclass.getTeacherId());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
	}}
	
	
	public int updateClass (tblclass tblclass) {
		try{
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("update tbl_class set subject_id = ? teacher_id =? room_num =? class_time =? where id = ?");
		pstmt.setInt(1, tblclass.getSubjectId());
		pstmt.setInt(2, tblclass.getTeacherId());
		pstmt.setInt(3, tblclass.getRoomNum());
		pstmt.setString(4,  tblclass.getPeriod());

		
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
	 	
	public 	List<tblclass> getAllClasses() {
		List<tblclass> listOfClasses = new ArrayList<tblclass>();
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from tbl_class");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				tblclass c = new tblclass();
				c.setClassId(rs.getInt(1));
				c.setSubjectId(rs.getInt(2));
				c.setTeacherId(rs.getInt(3));
				c.setRoomNum(rs.getInt(4));
				c.setPeriod(rs.getString(5));		
				listOfClasses.add(c);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return listOfClasses;
}
}
