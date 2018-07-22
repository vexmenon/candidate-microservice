package com.ripplehire.candidate.entities;

// Generated Sep 1, 2014 8:08:04 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "interview_stage_mstr")
public class InterviewStageMstr implements java.io.Serializable {

	private Integer interviewStageMstrSeq;
	private int companyMstrSeq;
	private String stageDesc;
	private String refrlStatusCd;
	private int interviewPriority;
	private String roundCode;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;
	private Set<InterviewStageMstrLang> interviewStageMstrLangs = new HashSet<InterviewStageMstrLang>(
			0);
	private Set<EmplRefrl> emplRefrls = new HashSet<EmplRefrl>(0);
	private Set<ClientInterviewStatus> clientInterviewStatuses = new HashSet<ClientInterviewStatus>(
			0);
	private Set<InterviewDetails> interviewDetailses = new HashSet<InterviewDetails>(
			0);

	private Set<InterviewKitStage> interviewKitStages = new HashSet<InterviewKitStage>(0);
    private Set<InterviewKitJobStage> interviewKitJobStages = new HashSet<InterviewKitJobStage>(0);

	public InterviewStageMstr() {
	}

	public InterviewStageMstr(int companyMstrSeq, String stageDesc,
			String refrlStatusCd, int interviewPriority, String roundCode,
			char status, int createdBy, Date createDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.stageDesc = stageDesc;
		this.refrlStatusCd = refrlStatusCd;
		this.interviewPriority = interviewPriority;
		this.roundCode = roundCode;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

    public InterviewStageMstr(Integer interviewStageMstrSeq, int companyMstrSeq, String stageDesc, String refrlStatusCd, int interviewPriority, String roundCode, char status, int createdBy, Date createDttm, Integer updatedBy, Date updateDttm, Set<InterviewStageMstrLang> interviewStageMstrLangs, Set<EmplRefrl> emplRefrls, Set<ClientInterviewStatus> clientInterviewStatuses, Set<InterviewDetails> interviewDetailses, Set<InterviewKitStage> interviewKitStages, Set<InterviewKitJobStage> interviewKitJobStages) {
        this.interviewStageMstrSeq = interviewStageMstrSeq;
		this.companyMstrSeq = companyMstrSeq;
		this.stageDesc = stageDesc;
		this.refrlStatusCd = refrlStatusCd;
		this.interviewPriority = interviewPriority;
		this.roundCode = roundCode;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
		this.interviewStageMstrLangs = interviewStageMstrLangs;
		this.emplRefrls = emplRefrls;
		this.clientInterviewStatuses = clientInterviewStatuses;
		this.interviewDetailses = interviewDetailses;
		this.interviewKitStages = interviewKitStages;
        this.interviewKitJobStages = interviewKitJobStages;
    }

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "INTERVIEW_STAGE_MSTR_SEQ", unique = true, nullable = false)
	public Integer getInterviewStageMstrSeq() {
		return this.interviewStageMstrSeq;
	}

	public void setInterviewStageMstrSeq(Integer interviewStageMstrSeq) {
		this.interviewStageMstrSeq = interviewStageMstrSeq;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "STAGE_DESC", nullable = false, length = 100)
	public String getStageDesc() {
		return this.stageDesc;
	}

	public void setStageDesc(String stageDesc) {
		this.stageDesc = stageDesc;
	}

	@Column(name = "REFRL_STATUS_CD", nullable = false, length = 20)
	public String getRefrlStatusCd() {
		return this.refrlStatusCd;
	}

	public void setRefrlStatusCd(String refrlStatusCd) {
		this.refrlStatusCd = refrlStatusCd;
	}

	@Column(name = "INTERVIEW_PRIORITY", nullable = false)
	public int getInterviewPriority() {
		return this.interviewPriority;
	}

	public void setInterviewPriority(int interviewPriority) {
		this.interviewPriority = interviewPriority;
	}

	@Column(name = "ROUND_CODE", nullable = false, length = 20)
	public String getRoundCode() {
		return this.roundCode;
	}

	public void setRoundCode(String roundCode) {
		this.roundCode = roundCode;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewStageMstr")
	public Set<InterviewStageMstrLang> getInterviewStageMstrLangs() {
		return this.interviewStageMstrLangs;
	}

	public void setInterviewStageMstrLangs(
			Set<InterviewStageMstrLang> interviewStageMstrLangs) {
		this.interviewStageMstrLangs = interviewStageMstrLangs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewStageMstr")
	public Set<EmplRefrl> getEmplRefrls() {
		return this.emplRefrls;
	}

	public void setEmplRefrls(Set<EmplRefrl> emplRefrls) {
		this.emplRefrls = emplRefrls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewStageMstr")
	public Set<ClientInterviewStatus> getClientInterviewStatuses() {
		return this.clientInterviewStatuses;
	}

	public void setClientInterviewStatuses(
			Set<ClientInterviewStatus> clientInterviewStatuses) {
		this.clientInterviewStatuses = clientInterviewStatuses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewStageMstr")
	public Set<InterviewDetails> getInterviewDetailses() {
		return this.interviewDetailses;
	}

	public void setInterviewDetailses(Set<InterviewDetails> interviewDetailses) {
		this.interviewDetailses = interviewDetailses;
	}

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewStageMstr")
    public Set<InterviewKitStage> getInterviewKitStages() {
		return interviewKitStages;
	}

	public void setInterviewKitStages(Set<InterviewKitStage> interviewKitStages) {
		this.interviewKitStages = interviewKitStages;
	}

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewStageMstr")
    public Set<InterviewKitJobStage> getInterviewKitJobStages() {
        return interviewKitJobStages;
    }

    public void setInterviewKitJobStages(Set<InterviewKitJobStage> interviewKitJobStages) {
        this.interviewKitJobStages = interviewKitJobStages;
    }
}
