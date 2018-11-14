package com.renu.s_b.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class SerialBooking extends BaseSerialBooking<Long> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank(message="Enter your name")
	private String name;
	@Min(1)
	@Max(130)
	@NotNull
	private Integer age;
	@NotBlank
	@Size(min=11,max=11,message="Enter a correct phone or email")
	private String contact;
	@NotBlank(message="Enter your visit time")
	private String visitTime;
	public SerialBooking() {}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getVisitTime() {
		return visitTime;
	}
	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}


	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "SerialBooking [id=" + id + ", name=" + name + ", age=" + age + ", contact=" + contact + ", visitTime="
				+ visitTime + "]";
	}
	
	
	
	
	
}
