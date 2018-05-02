package com.flipkart.deliverproduct;

public interface IDeliver {
	void deliverProduct(String name, long phone, String address);

	static void show() {
		System.out.println("This is static concrete");
	}
}