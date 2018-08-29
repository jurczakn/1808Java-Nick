package com.revature.driver;

import com.revature.beans.Dinosaur;
import com.revature.beans.Raptor;
import com.revature.beans.TRex;
import com.revature.beans.Watchable;

public class Driver {

	public static void main(String[] args) {
		TRex sue = new TRex();
		/*System.out.println(sue.getWeight());
		System.out.println(sue.getSize());
		System.out.println(sue.getName());*/
		//sue.setWeight(null);  primatives cannot be set to null
		sue.setName("Sue");
		System.out.println(sue.getName());
		System.out.println(sue.name);
		displayDinosaurName(sue);
		/*sue.eat();
		sue.roar();
		sue.watch();
		Dinosaur fred = new Raptor();
		fred.eat();
		fred.roar();
		Watchable w = sue;
		w.watch();
		//w.hasEyes = false;
		System.out.println(w.hasEyes);
		//byte b = 999999999;
*/		

	}
	
	public static void displayDinosaurName(Dinosaur d){
		System.out.println(d.name);
	}

}
