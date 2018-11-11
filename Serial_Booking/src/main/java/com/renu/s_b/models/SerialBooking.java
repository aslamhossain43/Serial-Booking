package com.renu.s_b.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
	private int age;
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
	@Override
	public String toString() {
		return "SerialBooking [id=" + id + ", name=" + name + ", age=" + age + ", visitTime=" + visitTime + "]";
	}
	
	
	
}
