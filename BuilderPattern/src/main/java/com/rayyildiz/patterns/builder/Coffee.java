package com.rayyildiz.patterns.builder;

public class Coffee {
	private ColourType colour;
	private SugarType sugar;
	private int price;
	private String name;
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the colour
	 */
	public ColourType getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(ColourType colour) {
		this.colour = colour;
	}
	/**
	 * @return the sugar
	 */
	public SugarType getSugar() {
		return sugar;
	}
	/**
	 * @param sugar the sugar to set
	 */
	public void setSugar(SugarType sugar) {
		this.sugar = sugar;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Coffee [colour=" + colour + ", name=" + name + ", price="
				+ price + ", sugar=" + sugar + "]";
	}
}
