package com.expedia.offers;

/**
 * 
 * User Info 
 * 
 * @author Reem Essa
 * @version 1.0
 * 
 */
public class UserInfo {

	/** Persona */	
	private Persona persona;
	
	/** User Id */
	private String userId;

	/**
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
