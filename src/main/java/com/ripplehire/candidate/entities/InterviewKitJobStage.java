package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "interview_kit_job_stage")
public class InterviewKitJobStage implements Serializable {
    private Integer interviewKitJobStageSeq;
    private Integer companyMstrSeq;
    private InterviewKit interviewKit;
    private Job job;
    private InterviewStageMstr interviewStageMstr;
    private String interviewKitJobStageStatus;
    private Character status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public InterviewKitJobStage() {
    }

    public InterviewKitJobStage(Integer interviewKitJobStageSeq, Integer companyMstrSeq, InterviewKit interviewKit, Job job, InterviewStageMstr interviewStageMstr, String interviewKitJobStageStatus, Character status, Integer createdBy, Date createDttm, Integer updatedBy, Date updateDttm) {
        this.interviewKitJobStageSeq = interviewKitJobStageSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.interviewKit = interviewKit;
        this.job = job;
        this.interviewStageMstr = interviewStageMstr;
        this.interviewKitJobStageStatus = interviewKitJobStageStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
    }

    public InterviewKitJobStage(Integer interviewKitJobStageSeq, Integer companyMstrSeq, InterviewKit interviewKit, Job job, InterviewStageMstr interviewStageMstr, String interviewKitJobStageStatus, Character status, Integer createdBy, Date createDttm) {
        this.interviewKitJobStageSeq = interviewKitJobStageSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.interviewKit = interviewKit;
        this.job = job;
        this.interviewStageMstr = interviewStageMstr;
        this.interviewKitJobStageStatus = interviewKitJobStageStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "INTERVIEW_KIT_JOB_STAGE_SEQ", unique = true, nullable = false)
    public Integer getInterviewKitJobStageSeq() {
        return interviewKitJobStageSeq;
    }

    public void setInterviewKitJobStageSeq(Integer interviewKitJobStageSeq) {
        this.interviewKitJobStageSeq = interviewKitJobStageSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @ManyToOne
    @JoinColumn(name = "INTERVIEW_KIT_SEQ", nullable = false)
    public InterviewKit getInterviewKit() {
        return interviewKit;
    }

    public void setInterviewKit(InterviewKit interviewKit) {
        this.interviewKit = interviewKit;
    }

    @ManyToOne
    @JoinColumn(name = "JOB_SEQ", nullable = false)
    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @ManyToOne
    @JoinColumn(name = "INTERVIEW_STAGE_MSTR_SEQ", nullable = false)
    public InterviewStageMstr getInterviewStageMstr() {
        return interviewStageMstr;
    }

    public void setInterviewStageMstr(InterviewStageMstr interviewStageMstr) {
        this.interviewStageMstr = interviewStageMstr;
    }

    @Column(name = "INTERVIEW_KIT_JOB_STAGE_STATUS", nullable = false, length = 10)
    public String getInterviewKitJobStageStatus() {
        return interviewKitJobStageStatus;
    }

    public void setInterviewKitJobStageStatus(String interviewKitJobStageStatus) {
        this.interviewKitJobStageStatus = interviewKitJobStageStatus;
    }

    @Column(name = "STATUS", nullable = false, length = 1)
    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
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
