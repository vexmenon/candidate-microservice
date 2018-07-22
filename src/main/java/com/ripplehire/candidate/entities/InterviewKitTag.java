package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "interview_kit_tag")
public class InterviewKitTag implements Serializable {
    private Integer interviewKitTagSeq;
    private Integer companyMstrSeq;
    private InterviewKitTagMstr interviewKitTagMstr;
    private InterviewKit interviewKit;
    private String interviewKitTagStatus;
    private Character status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public InterviewKitTag() {
    }

    public InterviewKitTag(Integer interviewKitTagSeq, Integer companyMstrSeq, InterviewKitTagMstr interviewKitTagMstr, InterviewKit interviewKit, String interviewKitTagStatus, Character status, Integer createdBy, Date createDttm, Integer updatedBy, Date updateDttm) {
        this.interviewKitTagSeq = interviewKitTagSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.interviewKitTagMstr = interviewKitTagMstr;
        this.interviewKit = interviewKit;
        this.interviewKitTagStatus = interviewKitTagStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
    }

    public InterviewKitTag(Integer interviewKitTagSeq, Integer companyMstrSeq, InterviewKitTagMstr interviewKitTagMstr, InterviewKit interviewKit, String interviewKitTagStatus, Character status, Integer createdBy, Date createDttm) {
        this.interviewKitTagSeq = interviewKitTagSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.interviewKitTagMstr = interviewKitTagMstr;
        this.interviewKit = interviewKit;
        this.interviewKitTagStatus = interviewKitTagStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "INTERVIEW_KIT_TAG_SEQ", unique = true, nullable = false)
    public Integer getInterviewKitTagSeq() {
        return interviewKitTagSeq;
    }

    public void setInterviewKitTagSeq(Integer interviewKitTagSeq) {
        this.interviewKitTagSeq = interviewKitTagSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @ManyToOne
    @JoinColumn(name = "INTERVIEW_KIT_TAG_MSTR_SEQ", nullable = false)
    public InterviewKitTagMstr getInterviewKitTagMstr() {
        return interviewKitTagMstr;
    }

    public void setInterviewKitTagMstr(InterviewKitTagMstr interviewKitTagMstr) {
        this.interviewKitTagMstr = interviewKitTagMstr;
    }

    @ManyToOne
    @JoinColumn(name = "INTERVIEW_KIT_SEQ", nullable = false)
    public InterviewKit getInterviewKit() {
        return interviewKit;
    }

    public void setInterviewKit(InterviewKit interviewKit) {
        this.interviewKit = interviewKit;
    }

    @Column(name = "INTERVIEW_KIT_TAG_STATUS", nullable = false, length = 10)
    public String getInterviewKitTagStatus() {
        return interviewKitTagStatus;
    }

    public void setInterviewKitTagStatus(String interviewKitTagStatus) {
        this.interviewKitTagStatus = interviewKitTagStatus;
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
