package com.expedia.offers;

import java.time.LocalDate;

/**
 * 
 * Offer Date Range
 * 
 * @author Reem Essa
 * @version 1.0
 * 
 */
public class OfferDateRange {
	
	/** Travel Start Date */
	private LocalDate travelStartDate;
	
	/** Travel End Date */
	private LocalDate travelEndDate;
	
	/** Length Of Stay */
	private Integer lengthOfStay;

	/**
	 * @return the travelStartDate
	 */
	public LocalDate getTravelStartDate() {
		return travelStartDate;
	}

	/**
	 * @param travelStartDate the travelStartDate to set
	 */
	public void setTravelStartDate(LocalDate travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	/**
	 * @return the travelEndDate
	 */
	public LocalDate getTravelEndDate() {
		return travelEndDate;
	}

	/**
	 * @param travelEndDate the travelEndDate to set
	 */
	public void setTravelEndDate(LocalDate travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	/**
	 * @return the lengthOfStay
	 */
	public Integer getLengthOfStay() {
		return lengthOfStay;
	}

	/**
	 * @param lengthOfStay the lengthOfStay to set
	 */
	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
}
