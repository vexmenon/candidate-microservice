package com.ripplehire.candidate.entities;

// Generated Mar 6, 2014 7:42:21 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CountryLang generated by hbm2java
 */
@Entity
@Table(name = "country_lang")
public class CountryLang implements java.io.Serializable {

	private Integer countryLangSeq;
	private LangMstr langMstr;
	private Country country;
	private String countryName;
	private char status;
	private int createdBy;
	private Date createDttm;

	public CountryLang() {
	}

	public CountryLang(LangMstr langMstr, Country country, String countryName,
			char status, int createdBy, Date createDttm) {
		this.langMstr = langMstr;
		this.country = country;
		this.countryName = countryName;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "COUNTRY_LANG_SEQ", unique = true, nullable = false)
	public Integer getCountryLangSeq() {
		return this.countryLangSeq;
	}

	public void setCountryLangSeq(Integer countryLangSeq) {
		this.countryLangSeq = countryLangSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LANG_MSTR_SEQ", nullable = false)
	public LangMstr getLangMstr() {
		return this.langMstr;
	}

	public void setLangMstr(LangMstr langMstr) {
		this.langMstr = langMstr;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COUNTRY_SEQ", nullable = false)
	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Column(name = "COUNTRY_NAME", nullable = false, length = 400)
	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Column(name = "STATUS", nullable = false, length = 1)
	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@Column(name = "CREATED_BY", nullable = false)
	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DTTM", nullable = false, length = 19)
	public Date getCreateDttm() {
		return this.createDttm;
	}

	public void setCreateDttm(Date createDttm) {
		this.createDttm = createDttm;
	}

}
