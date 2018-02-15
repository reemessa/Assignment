package com.expedia.offers;

import java.time.LocalDate;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Offers Helper
 * 
 * @author Reem Essa
 * @version 1.0
 * 
 */
public class OffersHelper {

	/**
	 * Generate Offers Object
	 * 
	 * This method will generate a Hotel object from an existing JSON Array
	 * 
	 * @param JSON
	 *            Array
	 * @return Offers object
	 * 
	 */
	public Offers generateOffersObject(JSONArray jsonArray) {

		Offers offers = new Offers();
		offers.setHotels(new ArrayList<>());
		Integer length = jsonArray.length();
		Hotel hotel = null;
		for (int i = 0; i < length; i++) {
			try {
				JSONObject hotels = (JSONObject) jsonArray.get(i);
				hotel = new Hotel();

				if (hotels.getJSONObject(Hotel.HOTEL_URL_ELEMENT_NAME) != null) {
					hotel.setHotelUrls(generateHotelUrlsObject(hotels.getJSONObject(Hotel.HOTEL_URL_ELEMENT_NAME)));
				}
				if (hotels.getJSONObject(Hotel.HOTEL_PRICING_INFO) != null) {
					hotel.setHotelPricingInfo(
							generateHotelPricingInfoObject(hotels.getJSONObject(Hotel.HOTEL_PRICING_INFO)));
				}
				if (hotels.getJSONObject(Hotel.HOTEL_INFO) != null) {
					hotel.setHotelInfo(generateHotelInfoObject(hotels.getJSONObject(Hotel.HOTEL_INFO)));
				}
				if (hotels.getJSONObject(Hotel.DESTINATION) != null) {
					hotel.setDestination(generateDestinationObject(hotels.getJSONObject(Hotel.DESTINATION)));
				}
				if (hotels.getJSONObject(Hotel.OFFER_DATE_RANGE) != null) {
					hotel.setOfferDateRange(generateOfferDateRangeObject(hotels.getJSONObject(Hotel.OFFER_DATE_RANGE)));
				}
			} catch (JSONException e) {
				e.printStackTrace();
			}
			if (hotel != null) {
				offers.getHotels().add(hotel);
			}
		}
		return offers;
	}

	/**
	 * Generate Offer Date Range Object
	 * 
	 * @param Json Object
	 * @return Offer Date Range Object
	 * */
	private static OfferDateRange generateOfferDateRangeObject(JSONObject obj) {
		OfferDateRange offerDateRange = new OfferDateRange();
		int[] date = new int[3];
		JSONArray jsonArray = null;
		try {
			offerDateRange.setLengthOfStay(obj.getInt("lengthOfStay"));
			jsonArray = (JSONArray) obj.get("travelStartDate");
			for (int i = 0; i < jsonArray.length(); i++) {
				date[i] = (int) jsonArray.get(i);
			}
			offerDateRange.setTravelStartDate(LocalDate.of(date[0], date[1], date[2]));
			jsonArray = (JSONArray) obj.get("travelEndDate");
			for (int i = 0; i < jsonArray.length(); i++) {
				date[i] = (int) jsonArray.get(i);
			}
			offerDateRange.setTravelEndDate(LocalDate.of(date[0], date[1], date[2]));
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return offerDateRange;

	}

	/**
	 * Generate Destination Object
	 * 
	 * @param Json Object
	 * @return Destination Object
	 * */
	private static Destination generateDestinationObject(JSONObject obj) {
		Destination destination = new Destination();
		try {
			destination.setAssociatedMultiCityRegionId(obj.getLong("associatedMultiCityRegionId"));
			destination.setCity(obj.getString("city"));
			destination.setCountry(obj.getString("country"));
			destination.setLongName(obj.getString("longName"));
			destination.setNonLocalizedCity(obj.getString("nonLocalizedCity"));
			destination.setProvince(obj.getString("province"));
			destination.setRegionID(obj.getLong("regionID"));
			destination.setShortName(obj.getString("shortName"));
			destination.setTla(obj.getString("tla"));

		} catch (JSONException e) {
			e.printStackTrace();
		}
		return destination;

	}

	/**
	 * Generate Hotel Urls Object
	 * 
	 * @param Json Object
	 * @return Hotel Urls Object
	 * */
	private static HotelUrls generateHotelUrlsObject(JSONObject obj) {
		HotelUrls hotelUrls = new HotelUrls();
		try {
			hotelUrls.setHotelInfositeUrl(obj.getString("hotelInfositeUrl"));
			hotelUrls.setHotelSearchResultUrl(obj.getString("hotelSearchResultUrl"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return hotelUrls;

	}

	/**
	 * Generate Hotel Pricing Info Object
	 * 
	 * @param Json Object
	 * @return Hotel Pricing Info Object
	 * */
	private static HotelPricingInfo generateHotelPricingInfoObject(JSONObject obj) {

		HotelPricingInfo hotelPricingInfo = new HotelPricingInfo();
		try {
			hotelPricingInfo.setAveragePriceValue(obj.getDouble("averagePriceValue"));
			hotelPricingInfo.setCrossOutPriceValue(obj.getDouble("crossOutPriceValue"));
			hotelPricingInfo.setCurrency(obj.getString("currency"));
			hotelPricingInfo.setDrr(obj.getBoolean("drr"));
			hotelPricingInfo.setOriginalPricePerNight(obj.getDouble("originalPricePerNight"));
			hotelPricingInfo.setPercentSavings(obj.getDouble("percentSavings"));
			hotelPricingInfo.setTotalPriceValue(obj.getDouble("totalPriceValue"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return hotelPricingInfo;

	}
	
	/**
	 * Generate Hotel Info Object
	 * 
	 * @param Json Object
	 * @return Hotel Info Object
	 * */
	private static HotelInfo generateHotelInfoObject(JSONObject obj) {
		HotelInfo hotelInfo = new HotelInfo();
		try {
			hotelInfo.setHotelCity(obj.getString("hotelCity"));
			hotelInfo.setHotelCountryCode(obj.getString("hotelCountryCode"));
			hotelInfo.setHotelDestination(obj.getString("hotelDestination"));
			hotelInfo.setHotelDestinationRegionID(obj.getLong("hotelDestinationRegionID"));
			hotelInfo.setHotelId(obj.getLong("hotelId"));
			hotelInfo.setHotelLatitude(obj.getDouble("hotelLatitude"));
			hotelInfo.setHotelLongDestination(obj.getString("hotelLongDestination"));
			hotelInfo.setHotelLongitude(obj.getDouble("hotelLongitude"));
			hotelInfo.setHotelName(obj.getString("hotelName"));
			hotelInfo.setHotelProvince(obj.getString("hotelProvince"));
			hotelInfo.setHotelStreetAddress(obj.getString("hotelStreetAddress"));
			hotelInfo.setLocalizedHotelName(obj.getString("localizedHotelName"));
			hotelInfo.setHotelStarRating((float) obj.getDouble(("hotelStarRating")));
			hotelInfo.setHotelGuestReviewRating((float) obj.getDouble(("hotelGuestReviewRating")));
			hotelInfo.setHotelReviewTotal(obj.getInt(("hotelReviewTotal")));
			hotelInfo.setHotelImageUrl(obj.getString("hotelImageUrl"));
			hotelInfo.setVipAccess(obj.getBoolean(("vipAccess")));
			hotelInfo.setOfficialRating(obj.getBoolean("isOfficialRating"));

		} catch (JSONException e) {
			e.printStackTrace();
		}
		return hotelInfo;
	}
}
