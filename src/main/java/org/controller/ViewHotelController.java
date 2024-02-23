package org.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model.HotelModel;
import org.services.HotelService;

@WebServlet("/Viewhotel")
public class ViewHotelController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	//out.println("I am view hotel page");
	RequestDispatcher r=request.getRequestDispatcher("navbar.html");
	r.include(request, response);
	HotelService hotelService=new HotelService();
	List<HotelModel>list=hotelService.getAllHotels();
	out.println("<table border='5'align='center'width='400px;'>");
	out.println("<tr><th>HotelName</th><th>DELETE</th><th>UPDATE</th></tr>");
	for(HotelModel h:list) {
		out.println("<tr>");
		out.println("<td>"+h.getName()+"</td>");
		out.println("<td><a href='del?hotelId="+h.getId()+"'>DELETE</a></td>");
	    out.println("<td><a href='Updatehotel?hotelId="+h.getId()+"&hotelName="+h.getName()+"'>UPDATE</a></td>");	
	}
	}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
