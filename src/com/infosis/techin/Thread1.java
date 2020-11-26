package com.infosis.techin;

public class Thread1 extends Thread {
	private Product product;
	
	public Thread1(Product product) {
		this.product=product;
	}
	
	public void run() {
		product.add(100, 200);
	}
	
}