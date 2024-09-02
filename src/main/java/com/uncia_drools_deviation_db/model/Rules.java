package com.uncia_drools_deviation_db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rule_table")
public class Rules {

	
//    private Long id;
//
//    private String ruleName;
//    private String ruleContent;
    
    
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "rule_name")
	private String ruleName;
	
	@Column(name = "ifcondition")
	private String ifcondition;
	@Column(name = "thencondition")
	private String thencondition;
	@Column(name = "version")
	private int version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIfcondition() {
		return ifcondition;
	}

	public void setIfcondition(String ifcondition) {
		this.ifcondition = ifcondition;
	}

	public String getThencondition() {
		return thencondition;
	}

	public void setThencondition(String thencondition) {
		this.thencondition = thencondition;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

}
