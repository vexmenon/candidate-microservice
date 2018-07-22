package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by sagar on 15/2/18.
 */
@Entity
@Table(name = "etl_reject_reason")
public class ETLRejectReason
{

    private Integer etlRejectReasonSeq;
    private int etlFileLogSeq;
    private int companyMstrSeq;
    private String applicantId;
    private String jobId;
    private String rhId;
    private String email;
    private String candidateStep;
    private String candidatesubStatus;
    private Date rejectDate;
    private String importStatus;
    private String importResult;
    private String importResultMessage;
    private char status;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ETL_REJECT_REASON_SEQ", unique = true, nullable = false)
    public Integer getEtlRejectReasonSeq() {
        return etlRejectReasonSeq;
    }

    public void setEtlRejectReasonSeq(Integer etlRejectReasonSeq) {
        this.etlRejectReasonSeq = etlRejectReasonSeq;
    }

    @Column(name = "ETL_FILE_LOG_SEQ", nullable = false)
    public int getEtlFileLogSeq() {
        return etlFileLogSeq;
    }

    public void setEtlFileLogSeq(int etlFileLogSeq) {
        this.etlFileLogSeq = etlFileLogSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public int getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(int companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "APPLICANT_ID", length = 50)
    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    @Column(name = "JOB_ID", length = 50)
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Column(name = "RHID", length = 50)
    public String getRhId() {
        return rhId;
    }

    public void setRhId(String rhId) {
        this.rhId = rhId;
    }

    @Column(name = "EMAIL", length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "CANDIDATE_STEP", length = 50)
    public String getCandidateStep() {
        return candidateStep;
    }

    public void setCandidateStep(String candidateStep) {
        this.candidateStep = candidateStep;
    }

    @Column(name = "CANDIDATE_SUB_STATUS", length = 50)
    public String getCandidatesubStatus() {
        return candidatesubStatus;
    }

    public void setCandidatesubStatus(String candidatesubStatus) {
        this.candidatesubStatus = candidatesubStatus;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "REJECT_DATE", length = 10)
    public Date getRejectDate() {
        return rejectDate;
    }

    public void setRejectDate(Date rejectDate) {
        this.rejectDate = rejectDate;
    }

    @Column(name = "IMPORT_STATUS", nullable = false, length = 50)
    public String getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    @Column(name = "IMPORT_RESULT")
    public String getImportResult() {
        return importResult;
    }

    public void setImportResult(String importResult) {
        this.importResult = importResult;
    }

    @Column(name = "IMPORT_RESULT_MESSAGE")
    public String getImportResultMessage() {
        return importResultMessage;
    }

    public void setImportResultMessage(String importResultMessage) {
        this.importResultMessage = importResultMessage;
    }

    @Column(name = "STATUS", nullable = false, length = 1)
    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DTTM", nullable = false, length = 19)
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DTTM", length = 19)
    public Date getUpdateDttm() {
        return updateDttm;
    }

    public void setUpdateDttm(Date updateDttm) {
        this.updateDttm = updateDttm;
    }
}
