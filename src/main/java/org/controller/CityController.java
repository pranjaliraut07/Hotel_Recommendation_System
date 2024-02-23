package org.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model.CityModel;
import org.services.CityService;

/**
 * Servlet implementation class CityController
 */
@WebServlet("/newcity")
public class CityController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher r=request.getRequestDispatcher("navbar.html");
		r.include(request, response);
		out.println("<br><br>");
		out.println("<center>");
		out.println("<form name='frm'action=''method='POST'>");
		out.println("<input type='text'name='name'value=''style='width:400px;height:40px;'/><br><br>");
		out.println("<input type='submit' name='s' value='Add New City'/>");
		out.println("</form>");
		out.println("</center>");
		String btn=request.getParameter("s");
		if(btn!=null)
		{
			String name=request.getParameter("name");
		CityModel model=new CityModel();
		model.setName(name);
		CityService cityService=new CityService();
		boolean b=cityService.isAddCity(model);
		if(b) {
			out.println("<h1>City Added Successfully....</h1>");
		}
		else {
			out.println("<h1>Some Problem is There...</h1>");
		}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
