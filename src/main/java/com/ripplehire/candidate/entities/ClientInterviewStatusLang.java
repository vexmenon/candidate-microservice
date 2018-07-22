package com.ripplehire.candidate.entities;

// Generated Sep 1, 2014 7:18:43 PM by Hibernate Tools 3.4.0.CR1

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
 * ClientInterviewStatusLang generated by hbm2java
 */
@Entity
@Table(name = "client_interview_status_lang")
public class ClientInterviewStatusLang implements java.io.Serializable {

	private Integer clientInterviewStatusLangSeq;
	private LangMstr langMstr;
	private ClientInterviewStatus clientInterviewStatus;
	private String clientInterviewStatusDesc;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;

	public ClientInterviewStatusLang() {
	}

	public ClientInterviewStatusLang(LangMstr langMstr,
			ClientInterviewStatus clientInterviewStatus, char status,
			int createdBy, Date createDttm) {
		this.langMstr = langMstr;
		this.clientInterviewStatus = clientInterviewStatus;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public ClientInterviewStatusLang(LangMstr langMstr,
			ClientInterviewStatus clientInterviewStatus,
			String clientInterviewStatusDesc, char status, int createdBy,
			Date createDttm, Integer updatedBy, Date updateDttm) {
		this.langMstr = langMstr;
		this.clientInterviewStatus = clientInterviewStatus;
		this.clientInterviewStatusDesc = clientInterviewStatusDesc;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CLIENT_INTERVIEW_STATUS_LANG_SEQ", unique = true, nullable = false)
	public Integer getClientInterviewStatusLangSeq() {
		return this.clientInterviewStatusLangSeq;
	}

	public void setClientInterviewStatusLangSeq(
			Integer clientInterviewStatusLangSeq) {
		this.clientInterviewStatusLangSeq = clientInterviewStatusLangSeq;
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
	@JoinColumn(name = "CLIENT_INTERVIEW_STATUS_SEQ", nullable = false)
	public ClientInterviewStatus getClientInterviewStatus() {
		return this.clientInterviewStatus;
	}

	public void setClientInterviewStatus(
			ClientInterviewStatus clientInterviewStatus) {
		this.clientInterviewStatus = clientInterviewStatus;
	}

	@Column(name = "CLIENT_INTERVIEW_STATUS_DESC", length = 400)
	public String getClientInterviewStatusDesc() {
		return this.clientInterviewStatusDesc;
	}

	public void setClientInterviewStatusDesc(String clientInterviewStatusDesc) {
		this.clientInterviewStatusDesc = clientInterviewStatusDesc;
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