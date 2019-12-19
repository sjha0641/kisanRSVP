package com.rsvp.interfaces;

import com.rsvp.entity.Crop;

public interface cropInterface {

	public void addCropForSale();
	public Crop fetchAllCropsByFarmerId(int farmerId);
	public Crop fetchAllSoldCropsByFarmerId(int farmerId);
	public Crop fetchACropMarketPlaceByCropIdAndFarmerId(int cropId,int farmerId);
	
}
