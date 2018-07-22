package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "timezone_mstr")
public class TimezoneMstr {

    private Integer timezoneMstrSeq;
    private String timezoneDescr;
    private String timezoneName;
    private String gmtOffset;
    private Character status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;
    private Set<InterviewSchedule> interviewSchedules = new HashSet<InterviewSchedule>(0);

    public TimezoneMstr() {
    }

    public TimezoneMstr(Integer timezoneMstrSeq, String timezoneDescr, String timezoneName, String gmtOffset, Character status, Integer createdBy, Date createDttm) {
        this.timezoneMstrSeq = timezoneMstrSeq;
        this.timezoneDescr = timezoneDescr;
        this.timezoneName = timezoneName;
        this.gmtOffset = gmtOffset;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    public TimezoneMstr(Integer timezoneMstrSeq, String timezoneDescr, String timezoneName, String gmtOffset, Character status, Integer createdBy, Date createDttm, Integer updatedBy, Date updateDttm, Set<InterviewSchedule> interviewSchedules) {
        this.timezoneMstrSeq = timezoneMstrSeq;
        this.timezoneDescr = timezoneDescr;
        this.timezoneName = timezoneName;
        this.gmtOffset = gmtOffset;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
        this.interviewSchedules = interviewSchedules;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "TIMEZONE_MSTR_SEQ", unique = true, nullable = false)
    public Integer getTimezoneMstrSeq() {
        return timezoneMstrSeq;
    }

    public void setTimezoneMstrSeq(Integer timezoneMstrSeq) {
        this.timezoneMstrSeq = timezoneMstrSeq;
    }

    @Column(name = "TIMEZONE_DESC", length = 50, nullable = false)
    public String getTimezoneDescr() {
        return timezoneDescr;
    }

    public void setTimezoneDescr(String timezoneDescr) {
        this.timezoneDescr = timezoneDescr;
    }

    @Column(name = "TIMEZONE_NAME", length = 50, nullable = false)
    public String getTimezoneName() {
        return timezoneName;
    }

    public void setTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
    }

    @Column(name = "GMT_OFFSET", length = 50, nullable = false)
    public String getGmtOffset() {
        return gmtOffset;
    }

    public void setGmtOffset(String gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    @Column(name = "STATUS", length = 1, nullable = false)
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "timezoneMstr")
    public Set<InterviewSchedule> getInterviewSchedules() {
        return this.interviewSchedules;
    }

    public void setInterviewSchedules(Set<InterviewSchedule> interviewSchedules) {
        this.interviewSchedules = interviewSchedules;
    }
}
