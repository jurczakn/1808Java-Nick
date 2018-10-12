package com.revature;


public class Potato {
	

	private Integer id;
	
	private String name;
	
	private String color;
	
	private Double weight;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Double getWeight() {
		return weight;
	}


	public void setWeight(Double weight) {
		this.weight = weight;
	}


	public Potato(Integer id, String name, String color, Double weight) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.weight = weight;
	}


	public Potato() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Potato [id=" + id + ", name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}

}
