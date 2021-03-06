package com.ripplehire.candidate.entities;

// Generated Oct 28, 2015 1:50:54 PM by Hibernate Tools 4.0.0

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
 * UserProfile generated by hbm2java
 */
@Entity
@Table(name = "user_profile")
public class UserProfile implements java.io.Serializable {

	private Integer userProfileSeq;
	private LangMstr langMstr;
	private UserRole userRole;
	private LocationMstr locationMstr;
	private int companyMstrSeq;
	private String uuid;
	private String accessToken;
	private String bussinessUnit;
	private String userId;
	private String password;
	private String userNickName;
	private String userFirstLogin;
	private Date lastLoginTs;
	private int loginAttempts;
	private char userEligibility;
	private String userTcAcceptance;
	private char status;
	private Character resetPwd;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;
	private Set<Candidate> candidates = new HashSet<Candidate>(0);
	private Set<InterviewComments> interviewCommentses = new HashSet<InterviewComments>(
			0);
	private Set<Interviewer> interviewers = new HashSet<Interviewer>(0);
	private Set<JobRecruiter> jobRecruiters = new HashSet<JobRecruiter>(0);
	private Set<EmplRefrl> emplRefrls = new HashSet<EmplRefrl>(0);
	private Set<ContestRecruiter> contestRecruiters = new HashSet<ContestRecruiter>(
			0);
	private Set<EmplMedal> emplMedals = new HashSet<EmplMedal>(0);
	private Set<EmplReward> emplRewards = new HashSet<EmplReward>(0);
	private Set<LiUserNetwork> liUserNetworks = new HashSet<LiUserNetwork>(0);
	private Set<ContestWinner> contestWinners = new HashSet<ContestWinner>(0);
	private Set<EmployeeMstr> employeeMstrs = new HashSet<EmployeeMstr>(0);
	private Set<LoginHistory> loginHistories = new HashSet<LoginHistory>(0);
	private Set<FbUserNetwork> fbUserNetworks = new HashSet<FbUserNetwork>(0);
	private Set<CampaignRecruiter> campaignRecruiters = new HashSet<CampaignRecruiter>(
			0);
	private Set<EmplGoal> emplGoals = new HashSet<EmplGoal>(0);
	private Set<EmplLevel> emplLevels = new HashSet<EmplLevel>(0);
	private Set<EmplActivity> emplActivities = new HashSet<EmplActivity>(0);
	private Set<EmplBadge> emplBadges = new HashSet<EmplBadge>(0);
	private Set<InterviewScheduleAttendee> interviewScheduleAttendees = new HashSet<>();
    private Set<TaskDetails> taskDetailss = new HashSet<>();
	private Set<JobApprovalDetails> jobApprovalDetailses = new HashSet<JobApprovalDetails>(0);

	//	private Set<VendorProfile> vendorProfiles = new HashSet<VendorProfile>(0);
	public UserProfile() {
	}

	public UserProfile(UserRole userRole, int companyMstrSeq, String userId,
					   String password, char status, int createdBy, Date createDttm) {
		this.userRole = userRole;
		this.companyMstrSeq = companyMstrSeq;
		this.userId = userId;
		this.password = password;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public UserProfile(LangMstr langMstr, UserRole userRole,
                       LocationMstr locationMstr, int companyMstrSeq, String uuid,
                       String accessToken, String bussinessUnit, String userId,
                       String password, String userNickName, String userFirstLogin,
                       Date lastLoginTs,  char userEligibility, char status,
                       Character resetPwd, int createdBy, Date createDttm,
                       Integer updatedBy, Date updateDttm, Set<Candidate> candidates,
                       Set<InterviewComments> interviewCommentses,
                       Set<Interviewer> interviewers, Set<JobRecruiter> jobRecruiters,
                       Set<EmplRefrl> emplRefrls, Set<ContestRecruiter> contestRecruiters,
                       Set<EmplMedal> emplMedals, Set<EmplReward> emplRewards,
                       Set<LiUserNetwork> liUserNetworks,
                       Set<ContestWinner> contestWinners, Set<EmployeeMstr> employeeMstrs,
                       Set<LoginHistory> loginHistories,
                       Set<FbUserNetwork> fbUserNetworks,
                       Set<CampaignRecruiter> campaignRecruiters, Set<EmplGoal> emplGoals,
                       Set<EmplLevel> emplLevels, Set<EmplActivity> emplActivities,
                       Set<EmplBadge> emplBadges,
                       Set<InterviewScheduleAttendee> interviewScheduleAttendees,
                       Set<TaskDetails> taskDetailss, Set<JobApprovalDetails> jobApprovalDetailses) {
        this.langMstr = langMstr;
		this.userRole = userRole;
		this.locationMstr = locationMstr;
		this.companyMstrSeq = companyMstrSeq;
		this.uuid = uuid;
		this.accessToken = accessToken;
		this.bussinessUnit = bussinessUnit;
		this.userId = userId;
		this.password = password;
		this.userNickName = userNickName;
		this.userFirstLogin = userFirstLogin;
		this.lastLoginTs = lastLoginTs;
		this.userEligibility = userEligibility;
		this.status = status;
		this.resetPwd = resetPwd;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
		this.candidates = candidates;
		this.interviewCommentses = interviewCommentses;
		this.interviewers = interviewers;
		this.jobRecruiters = jobRecruiters;
		this.emplRefrls = emplRefrls;
		this.contestRecruiters = contestRecruiters;
		this.emplMedals = emplMedals;
		this.emplRewards = emplRewards;
		this.liUserNetworks = liUserNetworks;
		this.contestWinners = contestWinners;
		this.employeeMstrs = employeeMstrs;
		this.loginHistories = loginHistories;
		this.fbUserNetworks = fbUserNetworks;
		this.campaignRecruiters = campaignRecruiters;
		this.emplGoals = emplGoals;
		this.emplLevels = emplLevels;
		this.emplActivities = emplActivities;
		this.emplBadges = emplBadges;
		this.interviewScheduleAttendees = interviewScheduleAttendees;
        this.taskDetailss = taskDetailss;
		this.jobApprovalDetailses = jobApprovalDetailses;
    }

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "USER_PROFILE_SEQ", unique = true, nullable = false)
	public Integer getUserProfileSeq() {
		return this.userProfileSeq;
	}

	public void setUserProfileSeq(Integer userProfileSeq) {
		this.userProfileSeq = userProfileSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LANG_MSTR_SEQ")
	public LangMstr getLangMstr() {
		return this.langMstr;
	}

	public void setLangMstr(LangMstr langMstr) {
		this.langMstr = langMstr;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ROLE_SEQ", nullable = false)
	public UserRole getUserRole() {
		return this.userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOCATION_MSTR_SEQ")
	public LocationMstr getLocationMstr() {
		return this.locationMstr;
	}

	public void setLocationMstr(LocationMstr locationMstr) {
		this.locationMstr = locationMstr;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "UUID", length = 200)
	public String getUUID() {
		return this.uuid;
	}

	public void setUUID(String uuid) {
		this.uuid = uuid;
	}

	@Column(name = "ACCESS_TOKEN", length = 40)
	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	@Column(name = "BUSSINESS_UNIT", length = 50)
	public String getBussinessUnit() {
		return this.bussinessUnit;
	}

	public void setBussinessUnit(String bussinessUnit) {
		this.bussinessUnit = bussinessUnit;
	}

	@Column(name = "USER_ID", nullable = false, length = 50)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "PASSWORD", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "USER_NICK_NAME", length = 50)
	public String getUserNickName() {
		return this.userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	@Column(name = "USER_FIRST_LOGIN", length = 1)
	public String getUserFirstLogin() {
		return this.userFirstLogin;
	}

	public void setUserFirstLogin(String userFirstLogin) {
		this.userFirstLogin = userFirstLogin;
	}

	@Column(name = "LOGIN_ATTEMPTS", nullable = false,  length = 11)
	public int getLoginAttempts() {
		return loginAttempts;
	}

	public void setLoginAttempts(int loginAttempts) {
		this.loginAttempts = loginAttempts;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_LOGIN_TS", length = 19)
	public Date getLastLoginTs() {
		return this.lastLoginTs;
	}

	public void setLastLoginTs(Date lastLoginTs) {
		this.lastLoginTs = lastLoginTs;
	}

	@Column(name="USER_ELIGIBILITY", length = 1)
	public char getUserEligibility() {
		return userEligibility;
	}

	public void setUserEligibility(char userEligibility) {
		this.userEligibility = userEligibility;
	}

	@Column(name = "USER_TC_ACCEPTANCE", length = 1)
	public String getUserTcAcceptance() {
		return userTcAcceptance;
	}

	public void setUserTcAcceptance(String userTcAcceptance) {
		this.userTcAcceptance = userTcAcceptance;
	}

	@Column(name = "STATUS", nullable = false, length = 1)
	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@Column(name = "RESET_PWD", length = 1)
	public Character getResetPwd() {
		return this.resetPwd;
	}

	public void setResetPwd(Character resetPwd) {
		this.resetPwd = resetPwd;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<Candidate> getCandidates() {
		return this.candidates;
	}

	public void setCandidates(Set<Candidate> candidates) {
		this.candidates = candidates;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<InterviewComments> getInterviewCommentses() {
		return this.interviewCommentses;
	}

	public void setInterviewCommentses(
			Set<InterviewComments> interviewCommentses) {
		this.interviewCommentses = interviewCommentses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<Interviewer> getInterviewers() {
		return this.interviewers;
	}

	public void setInterviewers(Set<Interviewer> interviewers) {
		this.interviewers = interviewers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<JobRecruiter> getJobRecruiters() {
		return this.jobRecruiters;
	}

	public void setJobRecruiters(Set<JobRecruiter> jobRecruiters) {
		this.jobRecruiters = jobRecruiters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<EmplRefrl> getEmplRefrls() {
		return this.emplRefrls;
	}

	public void setEmplRefrls(Set<EmplRefrl> emplRefrls) {
		this.emplRefrls = emplRefrls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<ContestRecruiter> getContestRecruiters() {
		return this.contestRecruiters;
	}

	public void setContestRecruiters(Set<ContestRecruiter> contestRecruiters) {
		this.contestRecruiters = contestRecruiters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<EmplMedal> getEmplMedals() {
		return this.emplMedals;
	}

	public void setEmplMedals(Set<EmplMedal> emplMedals) {
		this.emplMedals = emplMedals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<EmplReward> getEmplRewards() {
		return this.emplRewards;
	}

	public void setEmplRewards(Set<EmplReward> emplRewards) {
		this.emplRewards = emplRewards;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<LiUserNetwork> getLiUserNetworks() {
		return this.liUserNetworks;
	}

	public void setLiUserNetworks(Set<LiUserNetwork> liUserNetworks) {
		this.liUserNetworks = liUserNetworks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<ContestWinner> getContestWinners() {
		return this.contestWinners;
	}

	public void setContestWinners(Set<ContestWinner> contestWinners) {
		this.contestWinners = contestWinners;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<EmployeeMstr> getEmployeeMstrs() {
		return this.employeeMstrs;
	}

	public void setEmployeeMstrs(Set<EmployeeMstr> employeeMstrs) {
		this.employeeMstrs = employeeMstrs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<LoginHistory> getLoginHistories() {
		return this.loginHistories;
	}

	public void setLoginHistories(Set<LoginHistory> loginHistories) {
		this.loginHistories = loginHistories;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<FbUserNetwork> getFbUserNetworks() {
		return this.fbUserNetworks;
	}

	public void setFbUserNetworks(Set<FbUserNetwork> fbUserNetworks) {
		this.fbUserNetworks = fbUserNetworks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<CampaignRecruiter> getCampaignRecruiters() {
		return this.campaignRecruiters;
	}

	public void setCampaignRecruiters(Set<CampaignRecruiter> campaignRecruiters) {
		this.campaignRecruiters = campaignRecruiters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<EmplGoal> getEmplGoals() {
		return this.emplGoals;
	}

	public void setEmplGoals(Set<EmplGoal> emplGoals) {
		this.emplGoals = emplGoals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<EmplLevel> getEmplLevels() {
		return this.emplLevels;
	}

	public void setEmplLevels(Set<EmplLevel> emplLevels) {
		this.emplLevels = emplLevels;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<EmplActivity> getEmplActivities() {
		return this.emplActivities;
	}

	public void setEmplActivities(Set<EmplActivity> emplActivities) {
		this.emplActivities = emplActivities;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<EmplBadge> getEmplBadges() {
		return this.emplBadges;
	}

	public void setEmplBadges(Set<EmplBadge> emplBadges) {
		this.emplBadges = emplBadges;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mailTo")
	public Set<InterviewScheduleAttendee> getInterviewScheduleAttendees() {
		return interviewScheduleAttendees;
	}

	public void setInterviewScheduleAttendees(Set<InterviewScheduleAttendee> interviewScheduleAttendees) {
		this.interviewScheduleAttendees = interviewScheduleAttendees;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assignedTo")
    public Set<TaskDetails> getTaskDetailss() {
        return taskDetailss;
    }

    public void setTaskDetailss(Set<TaskDetails> taskDetailss) {
        this.taskDetailss = taskDetailss;
    }

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<JobApprovalDetails> getJobApprovalDetailses() {
		return this.jobApprovalDetailses;
	}

	public void setJobApprovalDetailses(Set<JobApprovalDetails> jobApprovalDetailses) {
		this.jobApprovalDetailses = jobApprovalDetailses;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<VendorProfile> getVendorProfiles() {
		return vendorProfiles;
	}

	public void setVendorProfiles(Set<VendorProfile> vendorProfiles) {
		this.vendorProfiles = vendorProfiles;
	}*/
}