package com.revature.pojos;

public class Circle extends Shapes{
	
	public String getCircleShape(){
		return "This is a circle and is also apperently a " 
	+ super.getName(); 
	}
	
	public String getCircleSides(){
		return "This circle should only have 1 side, but actually has "
				+ this.sides;
	}
	
	@Override
	public String getColor(){
		return "All circles blue";
	}

}
