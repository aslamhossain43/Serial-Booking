package com.renu.s_b.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ControllerAdvice
public class ManageController {
private static final Logger LOGGER=LoggerFactory.getLogger(ManageController.class);

@RequestMapping(value="/aassllaamm")
public String showManage() {
	LOGGER.info("From class ManageController,method : showManage()");
	
	
	return "manage";
}


}
