package com.renu.s_b.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.renu.s_b.models.Heading;

public interface HeadingReapository extends JpaRepository<Heading,Long>,JpaSpecificationExecutor<Heading>{
//GET BY ID
	public Heading getById(Long id);
}
