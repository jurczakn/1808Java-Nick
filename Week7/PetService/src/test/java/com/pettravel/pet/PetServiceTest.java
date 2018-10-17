package com.pettravel.pet;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.pettravel.pet.dao.PetRepository;
import com.pettravel.pet.domain.Pet;
import com.pettravel.pet.service.PetServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class PetServiceTest {
	
	@Mock
	PetRepository rp;
	
	@InjectMocks
	PetServiceImpl ps;
	
	private static Pet pet;
	
	private static List<Pet> petList;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		petList = new ArrayList<Pet>();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		this.pet = new Pet(1, "parakeet", "George", "7");
		
		this.petList.addAll(Arrays.asList(new Pet[] {this.pet, new Pet()}));
		
		when(rp.findAll()).thenReturn(this.petList);
		
		when(rp.findOne(1)).thenReturn(this.pet);
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAllPets() {
		assertEquals(
				"Should get whole list of pets", 
				this.petList, 
				this.ps.getAllPets());
	}

	@Test
	public void testGetAPet() {
		assertEquals(
				"Should get single pet", 
				this.pet, 
				this.ps.getPet(1));
	}
	
	@Test
	public void testMakePet() {
		ps.makePet(this.pet);
		verify(rp).save(pet);
	}
	
	@Test
	public void testUpdatePet() {
		ps.updatePet(this.pet);
		verify(rp).save(pet);
	}
	
	@Test
	public void testKillPet() {
		ps.killPet(this.pet);
		verify(rp).delete(pet);
	}
	
}
