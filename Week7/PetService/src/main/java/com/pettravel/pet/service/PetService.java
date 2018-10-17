package com.pettravel.pet.service;

import java.util.List;

import com.pettravel.pet.domain.Pet;

public interface PetService {
	
	public void makePet(Pet p);
	
	public List<Pet> getAllPets();
	
	public Pet getPet(Integer id);
	
	public void updatePet(Pet p);
	
	public void killPet(Pet p);

}
