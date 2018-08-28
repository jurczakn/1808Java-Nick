package com.revature.beans;

public abstract class Dinosaur implements Watchable {
	
	private double weight;
	
	private int size;
	
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
