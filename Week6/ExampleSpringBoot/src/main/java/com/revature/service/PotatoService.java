package com.revature.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.bean.Potato;

public interface PotatoService {
	
	public void makePotato(Potato p);
	
	public List<Potato> getAllPotatoes();

}
