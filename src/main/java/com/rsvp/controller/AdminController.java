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
import com.rsvp.entity.BidDetails;
import com.rsvp.entity.Bidder;
import com.rsvp.entity.Crop;
import com.rsvp.entity.Farmer;
import com.rsvp.services.AdminServices;

@Controller
@SessionAttributes({"loggedInAdmin","listOfUnverifiedCrops","listOfApprovedCrops","listOfBidding"})
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
	
	@RequestMapping(path ="/fetchAllUnverifiedCrops.rsvp")
	public String fetchAllUnverifiedCrop( ModelMap model, HttpServletRequest request) {
		
		List<Crop> list = adminServices.fetchAllUnverifiedCrop();
		
		model.put("listOfUnverifiedCrops", list);
		return "adminApproval.jsp";
	}

	@RequestMapping(path ="/fetchAllApprovedCrops.rsvp")
	public String fetchAllApprovedCrop( ModelMap model, HttpServletRequest request) {
		
		List<Crop> list = adminServices.fetchAllApprovedCrop();
		
		model.put("listOfApprovedCrops", list);
		return "adminApprovedCrops.jsp";
	}
	
	@RequestMapping(path ="/fetchAllBidding.rsvp")
	public String fetchAllBidding( ModelMap model, HttpServletRequest request) {
		
		List<BidDetails> list = adminServices.fetchAllBidding();
		
		model.put("listOfBidding", list);
		return "adminApprovedBids.jsp";
	}
	
	@RequestMapping(path = "/approve.rsvp")
	public String approveCrop(@RequestParam("cropId") int CropId, ModelMap model) {
		try {
			adminServices.approveCrop(CropId);
			return "adminApproval.jsp";
		}
		catch(Exception e) {
			model.put("noCrops", "no Crops To Be Approved");
			return "adminApproval.jsp";
		}
	}
	
	@RequestMapping(path = "/deleteFarmer.rsvp")
	public String removeFarmer(@RequestParam("farmerId") int farmerId, ModelMap model) {
			adminServices.deleteFarmer(farmerId);
			return "adminFarmerDetails.jsp";

	}
	
	
}
