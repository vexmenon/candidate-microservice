package com.ripplehire.candidate.entities;
// Generated 12 May, 2017 3:06:45 PM by Hibernate Tools 4.0.0.Final

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
 * UserGroupMembers generated by hbm2java
 */
@Entity
@Table(name = "user_group_members")
public class UserGroupMembers implements java.io.Serializable {

	private Integer userGroupMembersSeq;
	private UserProfile userProfile;
	private UserGroup userGroup;
	private int companyMstrSeq;
	private Character status;
	private int createdBy;
	private Date createdDttm;
	private Integer updateBy;
	private Date updateDttm;

	public UserGroupMembers() {
	}

	public UserGroupMembers(UserProfile userProfile, UserGroup userGroup, int companyMstrSeq, int createdBy,
			Date createdDttm) {
		this.userProfile = userProfile;
		this.userGroup = userGroup;
		this.companyMstrSeq = companyMstrSeq;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
	}

	public UserGroupMembers(UserProfile userProfile, UserGroup userGroup, int companyMstrSeq, Character status,
			int createdBy, Date createdDttm, Integer updateBy, Date updateDttm) {
		this.userProfile = userProfile;
		this.userGroup = userGroup;
		this.companyMstrSeq = companyMstrSeq;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
		this.updateBy = updateBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "USER_GROUP_MEMBERS_SEQ", unique = true, nullable = false)
	public Integer getUserGroupMembersSeq() {
		return this.userGroupMembersSeq;
	}

	public void setUserGroupMembersSeq(Integer userGroupMembersSeq) {
		this.userGroupMembersSeq = userGroupMembersSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_PROFILE_SEQ", nullable = false)
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_GROUP_SEQ", nullable = false)
	public UserGroup getUserGroup() {
		return this.userGroup;
	}

	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
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

}
