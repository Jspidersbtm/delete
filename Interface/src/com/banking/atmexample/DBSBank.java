package com.banking.atmexample;

public class DBSBank implements ITrackerCell {
	@Override
	public void withDraw() {
		System.out.println("swipe the card");
		System.out.println("Enter the pin and the amount");
		System.out.println("collect the money");
	}
}
