package com.pettravel.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pettravel.pet.dao.PetRepository;
import com.pettravel.pet.domain.Pet;

@Service
public class PetServiceImpl implements PetService {

	@Autowired
	PetRepository pr;
	
	@Override
	public void makePet(Pet p) {
		pr.save(p);

	}

	@Override
	public List<Pet> getAllPets() {
		return pr.findAll();
	}

	@Override
	public Pet getPet(Integer id) {
		return pr.findOne(id);
	}

	@Override
	public void updatePet(Pet p) {
		pr.save(p);

	}

	@Override
	public void killPet(Pet p) {
		pr.delete(p);

	}

}
