package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by mahesh on 27/4/17.
 */
@Entity
@Table(name = "currency_conversion")
public class CurrencyConversion {
    private Integer currencyConversionSeq;
    private Integer companySeq;
    private CurrencyMstr currencyMstr;
    private String conversionRate;
    private Character status;
    private Integer createdBy;
    private Date createdDttm;
    private Integer updatedBy;
    private Date updatedDttm;

    public CurrencyConversion() {
    }

    public CurrencyConversion(Integer companySeq, CurrencyMstr currencyMstr, String conversionRate, Character status,
                              Integer createdBy, Date createdDttm, Integer updatedBy, Date updatedDttm) {
        this.companySeq = companySeq;
        this.currencyMstr = currencyMstr;
        this.conversionRate = conversionRate;
        this.status = status;
        this.createdBy = createdBy;
        this.createdDttm = createdDttm;
        this.updatedBy = updatedBy;
        this.updatedDttm = updatedDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "CURRENCY_CONVERSION_SEQ", unique = true, nullable = false)
    public Integer getCurrencyConversionSeq() {
        return currencyConversionSeq;
    }

    public void setCurrencyConversionSeq(Integer currencyConversionSeq) {
        this.currencyConversionSeq = currencyConversionSeq;
    }

    @Column(name = "COMPANY_SEQ", nullable = false, length = 50)
    public Integer getCompanySeq() {
        return companySeq;
    }

    public void setCompanySeq(Integer companySeq) {
        this.companySeq = companySeq;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURRENCY_MSTR_SEQ", nullable = false)
    public CurrencyMstr getCurrencyMstr() {
        return currencyMstr;
    }

    public void setCurrencyMstr(CurrencyMstr currencyMstr) {
        this.currencyMstr = currencyMstr;
    }

    @Column(name = "CONVERSION_RATE", length = 1)
    public String getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(String conversionRate) {
        this.conversionRate = conversionRate;
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
    @Column(name = "CREATED_DTTM", length = 19)
    public Date getCreatedDttm() {
        return this.createdDttm;
    }

    public void setCreatedDttm(Date createdDttm) {
        this.createdDttm = createdDttm;
    }

    @Column(name = "UPDATED_BY")
    public Integer getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_DTTM", length = 19)
    public Date getUpdatedDttm() {
        return this.updatedDttm;
    }

    public void setUpdatedDttm(Date updatedDttm) {
        this.updatedDttm = updatedDttm;
    }
}
