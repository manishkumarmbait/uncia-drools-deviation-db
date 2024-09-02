package com.uncia_drools_deviation_db.service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.drools.template.ObjectDataCompiler;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.io.Resource;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.internal.utils.KieHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uncia_drools_deviation_db.config.DroolConfig;
import com.uncia_drools_deviation_db.model.Order;
import com.uncia_drools_deviation_db.model.Rule;
import com.uncia_drools_deviation_db.repository.RulesRepository;

@Service
public class OrderService {

	@Autowired
	private RulesRepository rulesRepo;
	
	/*
	 * public Order getDiscountForOrderV2(Order order) throws FileNotFoundException{
	 * List<Rule> ruleAttributes = new ArrayList<>();
	 * rulesRepo.findAll().forEach(ruleAttributes::add);
	 * 
	 * ObjectDataCompiler compiler = new ObjectDataCompiler(); String generatedDRL =
	 * compiler.compile(ruleAttributes,
	 * Thread.currentThread().getContextClassLoader().getResourceAsStream(
	 * DroolConfig.RULES_TEMPLATE_FILE)); KieServices kieServices =
	 * KieServices.Factory.get();
	 * 
	 * KieHelper kieHelper = new KieHelper();
	 * 
	 * //multiple such resoures/rules can be added byte[] b1 =
	 * generatedDRL.getBytes(); Resource resource1 =
	 * kieServices.getResources().newByteArrayResource(b1);
	 * kieHelper.addResource(resource1, ResourceType.DRL);
	 * 
	 * KieBase kieBase = kieHelper.build();
	 * 
	 * KieSession kieSession = kieBase.newKieSession(); kieSession.insert(order);
	 * int numberOfRulesFired = kieSession.fireAllRules(); kieSession.dispose();
	 * 
	 * return order; }
	 */
	
//	 @Autowired
//	    private DroolsRuleRepository droolsRuleRepository;

//	    public KieSession getKieSession() {
//	        List<DroolsRule> rules = droolsRuleRepository.findAll();
//
//	        KieServices kieServices = KieServices.Factory.get();
//	        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//
//	        for (DroolsRule rule : rules) {
//	            kieFileSystem.write("src/main/resources/" + rule.getRuleName() + ".drl", rule.getIfcondition(), rule.getThencondition());
//	        }
//
//	        kieServices.newKieBuilder(kieFileSystem).buildAll();
//	        KieRepository kieRepository = kieServices.getRepository();
//	        KieModule kieModule = kieRepository.getDefaultKieModule();
//
//	        KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
//	        return kieContainer.newKieSession();
//	    }
	}
