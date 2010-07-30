package com.rayyildiz.patterns;

import java.util.Random;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rnd = new Random();
		int number = rnd.nextInt(10);
		boolean odd = ((number % 2) == 0);
		
		AbstractFactory factory = odd ? new TurkeyFactory(): new  USAFactory();

		Application app = new Application(factory);
		app.show();
		
		if (System.console()!=null) System.console().readLine();
	}

}
