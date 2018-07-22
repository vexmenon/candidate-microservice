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
 * EmplActivity generated by hbm2java
 */
@Entity
@Table(name = "empl_activity")
public class EmplActivity implements java.io.Serializable {

	private Integer emplActivitySeq;
	private Reward reward;
	private ActivityMstr activityMstr;
	private EmplRefrl emplRefrl;
	private Job job;
	private UserProfile userProfile;
	private Contest contest;
	private int companyMstrSeq;
	private String isGoalActivity;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;

	public EmplActivity() {
	}

	public EmplActivity(ActivityMstr activityMstr, UserProfile userProfile,
			int companyMstrSeq, String isGoalActivity, char status,
			int createdBy, Date createDttm) {
		this.activityMstr = activityMstr;
		this.userProfile = userProfile;
		this.companyMstrSeq = companyMstrSeq;
		this.isGoalActivity = isGoalActivity;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public EmplActivity(Reward reward, ActivityMstr activityMstr, EmplRefrl emplRefrl, Job job,
			UserProfile userProfile, Contest contest, int companyMstrSeq,
			String isGoalActivity, char status, int createdBy, Date createDttm,
			Integer updatedBy, Date updateDttm) {
		this.reward = reward;
		this.activityMstr = activityMstr;
		this.emplRefrl = emplRefrl;
		this.job = job;
		this.userProfile = userProfile;
		this.contest = contest;
		this.companyMstrSeq = companyMstrSeq;
		this.isGoalActivity = isGoalActivity;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "EMPL_ACTIVITY_SEQ", unique = true, nullable = false)
	public Integer getEmplActivitySeq() {
		return this.emplActivitySeq;
	}

	public void setEmplActivitySeq(Integer emplActivitySeq) {
		this.emplActivitySeq = emplActivitySeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REWARD_SEQ")
	public Reward getReward() {
		return this.reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACTIVITY_MSTR_SEQ", nullable = false)
	public ActivityMstr getActivityMstr() {
		return this.activityMstr;
	}

	public void setActivityMstr(ActivityMstr activityMstr) {
		this.activityMstr = activityMstr;
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

	@Column(name = "IS_GOAL_ACTIVITY", nullable = false, length = 1)
	public String getIsGoalActivity() {
		return this.isGoalActivity;
	}

	public void setIsGoalActivity(String isGoalActivity) {
		this.isGoalActivity = isGoalActivity;
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