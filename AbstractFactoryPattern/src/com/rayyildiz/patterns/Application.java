package com.rayyildiz.patterns;

public class Application {
	AbstractFactory _factory;

	public Application(AbstractFactory factory) {
		super();
		_factory = factory;
	}
	
	public void show(){
		Address address = _factory.createAddress();
		address.setAddress("address");
		address.setCity("city");
		
		System.out.println("address :" + address);
	}
}
