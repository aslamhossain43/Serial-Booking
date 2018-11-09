package com.renu.s_b.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.renu.s_b.models.PersonDetails;

public interface PersonDetailsRepository extends JpaRepository<PersonDetails, Long>,JpaSpecificationExecutor<PersonDetails> {

}
