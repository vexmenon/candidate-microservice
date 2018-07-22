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
 * InterviewStageMstrLang generated by hbm2java
 */
@Entity
@Table(name = "interview_stage_mstr_lang")
public class InterviewStageMstrLang implements java.io.Serializable {

	private Integer interviewStageMstrLangSeq;
	private InterviewStageMstr interviewStageMstr;
	private LangMstr langMstr;
	private String stageDesc;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;

	public InterviewStageMstrLang() {
	}

	public InterviewStageMstrLang(InterviewStageMstr interviewStageMstr,
			LangMstr langMstr, String stageDesc, char status, int createdBy,
			Date createDttm) {
		this.interviewStageMstr = interviewStageMstr;
		this.langMstr = langMstr;
		this.stageDesc = stageDesc;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public InterviewStageMstrLang(InterviewStageMstr interviewStageMstr,
			LangMstr langMstr, String stageDesc, char status, int createdBy,
			Date createDttm, Integer updatedBy, Date updateDttm) {
		this.interviewStageMstr = interviewStageMstr;
		this.langMstr = langMstr;
		this.stageDesc = stageDesc;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "INTERVIEW_STAGE_MSTR_LANG_SEQ", unique = true, nullable = false)
	public Integer getInterviewStageMstrLangSeq() {
		return this.interviewStageMstrLangSeq;
	}

	public void setInterviewStageMstrLangSeq(Integer interviewStageMstrLangSeq) {
		this.interviewStageMstrLangSeq = interviewStageMstrLangSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INTERVIEW_STAGE_MSTR_SEQ", nullable = false)
	public InterviewStageMstr getInterviewStageMstr() {
		return this.interviewStageMstr;
	}

	public void setInterviewStageMstr(InterviewStageMstr interviewStageMstr) {
		this.interviewStageMstr = interviewStageMstr;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LANG_MSTR_SEQ", nullable = false)
	public LangMstr getLangMstr() {
		return this.langMstr;
	}

	public void setLangMstr(LangMstr langMstr) {
		this.langMstr = langMstr;
	}

	@Column(name = "STAGE_DESC", nullable = false, length = 400)
	public String getStageDesc() {
		return this.stageDesc;
	}

	public void setStageDesc(String stageDesc) {
		this.stageDesc = stageDesc;
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

}