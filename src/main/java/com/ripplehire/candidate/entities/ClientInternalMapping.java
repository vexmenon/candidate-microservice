package com.ripplehire.candidate.entities;

// Generated Feb 6, 2015 4:18:05 PM by Hibernate Tools 4.0.0

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * ClientCustomMapping generated by hbm2java
 */
@Entity
@Table(name = "client_internal_mapping")
public class ClientInternalMapping implements java.io.Serializable {

    private Integer clientInternalMappingSeq;
    private int companyMstrSeq;
    private String source;
    private String target;
    private String type;
    private char status;
    private int createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public ClientInternalMapping() {
    }

    public ClientInternalMapping(int companyMstrSeq, String source,
                                 String target, char status, int createdBy, Date createDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.source = source;
        this.target = target;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    public ClientInternalMapping(int companyMstrSeq, String internalKey,
                                 String externalKey, char status, int createdBy, Date createDttm,
                                 Integer updatedBy, Date updateDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "CLIENT_INTERNAL_MAPPING_SEQ", unique = true, nullable = false)
    public Integer getClientInternalMappingSeq() {
        return this.clientInternalMappingSeq;
    }

    public void setClientInternalMappingSeq(Integer clientInternalMappingSeq) {
        this.clientInternalMappingSeq = clientInternalMappingSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public int getCompanyMstrSeq() {
        return this.companyMstrSeq;
    }

    public void setCompanyMstrSeq(int companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "SOURCE", nullable = false, length = 50)
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Column(name = "TARGET", nullable = false, length = 50)
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Column(name = "TYPE", nullable = false, length = 50)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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