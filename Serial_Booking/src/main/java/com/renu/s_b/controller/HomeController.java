package com.renu.s_b.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.renu.s_b.models.SerialBooking;

@Controller
public class HomeController {

	private static final Logger LOGGER=LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value="/")
	public String home(Model model) {
		LOGGER.info(" From class : HomeController,Method : home()");
		model.addAttribute("serialbooking",new SerialBooking());
		model.addAttribute("jsonurlS","/getAllSerial");
		return "home";
	}
	
}
