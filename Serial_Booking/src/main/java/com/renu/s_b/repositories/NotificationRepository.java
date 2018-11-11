package com.renu.s_b.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.renu.s_b.models.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>,JpaSpecificationExecutor<Notification>{
//GET BY ID
	public Notification getById(Long id);
}
