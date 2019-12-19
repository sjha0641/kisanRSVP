package com.rsvp.interfaces;

import com.rsvp.entity.Farmer;

public interface farmerInterface {

	public void addFarmer();
	public Farmer loginFarmer(String email,String password);
	public Farmer forgotPassword(String email,int contactNo);
}
