package com.expedia.offers;

/**
 * 
 * Hotel
 * 
 * @author Reem Essa
 * @version 1.0
 * 
 */
public class Hotel {
	
	
	/** Hotel Urls */
	public static final String HOTEL_URL_ELEMENT_NAME = "hotelUrls";

	/** Hotel Pricing Info */
	public static final String HOTEL_PRICING_INFO = "hotelPricingInfo";
	
	/** Hotel Pricing Info */
	public static final String HOTEL_INFO = "hotelInfo";
	
	/** Destination */
	public static final String DESTINATION = "destination";
	
	/** Offer Date Range */
	public static final String OFFER_DATE_RANGE = "offerDateRange";
	

	/** Hotel Urls */
	private HotelUrls hotelUrls;

	/** Hotel Pricing Info */
	private HotelPricingInfo hotelPricingInfo;

	/** Hotel Info */
	private HotelInfo hotelInfo;

	/** Destination */
	private Destination destination;

	/** Offer DateR ange */
	private OfferDateRange offerDateRange;

	/**
	 * @return the hotelUrls
	 */
	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}

	/**
	 * @param hotelUrls the hotelUrls to set
	 */
	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}

	/**
	 * @return the hotelPricingInfo
	 */
	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}

	/**
	 * @param hotelPricingInfo the hotelPricingInfo to set
	 */
	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	/**
	 * @return the hotelInfo
	 */
	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}

	/**
	 * @param hotelInfo the hotelInfo to set
	 */
	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	/**
	 * @return the destination
	 */
	public Destination getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	/**
	 * @return the offerDateRange
	 */
	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	/**
	 * @param offerDateRange the offerDateRange to set
	 */
	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}
}
