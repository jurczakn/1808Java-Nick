package com.revature.threads;

import com.revature.driver.ProducerConsumer;

public class Consumer implements Runnable {

	@Override
	public void run() {
		for(;;){
			System.out.println("Consumer");
			ProducerConsumer.data.remove(ProducerConsumer.data.size() - 1);
		}

	}

}
