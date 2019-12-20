package com.rsvp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsvp.entity.Bidder;
import com.rsvp.exception.kisaanException;
import com.rsvp.repository.BidderRepository;

@Service
public class BidderServices {
	
	@Autowired
	BidderRepository bidderRepository;
	
	public Bidder addFarmer(Bidder bidder) throws kisaanException {
			
	try {
		Bidder bidder1 =  bidderRepository.addBidder(bidder);
		return bidder1;
	}
	catch (Exception e) {
		throw new kisaanException("Unable to Register.Please try again with valid credentials.",e);
	}
	}
} 
