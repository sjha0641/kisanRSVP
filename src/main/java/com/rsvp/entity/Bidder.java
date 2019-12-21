package com.rsvp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_KISAANBIDDER")
public class Bidder {

	@Id
	@GeneratedValue
	private int bidderId;
	@Column(unique=true)
	private String bidderEmail;
	private String bidderPassword;
	private String bidderFullName;
	private String bidderContact;
	
	@OneToOne(mappedBy = "bidderDetails",cascade = CascadeType.ALL)
	DetailsBidder detailsBidder;

	public int getBidderId() {
		return bidderId;
	}

	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}

	public String getBidderEmail() {
		return bidderEmail;
	}

	public void setBidderEmail(String bidderEmail) {
		this.bidderEmail = bidderEmail;
	}

	public String getBidderPassword() {
		return bidderPassword;
	}

	public void setBidderPassword(String bidderPassword) {
		this.bidderPassword = bidderPassword;
	}

	public String getBidderFullName() {
		return bidderFullName;
	}

	public void setBidderFullName(String bidderFullName) {
		this.bidderFullName = bidderFullName;
	}

	public String getBidderContact() {
		return bidderContact;
	}

	public void setBidderContact(String bidderContact) {
		this.bidderContact = bidderContact;
	}

	public DetailsBidder getDetailsBidder() {
		return detailsBidder;
	}

	public void setDetailsBidder(DetailsBidder detailsBidder) {
		this.detailsBidder = detailsBidder;
	}

	@Override
	public String toString() {
		return "Bidder [bidderId=" + bidderId + ", bidderEmail=" + bidderEmail + ", bidderPassword=" + bidderPassword
				+ ", bidderFullName=" + bidderFullName + ", bidderContact=" + bidderContact + ", detailsBidder="
				+ detailsBidder + "]";
	}
	
	
}
