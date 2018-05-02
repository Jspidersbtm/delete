package com.flipkart.deliverproduct;

public class DHL implements IDeliver {

	@Override
	public void deliverProduct(String name, long phone, String address) {
		System.out.println("dhl Delivered the product to " + name + " " + phone + " at " + address);
	}

}
