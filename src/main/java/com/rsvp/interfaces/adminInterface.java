package com.rsvp.interfaces;

import com.rsvp.entity.Admin;
import com.rsvp.entity.Farmer;

public interface adminInterface {

	public void addAdmin();
	public Admin loginAdmin(String email,String password);
}
