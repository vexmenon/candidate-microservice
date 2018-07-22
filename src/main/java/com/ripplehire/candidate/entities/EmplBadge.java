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
 * EmplBadge generated by hbm2java
 */
@Entity
@Table(name = "empl_badge")
public class EmplBadge implements java.io.Serializable {

	private Integer emplBadgeSeq;
	private RewardBadge rewardBadge;
	private UserProfile userProfile;
	private int companyMstrSeq;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;

	public EmplBadge() {
	}

	public EmplBadge(RewardBadge rewardBadge, UserProfile userProfile,
			int companyMstrSeq, char status, int createdBy, Date createDttm) {
		this.rewardBadge = rewardBadge;
		this.userProfile = userProfile;
		this.companyMstrSeq = companyMstrSeq;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public EmplBadge(RewardBadge rewardBadge, UserProfile userProfile,
			int companyMstrSeq, char status, int createdBy, Date createDttm,
			Integer updatedBy, Date updateDttm) {
		this.rewardBadge = rewardBadge;
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
	@Column(name = "EMPL_BADGE_SEQ", unique = true, nullable = false)
	public Integer getEmplBadgeSeq() {
		return this.emplBadgeSeq;
	}

	public void setEmplBadgeSeq(Integer emplBadgeSeq) {
		this.emplBadgeSeq = emplBadgeSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REWARD_BADGE_SEQ", nullable = false)
	public RewardBadge getRewardBadge() {
		return this.rewardBadge;
	}

	public void setRewardBadge(RewardBadge rewardBadge) {
		this.rewardBadge = rewardBadge;
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