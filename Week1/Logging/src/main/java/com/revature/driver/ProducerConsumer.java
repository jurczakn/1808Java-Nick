package com.revature.driver;

import java.util.Vector;

import com.revature.threads.Consumer;
import com.revature.threads.Producer;

public class ProducerConsumer {
	
	public static Vector<Object> data = new Vector<Object>();

	public static void main(String[] args) {
		Thread prod = new Thread(new Producer());
		Thread con = new Thread(new Consumer());
		con.start();
		prod.start();

	}

}
