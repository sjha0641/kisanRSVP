package com.rsvp.services;

import javax.mail.SendFailedException;
import javax.persistence.Access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsvp.entity.DetailsFarmer;
import com.rsvp.entity.Farmer;
import com.rsvp.repository.FarmerRepository;

@Service
public class FarmerServices {

	@Autowired
	private FarmerRepository farmerRepository;
	
	@Autowired
	private SendMailService sendMailService;
	
	public void saveFarmer(Farmer farmer, DetailsFarmer detailsFarmer) {
		farmerRepository.saveFarmer(farmer, detailsFarmer);		
		sendMailService.send(farmer.getFarmerEmail(), "wellcome to kisaan humari jaan", "Thanxs for registering with kisaanRSVP");
	}
	
}
