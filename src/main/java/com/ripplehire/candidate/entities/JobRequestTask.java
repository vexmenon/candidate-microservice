package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by nikesh on 2/5/17.
 */

@Entity
@Table(name = "job_request_task")
public class JobRequestTask implements java.io.Serializable {

    private Integer jobRequestTaskSeq;
    private Integer companyMstrSeq;
    private Job job;
    private TaskDetails taskDetails;
    private JobRecruiter jobRecruiter;
    private char status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public JobRequestTask() {
    }

    public JobRequestTask(Integer companyMstrSeq, Job job, TaskDetails taskDetails, JobRecruiter jobRecruiter, char status, Integer createdBy, Date createDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.job = job;
        this.taskDetails = taskDetails;
        this.jobRecruiter = jobRecruiter;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    public JobRequestTask(Integer companyMstrSeq, Job job, TaskDetails taskDetails, JobRecruiter jobRecruiter, char status, Integer createdBy, Date createDttm, Integer updatedBy, Date updateDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.job = job;
        this.taskDetails = taskDetails;
        this.jobRecruiter = jobRecruiter;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JOB_REQUEST_TASK_SEQ", unique = true, nullable = false)
    public Integer getJobRequestTaskSeq() {
        return jobRequestTaskSeq;
    }

    public void setJobRequestTaskSeq(Integer jobRequestTaskSeq) {
        this.jobRequestTaskSeq = jobRequestTaskSeq;
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
    @JoinColumn(name = "JOB_RECRUITER_SEQ", nullable = false)
    public JobRecruiter getJobRecruiter() {
        return jobRecruiter;
    }

    public void setJobRecruiter(JobRecruiter jobRecruiter) {
        this.jobRecruiter = jobRecruiter;
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
