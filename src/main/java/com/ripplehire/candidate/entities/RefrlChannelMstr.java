package com.ripplehire.candidate.entities;
// Generated 31 Aug, 2016 1:04:36 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * RefrlChannelMstr generated by hbm2java
 */
@Entity
@Table(name = "refrl_channel_mstr")
public class RefrlChannelMstr implements java.io.Serializable {

	private Integer refrlChannelMstrSeq;
	private int companyMstrSeq;
	private String channelType;
	private String refrlChannelCd;
	private String refrlChannelDesc;
	private String refrlChannelImg;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;
	private Set<CandidateUploadResumeDetails> candidateUploadResumeDetailses = new HashSet<CandidateUploadResumeDetails>(
			0);
	private Set<EmplRefrl> emplRefrls = new HashSet<EmplRefrl>(0);
	private Set<RefrlChannelMstrLang> refrlChannelMstrLangs = new HashSet<RefrlChannelMstrLang>(0);

	public RefrlChannelMstr() {
	}

	public RefrlChannelMstr(int companyMstrSeq, String channelType, String refrlChannelCd, char status, int createdBy,
							Date createDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.channelType = channelType;
		this.refrlChannelCd = refrlChannelCd;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public RefrlChannelMstr(int companyMstrSeq, String channelType, String refrlChannelCd, String refrlChannelDesc,
							String refrlChannelImg, char status, int createdBy, Date createDttm, Integer updatedBy, Date updateDttm,
							Set<CandidateUploadResumeDetails> candidateUploadResumeDetailses, Set<EmplRefrl> emplRefrls,
							Set<RefrlChannelMstrLang> refrlChannelMstrLangs) {
		this.companyMstrSeq = companyMstrSeq;
		this.channelType = channelType;
		this.refrlChannelCd = refrlChannelCd;
		this.refrlChannelDesc = refrlChannelDesc;
		this.refrlChannelImg = refrlChannelImg;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
		this.candidateUploadResumeDetailses = candidateUploadResumeDetailses;
		this.emplRefrls = emplRefrls;
		this.refrlChannelMstrLangs = refrlChannelMstrLangs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "REFRL_CHANNEL_MSTR_SEQ", unique = true, nullable = false)
	public Integer getRefrlChannelMstrSeq() {
		return this.refrlChannelMstrSeq;
	}

	public void setRefrlChannelMstrSeq(Integer refrlChannelMstrSeq) {
		this.refrlChannelMstrSeq = refrlChannelMstrSeq;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "CHANNEL_TYPE", nullable = false, length = 20)
	public String getChannelType() {
		return this.channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	@Column(name = "REFRL_CHANNEL_CD", nullable = false, length = 20)
	public String getRefrlChannelCd() {
		return this.refrlChannelCd;
	}

	public void setRefrlChannelCd(String refrlChannelCd) {
		this.refrlChannelCd = refrlChannelCd;
	}

	@Column(name = "REFRL_CHANNEL_DESC")
	public String getRefrlChannelDesc() {
		return this.refrlChannelDesc;
	}

	public void setRefrlChannelDesc(String refrlChannelDesc) {
		this.refrlChannelDesc = refrlChannelDesc;
	}

	@Column(name = "REFRL_CHANNEL_IMG")
	public String getRefrlChannelImg() {
		return this.refrlChannelImg;
	}

	public void setRefrlChannelImg(String refrlChannelImg) {
		this.refrlChannelImg = refrlChannelImg;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refrlChannelMstr")
	public Set<CandidateUploadResumeDetails> getCandidateUploadResumeDetailses() {
		return this.candidateUploadResumeDetailses;
	}

	public void setCandidateUploadResumeDetailses(Set<CandidateUploadResumeDetails> candidateUploadResumeDetailses) {
		this.candidateUploadResumeDetailses = candidateUploadResumeDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refrlChannelMstr")
	public Set<EmplRefrl> getEmplRefrls() {
		return this.emplRefrls;
	}

	public void setEmplRefrls(Set<EmplRefrl> emplRefrls) {
		this.emplRefrls = emplRefrls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refrlChannelMstr")
	public Set<RefrlChannelMstrLang> getRefrlChannelMstrLangs() {
		return this.refrlChannelMstrLangs;
	}

	public void setRefrlChannelMstrLangs(Set<RefrlChannelMstrLang> refrlChannelMstrLangs) {
		this.refrlChannelMstrLangs = refrlChannelMstrLangs;
	}

}
