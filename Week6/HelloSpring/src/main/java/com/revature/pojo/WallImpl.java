package com.revature.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wall")
@Scope("prototype")
public class WallImpl implements Wall {

	@Value("cards")
	private String material;
	
	@Override
	public String getMaterial() {
		// TODO Auto-generated method stub
		return material;
	}

	@Override
	public void setMaterial(String material) {
		// TODO Auto-generated method stub
		this.material = material;
	}
	
	public WallImpl(){
		
		
	}

}
