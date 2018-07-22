package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "internal_job_eligibility_mapping")
public class InternalJobEligibilityMapping implements Serializable {

    private Integer eligibilityMappingSeq;
    private Integer companyMstrSeq;
    private String jobCriteria;
    private String employeeCriteria;
    private String criteriaCondition;
    private char status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public InternalJobEligibilityMapping() {
    }

    public InternalJobEligibilityMapping(Integer companyMstrSeq, String jobCriteria, String employeeCriteria, String criteriaCondition) {
        this.companyMstrSeq = companyMstrSeq;
        this.jobCriteria = jobCriteria;
        this.employeeCriteria = employeeCriteria;
        this.criteriaCondition = criteriaCondition;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ELIGIBILITY_MAPPING_SEQ", unique = true, nullable = false)
    public Integer getEligibilityMappingSeq() {
        return eligibilityMappingSeq;
    }

    public void setEligibilityMappingSeq(Integer eligibilityMappingSeq) {
        this.eligibilityMappingSeq = eligibilityMappingSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "JOB_CRITERIA", length = 1000)
    public String getJobCriteria() {
        return jobCriteria;
    }

    public void setJobCriteria(String jobCriteria) {
        this.jobCriteria = jobCriteria;
    }

    @Column(name = "EMPLOYEE_CRITERIA", length = 1000)
    public String getEmployeeCriteria() {
        return employeeCriteria;
    }

    public void setEmployeeCriteria(String employeeCriteria) {
        this.employeeCriteria = employeeCriteria;
    }

    @Column(name = "CRITERIA_CONDITION", length = 50)
    public String getCriteriaCondition() {
        return criteriaCondition;
    }

    public void setCriteriaCondition(String criteriaCondition) {
        this.criteriaCondition = criteriaCondition;
    }

    @Column(name = "STATUS", nullable = false, length = 1)
    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Column(name = "CREATED_BY", nullable = false)
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.DATE)
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

    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATE_DTTM")
    public Date getUpdateDttm() {
        return updateDttm;
    }

    public void setUpdateDttm(Date updateDttm) {
        this.updateDttm = updateDttm;
    }
}
