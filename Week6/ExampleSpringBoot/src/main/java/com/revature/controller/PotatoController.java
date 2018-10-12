package com.revature.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.bean.Potato;
import com.revature.service.PotatoService;

@RestController
@RequestMapping("/potato")
public class PotatoController {

	private static Logger log = Logger.getLogger(PotatoController.class);
	
	@Autowired
	private PotatoService potatoService;
	
	@PostMapping(consumes={"application/json"})
	public void postPotato(@RequestBody Potato potato){
		log.info(potato);
		potatoService.makePotato(potato);
	}
	
	@GetMapping
	public List<Potato> getPotato(){
		return potatoService.getAllPotatoes();
	}
	
}
