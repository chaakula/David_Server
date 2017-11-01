package com.david.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 
 * @author Chandra Sekhar Babu A
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserLoanInformation {

	private long id;
	private long downPayment;
	private long minPaymentRange;
	private long maxPaymentRange;
	private String state;
	private String zipCode;
	private long vehicleYear;
	private long vehicleMilage;
	private long vehicleBookValue;
	private String tradeIn;
	private long tradeInAmountOwned;
	private long tradeInAmountToCredit;
	private long loanTermLength;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(long downPayment) {
		this.downPayment = downPayment;
	}

	public long getMinPaymentRange() {
		return minPaymentRange;
	}

	public void setMinPaymentRange(long minPaymentRange) {
		this.minPaymentRange = minPaymentRange;
	}

	public long getMaxPaymentRange() {
		return maxPaymentRange;
	}

	public void setMaxPaymentRange(long maxPaymentRange) {
		this.maxPaymentRange = maxPaymentRange;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public long getVehicleYear() {
		return vehicleYear;
	}

	public void setVehicleYear(long vehicleYear) {
		this.vehicleYear = vehicleYear;
	}

	public long getVehicleMilage() {
		return vehicleMilage;
	}

	public void setVehicleMilage(long vehicleMilage) {
		this.vehicleMilage = vehicleMilage;
	}

	public long getVehicleBookValue() {
		return vehicleBookValue;
	}

	public void setVehicleBookValue(long vehicleBookValue) {
		this.vehicleBookValue = vehicleBookValue;
	}

	public String getTradeIn() {
		return tradeIn;
	}

	public void setTradeIn(String tradeIn) {
		this.tradeIn = tradeIn;
	}

	public long getTradeInAmountOwned() {
		return tradeInAmountOwned;
	}

	public void setTradeInAmountOwned(long tradeInAmountOwned) {
		this.tradeInAmountOwned = tradeInAmountOwned;
	}

	public long getTradeInAmountToCredit() {
		return tradeInAmountToCredit;
	}

	public void setTradeInAmountToCredit(long tradeInAmountToCredit) {
		this.tradeInAmountToCredit = tradeInAmountToCredit;
	}

	public long getLoanTermLength() {
		return loanTermLength;
	}

	public void setLoanTermLength(long loanTermLength) {
		this.loanTermLength = loanTermLength;
	}

}
