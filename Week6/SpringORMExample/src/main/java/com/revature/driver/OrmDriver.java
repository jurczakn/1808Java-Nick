package com.revature.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.dao.HoneyPotRepository;
import com.revature.dao.HoneypotDao;
import com.revature.domain.HoneyPot;

public class OrmDriver {

	public static void main(String[] args) {
		
		/*HoneypotDao hpd = 
				(HoneypotDao) new ClassPathXmlApplicationContext("beans.xml").getBean("honeypotDaoImpl");
		
		hpd.saveHoneyPot(new HoneyPot(0, 55.5, 66.6));
		hpd.saveHoneyPot(new HoneyPot(0, 88.8, 77.7));
		
		
		System.out.println(hpd.getAllHoneyPots());*/
		
		HoneyPotRepository hpr = 
				(HoneyPotRepository) new ClassPathXmlApplicationContext("beans.xml").getBean("honeyPotRepository");
		
		hpr.save(new HoneyPot(0, 55.5, 66.6));
		HoneyPot hp = hpr.save(new HoneyPot(0, 100.0, 200.0));
		
		System.out.println(hpr.findAll());
		
		hpr.delete(hp);
		
		System.out.println(hpr.findAll());
		
		System.out.println(hpr.findByHoneypotAmount(55.5));
		

	}

}
