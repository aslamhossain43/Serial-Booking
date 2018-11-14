package com.renu.s_b.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.renu.s_b.models.PersonDetails;

public class ImageValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return PersonDetails.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		PersonDetails personDetails=(PersonDetails) target;
		
		if (personDetails.getiFile() == null
				|| personDetails.getiFile().getOriginalFilename().equals("")) {
			errors.rejectValue("iFile", null, "Please upload a file");
			return;
		}

		if (!(personDetails.getiFile().getContentType().equals("image/jpeg")
				|| personDetails.getiFile().getContentType().equals("image/png")
				|| personDetails.getiFile().getContentType().equals("image/jpg")
				|| personDetails.getiFile().getContentType().equals("image/gif"))) {
			errors.rejectValue("iFile", null, "Please upload an image");
			return;

		}

		
	}

}
