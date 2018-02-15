package com.expedia.offers;

/**
 * 
 * Destination
 * 
 * @author Reem Essa
 * @version 1.0
 * 
 */
public class Destination {
	
	/** Region ID */
	private Long regionID;
	
	/** Associated Multi City Region Id */
	private Long associatedMultiCityRegionId;
	
	/** Long Name */
	private String longName;
	
	/** Short Name */
	private String shortName;
	
	/** Country */
	private String country;
	
	/** Province */
	private String province;
	
	/** City */
	private String city;
	
	/** Tla */
	private String tla;
	
	/** Non Localized City */
	private String nonLocalizedCity;

	
	/**
	 * @return the regionID
	 */
	public Long getRegionID() {
		return regionID;
	}

	/**
	 * @param regionID the regionID to set
	 */
	public void setRegionID(Long regionID) {
		this.regionID = regionID;
	}

	/**
	 * @return the associatedMultiCityRegionId
	 */
	public Long getAssociatedMultiCityRegionId() {
		return associatedMultiCityRegionId;
	}

	/**
	 * @param associatedMultiCityRegionId the associatedMultiCityRegionId to set
	 */
	public void setAssociatedMultiCityRegionId(Long associatedMultiCityRegionId) {
		this.associatedMultiCityRegionId = associatedMultiCityRegionId;
	}

	/**
	 * @return the longName
	 */
	public String getLongName() {
		return longName;
	}

	/**
	 * @param longName the longName to set
	 */
	public void setLongName(String longName) {
		this.longName = longName;
	}

	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

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
	 * @return the tla
	 */
	public String getTla() {
		return tla;
	}

	/**
	 * @param tla the tla to set
	 */
	public void setTla(String tla) {
		this.tla = tla;
	}

	/**
	 * @return the nonLocalizedCity
	 */
	public String getNonLocalizedCity() {
		return nonLocalizedCity;
	}

	/**
	 * @param nonLocalizedCity the nonLocalizedCity to set
	 */
	public void setNonLocalizedCity(String nonLocalizedCity) {
		this.nonLocalizedCity = nonLocalizedCity;
	}
}
