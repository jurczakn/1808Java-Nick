package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.User;
import com.revature.services.UserService;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static UserService userService = new UserService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    private void setAccessControlHeaders(HttpServletResponse resp){
    	resp.setHeader("Access-Control-Allow-Origin", "*");
    	//resp.setHeader("Access-Control-Allow-Methods", "GET,POST,DELETE,OPTIONS");
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		setAccessControlHeaders(response);
		System.out.println(request.getPathInfo());
		String username = request.getPathInfo().substring(1);
		ObjectMapper om = new ObjectMapper();
		if ("".equals(username)){
			response.getWriter().write(om.writeValueAsString(userService.getAllUsers()));
		}
		else {
			String userString = om.writeValueAsString(userService.getUser(username));
			response.getWriter().write(userString);
		}
	}

	
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		setAccessControlHeaders(resp);
		//resp.getWriter().write("ok");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userString = request.getReader().readLine();
		System.out.println(userString);
		ObjectMapper om = new ObjectMapper();
		User user = om.readValue(userString, User.class);
		System.out.println(user);
		userService.addUser(user);
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
