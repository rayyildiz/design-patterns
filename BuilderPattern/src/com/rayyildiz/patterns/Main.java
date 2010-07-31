package com.rayyildiz.patterns;

public class Main {
	public static void main(String[] args) {
		Cook cook = new Cook();
		
		CoffeeBuilder turkishCoffeeBuilder = new TurkishCoffeeBuilder();
		
		cook.setCoffeeBuilder(turkishCoffeeBuilder);
		cook.constructCoffee();
		
		Coffee coffee = cook.getCoffee();
		
		System.out.println("coffee:" + coffee);
		if ( System.console()!=null) System.console().readLine();		
	}
}
