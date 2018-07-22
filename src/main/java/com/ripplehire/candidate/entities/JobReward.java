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
 * JobReward generated by hbm2java
 */
@Entity
@Table(name = "job_reward")
public class JobReward implements java.io.Serializable {

	private Integer jobRewardSeq;
	private Reward reward;
	private Job job;
	private int companyMstrSeq;
	private String bandCd;
	private char status;
	private int createdBy;
	private Date createdDttm;
	private Integer updatedBy;
	private Date updatedDttm;

	public JobReward() {
	}

	public JobReward(Job job, int companyMstrSeq, String bandCd, char status,
			int createdBy, Date createdDttm) {
		this.job = job;
		this.companyMstrSeq = companyMstrSeq;
		this.bandCd = bandCd;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
	}

	public JobReward(Reward reward, Job job, int companyMstrSeq, String bandCd,
			char status, int createdBy, Date createdDttm, Integer updatedBy,
			Date updatedDttm) {
		this.reward = reward;
		this.job = job;
		this.companyMstrSeq = companyMstrSeq;
		this.bandCd = bandCd;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
		this.updatedBy = updatedBy;
		this.updatedDttm = updatedDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "JOB_REWARD_SEQ", unique = true, nullable = false)
	public Integer getJobRewardSeq() {
		return this.jobRewardSeq;
	}

	public void setJobRewardSeq(Integer jobRewardSeq) {
		this.jobRewardSeq = jobRewardSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REWARD_SEQ")
	public Reward getReward() {
		return this.reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JOB_SEQ", nullable = false)
	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "BAND_CD", nullable = false, length = 20)
	public String getBandCd() {
		return this.bandCd;
	}

	public void setBandCd(String bandCd) {
		this.bandCd = bandCd;
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
	@Column(name = "CREATED_DTTM", nullable = false, length = 19)
	public Date getCreatedDttm() {
		return this.createdDttm;
	}

	public void setCreatedDttm(Date createdDttm) {
		this.createdDttm = createdDttm;
	}

	@Column(name = "UPDATED_BY")
	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DTTM", length = 19)
	public Date getUpdatedDttm() {
		return this.updatedDttm;
	}

	public void setUpdatedDttm(Date updatedDttm) {
		this.updatedDttm = updatedDttm;
	}

}
