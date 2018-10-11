package com.revature.dao;

import java.util.List;

import com.revature.domain.HoneyPot;

public interface HoneypotDao {
	
	public void saveHoneyPot(HoneyPot hp);
	public List<HoneyPot> getAllHoneyPots();
	public HoneyPot getHoneyPotById(Integer id);

}
