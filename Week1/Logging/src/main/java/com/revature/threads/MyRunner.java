package com.revature.threads;

public class MyRunner implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println("Inside thread " + Thread.currentThread().getName() + "：#" + i);
		}

	}

}
