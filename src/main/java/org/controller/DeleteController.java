package org.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.services.HotelService;


@WebServlet("/del")
public class DeleteController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	int hid=Integer.parseInt(request.getParameter("hotelId"));
	boolean b=new HotelService().isDeleteHotel(hid);
	if(b) {
		RequestDispatcher r=request.getRequestDispatcher("Viewhotel");
		r.forward(request, response);
	}
	else {
		out.println("<h1>Some Problem is there</h1>");
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
