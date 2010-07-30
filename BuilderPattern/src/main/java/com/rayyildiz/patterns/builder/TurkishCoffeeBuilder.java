package com.rayyildiz.patterns.builder;

public class TurkishCoffeeBuilder extends CoffeeBuilder {
	@Override
	public void buildTastyCoffee() {
		Coffee coffee = getCoffee();
		coffee.setColour(ColourType.LightBrown);
		coffee.setPrice(6);
		coffee.setSugar(SugarType.Much);
		coffee.setName("Turkish Coffee");
	}
}