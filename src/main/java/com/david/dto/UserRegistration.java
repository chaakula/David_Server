package com.david.dto;

import java.sql.Timestamp;

import com.david.common.DateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * @author Chandra Sekhar Babu A
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRegistration {

	private long id;
	private String fBuyer;
	private String name;
	private String address;
	private String state;
	private String zipCode;
	private String ssn;
	private long jobTime;
	private long payFrequency;
	private String reason;
	private String cosDigner;
	private String cName;
	private String cAddress;
	private String cState;
	private String cZipCode;
	private String cSsn;
	private long cJobTime;
	private long cPayFrequency;
	@JsonSerialize(using = DateSerializer.class)
	private Timestamp createdTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getfBuyer() {
		return fBuyer;
	}

	public void setfBuyer(String fBuyer) {
		this.fBuyer = fBuyer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public long getJobTime() {
		return jobTime;
	}

	public void setJobTime(long jobTime) {
		this.jobTime = jobTime;
	}

	public long getPayFrequency() {
		return payFrequency;
	}

	public void setPayFrequency(long payFrequency) {
		this.payFrequency = payFrequency;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getCosDigner() {
		return cosDigner;
	}

	public void setCosDigner(String cosDigner) {
		this.cosDigner = cosDigner;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcState() {
		return cState;
	}

	public void setcState(String cState) {
		this.cState = cState;
	}

	public String getcZipCode() {
		return cZipCode;
	}

	public void setcZipCode(String cZipCode) {
		this.cZipCode = cZipCode;
	}

	public String getcSsn() {
		return cSsn;
	}

	public void setcSsn(String cSsn) {
		this.cSsn = cSsn;
	}

	public long getcJobTime() {
		return cJobTime;
	}

	public void setcJobTime(long cJobTime) {
		this.cJobTime = cJobTime;
	}

	public long getcPayFrequency() {
		return cPayFrequency;
	}

	public void setcPayFrequency(long cPayFrequency) {
		this.cPayFrequency = cPayFrequency;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

}
