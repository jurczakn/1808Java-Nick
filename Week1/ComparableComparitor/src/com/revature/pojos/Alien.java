package com.revature.pojos;
//                             vvv---gives us the natural ordering
public class Alien implements Comparable<Alien>{
	
	private String spaceShip;
	
	private String homePlanet;
	
	private String name;

	public String getSpaceShip() {
		return spaceShip;
	}

	public void setSpaceShip(String spaceShip) {
		this.spaceShip = spaceShip;
	}

	public String getHomePlanet() {
		return homePlanet;
	}

	public void setHomePlanet(String homePlanet) {
		this.homePlanet = homePlanet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Alien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alien(String spaceShip, String homePlanet, String name) {
		super();
		this.spaceShip = spaceShip;
		this.homePlanet = homePlanet;
		this.name = name;
	}

	@Override
	public int compareTo(Alien arg0) {
		return (this.name.compareTo(arg0.name)==0)? 
				this.homePlanet.compareTo(arg0.homePlanet):
					this.name.compareTo(arg0.name);
	}

}
