package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "notify_internal_job")
public class NotifyInternalJob implements Serializable {

    private Integer notifyInternalJobSeq;
    private Integer companyMstrSeq;
    private Integer jobSeq;
    private Integer userProfileSeq;
    private char status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public NotifyInternalJob() {
    }

    public NotifyInternalJob(Integer companyMstrSeq, Integer jobSeq, Integer userProfileSeq, char status, Integer createdBy, Date createDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.jobSeq = jobSeq;
        this.userProfileSeq = userProfileSeq;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    public NotifyInternalJob(Integer companyMstrSeq, Integer jobSeq, Integer userProfileSeq, char status, Integer createdBy, Date createDttm, Integer updatedBy, Date updateDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.jobSeq = jobSeq;
        this.userProfileSeq = userProfileSeq;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NOTIFY_INTERNAL_JOB_SEQ", unique = true, nullable = false)
    public Integer getNotifyInternalJobSeq() {
        return notifyInternalJobSeq;
    }

    public void setNotifyInternalJobSeq(Integer notifyInternalJobSeq) {
        this.notifyInternalJobSeq = notifyInternalJobSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "JOB_SEQ", nullable = false)
    public Integer getJobSeq() {
        return jobSeq;
    }

    public void setJobSeq(Integer jobSeq) {
        this.jobSeq = jobSeq;
    }

    @Column(name = "USER_PROFILE_SEQ", nullable = false)
    public Integer getUserProfileSeq() {
        return userProfileSeq;
    }

    public void setUserProfileSeq(Integer userProfileSeq) {
        this.userProfileSeq = userProfileSeq;
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
