package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by nikesh on 17/4/17.
 */

@Entity
@Table(name = "job_status_mstr")
public class JobStatusMstr implements Serializable{

    private Integer jobStatusMstrSeq;
    private int companyMstrSeq;
    private String jobStatusCd;
    private String jobStatusLabel;
    private String jobType;
    private char status;

    public JobStatusMstr() {
    }

    public JobStatusMstr(Integer jobStatusMstrSeq, int companyMstrSeq, String jobStatusCd, String jobStatusLabel, String jobType, char status) {
        this.jobStatusMstrSeq = jobStatusMstrSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.jobStatusCd = jobStatusCd;
        this.jobStatusLabel = jobStatusLabel;
        this.jobType = jobType;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JOB_STATUS_MSTR_SEQ", unique = true, nullable = false)
    public Integer getJobStatusMstrSeq() {
        return jobStatusMstrSeq;
    }

    public void setJobStatusMstrSeq(Integer jobStatusMstrSeq) {
        this.jobStatusMstrSeq = jobStatusMstrSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public int getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(int companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "JOB_STATUS_CD", nullable = false, length = 50)
    public String getJobStatusCd() {
        return jobStatusCd;
    }

    public void setJobStatusCd(String jobStatusCd) {
        this.jobStatusCd = jobStatusCd;
    }

    @Column(name = "JOB_STATUS_LABEL", nullable = false, length = 50)
    public String getJobStatusLabel() {
        return jobStatusLabel;
    }

    public void setJobStatusLabel(String jobStatusLabel) {
        this.jobStatusLabel = jobStatusLabel;
    }

    @Column(name = "JOB_TYPE", nullable = false, length = 50)
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    @Column(name = "STATUS", nullable = false, length = 1)
    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
