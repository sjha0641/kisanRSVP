package com.rsvp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rsvp.entity.Bidder;
import com.rsvp.services.BidderServices;

@Controller
public class BidderController {
	
	@Autowired
	BidderServices bidderServices;
	
	@RequestMapping(path = "/addFarmer.rsvp", method = RequestMethod.POST)
	public String	addFarmer(Bidder bidder,ModelMap model) {
		
		bidderServices.addFarmer(bidder);
		
		return "SuccessfulRegistration.jsp";
	} 
}

