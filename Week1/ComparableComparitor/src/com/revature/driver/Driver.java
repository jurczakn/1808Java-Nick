package com.revature.driver;

import com.revature.pojos.Alien;
import com.revature.pojos.AlienHomePlanetComparitor;

public class Driver {

	public static void main(String[] args) {
		Alien daniel = new Alien("jax", "fl", "Daniel");
		Alien christian = new Alien("zoom", "nebulon", "Christian");
		Alien daniel2 = new Alien("jax", "tn", "Daniel");
		Alien christian2 = new Alien("zoom", "nebulon", "Christian");
		
		System.out.println("Compare daniel to christian: " + daniel.compareTo(christian));
		System.out.println("Compare daniel to daniel2: " + daniel.compareTo(daniel2));
		System.out.println("Compare christian to christian2: " + christian.compareTo(christian2));
		
		AlienHomePlanetComparitor comp = new AlienHomePlanetComparitor();
		System.out.println("Compare daniel to christian: " + comp.compare(daniel, christian));
		System.out.println("Compare daniel to daniel2: " + comp.compare(daniel, daniel2));
		System.out.println("Compare christian to christian2: " + comp.compare(christian, christian2));

	}

}
