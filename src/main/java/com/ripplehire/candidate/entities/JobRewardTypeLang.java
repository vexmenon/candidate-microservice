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
 * JobRewardTypeLang generated by hbm2java
 */
@Entity
@Table(name = "job_reward_type_lang")
public class JobRewardTypeLang implements java.io.Serializable {

	private Integer jobRewardTypeLangSeq;
	private LangMstr langMstr;
	private JobRewardType jobRewardType;
	private String rewardTypeDesc;
	private Character status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;

	public JobRewardTypeLang() {
	}

	public JobRewardTypeLang(LangMstr langMstr, JobRewardType jobRewardType,
			String rewardTypeDesc, int createdBy, Date createDttm) {
		this.langMstr = langMstr;
		this.jobRewardType = jobRewardType;
		this.rewardTypeDesc = rewardTypeDesc;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public JobRewardTypeLang(LangMstr langMstr, JobRewardType jobRewardType,
			String rewardTypeDesc, Character status, int createdBy,
			Date createDttm, Integer updatedBy, Date updateDttm) {
		this.langMstr = langMstr;
		this.jobRewardType = jobRewardType;
		this.rewardTypeDesc = rewardTypeDesc;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "JOB_REWARD_TYPE_LANG_SEQ", unique = true, nullable = false)
	public Integer getJobRewardTypeLangSeq() {
		return this.jobRewardTypeLangSeq;
	}

	public void setJobRewardTypeLangSeq(Integer jobRewardTypeLangSeq) {
		this.jobRewardTypeLangSeq = jobRewardTypeLangSeq;
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
	@JoinColumn(name = "JOB_REWARD_TYPE_SEQ", nullable = false)
	public JobRewardType getJobRewardType() {
		return this.jobRewardType;
	}

	public void setJobRewardType(JobRewardType jobRewardType) {
		this.jobRewardType = jobRewardType;
	}

	@Column(name = "REWARD_TYPE_DESC", nullable = false, length = 100)
	public String getRewardTypeDesc() {
		return this.rewardTypeDesc;
	}

	public void setRewardTypeDesc(String rewardTypeDesc) {
		this.rewardTypeDesc = rewardTypeDesc;
	}

	@Column(name = "STATUS", length = 1)
	public Character getStatus() {
		return this.status;
	}

	public void setStatus(Character status) {
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

}
