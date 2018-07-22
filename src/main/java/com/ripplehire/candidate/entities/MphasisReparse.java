package com.ripplehire.candidate.entities;
// Generated 9 Sep, 2016 3:49:43 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * MphasisReparse generated by hbm2java
 */
@Entity
@Table(name = "mphasis_reparse")
public class MphasisReparse implements java.io.Serializable {

	private Integer mphasisReparseSeq;
	private int emplRefrlSeq;
	private int companySeq;
	private String origPhone;
	private String origLocation;
	private String origExp;
	private String phone;
	private String location;
	private String exp;
	private String executeStatus;
	private String comment1;
	private String comment2;
	private CandidateUploadParsedData candidateUploadParsedData;
	private Date runTime;

	public MphasisReparse() {
	}

	public MphasisReparse(int emplRefrlSeq, String executeStatus, String comment1,
			String comment2) {
		this.emplRefrlSeq = emplRefrlSeq;
		this.executeStatus = executeStatus;
		this.comment1 = comment1;
		this.comment2 = comment2;
	}

	public MphasisReparse(int emplRefrlSeq,
			String origPhone, String origLocation, String phone, String location,
			String executeStatus, String comment1, String comment2) {
		this.emplRefrlSeq = emplRefrlSeq;
		this.origPhone = origPhone;
		this.origLocation = origLocation;
		this.phone = phone;
		this.location = location;
		this.executeStatus = executeStatus;
		this.comment1 = comment1;
		this.comment2 = comment2;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "mphasis_reparse_seq", unique = true, nullable = false)
	public Integer getMphasisReparseSeq() {
		return this.mphasisReparseSeq;
	}

	public void setMphasisReparseSeq(Integer mphasisReparseSeq) {
		this.mphasisReparseSeq = mphasisReparseSeq;
	}

	@Column(name = "empl_refrl_seq", nullable = false)
	public int getEmplRefrlSeq() {
		return this.emplRefrlSeq;
	}

	public void setEmplRefrlSeq(int emplRefrlSeq) {
		this.emplRefrlSeq = emplRefrlSeq;
	}

	@Column(name = "company_seq", nullable = false)
	public int getCompanySeq() {
		return this.companySeq;
	}

	public void setCompanySeq(int companySeq) {
		this.companySeq = companySeq;
	}

	@Column(name = "orig_phone", length = 100)
	public String getOrigPhone() {
		return this.origPhone;
	}

	public void setOrigPhone(String origPhone) {
		this.origPhone = origPhone;
	}

	@Column(name = "orig_location", length = 100)
	public String getOrigLocation() {
		return this.origLocation;
	}

	public void setOrigLocation(String origLocation) {
		this.origLocation = origLocation;
	}

	@Column(name = "phone", length = 100)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "location", length = 100)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "execute_status", nullable = false, length = 100)
	public String getExecuteStatus() {
		return this.executeStatus;
	}

	public void setExecuteStatus(String executeStatus) {
		this.executeStatus = executeStatus;
	}

	@Column(name = "comment1", nullable = false, length = 100)
	public String getComment1() {
		return this.comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

	@Column(name = "comment2", nullable = false, length = 100)
	public String getComment2() {
		return this.comment2;
	}

	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CANDIDATE_UPLOAD_PARSED_DATA_SEQ")
	public CandidateUploadParsedData getCandidateUploadParsedData() {
		return this.candidateUploadParsedData;
	}

	public void setCandidateUploadParsedData(CandidateUploadParsedData candidateUploadParsedData) {
		this.candidateUploadParsedData = candidateUploadParsedData;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "run_time", length = 19)
	public Date getRunTime() {
		return runTime;
	}

	public void setRunTime(Date runTime) {
		this.runTime = runTime;
	}
	@Column(name = "orig_exp", length = 100)
	public String getOrigExp() {
		return origExp;
	}

	public void setOrigExp(String origExp) {
		this.origExp = origExp;
	}

	@Column(name = "exp", length = 100)
	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}
}
