package com.rsvp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsvp.entity.Bidder;
import com.rsvp.repository.BidderRepository;

@Service
public class BidderServices {
	
	@Autowired
	BidderRepository bidderRepository;
	
	public Bidder addFarmer(Bidder bidder) {
			
		return bidderRepository.addBidder(bidder); 
	}
}
