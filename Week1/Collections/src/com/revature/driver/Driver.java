package com.revature.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.revature.beans.Dinosaur;
import com.revature.beans.TRex;

public class Driver {
	
	public static void main(String[] args) {
		List<Dinosaur> dinoList = new ArrayList<Dinosaur>();
		dinoList.add(new TRex());
		dinoList.add(new TRex());
		dinoList.add(new TRex());
		dinoList.add(new TRex());
		dinoList.add(new TRex());
		dinoList.add(new TRex());
		Iterator<Dinosaur> dinoIter = dinoList.iterator();
		String dinoName = "rex";
		Integer num = 1;
		while(dinoIter.hasNext()){
			Dinosaur d = dinoIter.next();
			d.setName(dinoName.concat(num.toString()));
			num++;
		}
		System.out.println(dinoList.toString());
		Collections.sort(dinoList);
		System.out.println(dinoList.toString());
	}

}
