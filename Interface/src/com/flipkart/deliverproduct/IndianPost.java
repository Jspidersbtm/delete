package com.flipkart.deliverproduct;

public class IndianPost implements IDeliver {
	@Override
	public void deliverProduct(String name, long phone, String address) {
		System.out.println("indian post Delivered the product to " + name + " " + phone + " at " + address);
	}

}
