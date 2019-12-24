package com.rsvp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rsvp.entity.Admin;
import com.rsvp.entity.Bidder;
import com.rsvp.entity.Farmer;
import com.rsvp.services.AdminServices;

@Controller
@SessionAttributes("loggedInAdmin")
public class AdminController {
	
	@Autowired
	private AdminServices adminServices;
	
	@RequestMapping("/adminLogin.rsvp")
	public String adminLogin(@RequestParam("adminEmail") String adminEmail, @RequestParam("adminPassword") String adminPassword, ModelMap model) {
		try {
			Admin admin=(Admin)adminServices.login(adminEmail, adminPassword);
			model.put("loggedInAdmin", admin);
			return "adminDashboard.jsp";
		} catch (Exception e) {
			model.put("errorMsg", "Please login again");
			return "adminLogin.jsp";
			
		}
	}
	
	
	@RequestMapping(path ="/fetchAllFarmers.rsvp")
	public String fetchAllFarmer( ModelMap model, HttpServletRequest request) {
		
		List<Farmer> list = adminServices.fetchAllFarmer();
		
		model.put("listOfFarmers", list);
		return "adminFarmerDetails.jsp";
	}
	
	@RequestMapping(path ="/fetchAllBidders.rsvp")
	public String fetchAllBidder( ModelMap model, HttpServletRequest request) {
		
		List<Bidder> list = adminServices.fetchAllBidder();
		
		model.put("listOfBidders", list);
		return "adminBidderDetails.jsp";
	}
	
	@RequestMapping(path ="/fetchAllFarmersUnverified.rsvp")
	public String fetchAllUnverifiedFarmer( ModelMap model, HttpServletRequest request) {
		
		List<Farmer> list = adminServices.fetchAllUnverifiedFarmer();
		
		model.put("listOfFarmers", list);
		return "adminApprove.jsp";
	}
	
	@RequestMapping(path ="/fetchAllBiddersUnverified.rsvp")
	public String fetchAllUnverifiedBidder( ModelMap model, HttpServletRequest request) {
		
		List<Bidder> list = adminServices.fetchAllUnverifiedBidder();
		
		model.put("listOfBidders", list);
		return "adminBidderDetails.jsp";
	}
	
	
}
