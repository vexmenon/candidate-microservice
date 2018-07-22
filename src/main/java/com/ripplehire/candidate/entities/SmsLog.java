package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by mahesh on 17/6/17.
 */
@Entity
@Table(name="sms_log")
public class SmsLog implements Serializable {
    private Integer smsLogSeq;
    private Integer companyMstrSeq;
    private String phoneNo;
    private Integer userProfileSeq;
    private String message;
    private String transactionStatus;
    private String transactionId;
    private Integer smsScheduleDetailSeq;
    private char status;
    private int createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public SmsLog() {
    }

    public SmsLog(Integer companyMstrSeq, String phoneNo, Integer userProfileSeq, String message, String transactionStatus,Integer smsScheduleDetailSeq, char status, int createdBy, Date createDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.phoneNo = phoneNo;
        this.userProfileSeq=userProfileSeq;
        this.message = message;
        this.transactionStatus = transactionStatus;
        this.smsScheduleDetailSeq=smsScheduleDetailSeq;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    public SmsLog(Integer companyMstrSeq, String phoneNo, Integer userProfileSeq, String message, String transactionStatus,Integer smsScheduleDetailSeq, char status, int createdBy, Date createDttm, Integer updatedBy, Date updateDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.phoneNo = phoneNo;
        this.userProfileSeq=userProfileSeq;
        this.message = message;
        this.transactionStatus = transactionStatus;
        this.smsScheduleDetailSeq=smsScheduleDetailSeq;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "SMS_LOG_SEQ", unique = true, nullable = false)
    public Integer getSmsLogSeq() {
        return smsLogSeq;
    }

    public void setSmsLogSeq(Integer smsLogSeq) {
        this.smsLogSeq = smsLogSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "PHONE_NO", nullable = false, length = 20)
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Column(name = "USER_PROFILE_SEQ", nullable = true)
    public Integer getUserProfileSeq() {
        return userProfileSeq;
    }

    public void setUserProfileSeq(Integer userProfileSeq) {
        this.userProfileSeq = userProfileSeq;
    }

    @Column(name = "MESSAGE", nullable = false)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Column(name = "TRANSACTION_STATUS", nullable = false)
    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @Column(name = "TRANSACTION_ID", nullable = false)
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Column(name = "SMS_SCHEDULE_DETAIL_SEQ")
    public Integer getSmsScheduleDetailSeq() {
        return smsScheduleDetailSeq;
    }

    public void setSmsScheduleDetailSeq(Integer smsScheduleDetailSeq) {
        this.smsScheduleDetailSeq = smsScheduleDetailSeq;
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
