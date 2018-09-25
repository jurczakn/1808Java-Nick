package com.revature.util;

import javax.servlet.http.HttpServlet;

import com.revature.servlets.HomeServlet;
import com.revature.servlets.LoginServlet;
import com.revature.servlets.PageNotFoundServlet;

public class RequestHelper {

	private static HttpServlet homeServlet = new HomeServlet();
	private static HttpServlet loginServlet = new LoginServlet();
	private static HttpServlet pnfServlet = new PageNotFoundServlet();

	public HttpServlet dispatchRequest(String path) {

		System.out.println(path);
		
		HttpServlet nextServlet = null;

		switch (path) {

		case "/FrontController/app/login":
			nextServlet = loginServlet;
			break;
		case "/FrontController/app/home":
			nextServlet = homeServlet;
			break;
		default:
			nextServlet = pnfServlet;
			break;
		}

		return nextServlet;

	}

}
