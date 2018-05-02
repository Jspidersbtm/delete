package com.banking.atmexample;

public class TestTracekerCell {
	public static void main(String[] args) {
		ITrackerCell dbsBank = new IciciATMImpl();
		dbsBank.withDraw();
	}
}
