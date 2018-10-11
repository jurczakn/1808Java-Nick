package com.revature.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.dao.HoneypotDao;
import com.revature.domain.HoneyPot;

public class OrmDriver {

	public static void main(String[] args) {
		
		HoneypotDao hpd = 
				(HoneypotDao) new ClassPathXmlApplicationContext("beans.xml").getBean("honeypotDaoImpl");
		
		hpd.saveHoneyPot(new HoneyPot(0, 55.5, 66.6));
		hpd.saveHoneyPot(new HoneyPot(0, 88.8, 77.7));
		
		
		System.out.println(hpd.getAllHoneyPots());

	}

}
