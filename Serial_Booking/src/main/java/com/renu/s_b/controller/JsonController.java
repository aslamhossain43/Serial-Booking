package com.renu.s_b.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.renu.s_b.models.Heading;
import com.renu.s_b.models.Notification;
import com.renu.s_b.models.PersonDetails;
import com.renu.s_b.models.Rules;
import com.renu.s_b.models.SerialBooking;
import com.renu.s_b.repositories.HeadingReapository;
import com.renu.s_b.repositories.NotificationRepository;
import com.renu.s_b.repositories.PersonDetailsRepository;
import com.renu.s_b.repositories.RulesRepository;
import com.renu.s_b.repositories.SerialBookingRepository;

@Controller
public class JsonController {
private static final Logger LOGGER=LoggerFactory.getLogger(JsonController.class);
@Autowired
PersonDetailsRepository personDetailsRepository;
@Autowired
RulesRepository rulesRepository;
@Autowired
NotificationRepository notificationRepository;
@Autowired
SerialBookingRepository serialBookingRepository;
@Autowired
HeadingReapository headingReapository;



@RequestMapping(value="/getAllPersonDetails")
@ResponseBody
public List<PersonDetails>getAllPersonDetails(){
	LOGGER.info("From class JsonController,method getAllPersonDetails()");
	List<PersonDetails>personDetails=personDetailsRepository.findAll();
	return personDetails;
	
	
	
}

@RequestMapping(value="/getAllRules")
@ResponseBody
public List<Rules>getAllRules(){
	LOGGER.info("From class JsonController,method getAllRules()");
	List<Rules>rules=rulesRepository.findAll();
	return rules;
	
	
	
}

@RequestMapping(value="/getAllNotification")
@ResponseBody
public List<Notification>getAllNotification(){
	LOGGER.info("From class JsonController,method getAllNotification()");
	List<Notification>notifications=notificationRepository.findAll();
	return notifications;
	
	
	
}
@RequestMapping(value="/getHeading")
@ResponseBody
public List<Heading>getHeading(){
	LOGGER.info("From class JsonController,method getHeading()");
	List<Heading>headings=headingReapository.findAll();
	return headings;
	
	
	
}
@RequestMapping(value="/getAllSerial")
@ResponseBody
public List<SerialBooking>getAllSerial(){
	LOGGER.info("From class JsonController,method getAllSerial()");
	List<SerialBooking>serialBookings=serialBookingRepository.findAll();
	return serialBookings;
	
	
	
}

}
