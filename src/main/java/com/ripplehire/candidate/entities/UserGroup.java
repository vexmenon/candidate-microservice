package com.ripplehire.candidate.entities;
// Generated 12 May, 2017 3:06:45 PM by Hibernate Tools 4.0.0.Final

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
 * UserGroup generated by hbm2java
 */
@Entity
@Table(name = "user_group")
public class UserGroup implements java.io.Serializable {

	private Integer userGroupSeq;
	private int companyMstrSeq;
	private String userGroupCd;
	private Character status;
	private int createdBy;
	private Date createdDttm;
	private Integer updateBy;
	private Date updateDttm;
	private Set<UserGroupMembers> userGroupMemberses = new HashSet<UserGroupMembers>(0);
	private Set<JobApprover> jobApprovers = new HashSet<JobApprover>(0);

	public UserGroup() {
	}

	public UserGroup(int companyMstrSeq, int createdBy, Date createdDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
	}

	public UserGroup(int companyMstrSeq, String userGroupCd, Character status, int createdBy, Date createdDttm,
			Integer updateBy, Date updateDttm, Set<UserGroupMembers> userGroupMemberses,
			Set<JobApprover> jobApprovers) {
		this.companyMstrSeq = companyMstrSeq;
		this.userGroupCd = userGroupCd;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
		this.updateBy = updateBy;
		this.updateDttm = updateDttm;
		this.userGroupMemberses = userGroupMemberses;
		this.jobApprovers = jobApprovers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "USER_GROUP_SEQ", unique = true, nullable = false)
	public Integer getUserGroupSeq() {
		return this.userGroupSeq;
	}

	public void setUserGroupSeq(Integer userGroupSeq) {
		this.userGroupSeq = userGroupSeq;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "USER_GROUP_CD", length = 100)
	public String getUserGroupCd() {
		return this.userGroupCd;
	}

	public void setUserGroupCd(String userGroupCd) {
		this.userGroupCd = userGroupCd;
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
	@Column(name = "CREATED_DTTM", nullable = false, length = 19)
	public Date getCreatedDttm() {
		return this.createdDttm;
	}

	public void setCreatedDttm(Date createdDttm) {
		this.createdDttm = createdDttm;
	}

	@Column(name = "UPDATE_BY")
	public Integer getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DTTM", length = 19)
	public Date getUpdateDttm() {
		return this.updateDttm;
	}

	public void setUpdateDttm(Date updateDttm) {
		this.updateDttm = updateDttm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userGroup")
	public Set<UserGroupMembers> getUserGroupMemberses() {
		return this.userGroupMemberses;
	}

	public void setUserGroupMemberses(Set<UserGroupMembers> userGroupMemberses) {
		this.userGroupMemberses = userGroupMemberses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userGroup")
	public Set<JobApprover> getJobApprovers() {
		return jobApprovers;
	}

	public void setJobApprovers(Set<JobApprover> jobApprovers) {
		this.jobApprovers = jobApprovers;
	}
}
