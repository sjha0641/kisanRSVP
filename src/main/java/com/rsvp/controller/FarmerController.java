package com.rsvp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rsvp.entity.Login;
import com.rsvp.exception.kisaanException;
import com.rsvp.services.FarmerServices;

@Controller
public class FarmerController {
	
	@Autowired
	private FarmerServices farmerServices;
	
	@RequestMapping("/loginfarmers.rsvp")
	public String loginFarmer(Login login,ModelMap model) throws kisaanException {
		Login loginFarmer=farmerServices.login(login.getEmail(), login.getPassword());
		if(loginFarmer!=null) {
		model.put("logincredentials", loginFarmer);
		return "farmerdashbord.jsp";
		}else {
			model.put("invalidcredentials", "failed to login");
			return "Failure.jsp";
		}
	}
	
}
