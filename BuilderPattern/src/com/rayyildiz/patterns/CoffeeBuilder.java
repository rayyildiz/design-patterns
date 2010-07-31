package com.rayyildiz.patterns;

public abstract class CoffeeBuilder {
	private Coffee coffee;

	public Coffee getCoffee() {
		return coffee;
	}
	
	public void createCoffee(){
		coffee = new Coffee();
	}
	
	public abstract void buildTastyCoffee();
}
