package com.revature.pojos;

public class Monkey <T, T2>{
	
	private T favoriteThing;
	
	private T2 secondFavoriteThing;
	
	public T getFavoriteThing(){
		return favoriteThing;
	}
	
	public void setFavoriteThing(T favoriteThing){
		this.favoriteThing = favoriteThing;
	}

	public T2 getSecondFavoriteThing(){
		return secondFavoriteThing;
	}
	
	public void setSecondFavoriteThing(T2 favoriteThing){
		this.secondFavoriteThing = favoriteThing;
	}
	
}
