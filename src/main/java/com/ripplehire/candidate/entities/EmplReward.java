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
 * EmplReward generated by hbm2java
 */
@Entity
@Table(name = "empl_reward")
public class EmplReward implements java.io.Serializable {

	private Integer emplRwrdSeq;
	private Reward reward;
	private EmplRefrl emplRefrl;
	private Job job;
	private UserProfile userProfile;
	private Contest contest;
	private int companyMstrSeq;
	private Date rewardDate;
	private String emplRwrdCat;
	private Integer empRwrdCatSeq;
	private String empNotification;
	private Character rewardReleased;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;
	private Character paymentPending;




	public EmplReward() {
	}

	public EmplReward(Reward reward, UserProfile userProfile,
			int companyMstrSeq, String emplRwrdCat, String empNotification,
			char status, int createdBy, Date createDttm) {
		this.reward = reward;
		this.userProfile = userProfile;
		this.companyMstrSeq = companyMstrSeq;
		this.emplRwrdCat = emplRwrdCat;
		this.empNotification = empNotification;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public EmplReward(Reward reward, EmplRefrl emplRefrl, Job job,
			UserProfile userProfile, Contest contest, int companyMstrSeq,
			Date rewardDate, String emplRwrdCat, Integer empRwrdCatSeq,
			String empNotification, Character rewardReleased, char status, int createdBy,
			Date createDttm, Integer updatedBy, Date updateDttm) {
		this.reward = reward;
		this.emplRefrl = emplRefrl;
		this.job = job;
		this.userProfile = userProfile;
		this.contest = contest;
		this.companyMstrSeq = companyMstrSeq;
		this.rewardDate = rewardDate;
		this.emplRwrdCat = emplRwrdCat;
		this.empRwrdCatSeq = empRwrdCatSeq;
		this.empNotification = empNotification;
		this.rewardReleased = rewardReleased;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "EMPL_RWRD_SEQ", unique = true, nullable = false)
	public Integer getEmplRwrdSeq() {
		return this.emplRwrdSeq;
	}

	public void setEmplRwrdSeq(Integer emplRwrdSeq) {
		this.emplRwrdSeq = emplRwrdSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REWARD_SEQ", nullable = false)
	public Reward getReward() {
		return this.reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPL_REFRL_SEQ")
	public EmplRefrl getEmplRefrl() {
		return this.emplRefrl;
	}

	public void setEmplRefrl(EmplRefrl emplRefrl) {
		this.emplRefrl = emplRefrl;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JOB_SEQ")
	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
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
	@JoinColumn(name = "CONTEST_SEQ")
	public Contest getContest() {
		return this.contest;
	}

	public void setContest(Contest contest) {
		this.contest = contest;
	}



	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REWARD_DATE", length = 19)
	public Date getRewardDate() {
		return this.rewardDate;
	}

	public void setRewardDate(Date rewardDate) {
		this.rewardDate = rewardDate;
	}

	@Column(name = "EMPL_RWRD_CAT", nullable = false, length = 25)
	public String getEmplRwrdCat() {
		return this.emplRwrdCat;
	}

	public void setEmplRwrdCat(String emplRwrdCat) {
		this.emplRwrdCat = emplRwrdCat;
	}



	@Column(name = "EMP_RWRD_CAT_SEQ")
	public Integer getEmpRwrdCatSeq() {
		return this.empRwrdCatSeq;
	}

	public void setEmpRwrdCatSeq(Integer empRwrdCatSeq) {
		this.empRwrdCatSeq = empRwrdCatSeq;
	}

	@Column(name = "EMP_NOTIFICATION", nullable = false, length = 1)
	public String getEmpNotification() {
		return this.empNotification;
	}

	public void setEmpNotification(String empNotification) {
		this.empNotification = empNotification;
	}

	@Column(name = "REWARD_RELEASED", length = 1)
	public Character getRewardReleased() {
		return this.rewardReleased;
	}

	public void setRewardReleased(Character rewardReleased) {
		this.rewardReleased = rewardReleased;
	}

	@Column(name = "STATUS", nullable = false, length = 1)
	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@Column(name = "PAYMENT_PENDING",length = 1)
	public Character getPaymentPending() {
		return paymentPending;
	}

	public void setPaymentPending(Character paymentPending) {
		this.paymentPending = paymentPending;
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