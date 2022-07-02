package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Details;
import com.services.DetailsServices;

/**
 * Servlet implementation class tblclassController
 */
@WebServlet("/DetailsController")
public class DetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DetailsServices ds = new DetailsServices();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailsController() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession hs = request.getSession();
		List<Details> listDetails = ds.getAllDetails();
		System.out.println("Numbers of Classes with Details " + listDetails.size());
		hs.setAttribute("listDetails", listDetails);
		response.sendRedirect("showDetails.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request,response);
	}

}
