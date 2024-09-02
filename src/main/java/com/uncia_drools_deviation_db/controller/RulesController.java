package com.uncia_drools_deviation_db.controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uncia_drools_deviation_db.model.Order;
import com.uncia_drools_deviation_db.model.Rule;
import com.uncia_drools_deviation_db.repository.RulesRepository;
import com.uncia_drools_deviation_db.service.OrderService;

@RestController
public class RulesController {

	@Autowired
	private RulesRepository rulesRepo;

	@Autowired
	private OrderService orderService;

	@PostMapping("/saveRule")
	public Rule addRule(@RequestBody Rule rule) {
		Rule save = rulesRepo.save(rule);
		return save;
	}

	@GetMapping("/getRules")
	public List<Rule> getRules() {
		List<Rule> rules = new ArrayList<Rule>();
		rulesRepo.findAll().forEach(rules::add);
		return rules;
	}
	
	@GetMapping("/deleteRules")
	public String deleteRules(@RequestParam Long id) {
		rulesRepo.deleteById(id);
		return "Rule Id "+id+ " is deleted!";
	}

	@PostMapping("/getDiscount")
	public ResponseEntity<Order> getRate(@RequestBody Order order) throws FileNotFoundException {
		Order discountOrder = orderService.getDiscountForOrderV2(order);
		return new ResponseEntity<>(discountOrder, HttpStatus.OK);
	}

}
