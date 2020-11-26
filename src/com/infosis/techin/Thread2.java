package com.infosis.techin;

public class Thread2 extends Thread {
	
private Product product;
	
	public Thread2(Product product) {
		this.product=product;
	}
	
	public void run() {
		product.add(100, 200);
	}
	

	
}
