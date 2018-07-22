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
 * ContestJob generated by hbm2java
 */
@Entity
@Table(name = "contest_job")
public class ContestJob implements java.io.Serializable {

	private Integer contestJobSeq;
	private Job job;
	private Contest contest;
	private int companyMstrSeq;
	private int jobPositions;
	private int jobPositionsClosed;
	private int totalCandidateClicks;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;

	public ContestJob() {
	}

	public ContestJob(Job job, Contest contest, int companyMstrSeq,
			int jobPositions, int jobPositionsClosed, int totalCandidateClicks,
			char status, int createdBy, Date createDttm) {
		this.job = job;
		this.contest = contest;
		this.companyMstrSeq = companyMstrSeq;
		this.jobPositions = jobPositions;
		this.jobPositionsClosed = jobPositionsClosed;
		this.totalCandidateClicks = totalCandidateClicks;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public ContestJob(Job job, Contest contest, int companyMstrSeq,
			int jobPositions, int jobPositionsClosed, int totalCandidateClicks,
			char status, int createdBy, Date createDttm, Integer updatedBy,
			Date updateDttm) {
		this.job = job;
		this.contest = contest;
		this.companyMstrSeq = companyMstrSeq;
		this.jobPositions = jobPositions;
		this.jobPositionsClosed = jobPositionsClosed;
		this.totalCandidateClicks = totalCandidateClicks;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CONTEST_JOB_SEQ", unique = true, nullable = false)
	public Integer getContestJobSeq() {
		return this.contestJobSeq;
	}

	public void setContestJobSeq(Integer contestJobSeq) {
		this.contestJobSeq = contestJobSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JOB_SEQ", nullable = false)
	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CONTEST_SEQ", nullable = false)
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

	@Column(name = "JOB_POSITIONS", nullable = false)
	public int getJobPositions() {
		return this.jobPositions;
	}

	public void setJobPositions(int jobPositions) {
		this.jobPositions = jobPositions;
	}

	@Column(name = "JOB_POSITIONS_CLOSED", nullable = false)
	public int getJobPositionsClosed() {
		return this.jobPositionsClosed;
	}

	public void setJobPositionsClosed(int jobPositionsClosed) {
		this.jobPositionsClosed = jobPositionsClosed;
	}

	@Column(name = "TOTAL_CANDIDATE_CLICKS", nullable = false)
	public int getTotalCandidateClicks() {
		return this.totalCandidateClicks;
	}

	public void setTotalCandidateClicks(int totalCandidateClicks) {
		this.totalCandidateClicks = totalCandidateClicks;
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
