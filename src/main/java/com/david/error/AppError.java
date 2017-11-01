package com.david.error;

/**
 * Application level Exception handling
 * @author Chandra sekhar Babu A
 *
 */
public class AppError extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5506935615750315132L;
	
	String errorCode;
	String errorDescription;

	public AppError(String errorCode, String errorDescription) {
		super();
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

}
