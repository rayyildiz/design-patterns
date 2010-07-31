package com.rayyildiz.patterns;

public class Cook {
	private CoffeeBuilder coffeeBuilder;
	
	/**
	 * @param coffeeBuilder the coffeeBuilder to set
	 */
	public void setCoffeeBuilder(CoffeeBuilder coffeeBuilder) {
		this.coffeeBuilder = coffeeBuilder;
	}

	public Coffee getCoffee(){
		return coffeeBuilder.getCoffee();
	}
	
	public void constructCoffee(){
		coffeeBuilder.createCoffee();
		coffeeBuilder.buildTastyCoffee();

	}
	
}
