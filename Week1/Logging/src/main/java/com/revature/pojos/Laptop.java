package com.revature.pojos;

import java.util.List;
import java.util.Set;

public class Laptop {
	
	Object[] memoryUnits;
	
	Object[] cores;

	public Object[] getMemoryUnits() {
		return memoryUnits;
	}

	public void setMemoryUnits(Object[] memoryUnits) {
		this.memoryUnits = memoryUnits;
	}

	public Object[] getCores() {
		return cores;
	}

	public void setCores(Object[] cores) {
		this.cores = cores;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Laptop [memoryUnits=" + memoryUnits + ", cores=" + cores + "]";
	}

}
