package com.revature.beans;

public class Raptor extends Dinosaur{

	public void roar(){
		System.out.println("slightly less load roar");
	}

	@Override
	public void watch() {
		System.out.println("Cleaver Girl");
	}
	
}
