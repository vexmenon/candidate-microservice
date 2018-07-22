package com.ripplehire.candidate.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "interview_schedule_history")
public class InterviewScheduleHistory implements Serializable {
    private int interviewScheduleHistorySeq;
    private Interview interview;
    private InterviewScheduleStatusMstr interviewScheduleStatusMstr;
    private String comment;
    private char status;
    private int companyMstrSeq;
    private int createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;
    private String historyType;

    public InterviewScheduleHistory() {
    }

    public InterviewScheduleHistory(int interviewScheduleHistorySeq, Interview interview, InterviewScheduleStatusMstr interviewScheduleStatusMstr, String comment, char status) {
        this.interviewScheduleHistorySeq = interviewScheduleHistorySeq;
        this.interview = interview;
        this.interviewScheduleStatusMstr = interviewScheduleStatusMstr;
        this.comment = comment;
        this.status = status;
    }

    public InterviewScheduleHistory(int interviewScheduleHistorySeq, Interview interview, InterviewScheduleStatusMstr interviewScheduleStatusMstr, String comment, char status, int companyMstrSeq, int createdBy, Date createDttm, Integer updatedBy, Date updateDttm,
                                    String historyType) {
        this.interviewScheduleHistorySeq = interviewScheduleHistorySeq;
        this.interview = interview;
        this.interviewScheduleStatusMstr = interviewScheduleStatusMstr;
        this.comment = comment;
        this.status = status;
        this.companyMstrSeq = companyMstrSeq;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
        this.historyType = historyType;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "INTERVIEW_SCHEDULE_HISTORY_SEQ", unique = true, nullable = false)
    public int getInterviewScheduleHistorySeq() {
        return interviewScheduleHistorySeq;
    }

    public void setInterviewScheduleHistorySeq(int interviewScheduleHistorySeq) {
        this.interviewScheduleHistorySeq = interviewScheduleHistorySeq;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERVIEW_SEQ", nullable = false)
    public Interview getInterview() {
        return interview;
    }

    public void setInterview(Interview interview) {
        this.interview = interview;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERVIEW_SCHEDULE_STATUS_MSTR_SEQ", nullable = false)
    public InterviewScheduleStatusMstr getInterviewScheduleStatusMstr() {
        return interviewScheduleStatusMstr;
    }

    public void setInterviewScheduleStatusMstr(InterviewScheduleStatusMstr interviewScheduleStatusMstr) {
        this.interviewScheduleStatusMstr = interviewScheduleStatusMstr;
    }

    @Column(name = "COMMENT", length = 1000)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Column(name = "HISTORY_TYPE", length = 50, nullable = false)
    public String getHistoryType() {
        return historyType;
    }

    public void setHistoryType(String historyType) {
        this.historyType = historyType;
    }

    @Column(name = "STATUS", nullable = false, length = 1)
    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
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
