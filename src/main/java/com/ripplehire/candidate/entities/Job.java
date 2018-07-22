package com.ripplehire.candidate.entities;
// Generated 16 May, 2017 1:27:45 PM by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Job generated by hbm2java
 */
@Entity
@Table(name = "job")
public class Job implements java.io.Serializable {

	private Integer jobSeq;
	private JobDetail jobDetail;
	private JobStatusMstr jobStatusMstr;
	private int companyMstrSeq;
	private String jobCd;
	private String jobTitle;
	private String jobStatus;
	private String jobType;
	private String jobOthedetails;
	private String jobDesc;
	private String jobSkills;
	private Integer reqExpMin;
	private Integer reqExpMax;
	private int totalPositions;
	private Integer totalClosedPositions;
	private int totalCandidateClicks;
	private int totalJoblink;
	private char isHotJob;
	private Character recruiterNotification;
	private String bussinessUnit;
	private String jobSourcer;
	private String jobRequester;
	private char allowIjp;
	private char allowedEmpRef;
	private char allowAgency;
	private char enableEeo;
	private String comment;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;
	private String origCd;
	private String origSeq;
	private String origPositions;
	private String comment2;
	private char isCareerSite;
	private Set<JobRequestTask> jobRequestTasks = new HashSet<JobRequestTask>(0);
	private Set<ContestJob> contestJobs = new HashSet<ContestJob>(0);
	private Set<EmplRefrl> emplRefrls = new HashSet<EmplRefrl>(0);
	private Set<JobApprover> jobApprovers = new HashSet<JobApprover>(0);
	private Set<JobRecruiter> jobRecruiters = new HashSet<JobRecruiter>(0);
	private Set<JobApprovalDetails> jobApprovalDetailses = new HashSet<JobApprovalDetails>(0);
	private Set<EmplReward> emplRewards = new HashSet<EmplReward>(0);
	private Set<CampaignJob> campaignJobs = new HashSet<CampaignJob>(0);
	private Set<JobHistory> jobHistories = new HashSet<JobHistory>(0);
	private Set<JobLocation> jobLocations = new HashSet<JobLocation>(0);
	private Set<EmplActivity> emplActivities = new HashSet<EmplActivity>(0);
	private Set<JobAgency> jobAgencies = new HashSet<JobAgency>(0);
	private Set<JobReward> jobRewards = new HashSet<JobReward>(0);
	private Set<JobViews> jobViewses = new HashSet<JobViews>(0);
	private Set<JobSnapshot> jobSnapshots = new HashSet<JobSnapshot>(0);
    private Set<InterviewKitJobStage> interviewKitJobStages = new HashSet<InterviewKitJobStage>(0);

	public Job() {
	}

	public Job(int companyMstrSeq, String jobCd, String jobTitle, String jobStatus, String jobType, String jobDesc,
			String jobSkills, int totalPositions, int totalCandidateClicks, int totalJoblink, char isHotJob,
			char allowIjp, char allowedEmpRef, char allowAgency, char enableEeo, char status, int createdBy,
			Date createDttm, char isCareerSite) {
		this.companyMstrSeq = companyMstrSeq;
		this.jobCd = jobCd;
		this.jobTitle = jobTitle;
		this.jobStatus = jobStatus;
		this.jobType = jobType;
		this.jobDesc = jobDesc;
		this.jobSkills = jobSkills;
		this.totalPositions = totalPositions;
		this.totalCandidateClicks = totalCandidateClicks;
		this.totalJoblink = totalJoblink;
		this.isHotJob = isHotJob;
		this.allowIjp = allowIjp;
		this.allowedEmpRef = allowedEmpRef;
		this.allowAgency = allowAgency;
		this.enableEeo = enableEeo;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.isCareerSite = isCareerSite;
	}

    public Job(Integer jobSeq, JobDetail jobDetail, JobStatusMstr jobStatusMstr, int companyMstrSeq, String jobCd, String jobTitle, String jobStatus, String jobType, String jobOthedetails, String jobDesc, String jobSkills, Integer reqExpMin, Integer reqExpMax, int totalPositions, Integer totalClosedPositions, int totalCandidateClicks, int totalJoblink, char isHotJob, Character recruiterNotification, String bussinessUnit, String jobSourcer, String jobRequester, char allowIjp, char allowedEmpRef, char allowAgency, char enableEeo, String comment, char status, int createdBy, Date createDttm, Integer updatedBy, Date updateDttm, String origCd, String origSeq, String origPositions, String comment2, char isCareerSite, Set<JobRequestTask> jobRequestTasks, Set<ContestJob> contestJobs, Set<EmplRefrl> emplRefrls, Set<JobApprover> jobApprovers, Set<JobRecruiter> jobRecruiters, Set<JobApprovalDetails> jobApprovalDetailses, Set<EmplReward> emplRewards, Set<CampaignJob> campaignJobs, Set<JobHistory> jobHistories, Set<JobLocation> jobLocations, Set<EmplActivity> emplActivities, Set<JobAgency> jobAgencies, Set<JobReward> jobRewards, Set<JobViews> jobViewses, Set<JobSnapshot> jobSnapshots, Set<InterviewKitJobStage> interviewKitJobStages) {
        this.jobSeq = jobSeq;
        this.jobDetail = jobDetail;
        this.jobStatusMstr = jobStatusMstr;
        this.companyMstrSeq = companyMstrSeq;
        this.jobCd = jobCd;
        this.jobTitle = jobTitle;
        this.jobStatus = jobStatus;
        this.jobType = jobType;
        this.jobOthedetails = jobOthedetails;
        this.jobDesc = jobDesc;
        this.jobSkills = jobSkills;
        this.reqExpMin = reqExpMin;
        this.reqExpMax = reqExpMax;
        this.totalPositions = totalPositions;
        this.totalClosedPositions = totalClosedPositions;
        this.totalCandidateClicks = totalCandidateClicks;
        this.totalJoblink = totalJoblink;
        this.isHotJob = isHotJob;
        this.recruiterNotification = recruiterNotification;
        this.bussinessUnit = bussinessUnit;
        this.jobSourcer = jobSourcer;
        this.jobRequester = jobRequester;
        this.allowIjp = allowIjp;
        this.allowedEmpRef = allowedEmpRef;
        this.allowAgency = allowAgency;
        this.enableEeo = enableEeo;
        this.comment = comment;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
        this.origCd = origCd;
        this.origSeq = origSeq;
        this.origPositions = origPositions;
        this.comment2 = comment2;
        this.isCareerSite = isCareerSite;
        this.jobRequestTasks = jobRequestTasks;
        this.contestJobs = contestJobs;
        this.emplRefrls = emplRefrls;
        this.jobApprovers = jobApprovers;
        this.jobRecruiters = jobRecruiters;
        this.jobApprovalDetailses = jobApprovalDetailses;
        this.emplRewards = emplRewards;
        this.campaignJobs = campaignJobs;
        this.jobHistories = jobHistories;
        this.jobLocations = jobLocations;
        this.emplActivities = emplActivities;
        this.jobAgencies = jobAgencies;
        this.jobRewards = jobRewards;
        this.jobViewses = jobViewses;
        this.jobSnapshots = jobSnapshots;
        this.interviewKitJobStages = interviewKitJobStages;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

	@Column(name = "JOB_SEQ", unique = true, nullable = false)
	public Integer getJobSeq() {
		return this.jobSeq;
	}

	public void setJobSeq(Integer jobSeq) {
		this.jobSeq = jobSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JOB_DETAIL_SEQ")
	public JobDetail getJobDetail() {
		return this.jobDetail;
	}

	public void setJobDetail(JobDetail jobDetail) {
		this.jobDetail = jobDetail;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JOB_STATUS_SEQ")
	public JobStatusMstr getJobStatusMstr() {
		return this.jobStatusMstr;
	}

	public void setJobStatusMstr(JobStatusMstr jobStatusMstr) {
		this.jobStatusMstr = jobStatusMstr;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "JOB_CD", nullable = false, length = 50)
	public String getJobCd() {
		return this.jobCd;
	}

	public void setJobCd(String jobCd) {
		this.jobCd = jobCd;
	}

	@Column(name = "JOB_TITLE", nullable = false, length = 200)
	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Column(name = "JOB_STATUS", nullable = false, length = 10)
	public String getJobStatus() {
		return this.jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	@Column(name = "JOB_TYPE", nullable = false, length = 10)
	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	@Column(name = "JOB_OTHEDETAILS", length = 3000)
	public String getJobOthedetails() {
		return this.jobOthedetails;
	}

	public void setJobOthedetails(String jobOthedetails) {
		this.jobOthedetails = jobOthedetails;
	}

	@Column(name = "JOB_DESC", nullable = false)
	public String getJobDesc() {
		return this.jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	@Column(name = "JOB_SKILLS", nullable = false, length = 9000)
	public String getJobSkills() {
		return this.jobSkills;
	}

	public void setJobSkills(String jobSkills) {
		this.jobSkills = jobSkills;
	}

	@Column(name = "REQ_EXP_MIN")
	public Integer getReqExpMin() {
		return this.reqExpMin;
	}

	public void setReqExpMin(Integer reqExpMin) {
		this.reqExpMin = reqExpMin;
	}

	@Column(name = "REQ_EXP_MAX")
	public Integer getReqExpMax() {
		return this.reqExpMax;
	}

	public void setReqExpMax(Integer reqExpMax) {
		this.reqExpMax = reqExpMax;
	}

	@Column(name = "TOTAL_POSITIONS", nullable = false)
	public int getTotalPositions() {
		return this.totalPositions;
	}

	public void setTotalPositions(int totalPositions) {
		this.totalPositions = totalPositions;
	}

	@Column(name = "TOTAL_CLOSED_POSITIONS")
	public Integer getTotalClosedPositions() {
		return this.totalClosedPositions;
	}

	public void setTotalClosedPositions(Integer totalClosedPositions) {
		this.totalClosedPositions = totalClosedPositions;
	}

	@Column(name = "TOTAL_CANDIDATE_CLICKS", nullable = false)
	public int getTotalCandidateClicks() {
		return this.totalCandidateClicks;
	}

	public void setTotalCandidateClicks(int totalCandidateClicks) {
		this.totalCandidateClicks = totalCandidateClicks;
	}

	@Column(name = "TOTAL_JOBLINK", nullable = false)
	public int getTotalJoblink() {
		return this.totalJoblink;
	}

	public void setTotalJoblink(int totalJoblink) {
		this.totalJoblink = totalJoblink;
	}

	@Column(name = "IS_HOT_JOB", nullable = false, length = 1)
	public char getIsHotJob() {
		return this.isHotJob;
	}

	public void setIsHotJob(char isHotJob) {
		this.isHotJob = isHotJob;
	}

	@Column(name = "RECRUITER_NOTIFICATION", length = 1)
	public Character getRecruiterNotification() {
		return this.recruiterNotification;
	}

	public void setRecruiterNotification(Character recruiterNotification) {
		this.recruiterNotification = recruiterNotification;
	}

	@Column(name = "BUSSINESS_UNIT", length = 50)
	public String getBussinessUnit() {
		return this.bussinessUnit;
	}

	public void setBussinessUnit(String bussinessUnit) {
		this.bussinessUnit = bussinessUnit;
	}

	@Column(name = "JOB_SOURCER", length = 100)
	public String getJobSourcer() {
		return this.jobSourcer;
	}

	public void setJobSourcer(String jobSourcer) {
		this.jobSourcer = jobSourcer;
	}

	@Column(name = "JOB_REQUESTER", length = 100)
	public String getJobRequester() {
		return this.jobRequester;
	}

	public void setJobRequester(String jobRequester) {
		this.jobRequester = jobRequester;
	}

	@Column(name = "ALLOW_IJP", nullable = false, length = 1)
	public char getAllowIjp() {
		return this.allowIjp;
	}

	public void setAllowIjp(char allowIjp) {
		this.allowIjp = allowIjp;
	}

	@Column(name = "ALLOW_EMP_REF", nullable = false, length = 1)
	public char getAllowedEmpRef() {
		return allowedEmpRef;
	}

	public void setAllowedEmpRef(char allowedEmpRef) {
		this.allowedEmpRef = allowedEmpRef;
	}

	@Column(name = "ALLOW_AGENCY", nullable = false, length = 1)
	public char getAllowAgency() {
		return this.allowAgency;
	}

	public void setAllowAgency(char allowAgency) {
		this.allowAgency = allowAgency;
	}

	@Column(name = "ENABLE_EEO", nullable = false, length = 1)
	public char getEnableEeo() {
		return this.enableEeo;
	}

	public void setEnableEeo(char enableEeo) {
		this.enableEeo = enableEeo;
	}

	@Column(name = "comment", length = 100)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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

	@Column(name = "ORIG_CD", length = 50)
	public String getOrigCd() {
		return this.origCd;
	}

	public void setOrigCd(String origCd) {
		this.origCd = origCd;
	}

	@Column(name = "ORIG_SEQ", length = 50)
	public String getOrigSeq() {
		return this.origSeq;
	}

	public void setOrigSeq(String origSeq) {
		this.origSeq = origSeq;
	}

	@Column(name = "ORIG_POSITIONS", length = 20)
	public String getOrigPositions() {
		return this.origPositions;
	}

	public void setOrigPositions(String origPositions) {
		this.origPositions = origPositions;
	}

	@Column(name = "comment2", length = 50)
	public String getComment2() {
		return this.comment2;
	}

	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}

	@Column(name = "IS_CAREER_SITE", nullable = false, length = 1)
	public char getIsCareerSite() {
		return this.isCareerSite;
	}

	public void setIsCareerSite(char isCareerSite) {
		this.isCareerSite = isCareerSite;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<JobRequestTask> getJobRequestTasks() {
		return this.jobRequestTasks;
	}

	public void setJobRequestTasks(Set<JobRequestTask> jobRequestTasks) {
		this.jobRequestTasks = jobRequestTasks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<ContestJob> getContestJobs() {
		return this.contestJobs;
	}

	public void setContestJobs(Set<ContestJob> contestJobs) {
		this.contestJobs = contestJobs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<EmplRefrl> getEmplRefrls() {
		return this.emplRefrls;
	}

	public void setEmplRefrls(Set<EmplRefrl> emplRefrls) {
		this.emplRefrls = emplRefrls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<JobApprover> getJobApprovers() {
		return this.jobApprovers;
	}

	public void setJobApprovers(Set<JobApprover> jobApprovers) {
		this.jobApprovers = jobApprovers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<JobRecruiter> getJobRecruiters() {
		return this.jobRecruiters;
	}

	public void setJobRecruiters(Set<JobRecruiter> jobRecruiters) {
		this.jobRecruiters = jobRecruiters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<JobApprovalDetails> getJobApprovalDetailses() {
		return this.jobApprovalDetailses;
	}

	public void setJobApprovalDetailses(Set<JobApprovalDetails> jobApprovalDetailses) {
		this.jobApprovalDetailses = jobApprovalDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<EmplReward> getEmplRewards() {
		return this.emplRewards;
	}

	public void setEmplRewards(Set<EmplReward> emplRewards) {
		this.emplRewards = emplRewards;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<CampaignJob> getCampaignJobs() {
		return this.campaignJobs;
	}

	public void setCampaignJobs(Set<CampaignJob> campaignJobs) {
		this.campaignJobs = campaignJobs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<JobHistory> getJobHistories() {
		return this.jobHistories;
	}

	public void setJobHistories(Set<JobHistory> jobHistories) {
		this.jobHistories = jobHistories;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<JobLocation> getJobLocations() {
		return this.jobLocations;
	}

	public void setJobLocations(Set<JobLocation> jobLocations) {
		this.jobLocations = jobLocations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<EmplActivity> getEmplActivities() {
		return this.emplActivities;
	}

	public void setEmplActivities(Set<EmplActivity> emplActivities) {
		this.emplActivities = emplActivities;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<JobAgency> getJobAgencies() {
		return this.jobAgencies;
	}

	public void setJobAgencies(Set<JobAgency> jobAgencies) {
		this.jobAgencies = jobAgencies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<JobReward> getJobRewards() {
		return this.jobRewards;
	}

	public void setJobRewards(Set<JobReward> jobRewards) {
		this.jobRewards = jobRewards;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<JobViews> getJobViewses() {
		return this.jobViewses;
	}

	public void setJobViewses(Set<JobViews> jobViewses) {
		this.jobViewses = jobViewses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	public Set<JobSnapshot> getJobSnapshots() {
		return this.jobSnapshots;
	}

	public void setJobSnapshots(Set<JobSnapshot> jobSnapshots) {
		this.jobSnapshots = jobSnapshots;
	}

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
    public Set<InterviewKitJobStage> getInterviewKitJobStages() {
        return interviewKitJobStages;
    }

    public void setInterviewKitJobStages(Set<InterviewKitJobStage> interviewKitJobStages) {
        this.interviewKitJobStages = interviewKitJobStages;
    }
}