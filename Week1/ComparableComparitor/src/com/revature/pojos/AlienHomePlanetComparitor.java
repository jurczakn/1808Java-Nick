package com.revature.pojos;

import java.util.Comparator;

public class AlienHomePlanetComparitor implements Comparator<Alien> {

	@Override
	public int compare(Alien arg0, Alien arg1) {
		return arg0.getHomePlanet().compareTo(arg1.getHomePlanet());
	}

}
