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
 * JobRecruiter generated by hbm2java
 */
@Entity
@Table(name = "job_recruiter")
public class JobRecruiter implements java.io.Serializable {

	private Integer jobRecrtrSeq;
	private Job job;
	private UserProfile userProfile;
	private int companyMstrSeq;
    private String role;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;

	public JobRecruiter() {
	}

	public JobRecruiter(Job job, UserProfile userProfile, int companyMstrSeq,
			char status, int createdBy, Date createDttm) {
		this.job = job;
		this.userProfile = userProfile;
		this.companyMstrSeq = companyMstrSeq;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public JobRecruiter(Job job, UserProfile userProfile, int companyMstrSeq,
			char status, int createdBy, Date createDttm, Integer updatedBy,
			Date updateDttm) {
		this.job = job;
		this.userProfile = userProfile;
		this.companyMstrSeq = companyMstrSeq;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "JOB_RECRTR_SEQ", unique = true, nullable = false)
	public Integer getJobRecrtrSeq() {
		return this.jobRecrtrSeq;
	}

	public void setJobRecrtrSeq(Integer jobRecrtrSeq) {
		this.jobRecrtrSeq = jobRecrtrSeq;
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
	@JoinColumn(name = "USER_PROFILE_SEQ", nullable = false)
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

    @Column(name = "ROLE", nullable = false, length = 10)
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
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
