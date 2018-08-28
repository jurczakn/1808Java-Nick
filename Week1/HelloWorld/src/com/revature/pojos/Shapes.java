package com.revature.pojos;

public class Shapes {
	
	public static final boolean IS_A_SHAPE = true;
	
	private String color;
	
	private int width;
	
	private int height;
	
	private int depth;
	
	public int sides;
	
	private String name;
	
	/*private Shapes(){
		
	}*/
	
	public Shapes(){
	}
	
	public Shapes(String name){
		this.name = name;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public int getWidth(){
		return this.width;
	}

	public void setWidth(int width){
		this.width = width;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public int getDepth(){
		return this.depth;
	}
	
	public void setDepth(int depth){
		this.depth = depth;
	}
	
	public int getSides(){
		return this.sides;
	}
	
	public void setSides(int sides){
		this.sides = sides;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
