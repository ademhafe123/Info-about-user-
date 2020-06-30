package com.adem.servleti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoAboutUser
 */
@WebServlet("/InfoAboutUser")
public class InfoAboutUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		PrintWriter out = response.getWriter();
		
		out.println("First name: " + firstName);
		out.println("Last name: " + lastName);
		out.println("Age: " + age);
		out.println("Email address: " + email);
		out.println("Address: " + address);
	}

}
