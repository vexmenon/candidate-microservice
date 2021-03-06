package com.ripplehire.candidate.entities;

// Generated Nov 1, 2014 1:10:46 PM by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CompanyConfig generated by hbm2java
 */
@Entity
@Table(name = "company_config")
public class CompanyConfig implements java.io.Serializable {

	private Integer companyConfigSeq;
	private ConfigMstr configMstr;
	private CompanyMstr companyMstr;
	private String value;

	public CompanyConfig() {
	}

	public CompanyConfig(ConfigMstr configMstr, CompanyMstr companyMstr) {
		this.configMstr = configMstr;
		this.companyMstr = companyMstr;
	}

	public CompanyConfig(ConfigMstr configMstr, CompanyMstr companyMstr,
			String value) {
		this.configMstr = configMstr;
		this.companyMstr = companyMstr;
		this.value = value;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "COMPANY_CONFIG_SEQ", unique = true, nullable = false)
	public Integer getCompanyConfigSeq() {
		return this.companyConfigSeq;
	}

	public void setCompanyConfigSeq(Integer companyConfigSeq) {
		this.companyConfigSeq = companyConfigSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CONFIG_MSTR_SEQ", nullable = false)
	public ConfigMstr getConfigMstr() {
		return this.configMstr;
	}

	public void setConfigMstr(ConfigMstr configMstr) {
		this.configMstr = configMstr;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COMPANY_MSTR_SEQ", nullable = false)
	public CompanyMstr getCompanyMstr() {
		return this.companyMstr;
	}

	public void setCompanyMstr(CompanyMstr companyMstr) {
		this.companyMstr = companyMstr;
	}

	@Column(name = "VALUE", length = 50)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
