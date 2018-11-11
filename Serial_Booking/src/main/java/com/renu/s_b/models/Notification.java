package com.renu.s_b.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Notification extends BaseNotification<Long> {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank(message="Enter your notification")
	private String notification;
	public Notification() {}
	@Override
	public Long getId() {
		return id;
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Notification [id=" + id + ", notification=" + notification + "]";
	}
	
	
	
	
	
}
