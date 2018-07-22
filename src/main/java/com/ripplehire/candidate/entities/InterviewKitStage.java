package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "interview_kit_stage")
public class InterviewKitStage implements Serializable {
    private Integer interviewKitStageSeq;
    private Integer companyMstrSeq;
    private InterviewKit interviewKit;
    private InterviewStageMstr interviewStageMstr;
    private String interviewKitStageStatus;
    private Character status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public InterviewKitStage() {
    }

    public InterviewKitStage(Integer interviewKitStageSeq, Integer companyMstrSeq, InterviewKit interviewKit, InterviewStageMstr interviewStageMstr, String interviewKitStageStatus, Character status, Integer createdBy, Date createDttm, Integer updatedBy, Date updateDttm) {
        this.interviewKitStageSeq = interviewKitStageSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.interviewKit = interviewKit;
        this.interviewStageMstr = interviewStageMstr;
        this.interviewKitStageStatus = interviewKitStageStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
    }

    public InterviewKitStage(Integer interviewKitStageSeq, Integer companyMstrSeq, InterviewKit interviewKit, InterviewStageMstr interviewStageMstr, String interviewKitStageStatus, Character status, Integer createdBy, Date createDttm) {
        this.interviewKitStageSeq = interviewKitStageSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.interviewKit = interviewKit;
        this.interviewStageMstr = interviewStageMstr;
        this.interviewKitStageStatus = interviewKitStageStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "INTERVIEW_KIT_STAGE_SEQ", unique = true, nullable = false)
    public Integer getInterviewKitStageSeq() {
        return interviewKitStageSeq;
    }

    public void setInterviewKitStageSeq(Integer interviewKitStageSeq) {
        this.interviewKitStageSeq = interviewKitStageSeq;
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
    @JoinColumn(name = "INTERVIEW_STAGE_MSTR_SEQ", nullable = false)
    public InterviewStageMstr getInterviewStageMstr() {
        return interviewStageMstr;
    }

    public void setInterviewStageMstr(InterviewStageMstr interviewStageMstr) {
        this.interviewStageMstr = interviewStageMstr;
    }

    @Column(name = "INTERVIEW_KIT_STAGE_STATUS", nullable = false, length = 10)
    public String getInterviewKitStageStatus() {
        return interviewKitStageStatus;
    }

    public void setInterviewKitStageStatus(String interviewKitStageStatus) {
        this.interviewKitStageStatus = interviewKitStageStatus;
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
