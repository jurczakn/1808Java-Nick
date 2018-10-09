package com.revature.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.pojo.House;
import com.revature.pojo.HouseImpl;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("master.xml");
		
		House h = (House) ac.getBean("houseImpl");
		
		House h2 = (House) ac.getBean("houseImpl");
		
		h.getWall().setMaterial("brick");
		
		h.setName("Bricky");
		
		//House h2 = new HouseImpl();  will create a bean... but not a Spring Bean
		
		h2.setName("home");
		//h2.getWall().setMaterial("lumber");
		
		System.out.println("House 2 name: " + h2.getName());
		
		System.out.println("House 2 wall material: " + h2.getWall().getMaterial());
		
		System.out.println("House name: " + h.getName());
		
		System.out.println("House wall material: " + h.getWall().getMaterial());
		
		ac.getBean("lifeCycle");

	}

}
