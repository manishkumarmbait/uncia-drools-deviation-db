package com.uncia_drools_deviation_db.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolConfig {
	private static final KieServices kieServices = KieServices.Factory.get();
	public static final String RULES_TEMPLATE_FILE = "rules/ruletemplate.drl";
	 
//	   @Bean
//	     public KieContainer kieContainer() {
//	         KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//	         kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_TEMPLATE_FILE));
//	         KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
//	         kb.buildAll();
//	         KieModule kieModule = kb.getKieModule();
//	         KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
////	         System.out.println(new DroolsBeanFactory().getDrlFromExcel("net/cloudburo/drools/rules/DroolsDiscount.xlsx"));
////	         System.out.println(new DroolsBeanFactory().getDrlFromExcel("rules/DroolsDiscount.xlsx"));
//	         return kieContainer;
//	     }
}
