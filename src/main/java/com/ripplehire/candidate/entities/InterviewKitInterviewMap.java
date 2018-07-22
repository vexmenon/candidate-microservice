package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "interview_kit_interview_map")
public class InterviewKitInterviewMap implements Serializable {
    private Integer interviewKitInterviewMapSeq;
    private Integer companyMstrSeq;
    private Interview interview;
    private InterviewKit interviewKit;
    private String interviewKitInterviewMapStatus;
    private Character status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public InterviewKitInterviewMap() {
    }

    public InterviewKitInterviewMap(Integer interviewKitInterviewMapSeq, Integer companyMstrSeq, Interview interview, InterviewKit interviewKit, String interviewKitInterviewMapStatus, Character status, Integer createdBy, Date createDttm) {
        this.interviewKitInterviewMapSeq = interviewKitInterviewMapSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.interview = interview;
        this.interviewKit = interviewKit;
        this.interviewKitInterviewMapStatus = interviewKitInterviewMapStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "INTERVIEW_KIT_INTERVIEW_MAP_SEQ", unique = true, nullable = false)
    public Integer getInterviewKitInterviewMapSeq() {
        return interviewKitInterviewMapSeq;
    }

    public void setInterviewKitInterviewMapSeq(Integer interviewKitInterviewMapSeq) {
        this.interviewKitInterviewMapSeq = interviewKitInterviewMapSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @ManyToOne
    @JoinColumn(name = "INTERVIEW_SEQ", nullable = false)
    public Interview getInterview() {
        return interview;
    }


    public void setInterview(Interview interview) {
        this.interview = interview;
    }

    @ManyToOne
    @JoinColumn(name = "INTERVIEW_KIT_SEQ", nullable = false)
    public InterviewKit getInterviewKit() {
        return interviewKit;
    }

    public void setInterviewKit(InterviewKit interviewKit) {
        this.interviewKit = interviewKit;
    }

    @Column(name = "INTERVIEW_KIT_INTERVIEW_MAP_STATUS", nullable = false, length = 10)
    public String getInterviewKitInterviewMapStatus() {
        return interviewKitInterviewMapStatus;
    }

    public void setInterviewKitInterviewMapStatus(String interviewKitInterviewMapStatus) {
        this.interviewKitInterviewMapStatus = interviewKitInterviewMapStatus;
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
