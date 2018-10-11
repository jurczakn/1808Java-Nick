package com.revature.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.service.PizzaService;

public class AspectDriver {

	public static void main(String[] args) {
		
		PizzaService ps = (PizzaService) new ClassPathXmlApplicationContext("master.xml").getBean("pizzaService");
		
		ps.eatPizza("cheese");
		
		ps.makePizza(7);

	}

}
