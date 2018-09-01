package com.revature.driver;

import com.revature.threads.MyRunner;
import com.revature.threads.MyThread;

public class ThreadDriver {
	public static void main(String[] args){
		Thread t = new MyThread();
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		Thread t2 = new Thread(new MyRunner());
		t2.start();
		for(int i = 0; i< 100000; i++){
			System.out.println("Inside thread " + Thread.currentThread().getName() + "：#" + i);
		}
	}

}
