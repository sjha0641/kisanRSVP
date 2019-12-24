package com.rsvp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsvp.entity.Admin;
import com.rsvp.entity.Bidder;
import com.rsvp.entity.Farmer;
import com.rsvp.exception.AdminLoginException;
import com.rsvp.repository.AdminRepository;

@Service
public class AdminServices {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin login(String email, String password) throws AdminLoginException{
	
		try {
			Admin admin= adminRepository.fetch(email, password);
			return admin;
		} catch(Exception e) {
			e.printStackTrace();
			throw new AdminLoginException("Invalid email or password",e);
		}
	}
	
	public List<Farmer> fetchAllFarmer() {
		List<Farmer> list=adminRepository.fetchAllFarmer();
		return list;
	}
	
	public List<Bidder> fetchAllBidder() {
		List<Bidder> list=adminRepository.fetchAllBidder();
		return list;
	}

	
	public List<Farmer> fetchAllUnverifiedFarmer() {
		List<Farmer> list=adminRepository.fetchAllUnverifiedFarmer();
		return list;
	}
	
	public List<Bidder> fetchAllUnverifiedBidder() {
		List<Bidder> list=adminRepository.fetchAllUnverifiedBidder();
		return list;
	}
	
}
