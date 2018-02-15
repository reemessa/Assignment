package com.expedia.offers;

/**
 * 
 * Offer Info
 * 
 * @author Reem Essa
 * @version 1.0
 * 
 */
public class OfferInfo {

	/** Site Id */
	private int siteId;

	/** Language */
	private String language;

	/** Currency */
	private String currency;

	/** User Selected Currency */
	private String userSelectedCurrency;

	/**
	 * @return the siteId
	 */
	public int getSiteId() {
		return siteId;
	}

	/**
	 * @param siteId
	 *            the siteId to set
	 */
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
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
	 * @return the userSelectedCurrency
	 */
	public String getUserSelectedCurrency() {
		return userSelectedCurrency;
	}

	/**
	 * @param userSelectedCurrency
	 *            the userSelectedCurrency to set
	 */
	public void setUserSelectedCurrency(String userSelectedCurrency) {
		this.userSelectedCurrency = userSelectedCurrency;
	}

}
