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

import com.bean.tblclass;
import com.services.tblclassServices;

/**
 * Servlet implementation class tblclassController
 */
@WebServlet("/tblclassController")
public class tblclassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	tblclassServices tc = new tblclassServices();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tblclassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession hs = request.getSession();
		List<tblclass> listOfClasses = tc.getAllClasses();
		System.out.println("Numbers of Classes " + listOfClasses.size());
		hs.setAttribute("listOfClasses", listOfClasses);
		response.sendRedirect("showAllClasses.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		int classId = Integer.parseInt(request.getParameter("classId"));
		int subjectId = Integer.parseInt(request.getParameter("subjectId"));
		int teacherId = Integer.parseInt(request.getParameter("teacherId"));
		int roomNum= Integer.parseInt(request.getParameter("roomNum"));
		String period = request.getParameter("period");


		tblclass tblclass = new tblclass();
		tblclass.setClassId(classId);
		tblclass.setSubjectId(subjectId);
		tblclass.setTeacherId(teacherId);
		tblclass.setRoomNum(roomNum);
		tblclass.setPeriod(period);
	

		String result = tc.addClass(tblclass);
		pw.print(result);
		RequestDispatcher rd1 = request.getRequestDispatcher("addClass.jsp");
		rd1.include(request, response);
	}

}
