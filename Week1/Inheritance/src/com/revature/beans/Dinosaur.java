package com.revature.beans;

public abstract class Dinosaur implements Watchable {
	
	private double weight;
	
	private int size;
	
	public String name;
	
	@Override
	public void watch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Killing Dino named: " + this.name);
		super.finalize();
	}

	public Dinosaur(String name){
		this.name = name;
	}
	
	public void setName(String name){
		short s;
		//System.out.println(s); does not get a default value
		System.out.println("Inside Dinosaur class setName");
		this.name = name;
	}
	
	public String getName(){
		System.out.println("Inside Dinosaur class getName");
		return this.name;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getWeight(){
		return this.weight;
	}
	
	public void setSize(int size){
		this.size = size;
	}
	
	public int getSize(){
		return this.size;
	}

	public void eat(){
		System.out.println("I am a dinosaur eating. munch munch munch");
	}
	
	public abstract void roar();
	
}
