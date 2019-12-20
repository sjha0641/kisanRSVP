package com.rsvp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rsvp.entity.Bidder;
import com.rsvp.exception.kisaanException;
import com.rsvp.services.BidderServices;

@Controller
public class BidderController {
	
	@Autowired
	BidderServices bidderServices;
	
	@RequestMapping(path = "/addFarmer.rsvp", method = RequestMethod.POST)
	public String	addFarmer(Bidder bidder,ModelMap model) {
		
		try {
			Bidder bidder1 = bidderServices.addFarmer(bidder);
			model.put("bidder1", bidder1);
			return "successfulregistration.jsp";
		} catch (kisaanException e) {
			return "bidderregistration.jsp";

		}
		
	} 
}

