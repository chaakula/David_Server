package com.david.dto;

import com.david.error.AppError;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 
 * @author Chandra Sekhar Babu A
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EvaluateResponse {

	private boolean status;

	private AppError error;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public AppError getError() {
		return error;
	}

	public void setError(AppError error) {
		this.error = error;
	}

}
