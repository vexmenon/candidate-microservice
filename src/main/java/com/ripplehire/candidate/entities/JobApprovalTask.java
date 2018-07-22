package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by nikesh on 2/5/17.
 */

@Entity
@Table(name = "job_approval_task")
public class JobApprovalTask implements java.io.Serializable {

    private Integer jobApprovalTaskSeq;
    private Integer companyMstrSeq;
    private Job job;
    private TaskDetails taskDetails;
    private JobApprovalDetails jobApprovalDetails;
    private char status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public JobApprovalTask() {
    }

    public JobApprovalTask(Integer companyMstrSeq, Job job, TaskDetails taskDetails, JobApprovalDetails jobApprovalDetails, char status, Integer createdBy, Date createDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.job = job;
        this.taskDetails = taskDetails;
        this.jobApprovalDetails = jobApprovalDetails;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    public JobApprovalTask(Integer companyMstrSeq, Job job, TaskDetails taskDetails, JobApprovalDetails jobApprovalDetails, char status, Integer createdBy, Date createDttm, Integer updatedBy, Date updateDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.job = job;
        this.taskDetails = taskDetails;
        this.jobApprovalDetails = jobApprovalDetails;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JOB_APPROVAL_TASK_SEQ", unique = true, nullable = false)
    public Integer getJobApprovalTaskSeq() {
        return jobApprovalTaskSeq;
    }

    public void setJobApprovalTaskSeq(Integer jobApprovalTaskSeq) {
        this.jobApprovalTaskSeq = jobApprovalTaskSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "JOB_SEQ", nullable = false)
    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASK_DETAILS_SEQ", nullable = false)
    public TaskDetails getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(TaskDetails taskDetails) {
        this.taskDetails = taskDetails;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "JOB_APPROVAL_DETAILS_SEQ", nullable = false)
    public JobApprovalDetails getJobApprovalDetails() {
        return jobApprovalDetails;
    }

    public void setJobApprovalDetails(JobApprovalDetails jobApprovalDetails) {
        this.jobApprovalDetails = jobApprovalDetails;
    }

    @Column(name = "STATUS", nullable = false, length = 1)
    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Column(name = "CREATED_BY", nullable = false)
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DTTM", nullable = false, length = 19)
    public Date getCreateDttm() {
        return createDttm;
    }

    public void setCreateDttm(Date createDttm) {
        this.createDttm = createDttm;
    }

    @Column(name = "UPDATED_BY")
    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DTTM", length = 19)
    public Date getUpdateDttm() {
        return updateDttm;
    }

    public void setUpdateDttm(Date updateDttm) {
        this.updateDttm = updateDttm;
    }
}
