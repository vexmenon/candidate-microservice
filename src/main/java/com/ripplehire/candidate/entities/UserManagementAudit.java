package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by ripplehireuser1 on 7/2/18.
 */

@Entity
@Table(name = "user_management_audit")
public class UserManagementAudit implements java.io.Serializable {

    private Integer userManagementAuditSeq;
    private Integer companyMstrSeq;
    private Integer userProfileSeq;
    private String primitiveFields;
    private Character status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public UserManagementAudit() {
    }

    public UserManagementAudit(Integer companyMstrSeq, Integer userProfileSeq, String primitiveFields, Character status, Integer createdBy, Date createDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.userProfileSeq = userProfileSeq;
        this.primitiveFields = primitiveFields;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "USER_MANAGEMENT_AUDIT_SEQ", unique = true, nullable = false)
    public Integer getUserManagementAuditSeq() {
        return userManagementAuditSeq;
    }

    public void setUserManagementAuditSeq(Integer userManagementAuditSeq) {
        this.userManagementAuditSeq = userManagementAuditSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "USER_PROFILE_SEQ", nullable = false)
    public Integer getUserProfileSeq() {
        return userProfileSeq;
    }

    public void setUserProfileSeq(Integer userProfileSeq) {
        this.userProfileSeq = userProfileSeq;
    }

    @Column(name = "PRIMITIVE_FIELDS")
    public String getPrimitiveFields() {
        return primitiveFields;
    }

    public void setPrimitiveFields(String primitiveFields) {
        this.primitiveFields = primitiveFields;
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

    @Column(name = "UPDATE_DTTM")
    public Date getUpdateDttm() {
        return updateDttm;
    }

    public void setUpdateDttm(Date updateDttm) {
        this.updateDttm = updateDttm;
    }
}
