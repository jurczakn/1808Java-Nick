package com.revature.beans;

public class Raptor extends Dinosaur{

	public Raptor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void roar(){
		System.out.println("slightly less load roar");
	}

	@Override
	public void watch() {
		System.out.println("Cleaver Girl");
	}
	
}
