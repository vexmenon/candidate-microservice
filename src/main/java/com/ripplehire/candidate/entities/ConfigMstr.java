package com.ripplehire.candidate.entities;

// Generated Nov 1, 2014 1:10:46 PM by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ConfigMstr generated by hbm2java
 */
@Entity
@Table(name = "config_mstr")
public class ConfigMstr implements java.io.Serializable {

	private Integer configMstrSeq;
	private ConfigMstr configMstr;
	private String configCd;
    private int type;
	private String defaultValue;
	private Set<ConfigMstr> configMstrs = new HashSet<ConfigMstr>(0);
	private Set<CompanyConfig> companyConfigs = new HashSet<CompanyConfig>(0);

	public ConfigMstr() {
	}

    public ConfigMstr(Integer configMstrSeq, ConfigMstr configMstr, String configCd, int type, String defaultValue, Set<ConfigMstr> configMstrs, Set<CompanyConfig> companyConfigs) {
        this.configMstrSeq = configMstrSeq;
        this.configMstr = configMstr;
        this.configCd = configCd;
        this.type = type;
        this.defaultValue = defaultValue;
        this.configMstrs = configMstrs;
        this.companyConfigs = companyConfigs;
    }

    @Column(name = "TYPE", nullable = false)
    public int getType() {
        return this.type;
    }

    public void setType(int type) {        this.type = type;    }

    @Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CONFIG_MSTR_SEQ", unique = true, nullable = false)
	public Integer getConfigMstrSeq() {
		return this.configMstrSeq;
	}

	public void setConfigMstrSeq(Integer configMstrSeq) {
		this.configMstrSeq = configMstrSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_CONFIG", nullable = false)
	public ConfigMstr getConfigMstr() {
		return this.configMstr;
	}

	public void setConfigMstr(ConfigMstr configMstr) {
		this.configMstr = configMstr;
	}

	@Column(name = "CONFIG_CD", nullable = false, length = 50)
	public String getConfigCd() {
		return this.configCd;
	}

	public void setConfigCd(String configCd) {
		this.configCd = configCd;
	}

	@Column(name = "DEFAULT_VALUE", length = 50)
	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "configMstr")
	public Set<ConfigMstr> getConfigMstrs() {
		return this.configMstrs;
	}

	public void setConfigMstrs(Set<ConfigMstr> configMstrs) {
		this.configMstrs = configMstrs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "configMstr")
	public Set<CompanyConfig> getCompanyConfigs() {
		return this.companyConfigs;
	}

	public void setCompanyConfigs(Set<CompanyConfig> companyConfigs) {
		this.companyConfigs = companyConfigs;
	}

}