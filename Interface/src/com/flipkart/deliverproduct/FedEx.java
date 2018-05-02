package com.flipkart.deliverproduct;

public class FedEx implements IDeliver {

	@Override
	public void deliverProduct(String name, long phone, String address) {
		System.out.println("fedex Delivered the product to " + name + " " + phone + " at " + address);
	}

}
