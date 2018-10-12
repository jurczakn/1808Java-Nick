package com.revature;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/findPotatoes")
public class PotatoFinderController {
	
	@Autowired
	PotatoServiceFinder psf;
	
	@GetMapping
	public List<Potato> findAllPotatoes(){
		return psf.findAllPotatoes();
	}

}
