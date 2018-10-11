package com.revature.service;

import org.springframework.stereotype.Service;

@Service
public class PizzaService {
	
	public String makePizza(int i){
		
		System.out.println("Making an awsome pizza");
		
		return "This is an awesome pizza with " + i + " toppings";
		
	}
	
	public void eatPizza(String pizza){
		
		System.out.println("You are eating this really good " + pizza + " pizza");		
	}

}
