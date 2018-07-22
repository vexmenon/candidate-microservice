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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Goal generated by hbm2java
 */
@Entity
@Table(name = "goal")
public class Goal implements java.io.Serializable {

	private Integer goalSeq;
	private int companyMstrSeq;
	private String goalCd;
	private String goalDesc;
	private int goalPriority;
	private String goalType;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;
	private Set<GoalLang> goalLangs = new HashSet<GoalLang>(0);
	private Set<EmplGoal> emplGoals = new HashSet<EmplGoal>(0);
	private Set<GoalActivity> goalActivities = new HashSet<GoalActivity>(0);
	private Set<GoalReward> goalRewards = new HashSet<GoalReward>(0);

	public Goal() {
	}

	public Goal(int companyMstrSeq, String goalCd, int goalPriority,
			String goalType, char status, int createdBy, Date createDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.goalCd = goalCd;
		this.goalPriority = goalPriority;
		this.goalType = goalType;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public Goal(int companyMstrSeq, String goalCd, String goalDesc,
			int goalPriority, String goalType, char status, int createdBy,
			Date createDttm, Integer updatedBy, Date updateDttm,
			Set<GoalLang> goalLangs, Set<EmplGoal> emplGoals,
			Set<GoalActivity> goalActivities, Set<GoalReward> goalRewards) {
		this.companyMstrSeq = companyMstrSeq;
		this.goalCd = goalCd;
		this.goalDesc = goalDesc;
		this.goalPriority = goalPriority;
		this.goalType = goalType;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
		this.goalLangs = goalLangs;
		this.emplGoals = emplGoals;
		this.goalActivities = goalActivities;
		this.goalRewards = goalRewards;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "GOAL_SEQ", unique = true, nullable = false)
	public Integer getGoalSeq() {
		return this.goalSeq;
	}

	public void setGoalSeq(Integer goalSeq) {
		this.goalSeq = goalSeq;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "GOAL_CD", nullable = false, length = 20)
	public String getGoalCd() {
		return this.goalCd;
	}

	public void setGoalCd(String goalCd) {
		this.goalCd = goalCd;
	}

	@Column(name = "GOAL_DESC")
	public String getGoalDesc() {
		return this.goalDesc;
	}

	public void setGoalDesc(String goalDesc) {
		this.goalDesc = goalDesc;
	}

	@Column(name = "GOAL_PRIORITY", nullable = false)
	public int getGoalPriority() {
		return this.goalPriority;
	}

	public void setGoalPriority(int goalPriority) {
		this.goalPriority = goalPriority;
	}

	@Column(name = "GOAL_TYPE", nullable = false, length = 10)
	public String getGoalType() {
		return this.goalType;
	}

	public void setGoalType(String goalType) {
		this.goalType = goalType;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "goal")
	public Set<GoalLang> getGoalLangs() {
		return this.goalLangs;
	}

	public void setGoalLangs(Set<GoalLang> goalLangs) {
		this.goalLangs = goalLangs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "goal")
	public Set<EmplGoal> getEmplGoals() {
		return this.emplGoals;
	}

	public void setEmplGoals(Set<EmplGoal> emplGoals) {
		this.emplGoals = emplGoals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "goal")
	public Set<GoalActivity> getGoalActivities() {
		return this.goalActivities;
	}

	public void setGoalActivities(Set<GoalActivity> goalActivities) {
		this.goalActivities = goalActivities;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "goal")
	public Set<GoalReward> getGoalRewards() {
		return this.goalRewards;
	}

	public void setGoalRewards(Set<GoalReward> goalRewards) {
		this.goalRewards = goalRewards;
	}

}