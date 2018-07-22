package com.ripplehire.candidate.entities;

/**
 * Created by mahesh on 12/13/16.
 */

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "job_agency")
public class JobAgency implements java.io.Serializable {
    private Integer jobAgencySeq;
    private int companyMstrSeq;
    private Job job;
    private VendorMstr vendorMstr;
    private int submissionLimit;
    private char status;
    private int createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public JobAgency() {
    }

    public JobAgency(int companyMstrSeq, Job job, VendorMstr vendorMstr,
                        char status, int createdBy, Date createDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.job = job;
        this.vendorMstr = vendorMstr;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    public JobAgency(int companyMstrSeq, Job job, VendorMstr vendorMstr, int submissionLimit,
                        char status, int createdBy, Date createDttm, Integer updatedBy,
                        Date updateDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.job = job;
        this.vendorMstr = vendorMstr;
        this.submissionLimit = submissionLimit;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "JOB_AGENCY_SEQ", unique = true, nullable = false)
    public Integer getJobAgencySeq() {
        return this.jobAgencySeq;
    }

    public void setJobAgencySeq(Integer jobAgencySeq) {
        this.jobAgencySeq = jobAgencySeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public int getCompanyMstrSeq() {
        return this.companyMstrSeq;
    }

    public void setCompanyMstrSeq(int companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
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
    @JoinColumn(name = "VENDOR_MSTR_SEQ", nullable = false)
    public VendorMstr getVendorMstr() {
        return this.vendorMstr;
    }

    public void setVendorMstr(VendorMstr vendorMstr) {
        this.vendorMstr = vendorMstr;
    }

    @Column(name = "SUBMISSION_LIMIT", nullable = false)
    public int getSubmissionLimit() {
        return submissionLimit;
    }

    public void setSubmissionLimit(int submissionLimit) {
        this.submissionLimit = submissionLimit;
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
