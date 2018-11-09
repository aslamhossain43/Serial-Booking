package com.renu.s_b.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.renu.s_b.models.PersonDetails;
import com.renu.s_b.repositories.PersonDetailsRepository;
import com.renu.s_b.utility.FileUploadUtility;
import com.renu.s_b.validator.ImageValidator;

@Controller
@ControllerAdvice
public class ManageController {
private static final Logger LOGGER=LoggerFactory.getLogger(ManageController.class);
@Autowired
PersonDetailsRepository personDetailsRepository;
@RequestMapping(value="/aassllaamm")
public String showManage(Model model) {
	LOGGER.info("From class ManageController,method : showManage()");
	model.addAttribute("persondetails",new PersonDetails());
	model.addAttribute("jsonurl","/getAllPersonDetails");
	
	return "manage";
}



@RequestMapping(value="/addPersonDetails",method=RequestMethod.POST)
public String showManageForPersonDetals(@Valid @ModelAttribute("persondetails") PersonDetails personDetails,
		BindingResult bindingResult,HttpServletRequest httpServletRequest,Model model) {
	LOGGER.info("From class ManageController,method : showManageForPersonDetails()");
	if (bindingResult.hasErrors()) {
		model.addAttribute("message","Your operation has not been completed successfully !!!");
		return "manage";
	}
	if (personDetails.getId()==null) {
		new ImageValidator().validate(personDetails,bindingResult);
		personDetailsRepository.save(personDetails);
		personDetails.setId(null);
	}else {
		personDetailsRepository.save(personDetails);
	}
	if (!personDetails.getiFile().getOriginalFilename().equals("")) {
		FileUploadUtility.imageUploadFile(httpServletRequest, personDetails.getiFile(),personDetails.getiCode());
		
	}
	
	model.addAttribute("message","Your operation has been completed successfully !!!");
	return "manage";
}







}
