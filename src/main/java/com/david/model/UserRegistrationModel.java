package com.david.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERREGISTRATION")
public class UserRegistrationModel implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "FBUYER")
	private String fBuyer;

	@Column(name = "NAME")
	private String name;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "STATE")
	private String state;

	@Column(name = "ZIPCODE")
	private String zipCode;

	@Column(name = "SSN")
	private String ssn;

	@Column(name = "JOBTIME")
	private long jobTime;

	@Column(name = "PAYFREQUENCY")
	private long payFrequency;

	@Column(name = "REASON")
	private String reason;

	@Column(name = "COSIGNER")
	private String cosDigner;

	@Column(name = "C_NAME")
	private String cName;

	@Column(name = "C_ADDRESS")
	private String cAddress;

	@Column(name = "C_STATE")
	private String cState;

	@Column(name = "C_ZIPCODE")
	private String cZipCode;

	@Column(name = "C_SSN")
	private String cSsn;

	@Column(name = "C_JOBTIME")
	private long cJobTime;

	@Column(name = "C_PAYFREQUENCY")
	private long cPayFrequency;

	@Column(name = "CREATED_TIME")
	private Timestamp createdTime;

	public UserRegistrationModel() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
