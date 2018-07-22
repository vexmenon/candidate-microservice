package com.ripplehire.candidate.entities;

// Generated Mar 31, 2015 1:21:40 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * VendorMstr generated by hbm2java
 */
@Entity
@Table(name = "vendor_mstr")
public class VendorMstr implements java.io.Serializable {

    private Integer vendorMstrSeq;
    private int companyMstrSeq;
    private String vendorId;
    private String vendorName;
    private String vendorDefaultEmail;
    private String vendorDefaultPhone;
    private Integer userProfileSeq;
    private Character status;
    private Integer createdBy;
    private Integer updatedBy;
    private Date createDttm;
    private Date updateDttm;
    Set<VendorCategoryMapping> vendorCategoryMappings = new HashSet<VendorCategoryMapping>();


    public VendorMstr() {
    }

    public VendorMstr(int companyMstrSeq, String vendorId, String vendorName, String vendorDefaultEmail, String vendorDefaultPhone,
                      Date createDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorDefaultEmail = vendorDefaultEmail;
        this.vendorDefaultPhone = vendorDefaultPhone;
        this.createDttm = createDttm;
    }

    public VendorMstr(int companyMstrSeq, String vendorId, String vendorName,
                      Integer userProfileSeq, Character status, Integer createdBy,
                      Date createDttm, Set<VendorCategoryMapping> vendorCategoryMappings) {
        this.companyMstrSeq = companyMstrSeq;
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.userProfileSeq = userProfileSeq;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.vendorCategoryMappings = vendorCategoryMappings;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "VENDOR_MSTR_SEQ", unique = true, nullable = false)
    public Integer getVendorMstrSeq() {
        return this.vendorMstrSeq;
    }

    public void setVendorMstrSeq(Integer vendorMstrSeq) {
        this.vendorMstrSeq = vendorMstrSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public int getCompanyMstrSeq() {
        return this.companyMstrSeq;
    }

    public void setCompanyMstrSeq(int companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "VENDOR_ID", nullable = false, length = 50)
    public String getVendorId() {
        return this.vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Column(name = "VENDOR_NAME", nullable = false, length = 50)
    public String getVendorName() {
        return this.vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    @Column(name = "VENDOR_DEFAULT_EMAIL", nullable = false, length = 100)
    public String getVendorDefaultEmail() {
        return vendorDefaultEmail;
    }

    public void setVendorDefaultEmail(String vendorDefaultEmail) {
        this.vendorDefaultEmail = vendorDefaultEmail;
    }

    @Column(name = "VENDOR_DEFAULT_PHONE", nullable = false, length = 20)
    public String getVendorDefaultPhone() {
        return vendorDefaultPhone;
    }

    public void setVendorDefaultPhone(String vendorDefaultPhone) {
        this.vendorDefaultPhone = vendorDefaultPhone;
    }

    @Column(name = "USER_PROFILE_SEQ")
    public Integer getUserProfileSeq() {
        return this.userProfileSeq;
    }

    public void setUserProfileSeq(Integer userProfileSeq) {
        this.userProfileSeq = userProfileSeq;
    }

    @Column(name = "STATUS", length = 1)
    public Character getStatus() {
        return this.status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Column(name = "CREATED_BY")
    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
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

    @Column(name = "UPDATE_DTTM")
    public Date getUpdateDttm() {
        return updateDttm;
    }

    public void setUpdateDttm(Date updateDttm) {
        this.updateDttm = updateDttm;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vendorMstr")
    public Set<VendorCategoryMapping> getVendorCategoryMappings() {
        return vendorCategoryMappings;
    }

    public void setVendorCategoryMappings(Set<VendorCategoryMapping> vendorCategoryMappings) {
        this.vendorCategoryMappings = vendorCategoryMappings;
    }
}