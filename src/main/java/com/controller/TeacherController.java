package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Teacher;
import com.services.TeacherServices;


@WebServlet("/TeacherController")
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TeacherServices ts = new TeacherServices();


	public TeacherController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession hs = request.getSession();
		List<Teacher> listOfTeacher = ts.getAllTeachers();
		System.out.println("Numbers of Teachers " + listOfTeacher.size());
		hs.setAttribute("listOfTeacher", listOfTeacher);
		response.sendRedirect("showAllTeachers.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		int teacherId = Integer.parseInt(request.getParameter("teacherId"));
		String teacherName = request.getParameter("teacherName");
		String email = request.getParameter("email");
		int age= Integer.parseInt(request.getParameter("age"));
		String faculty = request.getParameter("faculty");


		Teacher teacher = new Teacher();
		teacher.setTeacherId(teacherId);
		teacher.setTeacherName(teacherName);
		teacher.setEmail(email);
		teacher.setAge(age);
		teacher.setFaculty(faculty);
	

		String result = ts.addTeacher(teacher);
		pw.print(result);
		RequestDispatcher rd1 = request.getRequestDispatcher("addTeacher.jsp");
		rd1.include(request, response);
	}

}
