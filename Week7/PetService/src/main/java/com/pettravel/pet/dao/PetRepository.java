package com.pettravel.pet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pettravel.pet.domain.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

}
