package com.rsvp.interfaces;

import com.rsvp.entity.Crop;
import com.rsvp.entity.Farmer;

public interface bidderInterface {

	public void addBidder();
	public Farmer loginBidder(String email,String password);
	public Crop fetchAllCrops();
	public Crop placeABidByBidderIdAndCropId(int bidderId,int cropId);
}
