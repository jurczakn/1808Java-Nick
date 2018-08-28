package com.revature.driver;

import com.revature.beans.Dinosaur;
import com.revature.beans.Raptor;
import com.revature.beans.TRex;
import com.revature.beans.Watchable;

public class Driver {

	public static void main(String[] args) {
		Dinosaur sue = new TRex();
		sue.eat();
		sue.roar();
		sue.watch();
		Dinosaur fred = new Raptor();
		fred.eat();
		fred.roar();
		Watchable w = sue;
		w.watch();
		//w.hasEyes = false;
		System.out.println(w.hasEyes);

	}

}
