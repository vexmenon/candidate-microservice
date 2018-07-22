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
 * InterviewComments generated by hbm2java
 */
@Entity
@Table(name = "interview_comments")
public class InterviewComments implements java.io.Serializable {

	private Integer interviewCommentSeq;
	private UserProfile userProfile;
	private Interviewer interviewer;
	private InterviewDetails interviewDetails;
	private InterviewSchedule interviewSchedule;
	private Interview interview;
	private int companyMstrSeq;
	private String interviewComments;
	private String commentType;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;

	public InterviewComments() {
	}

	public InterviewComments(InterviewDetails interviewDetails,
			int companyMstrSeq, String interviewComments, char status,
			int createdBy, Date createDttm) {
		this.interviewDetails = interviewDetails;
		this.companyMstrSeq = companyMstrSeq;
		this.interviewComments = interviewComments;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public InterviewComments(UserProfile userProfile, Interviewer interviewer,
			InterviewDetails interviewDetails, InterviewSchedule interviewSchedule, int companyMstrSeq,
			String interviewComments, String commentType, char status, int createdBy,
			Date createDttm, Integer updatedBy, Date updateDttm) {
		this.userProfile = userProfile;
		this.interviewer = interviewer;
		this.interviewDetails = interviewDetails;
		this.interviewSchedule = interviewSchedule;
		this.companyMstrSeq = companyMstrSeq;
		this.interviewComments = interviewComments;
		this.commentType = commentType;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "INTERVIEW_COMMENT_SEQ", unique = true, nullable = false)
	public Integer getInterviewCommentSeq() {
		return this.interviewCommentSeq;
	}

	public void setInterviewCommentSeq(Integer interviewCommentSeq) {
		this.interviewCommentSeq = interviewCommentSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RECRUITER_SEQ")
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INTERVIEWER_SEQ")
	public Interviewer getInterviewer() {
		return this.interviewer;
	}

	public void setInterviewer(Interviewer interviewer) {
		this.interviewer = interviewer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INTERVIEW_DETAIL_SEQ", nullable = false)
	public InterviewDetails getInterviewDetails() {
		return this.interviewDetails;
	}

	public void setInterviewDetails(InterviewDetails interviewDetails) {
		this.interviewDetails = interviewDetails;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INTERVIEW_SEQ")
	public Interview getInterview() { 		return interview;	}

	public void setInterview(Interview interview) { 		this.interview = interview;	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INTERVIEW_SCHEDULE_SEQ")
	public InterviewSchedule getInterviewSchedule() {
		return interviewSchedule;
	}

	public void setInterviewSchedule(InterviewSchedule interviewSchedule) {
		this.interviewSchedule = interviewSchedule;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "INTERVIEW_COMMENTS", nullable = false)
	public String getInterviewComments() {
		return this.interviewComments;
	}

	public void setInterviewComments(String interviewComments) {
		this.interviewComments = interviewComments;
	}

	@Column(name = "COMMENTS_TYPE", length = 50)
	public String getCommentType() {
		return commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
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
