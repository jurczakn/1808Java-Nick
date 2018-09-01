package com.revature.threads;

import com.revature.driver.ProducerConsumer;

public class Producer implements Runnable {

	@Override
	public void run() {
		for(;;){
			System.out.println("Producer");
			ProducerConsumer.data.addElement(new Object());
			
		}

	}

}
