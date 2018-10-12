package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.revature.bean.Potato;
import com.revature.dao.PotatoRepository;
import com.revature.service.PotatoServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class PotatoServiceTest {

	@Mock
	private PotatoRepository pR;
	
	@InjectMocks
	private PotatoServiceImpl psi;
	
	private static List<Potato> potatoList;
	
	private static Potato potato;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		potatoList = new ArrayList<Potato>();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		potato = new Potato(1, "billy", "brown-purple", 7.0);
		potatoList.addAll(Stream.of(
				potato,
				new Potato(2, "frank", "golden", 3.0),
				new Potato(3, "Larry", "red", 4.1)
				).collect(Collectors.toList()));
		when(pR.save(potato)).thenReturn(potato);
		when(pR.findAll()).thenReturn(potatoList);
		
	}

	@After
	public void tearDown() throws Exception {
		potatoList.clear();
	}

	@Test
	public void testMakingPotato() {
		psi.makePotato(potato);
		verify(pR).save(potato);
	}
	
	@Test
	public void testGettingAllPotatos(){
		assertEquals("Should give full potato list", potatoList, psi.getAllPotatoes());
	}

}
