package com.david.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERLOANINFORMATION")
public class UserLoanInformationModel  implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "DOWN_PAYMENT")
	private long downPayment;
	
	@Column(name = "PAYMENT_RANGE_MIN")
	private long minPaymentRange;
	
	@Column(name = "PAYMENT_RANGE_MAX")
	private long maxPaymentRange;
	 
	@Column(name = "STATE")
	private String state;

	@Column(name = "ZIPCODE")
	private String zipCode;

	@Column(name = "VEHICLE_YEAR")
	private long vehicleYear;

	@Column(name = "VEHICLE_MILAGE")
	private long vehicleMilage;

	@Column(name = "VEHICLE_BOOK_VALUE")
	private long vehicleBookValue;
	
	@Column(name = "TRADEIN")
	private String tradeIn;

	@Column(name = "TRADEIN_AMOUNT_OWNED")
	private long tradeInAmountOwned;
	
	@Column(name = "TRADEIN_AMOUNT_TO_CREDIT")
	private long tradeInAmountToCredit;
	
	@Column(name = "LOAN_TERM_LENGTH")
	private long loanTermLength;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
