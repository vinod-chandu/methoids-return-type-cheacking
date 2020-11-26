package com.infosis.techin;

public class Product extends Thread {
	private int x;
	private int y;

	public void add(int x, int y) {
		this.x = x;
		this.y = y;
		Thread thread = new Thread().currentThread();// Thread class
		System.out.println(thread.currentThread());
		System.out.println("CHANDU VELAGAPUDI");
		System.out.println(thread.getName() + " is paused");// add method or thread1
		System.out.println(thread.getThreadGroup());// main
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(thread.getName() + " Thread is resumed");// add method or thread2
		}
		System.out.println(thread.getName() + " Thread is resumed");// add method or thread2
	}


	}