package com.uncia_drools_deviation_db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uncia_drools_deviation_db.model.Device;
import com.uncia_drools_deviation_db.model.Rule;
import com.uncia_drools_deviation_db.repository.RuleRepository;
import com.uncia_drools_deviation_db.service.RuleEngineService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RuleController {

	private final RuleRepository ruleRepository;
	private final RuleEngineService ruleEngineService;

	@Autowired
	public RuleController(RuleRepository ruleRepository, RuleEngineService ruleEngineService) {
		this.ruleRepository = ruleRepository;
		this.ruleEngineService = ruleEngineService;
	}

	@PostMapping("/addRule")
	public Rule createRule(@RequestBody Rule rule) {
		return ruleRepository.save(rule);
	}

	public Device executeRules(@RequestBody Device ahu) {
		return ruleEngineService.executeRule(ahu);
	}

	public ResponseEntity<List<Rule>> getRules() {
		List<Rule> response = ruleRepository.findAll();
		return new ResponseEntity<List<Rule>>(response, HttpStatus.OK);
	}
	
	public ResponseEntity<Rule> updateRule(@RequestBody Rule rule) {
		Rule response = ruleRepository.saveAndFlush(rule);
		return new ResponseEntity<Rule>(response, HttpStatus.OK);
	}
	
	public ResponseEntity<String> deleteRule(@PathVariable("id") Long id) {
		ruleRepository.deleteById(id);
		return new ResponseEntity<String>("Success", HttpStatus.ACCEPTED);
	}
	
}
