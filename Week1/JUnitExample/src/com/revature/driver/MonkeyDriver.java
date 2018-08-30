package com.revature.driver;

import com.revature.pojos.Monkey;

public class MonkeyDriver {
	
	public static void main(String[] args) {
		Monkey<String, String> monte = new Monkey<String, String>();
		monte.setFavoriteThing("a new string");
		//monte.setFavoriteThing(4);
		Monkey<Integer, Double> mike = new Monkey<Integer, Double>();
		mike.setFavoriteThing(5);
		//m2.setFavoriteThing("string");
		
	}

}
