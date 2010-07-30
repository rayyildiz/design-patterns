package com.rayyildiz.patterns.builder;

public class BrazilianCoffeeBuilder extends CoffeeBuilder {
	@Override
	public void buildTastyCoffee() {
		Coffee coffee = getCoffee();
		coffee.setColour(ColourType.DarkBrown);
		coffee.setPrice(10);
		coffee.setSugar(SugarType.Much);
		coffee.setName("Brazilian Coffee");
	}
}
