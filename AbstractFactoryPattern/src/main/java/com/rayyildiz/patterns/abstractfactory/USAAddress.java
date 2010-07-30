package com.rayyildiz.patterns.abstractfactory;

public class USAAddress extends Address {
	@Override
	String getCountryCode() {
		return "us_US";
	}
}
