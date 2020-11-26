package com.infosis.techin;

public class ChanduTesting {
	public static void main(String[] args) {
		Product product = new Product();
		new Thread1(product).start();
		new Thread2(product).start();
	}

}
