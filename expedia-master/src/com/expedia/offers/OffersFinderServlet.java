package com.expedia.offers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Offers Finder Servlet
 * 
 * @author Reem Essa
 * @version 1.0
 * 
 */
@WebServlet("/OffersFinderServlet")
public class OffersFinderServlet extends HttpServlet {

	/** Default Serial Version Id */
	private static final long serialVersionUID = 1L;

	/** Related JSP Page */
	private static final String RELATED_JSP_PAGE = "/OffersSearchPage.jsp";

	/** JSON Main Element Name */
	private static final String JSON_MAIN_ELEMENT_NAME = "Hotel";

	/** Offers Helper */
	private static OffersHelper offersHelper = new OffersHelper();

	/** Offers */
	private Offers offers;

	/**
	 * Do Get Method
	 * 
	 * @param request
	 * @param response
	 * throws : ServletException, IOException, MalformedURLException,IOException
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, MalformedURLException, IOException {

		JSONObject jsonObject = null;
		try {
			String jsonAsString = getOffersJson(request);
			if (jsonAsString != null && jsonAsString != "") {
				jsonObject = new JSONObject(jsonAsString);
				setOffers(constructOffersObject(jsonObject.getJSONObject("offers")));
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		request.setAttribute("offersInfo", getOffers());
		request.getRequestDispatcher(RELATED_JSP_PAGE).forward(request, response);
	}

	/**
	 * Read All
	 * 
	 * @param Reader rd
	 * @return JSON object as a string
	 * 
	 */
	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	/**
	 * Get Offers Json
	 * 
	 * @return String representing JSON Object
	 * @throws : MalformedURLException, IOException, JSONException
	 * 
	 */
	private static String getOffersJson(HttpServletRequest request)
			throws MalformedURLException, IOException, JSONException {
		String url = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";
		StringBuffer params = prepareUrlParams(request);
		
		if (params != null && params.length() != 0){
			url+=params.toString();
		}
		InputStream is = null;
		BufferedReader rd = null;
		try {
			is = new URL(url).openStream();
			rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			return readAll(rd);
		} finally {
			is.close();
		}

	}

	/**
	 * Prepare Url Params
	 * 
	 * @param Http Servlet Request
	 * @return A String representing the sent parameters
	 * 
	 * */
	private static StringBuffer prepareUrlParams(HttpServletRequest request) {
		StringBuffer params = new StringBuffer();
		String destination = request.getParameter("destinationName");
		String lengthOfStay = request.getParameter("lengthOfStay");
		String minTripStartDate = request.getParameter("minTripStartDate");
		String maxTripStartDate = request.getParameter("maxTripStartDate");
		String minStarRating = request.getParameter("minStarRating");
		String maxStarRating = request.getParameter("maxStarRating");
		String minTotalRating = request.getParameter("minTotalRating");
		String maxTotalRating = request.getParameter("maxTotalRating");
		String minGuestRating = request.getParameter("minGuestRating");
		String maxGuestRating = request.getParameter("maxGuestRating");

		if (destination != null && destination != "") {
			params.append("&destinationName=" + destination);
		}
		if (lengthOfStay != null && lengthOfStay != "") {
			params.append("&lengthOfStay=" + lengthOfStay);
		}
		if (minTripStartDate != null && minTripStartDate != "") {
			params.append("&minTripStartDate=%3A" + minTripStartDate);
		}
		if (maxTripStartDate != null && maxTripStartDate != "") {
			params.append("&maxTripStartDate=%3A" + maxTripStartDate);
		}
		if (minStarRating != null && minStarRating != "") {
			params.append("&minStarRating=" + minStarRating);
		}
		if (maxStarRating != null && maxStarRating != ""){
			params.append("&maxStarRating=" + maxStarRating);
		}
		if (minTotalRating != null && minTotalRating != ""){
			params.append("&minTotalRating=" + minTotalRating);
		}
		if (maxTotalRating != null && maxTotalRating != ""){
			params.append("&maxTotalRating=" + maxTotalRating);
		}
		if (minGuestRating!= null && minGuestRating != ""){
			params.append("&minGuestRating=" + minGuestRating);
		}
		if (maxGuestRating != null && maxGuestRating != ""){
			params.append("&maxGuestRating=" + maxGuestRating);
		}
		
		return params;

	}

	/**
	 * Construct Offers Object
	 * 
	 * @param JSON
	 *            Object
	 * @return Offers Object
	 * 
	 */
	private Offers constructOffersObject(JSONObject offersObject) {

		// If JSON object is empty , return null
		if (offersObject == null) {
			return null;
		}
		
		try {
			// If JSON main element is empty , return null
			if (offersObject.isNull(JSON_MAIN_ELEMENT_NAME)) {
				return null;
			}

			JSONArray hotelsJsonArray = offersObject.getJSONArray(JSON_MAIN_ELEMENT_NAME);

			// call generate offers object method using a helper class to
			// generate the required object
			setOffers(offersHelper.generateOffersObject(hotelsJsonArray));

		} catch (JSONException e) {
			e.printStackTrace();
		}
		return getOffers();
	}

	/**
	 * @return the offers
	 */
	public Offers getOffers() {
		return offers;
	}

	/**
	 * @param offers
	 *            the offers to set
	 */
	public void setOffers(Offers offers) {
		this.offers = offers;
	}
}
