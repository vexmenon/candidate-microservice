package com.ripplehire.candidate.entities;


import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "interview_schedule_cancel_reason")
public class InterviewScheduleCancelReason {
    private Integer interviewScheduleCancelReasonSeq;
    private String cancelReason;
    private int companyMstrSeq;
    private int createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;
    private char status;
    private String type;

    public InterviewScheduleCancelReason() {
    }

    public InterviewScheduleCancelReason(Integer interviewScheduleCancelReasonSeq, String cancelReason, int companyMstrSeq, int createdBy, Date createDttm, char status, String type) {
        this.interviewScheduleCancelReasonSeq = interviewScheduleCancelReasonSeq;
        this.cancelReason = cancelReason;
        this.companyMstrSeq = companyMstrSeq;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.status = status;
        this.type = type;
    }

    public InterviewScheduleCancelReason(Integer interviewScheduleCancelReasonSeq, String cancelReason, int companyMstrSeq, int createdBy, Date createDttm, Integer updatedBy, Date updateDttm, char status, String type) {
        this.interviewScheduleCancelReasonSeq = interviewScheduleCancelReasonSeq;
        this.cancelReason = cancelReason;
        this.companyMstrSeq = companyMstrSeq;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
        this.status = status;
        this.type = type;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "INTERVIEW_SCHEDULE_CANCEL_REASON_SEQ", unique = true, nullable = false)
    public Integer getInterviewScheduleCancelReasonSeq() {
        return interviewScheduleCancelReasonSeq;
    }

    public void setInterviewScheduleCancelReasonSeq(Integer interviewScheduleCancelReasonSeq) {
        this.interviewScheduleCancelReasonSeq = interviewScheduleCancelReasonSeq;
    }

    @Column(name = "CANCEL_REASON", nullable = false, length = 100)
    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public int getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(int companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "CREATED_BY", nullable = false)
    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DTTM", nullable = false)
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

    @Column(name = "STATUS", nullable = false, length = 1)
    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Column(name = "TYPE", nullable = false, length = 15)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
