package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.pojos.Monkey;

public class MonkeyTest {

	private Monkey<String, String> testMonkey;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		testMonkey = new Monkey<String, String>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		testMonkey.setFavoriteThing("free lunch");
		String thing = testMonkey.getFavoriteThing();
		assertTrue("Expected <free lunch> but found " + thing,
				"free lunch".equals(thing));
	}

}
