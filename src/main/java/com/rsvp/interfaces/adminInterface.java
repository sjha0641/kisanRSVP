package com.rsvp.interfaces;

import com.rsvp.entity.Farmer;

public interface adminInterface {

	public void addAdmin();
	public Farmer loginAdmin(String email,String password);
}
