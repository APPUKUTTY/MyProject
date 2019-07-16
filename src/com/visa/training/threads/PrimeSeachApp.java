package com.visa.training.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrimeSeachApp {

	public static void main(String[] args) throws InterruptedException {
		
		RunnablePrimeSearch p1=new RunnablePrimeSearch(1, 10000);
		RunnablePrimeSearch p2=new RunnablePrimeSearch(10000, 25000);
		
		//old style of creating obj for classes implementing Runnable
		/*
		 * Thread t1=new Thread(p1); Thread t2=new Thread(p2); t1.start(); t2.start();
		 * 
		 * t1.join();
		 * 
		 * t2.join(); System.out.println(p1.countOfPrimes);
		 * System.out.println(p2.countOfPrimes);
		 */
		
		//new style
		ExecutorService pool=Executors.newFixedThreadPool(4);
		pool.execute(p1);
		pool.execute(p2);
		
		/*
		 * while(!(w1.resultReady && w2.resultReady)) Thread.sleep(200);
		 */
	}

}
