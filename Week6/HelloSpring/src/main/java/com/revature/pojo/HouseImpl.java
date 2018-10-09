package com.revature.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HouseImpl implements House {

	@Autowired //@Inject and @Resource do the same thing as Autowired
	@Qualifier("brokenWall")
	private Wall wall;
	
	private String name;
	
	@Override
	public Wall getWall() {
		// TODO Auto-generated method stub
		return wall;
	}

	@Override
	//@Autowired
	public void setWall(Wall wall) {
		// TODO Auto-generated method stub
		this.wall = wall;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	public HouseImpl(){
		
	}
	
	//@Autowired
	public HouseImpl(Wall wall){
		
		this.wall = wall;
		
	}

}
