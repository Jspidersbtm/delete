package com.banking.atmexample;

public class CitiImpl implements ITrackerCell {
	@Override
	public void withDraw() {
		System.out.println("Insert the card");
		System.out.println("Enter the pin and the amount");
		System.out.println("collect the money");
	}
}
