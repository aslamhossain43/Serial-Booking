package com.renu.s_b.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.renu.s_b.models.SerialBooking;

public interface SerialBookingRepository extends JpaRepository<SerialBooking, Long>,JpaSpecificationExecutor<SerialBooking> {

}
