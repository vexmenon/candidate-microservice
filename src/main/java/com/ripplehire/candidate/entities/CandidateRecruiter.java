package com.ripplehire.candidate.entities;

// Generated Aug 18, 2015 5:39:55 PM by Hibernate Tools 4.0.0

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
 * CandidateRecruiter generated by hbm2java
 */
@Entity
@Table(name = "candidate_recruiter")
public class CandidateRecruiter implements java.io.Serializable {

	private Integer candRecrtrSeq;
	private EmplRefrl emplRefrl;
	private UserProfile userProfile;
	private int companyMstrSeq;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;

	public CandidateRecruiter() {
	}

	public CandidateRecruiter(EmplRefrl emplRefrl, UserProfile userProfile,
			int companyMstrSeq, char status, int createdBy, Date createDttm) {
		this.emplRefrl = emplRefrl;
		this.userProfile = userProfile;
		this.companyMstrSeq = companyMstrSeq;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public CandidateRecruiter(EmplRefrl emplRefrl, UserProfile userProfile,
			int companyMstrSeq, char status, int createdBy, Date createDttm,
			Integer updatedBy, Date updateDttm) {
		this.emplRefrl = emplRefrl;
		this.userProfile = userProfile;
		this.companyMstrSeq = companyMstrSeq;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CAND_RECRTR_SEQ", unique = true, nullable = false)
	public Integer getCandRecrtrSeq() {
		return this.candRecrtrSeq;
	}

	public void setCandRecrtrSeq(Integer candRecrtrSeq) {
		this.candRecrtrSeq = candRecrtrSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPL_REFRL_SEQ", nullable = false)
	public EmplRefrl getEmplRefrl() {
		return this.emplRefrl;
	}

	public void setEmplRefrl(EmplRefrl emplRefrl) {
		this.emplRefrl = emplRefrl;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_PROFILE_SEQ", nullable = false)
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
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