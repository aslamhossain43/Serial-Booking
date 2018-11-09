package com.renu.s_b.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.renu.s_b.models.Rules;

public interface RulesRepository extends JpaRepository<Rules, Long>,JpaSpecificationExecutor<Rules>{

}
