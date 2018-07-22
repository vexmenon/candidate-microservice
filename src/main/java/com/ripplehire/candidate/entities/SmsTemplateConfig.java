package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by prathmesh on 11/28/2017.
 */
@Entity
@Table(name = "sms_template_config")
public class SmsTemplateConfig implements Serializable {

    private Integer smsTemplateConfigSeq;
    private Integer companyMstrSeq;
    private String smsTemplateId;
    private String smsTemplateName;
    private String templateType;
    private Character sendSms;
    private char status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "SMS_TEMPLATE_CONFIG_SEQ", unique = true, nullable = false)
    public Integer getSmsTemplateConfigSeq() {
        return smsTemplateConfigSeq;
    }

    public void setSmsTemplateConfigSeq(Integer smsTemplateConfigSeq) {
        this.smsTemplateConfigSeq = smsTemplateConfigSeq;
    }

    @Column(name="COMPANY_MSTR_SEQ", nullable = false)
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(nullable = false, name = "SMS_TEMPLATE_ID")
    public String getSmsTemplateId() {
        return smsTemplateId;
    }

    public void setSmsTemplateId(String smsTemplateId) {
        this.smsTemplateId = smsTemplateId;
    }

    @Column(name = "SMS_TEMPLATE_NAME", nullable = false)
    public String getSmsTemplateName() {
        return smsTemplateName;
    }

    public void setSmsTemplateName(String smsTemplateName) {
        this.smsTemplateName = smsTemplateName;
    }

    @Column(name = "SEND_SMS", nullable = false)
    public Character getSendSms() {
        return sendSms;
    }

    public void setSendSms(Character sendSms) {
        this.sendSms = sendSms;
    }

    @Column(nullable = false, name = "TEMPLATE_TYPE")
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
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
