package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by ripplehireuser1 on 3/5/18.
 */

@Entity
@Table(name = "excel_export_log")
public class ExcelExportLog {

    private Integer excelExportLogSeq;
    private Integer companyMstrSeq;
    private String exportType;
    private Integer exportCompanyMstrSeq;
    private Character status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public ExcelExportLog(Integer companyMstrSeq, String exportType, Integer exportCompanyMstrSeq, Character status, Integer createdBy, Date createDttm) {
        this.companyMstrSeq = companyMstrSeq;
        this.exportType = exportType;
        this.exportCompanyMstrSeq = exportCompanyMstrSeq;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "EXCEL_EXPORT_LOG_SEQ", unique = true, nullable = false)
    public Integer getExcelExportLogSeq() {
        return excelExportLogSeq;
    }

    public void setExcelExportLogSeq(Integer excelExportLogSeq) {
        this.excelExportLogSeq = excelExportLogSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "EXPORT_TYPE", nullable = false)
    public String getExportType() {
        return exportType;
    }

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    @Column(name = "EXPORT_COMPANY_MSTR_SEQ", nullable = false)
    public Integer getExportCompanyMstrSeq() {
        return exportCompanyMstrSeq;
    }

    public void setExportCompanyMstrSeq(Integer exportCompanyMstrSeq) {
        this.exportCompanyMstrSeq = exportCompanyMstrSeq;
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
