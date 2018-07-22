package com.ripplehire.candidate.entities;

// Generated Mar 6, 2014 7:42:21 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RewardMedal generated by hbm2java
 */
@Entity
@Table(name = "reward_medal")
public class RewardMedal implements java.io.Serializable {

	private Integer rewardMedalSeq;
	private Reward reward;
	private int companyMstrSeq;
	private String medalCd;
	private String medalLbl;
	private String medalDesc;
	private String medalImg;
	private char status;
	private int createdBy;
	private Date createdDttm;
	private Integer updatedBy;
	private Date updatedDttm;
	private Set<RewardMedalLang> rewardMedalLangs = new HashSet<RewardMedalLang>(
			0);
	private Set<EmplMedal> emplMedals = new HashSet<EmplMedal>(0);

	public RewardMedal() {
	}

	public RewardMedal(Reward reward, int companyMstrSeq, char status,
			int createdBy, Date createdDttm) {
		this.reward = reward;
		this.companyMstrSeq = companyMstrSeq;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
	}

	public RewardMedal(Reward reward, int companyMstrSeq, String medalCd,
			String medalLbl, String medalDesc, String medalImg, char status,
			int createdBy, Date createdDttm, Integer updatedBy,
			Date updatedDttm, Set<RewardMedalLang> rewardMedalLangs,
			Set<EmplMedal> emplMedals) {
		this.reward = reward;
		this.companyMstrSeq = companyMstrSeq;
		this.medalCd = medalCd;
		this.medalLbl = medalLbl;
		this.medalDesc = medalDesc;
		this.medalImg = medalImg;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
		this.updatedBy = updatedBy;
		this.updatedDttm = updatedDttm;
		this.rewardMedalLangs = rewardMedalLangs;
		this.emplMedals = emplMedals;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "REWARD_MEDAL_SEQ", unique = true, nullable = false)
	public Integer getRewardMedalSeq() {
		return this.rewardMedalSeq;
	}

	public void setRewardMedalSeq(Integer rewardMedalSeq) {
		this.rewardMedalSeq = rewardMedalSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REWARD_SEQ", nullable = false)
	public Reward getReward() {
		return this.reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "MEDAL_CD", length = 20)
	public String getMedalCd() {
		return this.medalCd;
	}

	public void setMedalCd(String medalCd) {
		this.medalCd = medalCd;
	}

	@Column(name = "MEDAL_LBL", length = 50)
	public String getMedalLbl() {
		return this.medalLbl;
	}

	public void setMedalLbl(String medalLbl) {
		this.medalLbl = medalLbl;
	}

	@Column(name = "MEDAL_DESC")
	public String getMedalDesc() {
		return this.medalDesc;
	}

	public void setMedalDesc(String medalDesc) {
		this.medalDesc = medalDesc;
	}

	@Column(name = "MEDAL_IMG", length = 50)
	public String getMedalImg() {
		return this.medalImg;
	}

	public void setMedalImg(String medalImg) {
		this.medalImg = medalImg;
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
	@Column(name = "CREATED_DTTM", nullable = false, length = 19)
	public Date getCreatedDttm() {
		return this.createdDttm;
	}

	public void setCreatedDttm(Date createdDttm) {
		this.createdDttm = createdDttm;
	}

	@Column(name = "UPDATED_BY")
	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DTTM", length = 19)
	public Date getUpdatedDttm() {
		return this.updatedDttm;
	}

	public void setUpdatedDttm(Date updatedDttm) {
		this.updatedDttm = updatedDttm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rewardMedal")
	public Set<RewardMedalLang> getRewardMedalLangs() {
		return this.rewardMedalLangs;
	}

	public void setRewardMedalLangs(Set<RewardMedalLang> rewardMedalLangs) {
		this.rewardMedalLangs = rewardMedalLangs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rewardMedal")
	public Set<EmplMedal> getEmplMedals() {
		return this.emplMedals;
	}

	public void setEmplMedals(Set<EmplMedal> emplMedals) {
		this.emplMedals = emplMedals;
	}

}
