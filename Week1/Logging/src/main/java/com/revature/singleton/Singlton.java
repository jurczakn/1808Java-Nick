package com.revature.singleton;

public class Singlton {
	
	private static Singlton singlton;
	
	public static Singlton getInstance(){
		
		if (singlton == null){
			singlton = new Singlton();
		}
		
		return singlton;
	}
	
	private Singlton(){
		
	}

}
