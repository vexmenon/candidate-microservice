package com.ripplehire.candidate.entities;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by sumedh on 3/5/2018.
 */

@Entity
@Table(name = "sms_details_log")
public class SmsDetailsLog {

    private Integer smsDetailsLogSeq;
    private Integer smsScheduleSeq;
    private Integer companySeq;
    private Integer smsTemplateSeq;
    private Integer messageTo;
    private Integer referrerCompanySeq;
    private String phoneNo;
    private String smsJobSeq;
    private char transactionStatus;
    private char status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public SmsDetailsLog(){}

    public SmsDetailsLog(Integer smsScheduleSeq, Integer companySeq, Integer smsTemplateSeq, Integer messageTo, Integer referrerCompanySeq, String phoneNo, String smsJobSeq, char transactionStatus, char status, Integer createdBy, Date createDttm) {
        this.smsScheduleSeq = smsScheduleSeq;
        this.companySeq = companySeq;
        this.smsTemplateSeq = smsTemplateSeq;
        this.messageTo = messageTo;
        this.referrerCompanySeq=referrerCompanySeq;
        this.phoneNo = phoneNo;
        this.smsJobSeq = smsJobSeq;
        this.transactionStatus = transactionStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SMS_DETAILS_LOG_SEQ", nullable = false, unique = true)
    public Integer getSmsDetailsLogSeq() {
        return smsDetailsLogSeq;
    }

    public void setSmsDetailsLogSeq(Integer smsDetailsLogSeq) {
        this.smsDetailsLogSeq = smsDetailsLogSeq;
    }

    @Column(name = "SCHEDULE_SEQ")
    public Integer getSmsScheduleSeq() {
        return smsScheduleSeq;
    }

    public void setSmsScheduleSeq(Integer smsScheduleSeq) {
        this.smsScheduleSeq = smsScheduleSeq;
    }

    @Column(name = "COMPANY_SEQ")
    public Integer getCompanySeq() {
        return companySeq;
    }

    public void setCompanySeq(Integer companySeq) {
        this.companySeq = companySeq;
    }

    @Column(name = "SMS_TEMPLATE_SEQ")
    public Integer getSmsTemplateSeq() {
        return smsTemplateSeq;
    }

    public void setSmsTemplateSeq(Integer smsTemplateSeq) {
        this.smsTemplateSeq = smsTemplateSeq;
    }

    @Column(name = "MESSAGE_TO")
    public Integer getMessageTo() {
        return messageTo;
    }

    public void setMessageTo(Integer messageTo) {
        this.messageTo = messageTo;
    }

    @Column(name = "REFERRER_COMPANY_SEQ")
    public Integer getReferrerCompanySeq() {
        return referrerCompanySeq;
    }

    public void setReferrerCompanySeq(Integer referrerCompanySeq) {
        this.referrerCompanySeq = referrerCompanySeq;
    }

    @Column(name = "PHONE_NO")
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Column(name = "SMS_JOB_SEQ")
    public String getSmsJobSeq() {
        return smsJobSeq;
    }

    public void setSmsJobSeq(String smsJobSeq) {
        this.smsJobSeq = smsJobSeq;
    }

    @Column(name = "TRANSACTION_STATUS")
    public char getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(char actionStatus) {
        this.transactionStatus = actionStatus;
    }

    @Column(name = "STATUS")
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

    @Column(name="CREATE_DTTM")
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

    @Column(name="UPDATE_DTTM")
    public Date getUpdateDttm() {
        return updateDttm;
    }

    public void setUpdateDttm(Date updateDttm) {
        this.updateDttm = updateDttm;
    }
}
