package com.ripplehire.candidate.entities;

// Generated Oct 13, 2015 3:38:00 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * ActionReason generated by hbm2java
 */
@Entity
@Table(name = "vendor_category_mstr")
public class VendorCategoryMstr implements java.io.Serializable {

    private Integer vendorCategoryMstrSeq;
    private Integer companyMstrSeq;
    private String vendorCategoryCd;
    private String vendorCategoryLabel;
    private Character status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;
    private Set<VendorCategoryMapping> vendorCategoryMappings = new HashSet<VendorCategoryMapping>(0);

    public VendorCategoryMstr() {
    }

    public VendorCategoryMstr(Integer companyMstrSeq, String vendorCategoryCd, String vendorCategoryLabel,
                        Character status, Integer createdBy, Date createDttm,
                        Integer updatedBy, Date updateDttm, Set<VendorCategoryMapping> vendorCategoryMappings) {
        this.companyMstrSeq = companyMstrSeq;
        this.vendorCategoryCd = vendorCategoryCd;
        this.vendorCategoryLabel = vendorCategoryLabel;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
        this.vendorCategoryMappings = vendorCategoryMappings;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "VENDOR_CATEGORY_MSTR_SEQ", unique = true, nullable = false)
    public Integer getVendorCategoryMstrSeq() {
        return this.vendorCategoryMstrSeq;
    }

    public void setVendorCategoryMstrSeq(Integer vendorCategoryMstrSeq) {
        this.vendorCategoryMstrSeq = vendorCategoryMstrSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ")
    public Integer getCompanyMstrSeq() {
        return this.companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "VENDOR_CATEGORY_CD", length = 50)
    public String getVendorCategoryCd() {
        return this.vendorCategoryCd;
    }

    public void setVendorCategoryCd(String vendorCategoryCd) {
        this.vendorCategoryCd = vendorCategoryCd;
    }

    @Column(name = "VENDOR_CATEGORY_LABEL", length = 50)
    public String getVendorCategoryLabel() {
        return this.vendorCategoryLabel;
    }

    public void setVendorCategoryLabel(String vendorCategoryLabel) {
        this.vendorCategoryLabel = vendorCategoryLabel;
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
    @Column(name = "CREATE_DTTM", length = 19)
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vendorCategoryMstr")
    public Set<VendorCategoryMapping> getVendorCategoryMappings() {
        return vendorCategoryMappings;
    }

    public void setVendorCategoryMappings(Set<VendorCategoryMapping> vendorCategoryMappings) {
        this.vendorCategoryMappings = vendorCategoryMappings;
    }
}
