package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by ripplehireuser1 on 16/2/18.
 */

@Entity
@Table(name = "url_mapping")
public class URLMapping implements java.io.Serializable {

    private long urlMappingSeq;
    private Integer companyMstrSeq;
    private String shortURL;
    private String longURL;
    private Integer hitCount;
    private Character status;
    private Integer createdBy;
    private Date createddttm;
    private Integer updatedBy;
    private Date updateddttm;

    public URLMapping() {
    }

    public URLMapping(Long urlMappingSeq, Integer companyMstrSeq, String shortURL, String longURL, Character status, Integer createdBy, Date createddttm, Integer updatedBy, Date updateddttm) {
        this.urlMappingSeq = urlMappingSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.shortURL = shortURL;
        this.longURL = longURL;
        this.status = status;
        this.createdBy = createdBy;
        this.createddttm = createddttm;
        this.updatedBy = updatedBy;
        this.updateddttm = updateddttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "URL_MAPPING_SEQ", unique = true, nullable = false)
    public long getUrlMappingSeq() {
        return urlMappingSeq;
    }

    public void setUrlMappingSeq(long urlMappingSeq) {
        this.urlMappingSeq = urlMappingSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public int getCompanyMstrSeq() {
        return this.companyMstrSeq;
    }

    public void setCompanyMstrSeq(int companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "SHORT_URL", unique = true, nullable = false)
    public String getShortURL() {
        return shortURL;
    }

    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }

    @Column(name = "LONG_URL", unique = true, nullable = false)
    public String getLongURL() {
        return longURL;
    }

    public void setLongURL(String longURL) {
        this.longURL = longURL;
    }

    @Column(name = "HIT_COUNT")
    public Integer getHitCount() {
        return hitCount;
    }

    public void setHitCount(Integer hitCount) {
        this.hitCount = hitCount;
    }

    @Column(name = "STATUS")
    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
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
    public Date getCreateddttm() {
        return createddttm;
    }

    public void setCreateddttm(Date createddttm) {
        this.createddttm = createddttm;
    }

    @Column(name = "UPDATED_BY")
    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Column(name = "UPDATE_DTTM")
    public Date getUpdateddttm() {
        return updateddttm;
    }

    public void setUpdateddttm(Date updateddttm) {
        this.updateddttm = updateddttm;
    }
}