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
@Table(name = "vendor_category_mapping")
public class VendorCategoryMapping implements java.io.Serializable {

    private Integer vendorCategoryMappingSeq;
    private Integer companyMstrSeq;
    private VendorMstr vendorMstr;
    private VendorCategoryMstr vendorCategoryMstr;
    private Character status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public VendorCategoryMapping() {
    }

    public VendorCategoryMapping(Integer companyMstrSeq, VendorMstr vendorMstr, VendorCategoryMstr vendorCategoryMstr,
                          Character status, Integer createdBy, Date createDttm,
                          Integer updatedBy, Date updateDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.vendorMstr = vendorMstr;
        this.vendorCategoryMstr = vendorCategoryMstr;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "VENDOR_CATEGORY_MAPPING_SEQ", unique = true, nullable = false)
    public Integer getVendorCategoryMappingSeq() {
        return this.vendorCategoryMappingSeq;
    }

    public void setVendorCategoryMappingSeq(Integer vendorCategoryMappingSeq) {
        this.vendorCategoryMappingSeq = vendorCategoryMappingSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ")
    public Integer getCompanyMstrSeq() {
        return this.companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VENDOR_MSTR_SEQ")
    public VendorMstr getVendorMstr() {
        return vendorMstr;
    }

    public void setVendorMstr(VendorMstr vendorMstr) {
        this.vendorMstr = vendorMstr;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VENDOR_CATEGORY_MSTR_SEQ")
    public VendorCategoryMstr getVendorCategoryMstr() {
        return vendorCategoryMstr;
    }

    public void setVendorCategoryMstr(VendorCategoryMstr vendorCategoryMstr) {
        this.vendorCategoryMstr = vendorCategoryMstr;
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

}
