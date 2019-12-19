package com.rsvp.interfaces;

import com.rsvp.entity.Bidder;
import com.rsvp.entity.Crop;

public interface bidderInterface {

	public void addBidder();
	public Bidder loginBidder(String email,String password);
	public Crop fetchAllCrops();
	public Crop placeABidByBidderIdAndCropId(int bidderId,int cropId);
}
