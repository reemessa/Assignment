package com.expedia.offers;

import java.util.List;

/**
 * 
 * Offers
 * 
 * @author Reem Essa
 * @version 1.0
 * 
 */
public class Offers {

	/** Hotels */
	private List<Hotel> hotels;

	/**
	 * @return the hotels
	 */
	public List<Hotel> getHotels() {
		return hotels;
	}

	/**
	 * @param hotels
	 *            the hotels to set
	 */
	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
}
