package com.renu.s_b.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class PersonDetails extends BasePersonDetails<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String iCode;
	@Transient
	private MultipartFile iFile;
	@NotBlank(message = "Enter your name")
	private String name;
	@NotBlank(message = "Enter your degree")
	private String degree;
	@NotBlank(message = "Enter expert")
	private String expert;
	
	
	@NotBlank(message = "Enter your chamber location")
	private String chamberLocation;
	@NotBlank(message = "Enter your contact")
	private String contact;
	public PersonDetails() {
		this.iCode = "I" + UUID.randomUUID().toString().substring(26).toUpperCase();
		
	}

	@Override
	public Long getId() {
		return id;
	}

	public String getiCode() {
		return iCode;
	}

	public void setiCode(String iCode) {
		this.iCode = iCode;
	}

	public MultipartFile getiFile() {
		return iFile;
	}

	public void setiFile(MultipartFile iFile) {
		this.iFile = iFile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	
	

	public String getChamberLocation() {
		return chamberLocation;
	}

	public void setChamberLocation(String chamberLocation) {
		this.chamberLocation = chamberLocation;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

	public String getExpert() {
		return expert;
	}

	public void setExpert(String expert) {
		this.expert = expert;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PersonDetails [id=" + id + ", iCode=" + iCode + ", name=" + name + ", degree=" + degree + ", expert="
				+ expert + ", chamberLocation=" + chamberLocation + ", contact=" + contact + "]";
	}
	
	
	
}
