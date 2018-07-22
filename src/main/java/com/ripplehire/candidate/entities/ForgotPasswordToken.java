package com.ripplehire.candidate.entities;

// Generated Nov 19, 2015 2:58:36 PM by Hibernate Tools 4.0.0

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
 * ForgotPasswordToken generated by hbm2java
 */
@Entity
@Table(name = "forgot_password_token")
public class ForgotPasswordToken implements java.io.Serializable {

	private Integer forgotPasswordTokenSeq;
	private UserProfile userProfile;
	private String forgotPasswordToken;
	private Date expiryDate;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;

	public ForgotPasswordToken() {
	}

	public ForgotPasswordToken(UserProfile userProfile,
			String forgotPasswordToken, Date expiryDate, char status,
			int createdBy, Date createDttm) {
		this.userProfile = userProfile;
		this.forgotPasswordToken = forgotPasswordToken;
		this.expiryDate = expiryDate;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public ForgotPasswordToken(UserProfile userProfile,
			String forgotPasswordToken, Date expiryDate, char status,
			int createdBy, Date createDttm, Integer updatedBy, Date updateDttm) {
		this.userProfile = userProfile;
		this.forgotPasswordToken = forgotPasswordToken;
		this.expiryDate = expiryDate;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "FORGOT_PASSWORD_TOKEN_SEQ", unique = true, nullable = false)
	public Integer getForgotPasswordTokenSeq() {
		return this.forgotPasswordTokenSeq;
	}

	public void setForgotPasswordTokenSeq(Integer forgotPasswordTokenSeq) {
		this.forgotPasswordTokenSeq = forgotPasswordTokenSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_PROFILE_SEQ", nullable = false)
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Column(name = "FORGOT_PASSWORD_TOKEN", nullable = false, length = 100)
	public String getForgotPasswordToken() {
		return this.forgotPasswordToken;
	}

	public void setForgotPasswordToken(String forgotPasswordToken) {
		this.forgotPasswordToken = forgotPasswordToken;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EXPIRY_DATE", length = 19)
	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
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
