package com.ripplehire.candidate.entities;
// Generated 30 Mar, 2017 11:21:44 AM by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * InterviewTask generated by hbm2java
 */
@Entity
@Table(name = "interview_task")
public class InterviewTask implements java.io.Serializable {

    private Integer interviewTaskSeq;
    private InterviewSchedule interviewSchedule;
    private InterviewScheduleAttendee interviewScheduleAttendee;
    private TaskDetails taskDetails;
    private int companyMstrSeq;
    private char status;
    private int createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public InterviewTask() {
    }

    public InterviewTask(InterviewSchedule interviewSchedule, TaskDetails taskDetails, int companyMstrSeq, char status,
                         int createdBy, Date createDttm) {
        this.interviewSchedule = interviewSchedule;
        this.taskDetails = taskDetails;
        this.companyMstrSeq = companyMstrSeq;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    public InterviewTask(InterviewSchedule interviewSchedule, InterviewScheduleAttendee interviewScheduleAttendee,
                         TaskDetails taskDetails, int companyMstrSeq, char status, int createdBy, Date createDttm, Integer updatedBy,
                         Date updateDttm) {
        this.interviewSchedule = interviewSchedule;
        this.interviewScheduleAttendee = interviewScheduleAttendee;
        this.taskDetails = taskDetails;
        this.companyMstrSeq = companyMstrSeq;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "INTERVIEW_TASK_SEQ", unique = true, nullable = false)
    public Integer getInterviewTaskSeq() {
        return this.interviewTaskSeq;
    }

    public void setInterviewTaskSeq(Integer interviewTaskSeq) {
        this.interviewTaskSeq = interviewTaskSeq;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERVIEW_SCHEDULE_SEQ", nullable = false)
    public InterviewSchedule getInterviewSchedule() {
        return this.interviewSchedule;
    }

    public void setInterviewSchedule(InterviewSchedule interviewSchedule) {
        this.interviewSchedule = interviewSchedule;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERVIEW_SCHEDULE_ATTENDEE_SEQ")
    public InterviewScheduleAttendee getInterviewScheduleAttendee() {
        return this.interviewScheduleAttendee;
    }

    public void setInterviewScheduleAttendee(InterviewScheduleAttendee interviewScheduleAttendee) {
        this.interviewScheduleAttendee = interviewScheduleAttendee;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASK_DETAILS_SEQ", nullable = false)
    public TaskDetails getTaskDetails() {
        return this.taskDetails;
    }

    public void setTaskDetails(TaskDetails taskDetails) {
        this.taskDetails = taskDetails;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public int getCompanyMstrSeq() {
        return this.companyMstrSeq;
    }

    public void setCompanyMstrSeq(int companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
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