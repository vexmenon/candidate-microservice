package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by prathmesh on 11/28/2017.
 */
@Entity
@Table(name = "sms_schedule_details")
public class SmsScheduleDetails implements Serializable{

    private Integer smsScheduleDetailsSeq;
    private Integer companyMstrSeq;
    private String scheduleType;
    private String scheduleStatus;
    private char status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public SmsScheduleDetails() {
    }

    public SmsScheduleDetails(Integer companyMstrSeq, String scheduleType, String scheduleStatus,char status, Integer createdBy, Date createDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.scheduleType = scheduleType;
        this.scheduleStatus = scheduleStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SMS_SCHEDULE_DETAIL_SEQ", nullable = false)
    public Integer getSmsScheduleDetailsSeq() {
        return smsScheduleDetailsSeq;
    }

    public void setSmsScheduleDetailsSeq(Integer smsScheduleDetailsSeq) {
        this.smsScheduleDetailsSeq = smsScheduleDetailsSeq;
    }

    @Column(nullable = false, name = "COMPANY_MSTR_SEQ")
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "SCHEDULE_TYPE", nullable = false)
    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    @Column(nullable = false,name = "SCHEDULE_STATUS")
    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }


    @Column(name = "STATUS", nullable = false)
    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Column(name = "CREATED_BY")
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name = "CREATE_DTTM")
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

    @Column(name = "UPDATE_DTTM")
    public Date getUpdateDttm() {
        return updateDttm;
    }

    public void setUpdateDttm(Date updateDttm) {
        this.updateDttm = updateDttm;
    }
}
