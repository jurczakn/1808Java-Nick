package com.revature.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.pojo.User;
import com.revature.services.AuthService;

@Controller
public class LoginCtrl {
	
	@Autowired
	private AuthService authService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginGet(HttpSession sess){
		if (sess.getAttribute("user") != null){
			return "home";
		}
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginPost(@Valid User user, BindingResult bindingResult, ModelMap modelMap, HttpSession sess){
		
		User authUser = authService.validate(user);
		
		if (bindingResult.hasErrors()){
			modelMap.addAttribute("errorMessage", bindingResult.getAllErrors().get(0).getDefaultMessage());
			return "login";
		}
		
		if(authUser != null){
			sess.setAttribute("user", authUser);
			return "home";
		}
		
		modelMap.addAttribute("errorMessage", "Username or password incorrect");
		
		return "login";
	}

}
