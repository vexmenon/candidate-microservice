package com.ripplehire.candidate.entities;

// Generated Aug 12, 2014 2:57:53 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CurrentLocationMstr generated by hbm2java
 */
@Entity
@Table(name = "current_location_mstr")
public class CurrentLocationMstr implements java.io.Serializable {

	private Integer currentLocationMstrSeq;
	private int companyMstrSeq;
	private int currentLocationClientKey;
	private String currentLocationDesc;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;
	private Set<CandidateResumedetails> candidateResumedetailses = new HashSet<CandidateResumedetails>(
			0);
	private Set<CurrentLocationMstrLang> currentLocationMstrLangs = new HashSet<CurrentLocationMstrLang>(
			0);

	public CurrentLocationMstr() {
	}

	public CurrentLocationMstr(int companyMstrSeq,
			int currentLocationClientKey, String currentLocationDesc,
			char status, int createdBy, Date createDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.currentLocationClientKey = currentLocationClientKey;
		this.currentLocationDesc = currentLocationDesc;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public CurrentLocationMstr(int companyMstrSeq,
			int currentLocationClientKey, String currentLocationDesc,
			char status, int createdBy, Date createDttm, Integer updatedBy,
			Date updateDttm,
			Set<CandidateResumedetails> candidateResumedetailses,
			Set<CurrentLocationMstrLang> currentLocationMstrLangs) {
		this.companyMstrSeq = companyMstrSeq;
		this.currentLocationClientKey = currentLocationClientKey;
		this.currentLocationDesc = currentLocationDesc;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
		this.candidateResumedetailses = candidateResumedetailses;
		this.currentLocationMstrLangs = currentLocationMstrLangs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CURRENT_LOCATION_MSTR_SEQ", unique = true, nullable = false)
	public Integer getCurrentLocationMstrSeq() {
		return this.currentLocationMstrSeq;
	}

	public void setCurrentLocationMstrSeq(Integer currentLocationMstrSeq) {
		this.currentLocationMstrSeq = currentLocationMstrSeq;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "CURRENT_LOCATION_CLIENT_KEY", nullable = false)
	public int getCurrentLocationClientKey() {
		return this.currentLocationClientKey;
	}

	public void setCurrentLocationClientKey(int currentLocationClientKey) {
		this.currentLocationClientKey = currentLocationClientKey;
	}

	@Column(name = "CURRENT_LOCATION_DESC", nullable = false, length = 100)
	public String getCurrentLocationDesc() {
		return this.currentLocationDesc;
	}

	public void setCurrentLocationDesc(String currentLocationDesc) {
		this.currentLocationDesc = currentLocationDesc;
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

	@Column(name = "UPDATED_BY")
	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DTTM", length = 19)
	public Date getUpdateDttm() {
		return this.updateDttm;
	}

	public void setUpdateDttm(Date updateDttm) {
		this.updateDttm = updateDttm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "currentLocationMstr")
	public Set<CandidateResumedetails> getCandidateResumedetailses() {
		return this.candidateResumedetailses;
	}

	public void setCandidateResumedetailses(
			Set<CandidateResumedetails> candidateResumedetailses) {
		this.candidateResumedetailses = candidateResumedetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "currentLocationMstr")
	public Set<CurrentLocationMstrLang> getCurrentLocationMstrLangs() {
		return this.currentLocationMstrLangs;
	}

	public void setCurrentLocationMstrLangs(
			Set<CurrentLocationMstrLang> currentLocationMstrLangs) {
		this.currentLocationMstrLangs = currentLocationMstrLangs;
	}

}
