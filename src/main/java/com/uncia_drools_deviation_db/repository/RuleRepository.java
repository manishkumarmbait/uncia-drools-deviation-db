package com.uncia_drools_deviation_db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uncia_drools_deviation_db.model.Rule;

@Repository
public interface RuleRepository extends JpaRepository<Rule, Long>{

}
