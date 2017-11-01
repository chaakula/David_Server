package com.david.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 
 * @author Chandra Sekhar Babu A
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EvaluateRequest {

	private UserRegistration userRegistration;
	private UserLoanInformation userLoanInformation;

	public UserRegistration getUserRegistration() {
		return userRegistration;
	}

	public void setUserRegistration(UserRegistration userRegistration) {
		this.userRegistration = userRegistration;
	}

	public UserLoanInformation getUserLoanInformation() {
		return userLoanInformation;
	}

	public void setUserLoanInformation(UserLoanInformation userLoanInformation) {
		this.userLoanInformation = userLoanInformation;
	}

}
