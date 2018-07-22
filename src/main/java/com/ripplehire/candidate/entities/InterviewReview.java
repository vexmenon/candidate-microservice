package com.ripplehire.candidate.entities;
// Generated 30 Mar, 2017 11:21:44 AM by Hibernate Tools 5.2.0.CR1

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
 * InterviewReview generated by hbm2java
 */
@Entity
@Table(name = "interview_review")
public class InterviewReview implements java.io.Serializable {

	private Integer interviewReviewSeq;
	private Interview interview;
	private int companyMstrSeq;
	private Date dueDate;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;
	private Set<InterviewReviewTask> interviewReviewTasks = new HashSet<InterviewReviewTask>(0);

	public InterviewReview() {
	}

	public InterviewReview(Interview interview, int companyMstrSeq, Date dueDate, char status,
			int createdBy, Date createDttm) {
		this.interview = interview;
		this.companyMstrSeq = companyMstrSeq;
		this.dueDate = dueDate;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public InterviewReview(Interview interview, int companyMstrSeq, Date dueDate, char status,
			int createdBy, Date createDttm, Integer updatedBy, Date updateDttm,
			Set<InterviewReviewTask> interviewReviewTasks) {
		this.interview = interview;
		this.companyMstrSeq = companyMstrSeq;
		this.dueDate = dueDate;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
		this.interviewReviewTasks = interviewReviewTasks;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "INTERVIEW_REVIEW_SEQ", unique = true, nullable = false)
	public Integer getInterviewReviewSeq() {
		return this.interviewReviewSeq;
	}

	public void setInterviewReviewSeq(Integer interviewReviewSeq) {
		this.interviewReviewSeq = interviewReviewSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INTERVIEW_SEQ", nullable = false)
	public Interview getInterview() {
		return this.interview;
	}

	public void setInterview(Interview interview) {
		this.interview = interview;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DUE_DATE", nullable = false, length = 19)
	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewReview")
	public Set<InterviewReviewTask> getInterviewReviewTasks() {
		return this.interviewReviewTasks;
	}

	public void setInterviewReviewTasks(Set<InterviewReviewTask> interviewReviewTasks) {
		this.interviewReviewTasks = interviewReviewTasks;
	}

}
