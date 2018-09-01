package com.revature.factory;

import com.revature.pojos.Laptop;

public class LaptopFactory {
	
	public static Laptop makeLaptop(int m, int c){
		Laptop l = new Laptop();
		l.setCores(new Object[c]);
		l.setMemoryUnits(new Object[m]);
		return l;
	}

}
