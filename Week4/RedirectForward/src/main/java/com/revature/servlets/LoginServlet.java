package com.revature.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.beans.User;
import com.revature.services.UserService;

public class LoginServlet extends HttpServlet {

	private static UserService userService = new UserService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		HttpSession sess = req.getSession(false);
		if(sess == null || sess.getAttribute("role") == null){
			resp.sendRedirect("login.html");
		}
		else {
			resp.sendRedirect("home");
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println("Login attempt with username: " + username + " and password: " + password);

		User u = userService.validateUser(new User(username, password));
		// check for valid login with value of u
		if (u != null) {
			HttpSession sess = req.getSession(true);
			sess.setAttribute("username", u.getUsername());
			sess.setAttribute("role", u.getRole());
			resp.sendRedirect("home");
			
		} else {
			resp.sendRedirect("login.html");
		}
	}

}
