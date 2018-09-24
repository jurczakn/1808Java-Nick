package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		String role = (String) req.getAttribute("role");
		
		if("manager".equals(role)){
			resp.sendRedirect("manager.html");
		}
		else if("employee".equals(role)){
			resp.sendRedirect("home.html");
		}
		else{
			System.out.println("Role: " + role);
			resp.sendRedirect("login.html");
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		System.out.println("Pushing request to doGet method");
		doGet(req, resp);
	}

}
