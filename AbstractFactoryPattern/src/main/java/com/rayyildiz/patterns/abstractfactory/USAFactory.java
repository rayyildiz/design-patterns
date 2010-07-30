package com.rayyildiz.patterns.abstractfactory;

public class USAFactory implements AbstractFactory {
	@Override
	public Address createAddress() {
		return new USAAddress();
	}
}
