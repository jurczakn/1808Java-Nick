package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.bean.Potato;
import com.revature.dao.PotatoRepository;

@Service
public class PotatoServiceImpl implements PotatoService {

	@Autowired
	private PotatoRepository potatoRepository;
	
	@Override
	public void makePotato(Potato p) {
		potatoRepository.save(p);
	}

	@Override
	public List<Potato> getAllPotatoes() {
		return potatoRepository.findAll();
	}

}
