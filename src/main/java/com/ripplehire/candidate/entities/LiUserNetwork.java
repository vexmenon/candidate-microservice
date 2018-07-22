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
 * LiUserNetwork generated by hbm2java
 */
@Entity
@Table(name = "li_user_network")
public class LiUserNetwork implements java.io.Serializable {

	private Integer liUserNetworkSeq;
	private UserProfile userProfile;
	private String friendUserId;
	private String friendFirstName;
	private String friendLastName;
	private String friendEmailAddr;
	private String friendCompanyNm;
	private String friendJobTitle;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;

	public LiUserNetwork() {
	}

	public LiUserNetwork(UserProfile userProfile, char status, int createdBy,
			Date createDttm) {
		this.userProfile = userProfile;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public LiUserNetwork(UserProfile userProfile, String friendUserId,
			String friendFirstName, String friendLastName,
			String friendEmailAddr, String friendCompanyNm,
			String friendJobTitle, char status, int createdBy, Date createDttm,
			Integer updatedBy, Date updateDttm) {
		this.userProfile = userProfile;
		this.friendUserId = friendUserId;
		this.friendFirstName = friendFirstName;
		this.friendLastName = friendLastName;
		this.friendEmailAddr = friendEmailAddr;
		this.friendCompanyNm = friendCompanyNm;
		this.friendJobTitle = friendJobTitle;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "LI_USER_NETWORK_SEQ", unique = true, nullable = false)
	public Integer getLiUserNetworkSeq() {
		return this.liUserNetworkSeq;
	}

	public void setLiUserNetworkSeq(Integer liUserNetworkSeq) {
		this.liUserNetworkSeq = liUserNetworkSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_PROFILE_SEQ", nullable = false)
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Column(name = "FRIEND_USER_ID")
	public String getFriendUserId() {
		return this.friendUserId;
	}

	public void setFriendUserId(String friendUserId) {
		this.friendUserId = friendUserId;
	}

	@Column(name = "FRIEND_FIRST_NAME")
	public String getFriendFirstName() {
		return this.friendFirstName;
	}

	public void setFriendFirstName(String friendFirstName) {
		this.friendFirstName = friendFirstName;
	}

	@Column(name = "FRIEND_LAST_NAME")
	public String getFriendLastName() {
		return this.friendLastName;
	}

	public void setFriendLastName(String friendLastName) {
		this.friendLastName = friendLastName;
	}

	@Column(name = "FRIEND_EMAIL_ADDR", length = 1000)
	public String getFriendEmailAddr() {
		return this.friendEmailAddr;
	}

	public void setFriendEmailAddr(String friendEmailAddr) {
		this.friendEmailAddr = friendEmailAddr;
	}

	@Column(name = "FRIEND_COMPANY_NM", length = 1000)
	public String getFriendCompanyNm() {
		return this.friendCompanyNm;
	}

	public void setFriendCompanyNm(String friendCompanyNm) {
		this.friendCompanyNm = friendCompanyNm;
	}

	@Column(name = "FRIEND_JOB_TITLE", length = 1000)
	public String getFriendJobTitle() {
		return this.friendJobTitle;
	}

	public void setFriendJobTitle(String friendJobTitle) {
		this.friendJobTitle = friendJobTitle;
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