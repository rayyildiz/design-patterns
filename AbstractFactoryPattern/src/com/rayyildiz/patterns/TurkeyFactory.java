package com.rayyildiz.patterns;

public class TurkeyFactory implements AbstractFactory {
	@Override
	public Address createAddress() {
		return new TurkeyAddress();
	}
}
