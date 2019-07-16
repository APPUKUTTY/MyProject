package com.visa.training.threads;

public class RunnablePrimeSearch implements Runnable {
	
	long start,end;
	int countOfPrimes=0;
	public RunnablePrimeSearch(long start, long end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	@Override
	public synchronized void run() {
		
		for(long i=start;i<=end;i++)
			if(isPrime(i))
				countOfPrimes++;
		
	}

	private boolean isPrime(long i) {
		
		if(i<=2) return true;
		for(long it=2;it<=Math.sqrt(it);it++)
			{
			if(i%it==0)
				return false;
			}
	
		return true;
	}
	

}
