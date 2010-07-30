package com.rayyildiz.patterns;

public class USAFactory implements AbstractFactory {
	@Override
	public Address createAddress() {
		return new USAAddress();
	}

}
