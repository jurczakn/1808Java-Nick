package com.revature;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PotatoServiceFinder {
	
	public List<Potato> findAllPotatoes(){
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/potato/";
		ResponseEntity<List<Potato>> responseEntity = 
				restTemplate.exchange(url, HttpMethod.GET, null, 
						new ParameterizedTypeReference<List<Potato>>() {});
		
		List<Potato> potatoList = responseEntity.getBody();
		return potatoList;
	}

}
