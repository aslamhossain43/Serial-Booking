package com.renu.s_b.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.renu.s_b.models.PersonDetails;
import com.renu.s_b.repositories.PersonDetailsRepository;

@Controller
public class JsonController {
private static final Logger LOGGER=LoggerFactory.getLogger(JsonController.class);
@Autowired
PersonDetailsRepository personDetailsRepository;

@RequestMapping(value="/getAllPersonDetails")
@ResponseBody
public List<PersonDetails>getAllPersonDetails(){
	LOGGER.info("From class JsonController,method getAllPersonDetails()");
	List<PersonDetails>personDetails=personDetailsRepository.findAll();
	return personDetails;
	
	
	
}




}
