package com.renu.s_b.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Rules extends BaseRules<Long> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank(message="Enter your rules")
	private String rules;
	public Rules() {}
	@Override
	public Long getId() {
		return id;
	}
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
