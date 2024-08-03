package com.nmscinema.Capstone_Project_Add_Microservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer purchaseId;

	String customerName;

	String movieName;

	Integer ticketNumber;

	String customerEmail;

	public Purchase() {

	}

	public Purchase(Integer purchaseId, String customerName, String movieName, Integer ticketNumber,
			String customerEmail) {
		this.purchaseId = purchaseId;
		this.customerName = customerName;
		this.movieName = movieName;
		this.ticketNumber = ticketNumber;
		this.customerEmail = customerEmail;
	}

	public Integer getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Integer getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(Integer ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", customerName=" + customerName + ", movieName=" + movieName
				+ ", ticketNumber=" + ticketNumber + ", customerEmail=" + customerEmail + "]";
	}

}
