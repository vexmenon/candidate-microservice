package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "interview_schedule_status_mstr")
public class InterviewScheduleStatusMstr implements Serializable {
    private int interviewScheduleStatusMstrSeq;
    private String statusName;
    private String statusCD;
    private char status;
    private int companyMstrSeq;
    private int createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;
    private Set<InterviewScheduleHistory> interviewScheduleHistories = new HashSet<>(0);

    public InterviewScheduleStatusMstr() {
    }

    public InterviewScheduleStatusMstr(int interviewScheduleStatusMstrSeq, String statusName, String statusCD, char status, int companyMstrSeq, int createdBy, Date createDttm) {
        this.interviewScheduleStatusMstrSeq = interviewScheduleStatusMstrSeq;
        this.statusName = statusName;
        this.statusCD = statusCD;
        this.status = status;
        this.companyMstrSeq = companyMstrSeq;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    public InterviewScheduleStatusMstr(int interviewScheduleStatusMstrSeq, String statusName, String statusCD, char status, int companyMstrSeq, int createdBy, Date createDttm, Integer updatedBy, Date updateDttm, Set<InterviewScheduleHistory> interviewScheduleHistories) {
        this.interviewScheduleStatusMstrSeq = interviewScheduleStatusMstrSeq;
        this.statusName = statusName;
        this.statusCD = statusCD;
        this.status = status;
        this.companyMstrSeq = companyMstrSeq;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
        this.interviewScheduleHistories = interviewScheduleHistories;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "INTERVIEW_SCHEDULE_STATUS_MSTR_SEQ", unique = true, nullable = false)
    public int getInterviewScheduleStatusMstrSeq() {
        return interviewScheduleStatusMstrSeq;
    }

    public void setInterviewScheduleStatusMstrSeq(int interviewScheduleStatusMstrSeq) {
        this.interviewScheduleStatusMstrSeq = interviewScheduleStatusMstrSeq;
    }

    @Column(name = "STATUS_NAME", nullable = false, length = 25)
    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Column(name = "STATUS_CD", nullable = false, length = 20)
    public String getStatusCD() {
        return statusCD;
    }

    public void setStatusCD(String statusCD) {
        this.statusCD = statusCD;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewScheduleStatusMstr")
    public Set<InterviewScheduleHistory> getInterviewScheduleHistories() {
        return interviewScheduleHistories;
    }

    public void setInterviewScheduleHistories(Set<InterviewScheduleHistory> interviewScheduleHistories) {
        this.interviewScheduleHistories = interviewScheduleHistories;
    }
}
