package com.expedia.offers;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * 
 * Hotel Pricing Info
 * 
 * @author Reem Essa
 * @version 1.0
 * 
 */
public class HotelPricingInfo {

	/** Average Price Value */
	private Double averagePriceValue;

	/** Total Price Value */
	private Double totalPriceValue;

	/** Cross Out Price Value */
	private Double crossOutPriceValue;

	/** Original Price Per Night */
	private Double originalPricePerNight;

	/** Currency */
	private String currency;

	/** Percent Savings */
	private Double percentSavings;

	/** Drr */
	private boolean drr;

	/**
	 * @return the averagePriceValue
	 */
	public Double getAveragePriceValue() {
		return averagePriceValue;
	}

	/**
	 * @param averagePriceValue
	 *            the averagePriceValue to set
	 */
	public void setAveragePriceValue(Double averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}

	/**
	 * @return the totalPriceValue
	 */
	public Double getTotalPriceValue() {
		return totalPriceValue;
	}

	/**
	 * @param totalPriceValue
	 *            the totalPriceValue to set
	 */
	public void setTotalPriceValue(Double totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}

	/**
	 * @return the crossOutPriceValue
	 */
	public Double getCrossOutPriceValue() {
		return crossOutPriceValue;
	}

	/**
	 * @param crossOutPriceValue
	 *            the crossOutPriceValue to set
	 */
	public void setCrossOutPriceValue(Double crossOutPriceValue) {
		this.crossOutPriceValue = crossOutPriceValue;
	}

	/**
	 * @return the originalPricePerNight
	 */
	public Double getOriginalPricePerNight() {
		return originalPricePerNight;
	}

	/**
	 * @param originalPricePerNight
	 *            the originalPricePerNight to set
	 */
	public void setOriginalPricePerNight(Double originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the percentSavings
	 */
	public Double getPercentSavings() {
		return percentSavings;
	}

	/**
	 * @param percentSavings
	 *            the percentSavings to set
	 */
	public void setPercentSavings(Double percentSavings) {
		this.percentSavings = percentSavings;
	}

	/**
	 * @return the drr
	 */
	public boolean isDrr() {
		return drr;
	}

	/**
	 * @param drr
	 *            the drr to set
	 */
	public void setDrr(boolean drr) {
		this.drr = drr;
	}
}
