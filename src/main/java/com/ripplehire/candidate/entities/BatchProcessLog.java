package com.ripplehire.candidate.entities;

// Generated Mar 16, 2015 3:48:24 PM by Hibernate Tools 4.0.0

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * BatchProcessLog generated by hbm2java
 */
@Entity
@Table(name = "batch_process_log")
public class BatchProcessLog implements java.io.Serializable {

	private Integer batchProcessSeq;
	private String type;
	private String fileName;
    private String result;
	private String batchStatus;
    private char status;
	private int companyMstrSeq;
	private Date createDttm;
	private Date updatedDttm;

	public BatchProcessLog() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "BATCH_PROCESS_SEQ", unique = true, nullable = false)
	public Integer getBatchProcessSeq() {
		return this.batchProcessSeq;
	}

	public void setBatchProcessSeq(Integer batchProcessSeq) {
		this.batchProcessSeq = batchProcessSeq;
	}

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "FILE_NAME", length = 100)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

    @Column(name = "RESULT", length = 100)
    public String getResult() {        return result;    }

    public void setResult(String result) {         this.result = result;    }

    @Column(name = "BATCH_STATUS", length = 50)
	public String getBatchStatus() {
		return this.batchStatus;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

    @Column(name = "STATUS", nullable = true, length = 1)
    public char getStatus() {
        return this.status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DTTM", nullable = false, length = 19)
	public Date getCreateDttm() {
		return this.createDttm;
	}

	public void setCreateDttm(Date createdDttm) {
		this.createDttm = createdDttm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DTTM", nullable = false, length = 19)
	public Date getUpdateDttm() {
		return this.updatedDttm;
	}

	public void setUpdateDttm(Date updatedDttm) {
		this.updatedDttm = updatedDttm;
	}

}
