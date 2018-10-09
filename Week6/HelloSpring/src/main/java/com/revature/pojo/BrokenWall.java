package com.revature.pojo;

import org.springframework.stereotype.Component;

@Component
public class BrokenWall implements Wall {

	@Override
	public String getMaterial() {
		// TODO Auto-generated method stub
		return "This wall is busted";
	}

	@Override
	public void setMaterial(String material) {
		// TODO Auto-generated method stub

	}
	
	public BrokenWall(){
		
	}

}
