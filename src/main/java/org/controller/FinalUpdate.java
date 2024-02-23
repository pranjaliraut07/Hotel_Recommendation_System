package org.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model.HotelModel;
import org.services.HotelService;


@WebServlet("/Finalupdate")
public class FinalUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();	
		int hotelId=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		HotelModel model=new HotelModel();
		model.setId(hotelId);
		model.setName(name);
		boolean b=new HotelService().isUpdateHotel(model);
		if(b){
			RequestDispatcher r=request.getRequestDispatcher("Viewhotel");
			r.forward(request, response);
		}
		else {
			out.println("</h1>Some problem is there......</h1>");
		}
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
