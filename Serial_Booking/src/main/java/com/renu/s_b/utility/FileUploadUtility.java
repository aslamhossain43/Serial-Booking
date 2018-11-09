package com.renu.s_b.utility;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;


public class FileUploadUtility {

	public static final String IABS_PATH = "H:\\STS_Github\\Serial-Booking\\Serial_Booking\\src\\main\\resources\\static\\images\\";

	 
	private static final Logger logger = LoggerFactory.getLogger(FileUploadUtility.class);
	
	public static boolean imageUploadFile(HttpServletRequest request, MultipartFile file, String code) 
	{				
		
		logger.info("FROM imageUploadFile method");	
		
		
		
		// create the directories if it does not exist
		
	
		if(!new File(IABS_PATH).exists()) {
			new File(IABS_PATH).mkdirs();
		}
		
		try {
			
			file.transferTo(new File(IABS_PATH + code + ".jpg"));
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return true;
	}
	
		
	
}
