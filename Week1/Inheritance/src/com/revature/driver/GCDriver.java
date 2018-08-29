package com.revature.driver;

import com.revature.beans.Raptor;

public class GCDriver {
	
	public static void main(String[] args) {
		for(int i = 0; ;i++){
			System.out.println("---------------------");
			new Raptor("Raptor #" + i);
			//System.gc();
		}
	}

}
