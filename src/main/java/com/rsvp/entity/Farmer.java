package com.rsvp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_KISAANFARMER")
public class Farmer {

	@Id
	@GeneratedValue
	private int farmerId;
	private String farmerEmail;
	private String farmerPassword;
	private String farmerFullName;
	private String farmerContact;
	
	@OneToOne(mappedBy = "farmerDetails",cascade = CascadeType.ALL)
	DetailsFarmer detailsFarmer;

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public String getFarmerEmail() {
		return farmerEmail;
	}

	public void setFarmerEmail(String farmerEmail) {
		this.farmerEmail = farmerEmail;
	}

	public String getFarmerPassword() {
		return farmerPassword;
	}

	public void setFarmerPassword(String farmerPassword) {
		this.farmerPassword = farmerPassword;
	}

	public String getFarmerFullName() {
		return farmerFullName;
	}

	public void setFarmerFullName(String farmerFullName) {
		this.farmerFullName = farmerFullName;
	}

	public String getFarmerContact() {
		return farmerContact;
	}

	public void setFarmerContact(String farmerContact) {
		this.farmerContact = farmerContact;
	}

	public DetailsFarmer getDetailsFarmer() {
		return detailsFarmer;
	}

	public void setDetailsFarmer(DetailsFarmer detailsFarmer) {
		this.detailsFarmer = detailsFarmer;
	}

	@Override
	public String toString() {
		return "Farmer [farmerId=" + farmerId + ", farmerEmail=" + farmerEmail + ", farmerPassword=" + farmerPassword
				+ ", farmerFullName=" + farmerFullName + ", farmerContact=" + farmerContact + ", detailsFarmer="
				+ detailsFarmer + "]";
	}
	
	
	
}
