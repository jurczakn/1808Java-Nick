package com.pettravel.pet.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pet")
public class Pet {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	@Column(name="species")
	String species;
	
	@Column(name="name")
	String name;
	
	@Column(name="ssn")
	String ssn;

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pet(Integer id, String species, String name, String ssn) {
		super();
		this.id = id;
		this.species = species;
		this.name = name;
		this.ssn = ssn;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", species=" + species + ", name=" + name + ", ssn=" + ssn + "]";
	}
	
}
