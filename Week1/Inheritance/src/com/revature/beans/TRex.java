package com.revature.beans;

public class TRex extends Dinosaur {
	
	public String name;	//variable shadowing

	public TRex(){
		super("name");
	}
	
	@Override
	public void setName(String name){
		System.out.println("Inside TRex set name");
		this.name = name;
	}
	
	@Override
	public String getName(){
		System.out.println("Inside TRex get name");
		return this.name;
	}
	
	@Override
	public void roar(){
		System.out.println("really load roar");
	}

	@Override
	public void watch() {
		System.out.println("It is looking at you... run");
	}
	
}
