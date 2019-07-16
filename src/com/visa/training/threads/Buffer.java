package com.visa.training.threads;

public class Buffer {

	int data;
	boolean available = false;

	public synchronized void produce(int newdata) {
		while (available) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("producer producing " + data);
		data = newdata;
		available = true;
		this.notify();

	}

	public synchronized int consume() {
		while (!available) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("consumer consuming " + data);
		available = false;
		this.notify();
		return data;

	}
}
