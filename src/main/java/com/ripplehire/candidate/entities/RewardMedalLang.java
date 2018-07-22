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
 * RewardMedalLang generated by hbm2java
 */
@Entity
@Table(name = "reward_medal_lang")
public class RewardMedalLang implements java.io.Serializable {

	private Integer rewardMedalLangSeq;
	private RewardMedal rewardMedal;
	private LangMstr langMstr;
	private String medalLbl;
	private String medalDesc;
	private String medalMsg;
	private char status;
	private int createdBy;
	private Date createdDttm;
	private Integer updatedBy;
	private Date updatedDttm;

	public RewardMedalLang() {
	}

	public RewardMedalLang(RewardMedal rewardMedal, LangMstr langMstr,
			char status, int createdBy, Date createdDttm) {
		this.rewardMedal = rewardMedal;
		this.langMstr = langMstr;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
	}

	public RewardMedalLang(RewardMedal rewardMedal, LangMstr langMstr,
			String medalLbl, String medalDesc, String medalMsg, char status, int createdBy,
			Date createdDttm, Integer updatedBy, Date updatedDttm) {
		this.rewardMedal = rewardMedal;
		this.langMstr = langMstr;
		this.medalLbl = medalLbl;
		this.medalDesc = medalDesc;
		this.medalMsg = medalMsg;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
		this.updatedBy = updatedBy;
		this.updatedDttm = updatedDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "REWARD_MEDAL_LANG_SEQ", unique = true, nullable = false)
	public Integer getRewardMedalLangSeq() {
		return this.rewardMedalLangSeq;
	}

	public void setRewardMedalLangSeq(Integer rewardMedalLangSeq) {
		this.rewardMedalLangSeq = rewardMedalLangSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REWARD_MEDAL_SEQ", nullable = false)
	public RewardMedal getRewardMedal() {
		return this.rewardMedal;
	}

	public void setRewardMedal(RewardMedal rewardMedal) {
		this.rewardMedal = rewardMedal;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LANG_MSTR_SEQ", nullable = false)
	public LangMstr getLangMstr() {
		return this.langMstr;
	}

	public void setLangMstr(LangMstr langMstr) {
		this.langMstr = langMstr;
	}

	@Column(name = "MEDAL_LBL", length = 400)
	public String getMedalLbl() {
		return this.medalLbl;
	}

	public void setMedalLbl(String medalLbl) {
		this.medalLbl = medalLbl;
	}

	@Column(name = "MEDAL_DESC", length = 500)
	public String getMedalDesc() {
		return this.medalDesc;
	}

	public void setMedalDesc(String medalDesc) {
		this.medalDesc = medalDesc;
	}

	@Column(name = "MEDAL_MSG", length = 500)
	public String getMedalMsg() {
		return medalMsg;
	}

	public void setMedalMsg(String medalMsg) {
		this.medalMsg = medalMsg;
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

}
