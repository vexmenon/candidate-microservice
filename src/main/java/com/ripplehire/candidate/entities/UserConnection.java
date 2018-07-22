package com.ripplehire.candidate.entities;

// Generated Mar 6, 2014 7:42:21 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Userconnection generated by hbm2java
 */
@Entity
@Table(name = "UserConnection", uniqueConstraints = @UniqueConstraint(columnNames = {
		"USERID", "PROVIDERID", "RANK" }))
public class UserConnection implements java.io.Serializable {

	private UserconnectionId id;
	private int rank;
	private String displayname;
	private String profileurl;
	private String imageurl;
	private String accesstoken;
	private String secret;
	private String refreshtoken;
	private Long expiretime;

	public UserConnection() {
	}

	public UserConnection(UserconnectionId id, int rank, String accesstoken) {
		this.id = id;
		this.rank = rank;
		this.accesstoken = accesstoken;
	}

	public UserConnection(UserconnectionId id, int rank, String displayname,
			String profileurl, String imageurl, String accesstoken,
			String secret, String refreshtoken, Long expiretime) {
		this.id = id;
		this.rank = rank;
		this.displayname = displayname;
		this.profileurl = profileurl;
		this.imageurl = imageurl;
		this.accesstoken = accesstoken;
		this.secret = secret;
		this.refreshtoken = refreshtoken;
		this.expiretime = expiretime;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "userid", column = @Column(name = "USERID", nullable = false)),
			@AttributeOverride(name = "providerid", column = @Column(name = "PROVIDERID", nullable = false)),
			@AttributeOverride(name = "provideruserid", column = @Column(name = "PROVIDERUSERID", nullable = false)) })
	public UserconnectionId getId() {
		return this.id;
	}

	public void setId(UserconnectionId id) {
		this.id = id;
	}

	@Column(name = "RANK", nullable = false)
	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Column(name = "DISPLAYNAME")
	public String getDisplayname() {
		return this.displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	@Column(name = "PROFILEURL", length = 512)
	public String getProfileurl() {
		return this.profileurl;
	}

	public void setProfileurl(String profileurl) {
		this.profileurl = profileurl;
	}

	@Column(name = "IMAGEURL", length = 512)
	public String getImageurl() {
		return this.imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	@Column(name = "ACCESSTOKEN", nullable = false)
	public String getAccesstoken() {
		return this.accesstoken;
	}

	public void setAccesstoken(String accesstoken) {
		this.accesstoken = accesstoken;
	}

	@Column(name = "SECRET")
	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	@Column(name = "REFRESHTOKEN")
	public String getRefreshtoken() {
		return this.refreshtoken;
	}

	public void setRefreshtoken(String refreshtoken) {
		this.refreshtoken = refreshtoken;
	}

	@Column(name = "EXPIRETIME")
	public Long getExpiretime() {
		return this.expiretime;
	}

	public void setExpiretime(Long expiretime) {
		this.expiretime = expiretime;
	}

}
