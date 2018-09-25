package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		HttpSession sess = req.getSession(false);
		
		if(sess == null){
			resp.sendRedirect("login");
		}
		
		else {
			String role = (String) sess.getAttribute("role");
			
			if("manager".equals(role)){
				req.getRequestDispatcher("manager.html").forward(req, resp);
			}
			else if("employee".equals(role)){
				req.getRequestDispatcher("home.html").forward(req, resp);
			}
			else{
				System.out.println("Role: " + role);
				resp.sendRedirect("login.html");
			}
		}
		

	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		System.out.println("Pushing request to doGet method");
		doGet(req, resp);
	}

}
