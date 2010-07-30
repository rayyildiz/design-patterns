package com.rayyildiz.patterns.abstractfactory;

public class TurkeyFactory implements AbstractFactory {
	@Override
	public Address createAddress() {
		return new TurkeyAddress();
	}
}
