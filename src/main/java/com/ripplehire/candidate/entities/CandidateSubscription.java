package com.ripplehire.candidate.entities;

// Generated Sep 19, 2014 7:03:19 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CandidateSubscription generated by hbm2java
 */
@Entity
@Table(name = "candidate_subscription")
public class CandidateSubscription implements java.io.Serializable {

	private Integer candidateSubscriptionSeq;
	private int companyMstrSeq;
	private String emailAddr;
	private String isUnsubscribe;
	private String unsubscribeType;
	private String isBounce;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;

	public CandidateSubscription() {
	}

	public CandidateSubscription(int companyMstrSeq, String emailAddr,
			String isUnsubscribe, String isBounce, char status, int createdBy, Date createDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.emailAddr = emailAddr;
		this.isUnsubscribe = isUnsubscribe;
		this.isBounce = isBounce;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public CandidateSubscription(int companyMstrSeq, String emailAddr,
			String isUnsubscribe, String isBounce, char status, int createdBy, Date createDttm,
			Integer updatedBy, Date updateDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.emailAddr = emailAddr;
		this.isUnsubscribe = isUnsubscribe;
		this.isBounce = isBounce;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CANDIDATE_SUBSCRIPTION_SEQ", unique = true, nullable = false)
	public Integer getCandidateSubscriptionSeq() {
		return this.candidateSubscriptionSeq;
	}

	public void setCandidateSubscriptionSeq(Integer candidateSubscriptionSeq) {
		this.candidateSubscriptionSeq = candidateSubscriptionSeq;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "EMAIL_ADDR", nullable = false, length = 50)
	public String getEmailAddr() {
		return this.emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	@Column(name = "IS_UNSUBSCRIBE", nullable = false, length = 1)
	public String getIsUnsubscribe() {
		return this.isUnsubscribe;
	}

	@Column(name = "UNSUBSCRIBE_TYPE", length = 50)
	public String getUnsubscribeType() {
		return unsubscribeType;
	}

	public void setUnsubscribeType(String unsubscribeType) {
		this.unsubscribeType = unsubscribeType;
	}

	public void setIsUnsubscribe(String isUnsubscribe) {
		this.isUnsubscribe = isUnsubscribe;
	}

	@Column(name = "IS_BOUNCE", nullable = false, length = 1)
	public String getIsBounce() {
		return isBounce;
	}

	public void setIsBounce(String isBounce) {
		this.isBounce = isBounce;
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
