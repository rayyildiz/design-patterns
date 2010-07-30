package com.rayyildiz.patterns;

public abstract class Address {
	String city;
	String address;
	 
	abstract String getCountryCode();
	 


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}



	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}



	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [_address=" + address + ", _city=" + city
				+ ", Country Code=" + getCountryCode() + "]";
	}	
}
