package com.revature;

import com.revature.pojos.Circle;
import com.revature.pojos.Shapes;

public class Driver {
	
	static public void main(String pirateSounds[]){
		System.out.println("Hello World");
		com.revature.pojos.Shapes s = new com.revature.pojos.Shapes("square");
		//Shapes s = new Shapes();
		System.out.println(s.getWidth());
		doCircleStuff();
		return;
	}
	
	private static void doCircleStuff(){
		Circle c = new Circle();
		System.out.println(c.getCircleShape());
		takeShape(c);
		System.out.println("calling get color from a circle: " 
				+ c.getColor());
		Shapes s = c;
		//s = "new string";
		//s.getCircleShape();
		System.out.println("calling getColor from a circle referenced"
				+ "as a shape: " + s.getColor());
	}
	
	private static void takeShape(Shapes s){
		
	}
	
	static public void main(int[] args){
		System.out.println("Hello World");
		return;
	}

}
