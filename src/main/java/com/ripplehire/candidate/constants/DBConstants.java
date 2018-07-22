package com.ripplehire.candidate.constants;

public interface DBConstants {

    //Table Names
    public final String TBL_EMPLOYEE_MSTR = "employee_mstr";
    public final String TBL_JOB = "job";

    //Query Parameter Field Names

    public final String FORM_TYPE = "formType";
    public final String BATCH_PROCESS_FILE_NAME = "fileName";
    public final String EMPLOYEE_MSTR_SEQ = "employeeMstrSeq";
    public final String COMPANY_MSTR_SEQ = "companyMstrSeq";
    String STATUS = "status";
    public final String FIELD_DUPLICATE = "fieldDuplicate";
    public final String PARENT_COMPANY_MSTR_SEQ = "parentCompanyMstrSeq";
    public final String JOB_SEQ = "jobSeq";
    public final String REWARD_TYPE_CD = "rewardTypeCd";
    public final String REWARD_RELEASE = "rewardRelease";
    public final String REWARD_TYPE_MSTR_SEQ = "rewardTypeMstrSeq";
    public final String GOAL_SEQ_LIST = "goalSeq";
    public final String GOAL_SEQ = "goalSeq";
    public final String ACTIVITY_MSTR_SEQ = "activityMstrSeq";
    public final String ACTIVITY_MSTR_CD = "activityCd";
    public final String USERPROFILE_SEQ = "userProfileSeq";
    public final String VIEW_TYPE = "viewType";
    public final String REFRL_STATUS_CD = "refrlStatusCd";
    public final String REFRL_STATUS_CODE = "refrlStatusCode";
    public final String REFRL_CHANNEL_CD = "refrlChannelCd";
    public final String REFRL_CHANNEL_CD_FACEBOOK = "FACEBOOK";
    public final String REFRL_CHANNEL_CD_LINKEDIN = "LINKEDIN";
    public final String REFRL_CHANNEL_CD_TWITTER = "TWITTER";
    public final String REFRL_TYPE_CD = "referralTypeCd";
    public final String CONTEST_JOB_SEQ = "contestJobSeq";
    public final String CAMPAIGN_JOB_SEQ = "campaignJobSeq";
    public final String CAMPAIGN_SEQ = "campaignSeq";
    public final String CANDIDATE_SEQ = "candidateSeq";
    public final String CANDIDATE_RESUME_DETAILS_SEQ = "candidateResumedetailsSeq";
    public final String CONTEST_SEQ = "contestSeq";
    public final String REWARD_CRITERIA = "rewardCriteria";
    public final String CONTEST_WIN_POSITION = "contestWinPosition";
    public final String DELETED_USER_SEQ = "deletedUserSeq";
    public final String JOB_REFRL_TYPE_SEQ = "jobRefrlTypeSeq";
    public final String USER_ID = "userId";
    public final String COMPANY_EMPLOYEE_ID = "companyEmplId";
    public final String JOB_TITLE_STRING = "jobTitleString";
    public final String JOB_SEQ_LIST = "jobSeqList";
    public final String FRIEND_USER_ID = "friendUserId";
    public final String FRIEND_FIRST_NAME = "friendFirstName";
    public final String FRIEND_LAST_NAME = "friendLastName";
    public final String FIRST_NAME = "firstName";
    public final String LAST_NAME = "lastName";
    public final String FRIEND_JOB_TITLE = "friendJobTitle";
    public final String FRIEND_COMPANY_NM = "friendCompanyNm";
    public final String EMPL_REFRL_SEQ = "emplRefrlSeq";
    public final String TIMEZONE_DESCRIPTION = "timezoneDescr";
    public final String INTERVIEW_SCHEDULE_SEQ = "interviewScheduleSeq";
    public final String INTERVIEW_REVIEW_SEQ = "interviewReviewSeq";
    public final String USER_TYPE = "userType";
    public final String INTERVIEW_DETAIL_SEQ = "interviewDetailSeq";
    public final String INTERVIEW_STAGE_MSTR_SEQ = "interviewStageMstrSeq";
    public final String FIND_CANDIDATE_BY_EMAIL_ADDR_AND_COMPANY_ID = "Candidate.findCandidateByEmailAddrAndCompanyMstrSeq";
    public final String JOB_RECRUITER_ROLE = "role";
    public final String EMAIL_ADDR = "emailAddr";
    public final String USER_ROLE = "userRole";
    public final String USER_ROLE_CD = "userRoleCd";
    public final String ALTERNATE_EMAIL_ADDR = "alternateEmailAddr";
    public final String EMAIL_LIST = "emailList";
    public final String EMPL_REFRL_TOKEN = "token";
    public final String SKILL_TEXT = "skillText";
    public final String REFRL_CHANNEL_MSTR_SEQ = "refrlChannelMstrSeq";
    public final String STAGE_NUMBER = "stageNumber";
    public final String ACTIVITY_STAGE_CNT = "activitystageCnt";
    public final String GOAL_LIST = "goalList";
    public final String TOTAL_POINTS = "totalPoints";
    public final String CURRENT_LEVEL = "currentLevel";
    public final String ACTIVITY_COUNT = "activityCount";
    public final String CITY = "city";
    public final String KEYWORDS = "keywords";
    public final String VENDOR_ID = "vendorId";
    public final String UPDATE_DTTM = "updateDttm";
    public final String VENDOR_MSTR_SEQ = "vendorMstrSeq";
    public final String VENDOR_CATERGORY_SEQ = "vendorCategorySeq";
    public final String VENDOR_MSTR_SEQ_LIST = "vendorMstrSeqList";
    public final String INTERVIEW_TOKEN = "interviewToken";
    public final String INTERVIEW_DETAILS_SEQ = "interviewDetailsSeq";
    public final String USER_PROFILE_SEQ = "userProfileSeq";
    public final String CURRENTDATE = "currentDate";
    public final String LOCATION_SEQ = "locationMstrSeq";
    public final String INTERVIEW_PRIORITY = "interviewPriority";
    public final String JOB_TITLE = "jobTitle";
    public final String ROUND_CODE = "roundCode";
    public final String STAGE_DESC = "stageDesc";
    public final String JOB_STATUS = "jobStatus";
    public final String JOB_TYPE = "jobType";
    public final String EMAIL_TEMPLATE_CD = "emailTemplateCd";
    public final String DAYS = "days";
    public final String REFRL_MODE_CD = "refrlModeCd";
    public final String BAND_CODE = "bandCd";
    public final String ACCESS_TOKEN = "accessToken";
    public final String JOB_CODE = "jobCd";
    public final String PHONE_NO = "phoneNo";
    public final String DOB = "dob";
    public final String START_DATE = "startDate";
    public final String END_DATE = "endDate";
    public final String DATE_DIFFERENCE = "difference";
    public final String SOCIAL_CHANNEL_CD = "socialChannelCd";
    public final String TRANSACTION_ID = "transactionId";
    public final String TRANSACTION_TYPE = "transactionType";
    public final String TRANSACTION_TYPE_REDEEM = "REDEEM";
    public final String VENDOR_PROFILE_SEQ = "vendorProfileSeq";
    public final String VENDOR_DEFAULT_EMAIL = "vendorDefaultMail";
    public final String REQUEST_TYPE = "requestType";
    public final String COINS_REQUEST_HISTORY = "CoinsServiceLog.fetchUserCoinsHistory";
    public final String CURRENCY_MSTR_SEQ = "currencyMstrSeq";
    public final String USER_SEARCH = "userSearch";

    public final String EMP_RWRD_CAT_SEQ = "empRwrdCatSeq";
    public final String EMPL_RWRD_CAT = "emplRwrdCat";
    public final String SOCIAL_MEDIA_ID = "socialMediaID";

    public final String COMPANY_NAME = "companyName";
    public final String COMPANY_LOGO_IMAGE = "logoImage";
    public final String CONTEST_TITLE = "contestTitle";
    public final String CONTEST_BANNER = "contestBanner";
    public final String CONTEST_JOBS = "contesJobs";
    public final String SOURCER_EMAIL = "sourcerEmail";

    public final String COUNTRY_NAME = "countryName";
    public final String STATE_NAME = "stateName";
    public final String LANG_CD = "langCd";
    public final String TIME_ZONE = "timezone";
    public final String CLIENT_INTERVIEW_STATUS_SEQ = "clientInterviewStatusSeq";

    public final String SEARCH_STR = "searchStr";
    public final String SORT_STR = "sortStr";
    public final String SORT_DIR = "sortDir";
    public final String ONLY_EMP_REF = "showOnlyEmp";
    public final String FORGOT_PASSWORD_TOKEN = "forgotPasswordToken";
    public final String ONLY_CAREER_SITE = "isCareerSite";

    public final String REPORT_TYPE = "type";
    public final String REPORT_MSTR_SEQ = "reportMstrSeq";
    public final String REPORT_CD = "reportCd";
    public final String ENTITY = "entity";
    public final String CHANNEL_TYPE = "channelType";
    public final String JOB_CHANNEL_TYPE = "jobChannelType";
    public final String JOB_CHANNEL_SPECIFIC = "channelSpecific";
    public final String HELP_SCTION_FOR = "sectionFor";
    public final String LOG_CANDIDATE_REAPPLY = "log_candidate_reapply";
    public final String ETL_TYPE = "etlType";
    public final String UPLOAD_STATUS = "uploadStatus";
    public final String MPHASIS_ETL_IMPORT_STATUS = "importStatus";
    public final String ETL_LOG_SEQ = "etlFileLogSeq";
    //Widget
    public final String PAGE_MSTR_SEQ = "pageMstrSeq";
    public final String WIDGET_CD = "widgetCd";

    public final String FIELD_EXPORT = "fieldExport";
    String JOB_REQUEST_TYPE = "jobRequestType";

    String BADGE_CD = "badgeCd";
    String INTERVIEWER_SEQ = "interviewerSeq";
    String INTERVIEW_SEQ = "interviewSeq";
    String INTERVIEW_STATUS = "interviewStatus";
    String PREV_COMMENT_TIME_LIMIT = "prevCommentTime";
    String INTERVIEW_TYPE = "interviewType";
    String USER_GROUP_CD="userGroupCd";
    String LEVEL = "level";
    String USER_GROUP_SEQ = "userGroupSeq";
    String TYPE = "type";
    String MAIL_SUBJECT="mailSubject";
    String MAIL_RECEIVED_DATE = "receivedDate";
    String INTERVIEW_KIT_SEQ = "interviewKitSeq";
    String INTERVIEW_KIT_TAG_MSTR_TITLE = "tagTitle";
    String INTERVIEW_KIT_TAG_MSTR_SEQ = "interviewKitTagMstrSeq";
    String INTERVIEW_FEEDBACK_QUESTION_TOPIC_DETAIL = "topicDetails";
    String INTERVIEW_KIT_SEQ_LIST = "interviewKitSeqList";
    String CONFIG_CD = "configCd";
    String CONFIG_VALUE = "configValue";
    String JOB_CRITERIA = "jobCriteria";
    String CRITERIA_CONDITION="criteriaCondition";
    String APPLICATION_STATUS = "applicationStatus";

    String REDEMPTION_PAYOUT_DETAIL_SEQ = "redemptionPayoutDetailsSeq";
    String EMPL_REWARD_CAT = "emplRwrdCat";
    String SMS_TEMPLATE_TYPE = "templateType";
    String SMS_SCHEDULE_SEQ="smsScheduleDetailSeq";
    String SMS_LOG_TRANSACTION_STATUS="transactionStatus";
    String ALLOW_IJP = "allowIjp";
    String SMS_TEMPLATE_ID = "smsTemplateId";

    String SHORT_URL = "shortURL";
    String IS_DEFAULT = "isDefault";
    String UNSUBSCRIBE_TYPE = "unsubscribeType";

    //Named queries
    public final String FIND_EMP_BY_EMPSEQ = "EmployeeMstr.findEmployeeByEmpSeq";
    public final String FIND_ALL_JOBS = "Job.findAllJobs";
    public final String FIND_ALL_COMPANY_JOBS = "Job.findAllCompanyJobs";
    public final String FIND_IS_COMPANY_CAMPAIGN = "Campaign.findIsCompanyCampaign";
    public final String FIND_HOT_JOBS = "Job.findHotJobs";
    public final String FIND_RANDOM_JOBS = "Job.findRandomJobs";
    public final String FIND_JOB_REWARDS = "Job.findRewards";
    public final String FIND_JOB_RECRUITERS = "Job.findJobRecruiters";
    public final String FIND_JOB_RECRUITERS_USER_PROFILE_SEQ = "Job.findJobRecruitersByUserProfileSeq";
    public final String FIND_JOB_RECRUITERS_ROLE = "Job.findJobRecruitersByRole";
    public final String FIND_JOB_RECRUITERS_BY_USER_ROLE_NOT_IN  = "Job.findJobRecruitersByUserRoleNotIn";
    public final String FIND_JOB_LOCATIONS = "Job.findJobLocations";
    public final String FIND_JOB = "Job.findJob";

    public final String FIND_JOB_LIST = "Job.findJobList";

    public final String FIND_JOB_LIST_FOR_CAMPAIGN = "Job.findJobListForCampaign";
    //public final String FIND_JOB_LIST_FOR_LOCATION = "Job.findJobListForLocation";
    //public final String FIND_JOB_LIST_FOR_LOC_CAMP = "Job.findJobListForLocAndCamp";


    public final String FIND_ALL_JOB_LIST_TO_LINK_DESC = "Job.findAllJobListToLinkDesc";
    public final String FIND_ALL_JOB_LIST_TO_LINK_INT_DESC = "Job.findAllJobListToLinkIntDesc";
    public final String FIND_ALL_JOB_LIST_TO_LINK_ASC = "Job.findAllJobListToLinkAsc";
    public final String FIND_ALL_JOB_LIST_TO_LINK_INT_ASC = "Job.findAllJobListToLinkIntAsc";

    public final String FIND_JOB_LIST_TO_LINK_DESC = "Job.findJobListToLinkDesc";
    public final String FIND_JOB_LIST_TO_LINK_INT_DESC = "Job.findJobListToLinkIntDesc";
    public final String FIND_JOB_LIST_TO_LINK_ASC = "Job.findJobListToLinkAsc";
    public final String FIND_JOB_LIST_TO_LINK_INT_ASC = "Job.findJobListToLinkIntAsc";

    public final String FIND_ALL_CONTEST_JOB_LIST_TO_LINK_ASC = "Job.findAllContestJobListToLinkAsc";
    public final String FIND_ALL_CONTEST_JOB_LIST_TO_LINK_DESC = "Job.findAllContestJobListToLinkDesc";
    public final String FIND_ALL_CONTEST_JOB_LIST_TO_LINK_INT_ASC = "Job.findAllContestJobListToLinkIntAsc";
    public final String FIND_ALL_CONTEST_JOB_LIST_TO_LINK_INT_DESC = "Job.findAllContestJobListToLinkIntDesc";

    public final String FIND_CONTEST_JOB_LIST_TO_LINK_ASC = "Job.findContestJobListToLinkAsc";
    public final String FIND_CONTEST_JOB_LIST_TO_LINK_DESC = "Job.findContestJobListToLinkDesc";
    public final String FIND_CONTEST_JOB_LIST_TO_LINK_INT_ASC = "Job.findContestJobListToLinkIntAsc";
    public final String FIND_CONTEST_JOB_LIST_TO_LINK_INT_DESC = "Job.findContestJobListToLinkIntDesc";


    public final String FIND_ALL_JOB_LIST_TO_LINK_COUNT = "Job.findAllJobListToLinkCount";
    public final String FIND_ALL_JOB_LIST_FOR_CAMPAIGN_COUNT = "Job.findALLJobListForCampaignCount";

    public final String FIND_JOB_LIST_TO_LINK_COUNT = "Job.findJobListToLinkCount";
    public final String FIND_JOB_LIST_FOR_CAMPAIGN_COUNT = "Job.findJobListForCampaignCount";

    public final String FIND_ALL_CONTEST_JOB_LIST_TO_LINK_COUNT = "Job.findAllContestJobListToLinkCount";
    public final String FIND_ALL_CONTEST_JOB_LIST_FOR_CAMPAIGN_COUNT = "Job.findAllContestJobListForCampaignCount";

    public final String FIND_CONTEST_JOB_LIST_TO_LINK_COUNT = "Job.findContestJobListToLinkCount";
    public final String FIND_CONTEST_JOB_LIST_FOR_CAMPAIGN_COUNT = "Job.findContestJobListForCampaignCount";


    //public final String FIND_JOB_LIST_FOR_LOCATION_COUNT = "Job.findJobListForLocationCount";
    //public final String FIND_JOB_LIST_FOR_LOC_CAMP_COUNT = "Job.findJobListForLocAndCampCount";

    public final String FIND_CONTEST_JOB_LIST_FOR_CAMPAIGN = "Job.findContestJobListForCampaign";
    //public final String FIND_CONTEST_JOB_LIST_FOR_LOCATION = "Job.findContestJobListForLocation";
    //public final String FIND_CONTEST_JOB_LIST_FOR_LOC_CAMP = "Job.findContestJobListForLocAndCamp";
    public final String FIND_EMP_REWARDS_IN_PROCESS = "EmplReward.findEmpRewardsInProcess";
    public final String FIND_EMP_REWARDS_EARNED = "EmplReward.findEmpRewardsEarned";
    public final String FIND_JOBREWARD_AMT = "JobReward.findAmtReward";
    public final String FIND_JOBREWARD_AMT_JOBS = "JobReward.findAmtRewardJobs";
    public final String FIND_ALL_JOBREWARDS = "JobReward.findJobAllRewards";
    public final String FIND_ALL_JOBREWARDSCONFIG = "JobReward.findJobAllRewardsConfigs";

    //public final String FIND_CONTEST_JOB_LIST_FOR_LOCATION_COUNT = "Job.findContestJobListForLocationCount";
    //public final String FIND_CONTEST_JOB_LIST_FOR_LOC_CAMP_COUNT = "Job.findContestJobListForLocAndCampCount";

    public final String FETCH_BAND_N_REWARD = "JobRewardRule.findBandNRewardByCompany";
    public final String FETCH_REWARD_TYPE_MSTR_LANG = "RewardTypeMstrLang.findRewardTypeLangValues";
    public final String FETCH_RECRUITERSID_N_JOB = "UserProfile.findRecruitersIDByJobSeq";


    public final String FIND_EMPREFRL_COUNT = "EmplRefrl.findRefrlCount";
    public final String FIND_EMPREFRL_COUNT_ALL_ROUNDS = "EmplRefrl.findRefrlCountAllRounds";
    public final String FIND_EMPLREFRL_COUNT_ALL_ROUNDS_STATS = "EmplRefrl.findRefrlCountAllRoundsStats";
    //public final String FIND_EMP_REWARDS = "EmplReward.findRewards";
    public final String FIND_EMP_TOTAL_REWARD_QTY = "EmplReward.findEmployeeTotalRewardQty";
    public final String FIND_EMP_LEVEL_DETAILS = "EmplLevel.findEmployeeLevelDetails";
    public final String FIND_EMP_REWARD_WITH_LEVEL_DETAILS = "EmplReward.findEmpRewardWithLevelDetails";
    public final String FIND_EMP_INPROCESS_REWARDAMOUNT = "EmplRefrl.JobReward.findEmpRewardAmountInProcess";
    public final String FIND_CURRENCY_SYMBOL = "CompanyMstr.findCurrencySymbol";
    public final String FETCH_EMP_CURRENCY_REWARDS = "EmplReward.findEmployeeCurrencyRewardQty";
    public final String FETCH_ALL_EMPLREFRL_FOR_CANDIDATE_BY_EMPLREFRL_SEQ = "EmplRefrl.fetchAllEmplRefrlForCandidateByEmplRefrlSeq";



    public final String FIND_ALL_GOALS = "Goal.findAllGoals";
    public final String FIND_ALL_NOTCOMPLETEDGOALS_FOR_ACTIVITY = "GoalActivity.findAllNotCompletedGoalsForActivity";
    public final String FIND_ALL_EMP_GOALS_LANG = "EmplGoal.findAllGoalsLang";
    public final String FIND_ALL_EMP_GOALS = "EmplGoal.findAllGoals";
    public final String FIND_ALL_BADGES = "RewardBadge.findAllBadges";
    public final String FIND_ALL_BADGES_LANG = "RewardBadge.findAllBadgeslang";
    public final String FIND_ALL_EMP_BADGES = "EmplBadges.findAllBadges";
    public final String FIND_ALL_MEDALS = "RewardMedal.findAllMedals";
    public final String FIND_ALL_EMP_MEDALS = "EmplMedal.findAllMedals";
    public final String FIND_TOP_PLAYERS = "EmplReward.findTopPlayers";
    public final String FETCH_JOB_COUNT = "Job.fetchJobCount";
    public final String FETCH_JOB_COUNT_All_COMPANY = "Job.fetchJobCountAllCompany";
    public final String FETCH_JOB_SEARCH_COUNT = "Job.fetchJobSearchCount";
    public final String FETCH_JOB_SEARCH_COUNT_ALL_COMPANY = "Job.fetchJobSearchCountAllCompany";
    public final String FIND_EMPREFRL_DETAILS = "EmplRefrl.findRefrlDetails";
    public final String FIND_EMPLREFRL_DETAILS = "EmplRefrl.findEmpRefrlDetails";
    public final String FNID_ALL_EMPREFRL_DETAILS = "EmplRefrl.findAllEmpRefrlDetails";
    public final String FIND_ALL_EMPREFRL_DETAILS_WITH_INTERVIEWSTAGE = "EmplRefrl.findAllEmpRefrlDetailsWithInterviewStage";
    public final String FIND_EMPREFRL_NETSTAT = "EmplRefrl.findRefrlNetStat";
    public final String FIND_EMP_BY_USERID = "EmployeeMstr.findEmployeeByUserID";
    public final String FIND_EMP_BY_USERIDAI = "EmployeeMstr.findEmployeeByUserIDAI";
    public final String FIND_EMP_BY_USER_LOGIN_ID = "EmployeeMstr.findEmpByUserLoginID";
    public final String FIND_EMP_COUNT = "EmployeeMstr.findEmployeeCount";
    public final String FIND_ALL_EMPLOYEE_DISPLAYLIST = "EmployeeMstr.findAllEmployeeDisplayList";
    public final String FIND_RECRUITER_DISPLAYLIST = "EmployeeMstr.findRecruiterDisplayList";
    public final String FIND_RECRUITER_LIST = "EmployeeMstr.findRecruiterList";
    public final String FIND_EMPLOYEE_LIST = "EmployeeMstr.findEmployeeList";
    public final String FIND_EMPLOYEE_DISPLAYLIST = "EmployeeMstr.findEmployeeDisplayList";
    public final String FIND_EMP_USERPROFILE_BYEMAIL = "EmployeeMstr.findUserProfileByEmail";
    public final String FIND_USER_BY_USERID_COMPANY = "UserProfile.findUserByUserIDCompany";
    public final String FETCH_EMPLOYEE_BY_COMPANY_EMPLOYEE_ID = "EmployeeMstr.fetchEmployeeByCompanyEmployeeID";
    public final String FIND_EMP_USERPROFILE_BYEMAILADDRESS = "EmployeeMstr.findUserProfileByEmailAdress";
    public final String FIND_EMP_USERPROFILE_BYEMAILADDRESS_AI = "EmployeeMstr.findUserProfileByEmailAddressAI";
    public final String COUNT_EMPLOYEE_BY_COMPANY_EMPLOYEE_ID = "EmployeeMstr.countEmployeeByCompanyEmployeeID";
    public final String FIND_EMPLOYEE_BY_COMPANY_AND_EMAIL = "EmployeeMstr.findEmployeeByCompanyAndEmailAdress";
    public final String FIND_EMPLOYEE_BY_COMPANY_AND_EMAIL_AI = "EmployeeMstr.findEmployeeByCompanyAndEmailAdressAI";
    public final String FIND_ALL_EMPLOYEE_BY_COMPANY_AND_EMAIL = "EmployeeMstr.findAllEmployeeByCompanyAndEmailAdress";
    //todo
    public final String FIND_ALL_EMPLOYEE_BY_COMPANY_AND_EMAIL_AND_PROFILE_SEQ = "EmployeeMstr.findAllEmployeeByCompanyAndEmailAdressAndProfileSeq";

    public final String FIND_ALL_CAMPAIGNS = "Campaign.findAllCampaigns";
    public final String FIND_OTHER_CAMPAIGNS = "Campaign.findOtherCampaigns";
    public final String FIND_ALL_CAMPAIGN_JOBS_ASC = "CampaignJob.findCampaignJobsASC";
    public final String FIND_ALL_CAMPAIGN_JOBS_ASC_INT = "CampaignJob.findCampaignJobsIntASC";
    public final String FIND_ALL_CAMPAIGN_JOBS_DESC = "CampaignJob.findCampaignJobsDESC";
    public final String FIND_ALL_CAMPAIGN_JOBS_DESC_INT = "CampaignJob.findCampaignJobsIntDESC";
    public final String FIND_ALL_JOBS_IN_CAMPAIGN = "CampaignJob.findAllJobsInCampaign";
    public final String FIND_CAMPAIGN_JOBS_ACS = "CampaignJob.findCampaignJobsFilterASC";
    public final String FIND_CAMPAIGN_JOBS_DESC = "CampaignJob.findCampaignJobsFilterDESC";
    public final String FIND_CAMPAIGN_JOBS_FILTER_COUNT = "CampaignJob.findCampaignJobsFilterCount";
    public final String FIND_RECRUITER_JOBS_ACS = "JobRecruiter.findRecruiterJobsFilterASC";
    public final String FIND_RECRUITER_JOBS_DESC = "JobRecruiter.findRecruiterJobsFilterDESC";
    public final String FIND_ALL_RECRUITER_JOBS_ACS = "JobRecruiter.findRecruiterAllJobsFilterASC";
    public final String FIND_ALL_RECRUITER_JOBS_DESC = "JobRecruiter.findRecruiterAllJobsFilterDESC";
    public final String FIND_RECRUITER_JOBS_COUNT = "JobRecruiter.findRecruiterJobsFilterCount";
    public final String FIND_RECRUITER_ALL_JOBS_COUNT = "JobRecruiter.findRecruiterAllJobsFilterCount";
    public final String FIND_ALL_CAMPAIGN_JOBS_STATUS = "CampaignJob.findCampaignJobsStatus";
    public final String FIND_ALL_CAMPAIGN_JOBS_COUNT = "CampaignJob.findCampaignJobsCount";
    public final String FIND_ALL_CAMPAIGN_ACTIVE_JOBS = "CampaignJob.findCampaignActiveJobs";
    public final String FIND_SELECTED_CAMPAIGN_JOBS = "CampaignJob.findSelectedCampaignJobs";
    public final String FIND_ALL_CONTESTS = "Contest.findAllContests";
    public final String FIND_ALL_CONTEST_JOBS = "ContestJob.findContestJobs";
    public final String FIND_ALL_CONTEST_JOB = "ContestJob.findContestJob";
    public final String FIND_ALL_JOBS_FORCONTEST = "ContestJob.findAllJobsForContest";
    public final String FIND_SELECTED_CONTEST_JOBS = "ContestJob.findSelectedContestJobs";
    public final String FIND_REVIEW_JOBS_ACS = "JobReview.findJobsReviewFilterASC";
    public final String FIND_REVIEW_JOBS_DESC = "JobReview.findJobsReviewFilterDESC";
    public final String FIND_ALL_REVIEW_JOBS_COUNT = "JobReview.findAllReviewJobsFilterCount";
    public final String FIND_REVIEW_JOBS_COUNT = "JobReview.findReviewJobsFilterCount";
    public final String FIND_RECRUITER_ALL_JOBS_REQUEST_COUNT = "JobRecruiter.findRecruiterAllJobsRequestFilterCount";
    public final String FIND_RECRUITER_JOBS_REQUEST_DESC = "JobRecruiter.findRecruiterJobsRequestFilterDESC";
    public final String FIND_RECRUITER_JOBS_REQUEST_ACS = "JobRecruiter.findRecruiterJobsRequestFilterASC";
    public final String FIND_ALL_RECRUITER_JOBS_REQUEST_DESC = "JobRecruiter.findRecruiterAllJobsRequestFilterDESC";
    public final String FIND_ALL_RECRUITER_JOBS_REQUEST_ACS = "JobRecruiter.findRecruiterAllJobsRequestFilterASC";
    public final String FIND_RECRUITER_JOBS_REQUEST_COUNT = "JobRecruiter.findRecruiterJobsRequestFilterCount";



    public final String FIND_CAMPAIGN_JOB_REFRLSTATUS_COUNT = "EmplRefrl.findCampaignJobRefrlStatusCount";
    public final String FIND_ALL_CAMPAIGN_JOB_REFRLSTATUS_COUNT = "EmplRefrl.findAllCampaignJobRefrlStatusCount";
    public final String FIND_ALL_CAMPAIGN_JOB_ALL_REFRLSTATUS_COUNT = "EmplRefrl.findAllCampaignJobAllRefrlStatusCount";
    public final String FIND_CAMPAIGN_JOB_ALL_REFRLSTATUS_COUNT = "EmplRefrl.findCampaignJobAllRefrlStatusCount";
    public final String FIND_ALL_CAMPAIGN_JOB_INTERVIEW_STAGE_COUNT = "EmplRefrl.findAllCampaignJobInterviewStageCount";
    public final String FIND_CAMPAIGN_JOB_INTERVIEW_STAGE_COUNT = "EmplRefrl.findCampaignJobInterviewStageCount";
    public final String FIND_CONTEST_JOB_REFRL_COUNT = "EmplRefrl.findContestJobRefrlCount";
    public final String FIND_CONTEST_JOB_INTERVIEW_STAGE_COUNT = "EmplRefrl.findContestJobInterviewStageCount";
    public final String FIND_INTERVIEW_STAGE_ROUNDS = "InterviewStageMstr.findInterviewStageRounds";
    public final String FIND_CANDIDATE_SOURCES = "CandidateSources.findSources";
    public final String FIND_INTERVIEW_STAGE_ROUND_TITLES = "InterviewStageMstr.findInterviewStageRoundTitles";
    public final String FIND_GOAL_POINTS = "Reward.findGoalsPoints";
    public final String FIND_EMPREFRL_FOR_JOB = "EmplRefrl.findRefrlsForJob";
    public final String FIND_ALL_ACTIVECONTESTS = "Contest.findAllActiveContests";
    public final String FIND_OTHER_CONTESTS = "Contest.findOtherContests";
    public final String FIND_ALL_CLOSEDCONTESTS = "Contest.findAllClosedContests";
    public final String FIND_CONTEST_BY_CONTESTBYID = "Contest.findContestByContestID";
    public final String FIND_CAMPAIGN_EMPLOYEE_PARTICIPATION = "EmplRefrl.findCampaignEmployeeParticipation";
    public final String FIND_ALL_CAMPAIGN_RECRUITERS = "CampaignRecruiter.findAllCampaignRecuiters";
    public final String FIND_CAMPAIGN = "Campaign.findCampaign";
    public final String FIND_DEFAULT_CAMPAIGN = "Campaign.findDefaultCampaign";
    public final String FIND_CONTEST_EMPLOYEE_PARTICIPATION = "EmplRefrl.findContestEmployeeParticipation";
    public final String FIND_ALL_CONTEST_RECRUITERS = "ContestRecruiter.findAllContestRecuiters";

    public final String FIND_CONTEST = "Contest.findContest";
    public final String FETCH_EMAIL_CONFIG = "email.findEmailConfig";
    public final String FETCH_ALL_COMPANIES_WITH_EMAIL_CONFIG = "email.findAllCompaniesWithEmailConfig";
    public final String FIND_ALL_RECRUITER_CAMPAIGNS = "CampaignRecruiter.findAllRecuiterCampaigns";
    public final String FIND_USER_PROFILE_BY_ID = "UserProfile.findUserProfileById";
    public final String FIND_ALL_USER_PROFILE_BY_ID = "UserProfile.findAllUserProfileById";
    public final String FIND_USER_PROFILE_BY_ID_AND_EMAIL = "UserProfile.findUserProfileByIdAndEmail";
    public final String FIND_USER_PROFILE_BY_ID_AND_COMPANY = "UserProfile.findUserProfileByIdAndCompany";
    public final String FIND_CAMPAIGNS = "Campaign.findCampaigns";
    public final String FETCH_CONTEST_JOBS_COUNT = "ContestJob.fetchContestJobCount";
    public final String FETCH_CLOSED_CONTEST_JOBS_COUNT = "ContestJob.fetchClosedContestJobCount";
    public final String FETCH_POSITIONS_CLOSED_CONTEST_JOB_COUNT = "EmplRefrl.fetchContestJobsPositionClosedRefrlCount";
    public final String FETCH_CONTEST_JOBS_REFERRED_COUNT = "EmplRefrl.fetchContestJobsReferredRefrlCount";
    public final String FETCH_PARTICIPATION_CONTEST_JOB_COUNT = "EmplRefrl.fetchTotalContestParticipationCount";
    public final String FIND_CANDIDATE_DETAILS = "Candidate.findCandidateDetails";
    public final String FIND_EMPL_REFRL_DETAILS = "EmplRefrl.findEmplRefrlDetails";
    public final String FIND_JOB_DETAILS = "Job.findJobDetails";
    public final String FIND_JOBS_LOCATION_DETAILS = "Job.findJobsLocationsDetails";
    public final String FIND_JOBS_TITLE = "Job.findJobTitle";
    public final String FIND_JOBS_ON_TITLE = "Job.findJobOnTitle";
    public final String FIND_JOB_BY_TITLE = "Job.findJobByTitle";
    public final String FETCH_JOB_ELIGIBLE_FOR_CONTEST = null;
    public final String FIND_JOB_VIEWS = "JobViews.findJobViews";

    public final String FETCH_JOB_REWARD_TYPE = "JobRewardType.fetchRewardTypeByParentCompany";
    public final String FETCH_JOB_REWARD_CONFIG_VALUES = "JobRewardPolicy.fetchRewardConfigValuesByParentCompany";

    public final String FIND_ACTIVITYSTAGE_REWARDS = "ActivitystageReward.findAcivityRewards";
    public final String FIND_GOAL_ACTIVITY = "Activity.findGoalActivity";
    public final String FIND_ALL_EMPL_GOAL_ACTIVITY_COUNT = "EmplActivity.findAllEmplGoalActivityCount";
    public final String FIND_EMPL_ACTIVITY_COUNT = "EmplActivity.findActivityCount";
    public final String FETCH_ACTIVITIES_REWARDED = "EmpActivity.findActivitiesRewardedToday";

    public final String FIND_ALL_CAMPAIGN_JOBSEQ = "CampaignJob.findCampaignJobSeq";
    public final String FIND_ALL_CAMPAIGN_FROM_JOBSEQ = "CampaignJob.findCampaignFromJobSeq";
    public final String FIND_ALL_CAMPAIGN_JOB_COUNT = "CampaignJob.findAllCampaignJobCount";
    public final String FIND_ALL_CONTEST_JOB_COUNT = "ContestJob.findAllContestJobCount";
    public final String FIND_CAMPAIGN_SEQ_FROM_JOBSEQ = "CampaignJob.findCampaignSeqFromJobSeq";
    public final String FIND_CONTEST_SEQ_FROM_JOB_SEQ = "ContestJob.findContestSeqFromJobSeq";
    public final String FIND_CAMPAIGN_JOB = "CampaignJob.findCampaignJob";
    public final String FIND_ALL_CAMPAIGN_CLOSEDJOBCOUNT = "CampaignJob.findCampaignClosedJobCount";
    public final String FIND_CAMPAIGN_LIST_CLOSEDJOBCOUNT = "CampaignJob.findCampaignListClosedJobCount";
    public final String FIND_CAMPAIGN_LIST_JOB_COUNT_BY_STATUS = "CampaignJob.findCampaignListJobCountByStatus";
    public final String FIND_CAMPAIGN_JOB_COUNT_BY_STATUS = "CampaignJob.findCampaignJobCountByStatus";
    public final String FIND_CONTEST_LIST_CLOSEDJOBCOUNT = "ContestJob.findContestListClosedJobCount";
    public final String FIND_ALL_CAMPAIGN_FROM_CAMPAIGN_SEQ = "Campaign.findAllCampaignFromCampaignSeq";
    public final String FIND_ALL_CAMPAIGN_CANDIDATECLICKS = "EmplRefrl.findCampaignCandidateClicks";
    public final String FIND_CAMPAIGN_CANDIDATE_CLICK_STATS = "EmpRefrl.findCampaignCandidateClickStats";
    public final String FIND_CAMPAIGN_RESPONDED_CANDIDATE_STATS = "EmpRefrl.findCampaignRespondedCandidateStats";
    public final String FIND_COMPANY_CANDIDATE_SOURCE_STAT = "EmpRefrl.findCompanyCandidateSourceStat";
    public final String FIND_CONTEST_JOB_REFRL_OFFERED_HIRED_COUNT = "";
    public final String FIND_CAMPAIGN_ACTIVE_JOBS_COUNT = "CampaignJob.findCampaignJobsCount";
    public final String FIND_CAMPAIGN_LIST = "Campaign.findCampaignList";

    public final String FIND_JOB_REWARD_BY_COMPANY_SEQ = "JobReward.FindJobRewardByCompanySeq";
    public final String FIND_REWARD_TYPE_LOCAL_DESC = "Reward.FindRewardTypeLocalDescByRewardSeq";
    public final String FIND_EMP_INPROCESS_REWARDAMOUNT_BAND = "EmplRefrl.JobReward.findEmpRewardAmountInProcessBand";
    public final String FIND_EMP_INPROCESS_REWARDAMOUNT_BAND_OTHERS = "EmplRefrl.JobReward.findEmpRewardAmountInProcessBandOther";


    public final String FIND_PASSWORD_BY_ID = "UserProfile.findPasswordByUserID";
    public final String FIND_USER_PROFILE_BY_TOKEN = "UserProfile.findUserProfileByToken";


    public final String FIND_ALL_CANDIDATES_COUNT_PER_ROUND = "EmplRefrl.FindAllCandidateCountPerRound";
    public final String FIND_ALL_CANDIDATES_COUNT_IN_ROUND12345 = "EmplRefrl.FindAllCandidateCountPerRound12345";
    public final String FIND_ALL_CANDIDATES_CLICKS_PER_COMPANY = "EmplRefrl.FindAllCandidateClicksPerCompany";
    public final String FIND_ALL_EMPLOYEE_LOGINS_PER_COMPANY = "LoginHistory.FindTotalEmployeeLoginsPerCompany";
    public final String FIND_ALL_EMPLOYEE_PARTICIPATED_PER_COMPANY = "UserProfile.FindTotalEmployeeParticipatedPerCompany";

    public final String FETCH_ALL_APPLIED_CANDIDATE_IDS = "EmplRefrl.FetchAllAppliedCandiadateIds";
    String FETCH_ALL_NOT_REJECTED_CANDIDATE_IDS = "EmplRefrl.FetchAllNotRejecteCandiadateIds";
    String FETCH_ALL_REJECTED_CANDIDATE_IDS = "EmplRefrl.FetchAllRejecteCandiadateIds";
    //Common Master Data Fetch Queries

    public final String FIND_VENDOR_COUNT = "VendorMstr.findAllVendorCount";
    public final String FIND_VENDOR_COUNT_BY_STATUS = "VendorMstr.findAllVendorCountByStatus";
    public final String FIND_EXISTING_VENDOR = "VendorMstr.findVendorId";

    public final String FIND_VENDOR_USERPROFILESEQ = "VendorMstr.findVendorUserProfileSeq";
    public final String FIND_VENDOR_USERPROFILESEQ_UPDATEBY = "VendorMstr.findVendorUserProfileSeqUpdateBy";

    public final String FIND_REFRLSTATUS_BYREFRLCODE = "RefrlStatusMstr.findRefrlStatusMstrByCd";
    public final String FIND_REFRLSTATUS_SEQ_CD_BY_COMPANY = "RefrlStatusMstr.findRefrlStatusMstrSeqCdByCompanyID";
    public final String FETCH_COMPANY_DETAILS = "CompanyMstr.fetchCompanyDetailsBySeq";
    public final String FETCH_COMPANY_INFO_BY_COMPANY_MSTR_SEQ = "CompanyInfo.fetchCompanyInfoByCompanyMstrSeq";

    public final String FETCH_COMPANY_CONFIG = "CompanyConfig.fetchConfigDetailsByCompany";
    public final String FETCH_COMPANY_CONFIGS_ALL_COS = "CompanyConfig.fetchConfigDetailAllCompanies";
    public final String FIND_ALL_CONTEST_CLOSEDJOBCOUNT = "ContestJob.findContestClosedJobCount";
    public final String FIND_ALL_CONTEST_FROM_CONTEST_SEQ = "Contest.findAllContestFromContestSeq";
    public final String FIND_ALL_CONTEST_JOBSEQ = "ContestJob.findContestJobSeq";
    public final String FIND_ALL_JOBSEQ_OF_CONTEST = "ContestJob.findAllJobSeqOfContest";
    public final String FIND_REFRL_CHANNEL_TITLE = "RefrlChannelMstr.findRefrlChannelMstrDesc";
    public final String FIND_ALL_RELATIONSHIP = "RelationshipMstr.findRelationshipMstr";

    public final String FIND_CONTEST_JOB = "ContestJob.findContestJob";
    public final String FIND_CONTEST_JOB_REFRLSTATUS_COUNT = "EmplRefrl.findContestJobRefrlStatusCount";
    public final String FIND_CONTEST_JOB_ALL_REFRLSTATUS_COUNT = "EmplRefrl.findContestJobAllRefrlStatusCount";
    public final String FIND_CONTEST_CANDIDATE_CLICK_STATS = "EmpRefrl.findContestCandidateClickStats";
    public final String FIND_CONTEST_RESPONDED_CANDIDATE_STATS = "EmpRefrl.findContestRespondedCandidateStats";
    public final String FIND_ALL_CONTEST_CANDIDATECLICKS = "EmplRefrl.findContestCandidateClicks";

    public final String FIND_ALL_FB_FRIENDS = "FbUserNetwork.findFriendProfiles";
    public final String FIND_FB_FRIENDS_BY_ID = "FbUserNetwork.findFriendProfileById";
    public final String FIND_FB_FRIENDS_BY_NAME = "FbUserNetwork.findFriendProfileByName";

    public final String FIND_ALL_RECRUITER_JOBS = "JobRecruiter.findRecruiterJobs";
    public final String FIND_ALL_RECRUITER_ALL_JOBS = "JobRecruiter.findRecruiterAllJobs";
    public final String FETCH_RECRUITER_CLOSED_JOBS_COUNT = "JobRecruiter.findRecruiterClosedJobCount";
    public final String FETCH_RECRUITER_ALL_CLOSED_JOBS_COUNT = "Job.findRecruiterAllClosedJobCount";
    public final String FETCH_RECRUITER_TOTAL_JOBS_COUNT = "JobRecruiter.findRecruiterJobCount";
    public final String FIND_ALL_RECRUITER_EMP_REFRLS = "EmplRefrl.findRecruiterEmpRefrls";
    public final String GET_CANDIDATES_LISTING = "EmplRefrl.getCandidateListing";
    public final String FIND_RECRUITER_CONTEST_EMP_REFRLS = "EmplRefrl.findContestRecruiterEmpRefrls";
    public final String FIND_ALL_RECRUITER_EMP_REFRLS_BY_REFRL_STATUS_CD = "EmplRefrl.findRecruiterEmpRefrlsByRefrlStatusCd";
    public final String FIND_RECRUITER_CONTEST_EMP_REFRLS_BY_REFRL_STATUS_CD = "EmplRefrl.findContestRecruiterEmpRefrlsByRefrlStatusCd";

    public final String FIND_REFRL_CHANNEL_BY_CODE = "RefrlChannelMstr.findRefrlChannelMstrByCd";
    public final String FIND_REFRL_CHANNEL_BY_SEQ = "RefrlChannelMstr.findRefrlChannelMstrBySeq";
    public final String FIND_REFRL_CHANNEL_BY_SEQ_MULTI_COMPANY = "RefrlChannelMstr.findRefrlChannelMstrBySeqMultiCompany";
    public final String FIND_CANDIDATE_INTERVIEW_DETAILS = "InterviewDetails.findCandidateInterviewDetails";
    public final String FIND_INTERVIEW_DETAILS_BY_RHID_AND_JOB_SEQ = "InterviewDetails.findInterviewDetailsByRHIDandJobSeq";
    public final String FIND_CANDIDATE_INTERVIEW_COMMENTS = "InterviewComments.findCandidateInterviewComments";
    public final String FIND_CANDIDATE_ROUND_INTERVIEWERS = "Interviewer.findCandidateRoundInterviewers";
    public final String FIND_CANDIDATE_ROUND_INTERVIEWERS_FOR_NON_EXIST_EMP = "Interviewer.findCandidateRoundInterviewersForNonExistEmp";
    public final String FIND_CANDIDATE_ROUND_INTERVIEWER_TOKEN_BY_EMAIL = "Interviewer.findCandidateRoundInterviewersTokenByEmail";
    public final String FIND_CANDIDATE_ROUND_INTERVIEWER_TOKEN_NON_EXISTING_EMP = "Interviewer.findCandidateRoundInterviewersTokenByEmailNonExisiting";
    public final String FIND_CANDIDATE_ALL_ROUNDS_INTERVIEWERS = "Interviewer.findCandidateAllRoundsInterviewers";
    public final String FIND_CANDIDATE_ROUND_INTERVIEWER_EMAILS = "Interviewer.findCandidateRoundInterviewerEmails";
    public final String FIND_CANDIDATE_ROUND_INTERVIEWER_EMAILS_NON_EXISTING_EMP = "Interviewer.findCandidateRoundInterviewerEmailsForNonExistingEmp";
    public final String FIND_CANDIDATE_INTERVIEW_DETAIL_SEQ = "InterviewDetails.findCandidateInterviewDetailSeq";
    public final String FIND_CURRENT_ROUND_INTERVIEW_DETAILS = "InterviewDetails.findCurrentRoundInterviewDetails";
    public final String FIND_RECENT_INTERVIEW_STAGE_MSTR_BY_ROUND_CODE = "InterviewDetails.findRecentInterviewStageMstrByRoundCode";
    public final String FIND_RECENT_INTERVIEW_DETAILS_BY_ROUND_CODE = "InterviewDetails.findRecentInterviewDetailsByRoundCode";
    public final String FIND_CANDIDATE_INTERVIEW_SKILL_RATING = "InterviewSkillRating.findCandidateInterviewSkillRating";
    public final String FIND_REFERRAL_CHANNEL_NAME = "RefrlChannelMstr.findReferralChannelName";
    public final String FIND_LOCATIONLIST = "LocationMstr.findlocationlist";
    public final String FIND_LOCATION_BYCITY = "LocationMstr.findLocationByCity";

    public final String FIND_VENDOR_BYID = "VendorMstr.findVendorById";
    public final String FIND_ALL_VENDOR_BYID = "VendorMstr.findAllVendorById";
    public final String FIND_VENDOR_BYMSTRSEQ = "VendorMstr.findVendorByMstrSeq";
    public final String FIND_ALL_LOCATIONS = "LocationMstr.findAllLocations";
    public final String Find_Parent_Company_Config = "ParentCompany.findConfigByCompanySeq";
    public final String FIND_REWARD_TYPE_CODE = "RewardTypeMstr.findRewardTypeCdByRewardSeq";
    public final String FIND_RUPEE_VALUE = "Currency.FindRupeeValueByCompanySeq";
    public final String FIND_BATCH_PROCESS_LOG_BYNAME = "BatchProcessLog.FindBatchProcessLogByName";
    public final String FIND_VENDOR_CATERGORY_BYSEQ = "VendorCategory.findVendorCategoryBySeq";
    public final String FETCH_JOB_CHANNEL_BY_JOB_AND_CHANNEL = "JobChannelMstr.fetchJobChannelMstrByJobSeqAndChannel";

    public final String FETCH_CAMPAIGNJOBS_BY_JOBSEQ = "CampaignJobs.findCampaignJobsByJobSeq";

    public final String FIND_REPORT_LOCATIONLIST = "LocationMstrLang.findAllLocations";

    //Reward Queries
    public final String FIND_ACTIVITYREWARDS = "Reward.findActivityRewards";
    public final String FIND_ACTIVITYREWARDS_BY_CD = "Reward.findActivityRewardsByCd";
    public final String FIND_GOALREWARDS = "GoalReward.findGoalRewards";
    public final String FIND_EMPL_LEVEL = "EmplLevel.findEmplLevel";
    public final String FIND_ALL_CONTESTREWARDS = "ContestReward.findAllContestRewards";
    public final String FIND_LEVEL_REWARDS = "LevelReward.findLevelRewards";
    public final String FIND_GOAL_REWARD_LIST = "GoalReward.findGoalRewardList";
    public final String FIND_EMP_REWARDS = "EmplReward.findDistEmplReward";
    public final String FIND_USER_PROFILE_BY_SEQ = "UserProfile.FindUserProfileBySeq";
    public final String USER_LOCATION_REWARD = "Reward.FindRewardForUserLocation";
    public final String FIND_CURRENCY_SYMBOL_COMPANY = "CompanyMstr.findCurrencySymbolByCompany";
    public final String FIND_REWARDAMT_JOB = "JobReward.findAmtRewardForJob";
    public final String FIND_REWARDAMT_JOBS = "JobReward.findAmtRewardForJobs";
    public final String FIND_REWARDAMT_COMPANY = "JobReward.findAmtRewardCompany";
    public final String JOB_LOCATION_REWARD = "Reward.FindRewardForJobLocation";
    public final String FIND_REWARDAMT_CONFIG_COMPANY = "JobReward.findRewardAmtConfigCompany";
    //employee performance queries
    public final String FIND_TOPPLAYER = "EmplLevel.findTopPlayer";
    public final String FIND_APP_TOPPLAYER = "EmplLevel.findAppTopPlayer";
    public final String FIND_CANDIDATE_INTERVIEW_STAGE_MSTR_SEQ = "EmplRefrl.findCandidateInterviewStageMstrSeq";

    public final String FIND_ELIMINATED_WINNERS_BY_REFERRAL = "ContestWinner.findEliminatedWinnersByReferral";
    public final String FIND_ELIMINATED_WINNERS_BY_HIRE = "ContestWinner.findEliminatedWinnersByHire";
    public final String FIND_EMPL_REFRL = "EmplRefrl.findEmplRefrl";
    public final String FIND_RECRUITER_CANDIDATE_INTERVIEW_STAGE_COUNT = "EmplRefrl.findRecruiterCandidateInterviewStageCount";
    public final String FIND_RECRUITER_CANDIDATE_INTERVIEW_STAGE_COUNT_BY_JOB = "EmplRefrl.findRecruiterCandidateInterviewStageCountByJob";
    public final String FIND_RECRUITER_CANDIDATE_INTERVIEW_STAGE_COUNT_BY_CAMPAIGN_SEQ_JOB_SEQ = "EmplRefrl.findRecruiterCandidateInterviewStageCountByCampaignSeqJobSeq";
    public final String FIND_RECRUITER_CANDIDATE_INTERVIEW_STAGE_COUNT_BY_CONTEST_SEQ = "EmplRefrl.findRecruiterCandidateInterviewStageCountByContestSeq";
    public final String FIND_RECRUITER_CANDIDATE_INTERVIEW_STAGE_COUNT_BY_CONTEST_SEQ_JOB_SEQ = "EmplRefrl.findRecruiterCandidateInterviewStageCountByContestSeqJobSeq";
    public final String FIND_RECRUITER_CANDIDATE_REFRL_STATUS_COUNT = "EmplRefrl.findRecruiterCandidateRefrlStatusCount";
    public final String FIND_RECRUITER_CANDIDATE_REFRL_STATUS_COUNT_BY_JOB = "EmplRefrl.findRecruiterCandidateRefrlStatusCountByJob";
    public final String FIND_RECRUITER_CANDIDATE_REFRL_STATUS_COUNT_BY_CAMAPIGN_SEQ_JOB_SEQ = "EmplRefrl.findRecruiterCandidateRefrlStatusCountByCampaignSeqJobSeq";
    public final String FIND_RECRUITER_CANDIDATE_REFRL_STATUS_COUNT_BY_CONTEST_SEQ = "EmplRefrl.findRecruiterCandidateRefrlStatusCountByContestSeq";
    public final String FIND_RECRUITER_CANDIDATE_REFRL_STATUS_COUNT_BY_CONTEST_SEQ_JOB_SEQ = "EmplRefrl.findRecruiterCandidateRefrlStatusCountByContestSeqJobSeq";
    public final String FIND_RECRUITER_CANDIDATE_REFRL_STATUS_COUNT_BY_CAMPAIGN_SEQ = "EmplRefrl.findRecruiterCandidateRefrlStatusCountByCampaignSeq";
    public final String FIND_RECRUITER_CANDIDATE_INTERVIEW_STAGE_COUNT_BY_CAMPAIGN_SEQ = "EmplRefrl.findRecruiterCandidateInterviewStageCountByCampaignSeq";
    public final String FIND_RECRUITER_EMPL_REFRL_SEQ = "EmplRefrl.findRecruiterEmpRefrlSeq";
    public final String FIND_RECRUITER_CONTEST_EMPL_REFRL_SEQ = "EmplRefrl.findRecruiterContestEmpRefrlSeq";

    public final String REWARD_CRITERIA_CD = "rewardCriteriaCd";
    public final String REWARD_SEQ = "rewardSeq";

    public final String GET_CONTEST_WINNERS_BY_TYPE = "ContestWinner.getContestWinnersByType";
    public final String DETERMINE_CONTEST_WINNERS = "ContestWinner.determineContestWinners";

    public final String GET_CONTEST_REWARDS = "ContestReward.getContestRewards";
    public final String FIND_EMPLOYEE_CONTEST_PARTICIPATION = "EmplRefrl.findEmployeeContestParticipation";
    public final String FIND_ALL_EMPLOYEE_EMAIL = "EmployeeMstr.findAllEmployeeEmail";
    public final String FIND_ALL_EMPLOYEE_PHONE = "EmployeeMstr.findAllEmployeePhone";
    public final String FIND_ALL_USER_DETAILS = "EmployeeMstr.findAllUserDetails";
    public final String FIND_USER_SEARCH_RESULT_COUNT = "EmployeeMstr.findUserSearchResultCount";
    public final String EMPLOYEE_MSTR_COUNT = "EmployeeMstr.getCount";
    public final String FIND_ALL_USERS_COUNT = "EmployeeMstr.findAllUsersCount";
    public final String FETCH_ALL_EMPLOYEE_DETAILS = "EmployeeMstr.fetchAllEmployeeDetails";

    public final String FIND_EMPLOYEES_BY_EMAIL_AND_COMPANY = "EmployeeMstr.findEmployeesByEmailAndCompany";

    public final String FIND_ALL_FRAUD_COUNT = "FraudChecklist.findAllFraudCount";
    public final String FIND_ALL_FRAUD_DETAILS = "FraudChecklist.findAllFraudDetails";
    public final String FIND_ALL_FRAUD_BY_KEYWORDS = "FraudChecklist.findAllFraudByKeywords";

    public final String FIND_ALL_RECRUITER_EMAIL = "EmployeeMstr.findAllRecruiterEmail";
    public final String FIND_ALL_INTERVIEWER_EMAIL = "EmployeeMstr.findAllInterviewerEmail";
    public final String FIND_EMPLOYEES_EMAIL = "EmployeeMstr.findEmployeesEmail";
    public final String FIND_INTERVIEWER = "Interviewer.findInterviewer";
    public final String FIND_INTERVIEWER_BY_TOKEN_AND_DETAIL_SEQ = "Interviewer.findInterviewerByTokenAndInterviewDetailSeq";
    public final String FIND_REVIEW_INTERVIEWER_BY_INTERVIEW_SEQ = "Interviewer.findReviewInterviewerByInterviewSeq";
    public final String FIND_INTERVIEWER_BY_USER_PROFILE_SEQ_AND_INTERVIEW = "Interviewer.findInterviewerByUserprofileAndInterview";

    public final String FIND_ALL_UNINTERVIEWED_INTERVIEW_DETAILS_SEQ = "Interviewer.findAllUnInterviewedInterviewDetailsSeq";
    public final String FIND_ALL_INTERVIEWED_INTERVIEW_DETAILS_SEQ = "Interviewer.findAllInterviewedInterviewDetailsSeq";
    public final String FIND_ALL_INTERVIEW_DETAILS_OF_INTERVIEWER = "Interviewer.findAllInterviewDetailsOfInterviewer";
    public final String FIND_INTERVIEWER_EMPL_REFRLS = "InterviewDetails.findInterviewerEmplRefrls";
    public final String FIND_CONTEST_WINNER = "ContestWinner.findContestWinner";

    public final String FIND_ACTIVITY_LIMIT_PERDAY = "ActivityMstr.findActivityLimitPerDay";
    public final String FIND_ACTIVITY_LIMIT_PERJOB_PERDAY = "ActivityMstr.findActivityLimitPerJobPerDay";
    public final String FIND_ACTIVITY_DETAILS_BYCODE = "ActivityMstr.findActivityByCode";
    public final String FIND_ACTIVE_CONTESTJOB_FOR_JOB = "ContestJob.findActiveContestJobForJob";
    public final String FIND_ALL_ACTIVITY_MSTR_OF_COMPANY = "ActivityMstr.findAllActivityMstrOfCompany";
    public final String FIND_ALL_USER_ROLE_OF_COMPANY = "UserRole.findAllUserRoleOfCompany";

    public final String FIND_REWARDBADGE = "RewardBadge.findRewardBadge";

    public final String FIND_EMPLOYEE_BY_EMAIL_ID = "EmployeeMstr.findEmployeeByEmailID";
    public final String FIND_TOP_PLAYERS_IN_CATEGORY = "EmplReward.findTopPlayersInCategory";
    public final String FIND_CAMPAIGN_TOP_PLAYERS = "EmplReward.findCampaignTopPlayers";
    public final String FIND_CONTEST_TOP_PLAYERS = "EmplReward.findContestTopPlayers";
    public final String FIND_CAMPAIGN_TOTAL_BADGES = "EmplReward.findCampaignTotalBadges";
    public final String FIND_CONTEST_TOTAL_BADGES = "EmplReward.findContestTotalBadges";
    public final String FIND_CAMPAIGN_TOTAL_POINTS = "EmplReward.findCampaignTotalPoints";
    public final String FIND_CONTEST_TOTAL_POINTS = "EmplReward.findContestTotalPoints";
    public final String FIND_CAMPAIGN_TOTAL_REWARDS = "EmplReward.findCampaignTotalRewards";
    public final String FETCH_TOP_PLAYERS = "EmplReward.fetchTopPlayers";
    public final String FETCH_OVERALL_TOP_PLAYERS = "EmplReward.findOverallTopPlayers";
    public final String FETCH_TOP_PLAYERS_IN_RANGE = "EmplReward.findTopPlayersInRange";

    public final String FIND_CANDIDATE_BY_EMAIL_ADDR = "Candidate.findCandidateByEmailAddr";
    public final String FIND_RECRUITER_CAMPAIGN_SEQ = "CampaignJob.findRecruiterCampaignSeq";
    public final String FIND_RECRUITER_CONTEST_SEQ = "ContestJob.findRecruiterContestSeq";
    public final String FIND_RECRUITER_CONTEST = "ContestRecruiter.findRecuiterContest";
    public final String FIND_RECRUITER_ALL_CONTEST = "ContestRecruiter.findRecuiterAllContest";
    public final String FIND_CONTEST_LIST = "Contest.findContestList";
    public final String FIND_RECRUITER_CAMPAIGN = "CampaignRecruiter.findRecuiterCampaign";
    public final String FIND_RECRUITER_ALL_CAMPAIGN = "CampaignRecruiter.findAllRecuiterCampaign";
    public final String FIND_RECRUITER_ALL_CAMPAIGN_SUGGEST = "Recruiter.findAllCampaignSuggest";
    public final String FIND_RECRUITER_CAMPAIGN_SUGGEST = "CampaignRecruiter.findRecuiterCampaignSuggest";
    public final String FIND_RECRUITER_CAMPAIGN_PAGINATED = "CampaignRecruiter.findRecuiterCampaignPaginated";
    public final String FIND_RECRUITER_CAMPAIGN_PAGINATED_ASC = "CampaignRecruiter.findRecuiterCampaignPaginatedAsc";
    public final String FIND_RECRUITER_CAMPAIGN_PAGINATED_COUNT = "CampaignRecruiter.findRecuiterCampaignPaginatedCount";
    public final String FIND_RECRUITER_ALL_CAMPAIGN_PAGINATED = "CampaignRecruiter.findRecuiterAllCampaignPaginated";
    public final String FIND_RECRUITER_ALL_CAMPAIGN_PAGINATED_ASC = "CampaignRecruiter.findRecuiterAllCampaignPaginatedAsc";
    public final String FIND_RECRUITER_ALL_CAMPAIGN_PAGINATED_COUNT = "CampaignRecruiter.findRecuiterAllCampaignPaginatedCount";

    public final String FIND_CANDIDATE_BY_SOCIAL_MEDIA_ID = "Candidate.findCandidateBySocialMediaID";
    public final String FIND_CANDIDATE_BY_PHONE_NO_OR_EMAIL = "Candidate.findCandidateByPhoneNoOrEmail";
    public final String FIND_USERPROFILE_BY_PHONE_NO_OR_EMAIL = "Candidate.findUserProfileByPhoneNoOrEmail";

    public final String FIND_CONTEST_WIN_REWARD = "ContestReward.findContestWinReward";
    public final String FIND_CONTEST_JOB_FROM_CONTEST_JOB_SEQ = "ContestJob.findContestJobFromContesJobSeq";
    public final String FIND_INTERVIEW_STAGE_MSTR_BY_INTERVIEW_PRIORITY = "InterviewStageMstr.findInterviewStageMstrByInterviewPriority";
    public final String FIND_INTERVIEW_STAGE_MSTR_BY_REFRL_STATUS_CD = "InterviewStageMstr.findInterviewStageMstrByRefrlStatusCd";
    public final String FIND_INTERVIEW_STAGE_MSTR_BY_STAGE_DESC = "InterviewStageMstr.findInterviewStageMstrByStageDesc";
    public final String FIND_JOB_FROM_EMPL_REFRL = "EmplRefrl.findJobsFromEmpRefrl";

    public final String FIND_REWARD_TYPES = "RewardTypeMstr.findRewardType";
    public final String FIND_ALL_REWARD_TYPES = "RewardTypeMstr.findAllRewardTypeOfACompany";

    public final String FIND_APPLICABLE_CONTESTREWARD_TYPES = "ContestReward.findApplicableContestRewardTypes";

    public final String FIND_ALL_LI_FRIENDS = "LiUserNetwork.findFriendProfiles";
    public final String FIND_LI_FRIENDS_BY_KEYWORD = "LiUserNetwork.findFriendProfileByKeyword";
    public final String FIND_USER_BY_ID = "LoginHistory.findUserById";
    public final String FIND_LAST_LOGIN = "LoginHistory.findLastLogin";
    public final String FIND_EMP_REWARD_NOTIFICATION = "EmplReward.findNotificationewardList";

    public final String FIND_EMPL_MEDAL = "EmplMedal.findEmpMedal";

    public final String FIND_REWARDMEDAL = "RewardMedal.findRewardMedal";

    public final String FIND_ALL_GOALS_FROM_GOAL_SEQ = "Goal.findAllGoalsFromGoalSeq";

    public final String FIND_LATEST_REWARDS = "EmplReward.findLatestRewards";

    public final String FIND_LATEST_REWARDS_BY_ACTIVITYCD = "EmplReward.findLatestRewardsByActivityCd";

    public final String FIND_DATA_FOR_CANDIDATE_POOL = "EmplRefrl.findDataForCandPool";

    public final String SHIFT_STATUS = "shiftStatus";

    public final String FIND_EMPL_REFRL_SEQ_BY_SHIFT_STATUS = "EmplRefrl.findEmplRefrlSeqByShiftStatus";

    public final String FIND_CAND_EMPL_REFRL_COUNT_FOR_A_JOB = "EmplRefrl.findCandEmplRefrlCountForAJob";

    public final String FIND_CAND_EMPL_REFRL_COUNT_FOR_A_JOB_BY_PHONE = "EmplRefrl.findCandEmplRefrlCountForAJobByPhone";
    public final String FIND_CAND_EMPL_REFRL_FOR_A_JOB_BY_PHONE = "EmplRefrl.findCandEmplRefrlForAJobByPhone";
    public final String FIND_CAND_EMPL_REFRL_FOR_A_JOB = "EmplRefrl.findCandEmplRefrlForAJob";

    public final String FIND_CAND_EMPL_REFRL_COUNT_FOR_A_JOB_WITH_INTERVIEW_STAGE_MSTR = "EmplRefrl.findCandEmplRefrlCountForAJobWithInterviewStageMstr";

    public final String FIND_CAND_EMPL_REFRL = "EmplRefrl.findCandEmplRefrl";

    public final String FIND_DUPLICATE_MPHASIS = "EmplRefrl.findDuplicateCountMphasis";

    public final String FIND_DUPLICATE_MPHASIS_WITH_DOB = "EmplRefrl.findDuplicateCountMphasisWithDOB";

    public final String FIND_DUPLICATE_CAND_EMAIL_PHONE = "EmplRefrl.findDuplicateCountEmailPhone";
    public final String FIND_UPLOAD_DUPLICATE_MPHASIS_WITH_DOB = "EmplRefrl.findUploadDuplicateCountMphasisWithDOB";
    public final String FIND_UPLOAD_DUPLICATE_MYNTRA = "EmplRefrl.findUploadDuplicateCountMyntra";
    public final String FIND_UPLOAD_DUPLICATE_CAND_EMAIL_PHONE = "EmplRefrl.findUploadDuplicateCountEmailPhone";

    public final String PROBATION_DATE = "probationDate";
    public final String FIND_ACTIVITYSTAGE_REWARD_WITH_REWARD = "ActivitystageReward.findActivityStageRewardWithReward";
    public final String FIND_GOAL_REWARD_WITH_REWARD = "GoalReward.findGoalRewardWithReward";
    public final String FIND_JOB_REWARD_WITH_REWARD = "JobReward.findJobRewardWithReward";

    public final String FIND_ALL_COMPANIES = "CompanyMstr.findAllCompanies";
    public final String FIND_ALL_COMPANIES_WITH_TEMPLATE = "EmailTemplateConfig.findAllCompaniesWithTemplate";
    public final String FIND_ALL_ACTIVE_CONTESTS_WITH_MORE_THAN_SPECIFIED_DAYS_TO_END = "Contest.findAllActiveContestsWithMoreThanSpecifiedDaysToEnd";
    public final String FIND_ALL_ACTIVE_CONTESTS_WITH_LESS_THAN_SPECIFIED_DAYS_TO_END = "Contest.findAllActiveContestsWithLessThanSpecifiedDaysToEnd";
    public final String FIND_COMPANY_BY_COMPANY_CD = "CompanyMstr.findCompanyByCompanyCd";
    public final String FIND_COMPANY_BY_ACCESS_TOKEN = "CompanyMstr.findCompanyByAccessToken";
    public final String FIND_COMPANY_BY_DOMAIN = "CompanyMstr.findCompanyByDomain";
    public final String FIND_ALL_CONTEST_ACTIVITIES = "EmplActivity.findAllContestActivities";
    public final String FIND_EMP_CONTEST_ACTIVITIES = "EmplActivity.findAllEmpContestActivities";

    public final String FIND_CANDIDATES_WITH_REFRL_STATUS_CD = "EmplRefrl.findCandidatesWithRefrlStatusCd";

    public final String FIND_ALL_COUNTRY_NAMES = "Country.findAllCountryNames";
    public final String FIND_STATE_NAMES_WITH_COUNTRY_NAME = "State.findStateNamesWithCountryName";
    public final String FIND_CITY_NAMES_WITH_STATE_NAME = "City.findCityNamesWithStateName";

    public final String FIND_EMP_REFERRAL_AND_SHARE_COUNTS = "EmplRefrl.findEmpRefrlAndShareCounts";

    public final String FETCH_ALL_REG_ID = "UserProfile.fetchAllRegIdByUserProfileSeq";

    public final String FIND_PARENTCOMPANY_DETAILS = "CompanyMstr.findParentCompanyDetails";

    public final String FIND_ALL_CURRENCY_DETAILS = "CurrencyMstr.findCurrencyDetails";

    public final String FETCH_LANG_SEQ_BY_CODE = "LangMstr.fetchLangSeqbyCode";
    public final String FETCH_LANG_BY_CODE = "LangMstr.fetchLangbyCode";

    public final String FIND_ALL_JOBS_ID = "Job.findAllJobsbyId";
    public final String FIND_ALL_COMPANY_JOBS_ID = "Job.findAllCompanyJobsbyId";

    public final String FIND_ALL_JOBS_ID_FOR_ER = "Job.findAllJobsbyIdForEr";
    public final String FIND_ALL_COMPANY_JOBS_ID_FOR_ER = "Job.findAllCompanyJobsbyIdForEr";

    public final String FIND_PARENT_COMPANY_CONFIG = "CompanyMstr.findParentCompanyMstrByCompanySeq";
    public final String FIND_ALL_ACTIVE_CONTESTS = "Contest.findAllActiveContest";

    public final String FETCH_ALL_LEVEL_REWARDS = "LevelReward.fetchAllLevelRewards";
    public final String CHECK_CANDIDATE_IN_PROCESS = "EmplRefrl.checkCandInProcess";
    public final String CHECK_CANDIDATE_IN_PROCESS_BY_PHONE = "EmplRefrl.checkCandInProcessByPhone";
    public final String CHECK_EMP_IN_PROCESS = "EmplRefrl.checkEmpInProcess";
    public final String CHECK_EMP_IN_PROCESS_BY_PHONE = "EmplRefrl.checkEmpInProcessByPhone";

    //public final String FIND_CONFIG_BY_COMPANY = "CompanyConfig.findConfigByCompany";
    public final String FIND_CAMPAIGN_BY_TITLE = "Campaign.findCampaignByTitle";
    public final String CAMPAIGN_TITLE = "campaignTitle";
    public final String FIND_CAMPAIGN_BY_TITLE_NOT_EQUALS_CAMPAIGN_SEQ = "Campaign.findCampaignByTitleNotEqualsCampaignSeq";
    public final String FETCH_COUNTRY_DETAILS_LANG = "CountryMstr.fetchCountryDetailsLang";
    public final String FETCH_CURRENT_LOCATION_DETAILS_LANG = "CurrentLocationMstr.fetchCurrentLocationDetailsLang";
    public final String FETCH_CURRENT_EMPLOYER_DETAILS_LANG = "CurrentEmployerMstr.fetchCurrentEmployerDetailsLang";
    public final String FETCH_CURRENT_EMPLOYER_DETAILS_LANG_BY_NAME = "CurrentEmployerMstr.fetchCurrentEmployerDetailsLangByName";
    public final String FETCH_QUALIFICATION_DETAILS_LANG = "QualificationMstr.fetchQualificationDetailsLang";
    public final String FETCH_SKILLS_DETAILS_LANG = "SkillsMstr.fetchSkillsDetailsLang";
    public final String FETCH_GENDER_DETAILS_LANG = "GenderMstr.fetchGenderDetailsLang";

    public final String FIND_WEBSERVICES_LOG_BY_TRANSACTION_ID = "WebServicesLog.findWebServicesLogByTransactionId";
    public final String FETCH_CANDIDATE_SKILLS_BY_RESUME_SEQ = "CandidateSkills.fetchCandidateSkillsByResumeSeq";

    public final String RIPPLEHIRE_SEQ = "ripplehireSeq";
    public final String FETCH_REFRL_DETAILS_BY_RIPPLEHIRE_ID = "EmplRefrl.fetchRefrlDetailsByRipplehireId";
    public final String FETCH_REFRL_BY_RIPPLEHIRE_ID = "EmplRefrl.fetchRefrlByRipplehireId";
    public final String GENDER_CLIENT_KEY = "genderClientKey";
    public final String FETCH_GENDER_SEQ_BY_GENDER_DESC = "GenderMstr.fetchGenderSeqbyGenderDesc";
    public final String CURRENT_LOCATION_CLIENT_KEY = "currentLocationClientKey";
    public final String FETCH_CURRENT_LOCATION_SEQ_BY_CURRENT_LOCATION_DESC = "CurrentLocationMstr.fetchCurrentLocationSeqbyCurrentLocationDesc";
    public final String QUALIFICATION_CLIENT_KEY = "qualificationClientKey";
    public final String FETCH_QUALIFICATION_SEQ_BY_CLIENT_KEY = "QualificationMstr.fetchQualificationSeqbyClientKey";
    public final String CURRENT_EMPLOYER_CLIENT_KEY = "currentEmployerClientKey";
    public final String FETCH_CURRENT_EMPLOYER_BY_CLIENT_KEY = "CurrentEmployerMstr.fetchCurrentEmployerSeqbyClientKey";
    public final String FETCH_CURRENT_EMPLOYER_OTHER = "CurrentEmployerMstr.fetchCurrentEmployerSeqOther";
    public final String COUNTRY_CLIENT_KEY = "countryClientKey";
    public final String FETCH_COUNTRY_SEQ_BY_CLIENT_KEY = "CountryMstr.fetchCountrySeqbyClientKey";
    public final String FIND_JOB_LEVEL_CONFIG = "JobLevelConfig.findJobLevelConfig";
    public final String SKILLS_CLIENT_KEY = "skillsClientKey";
    public final String FETCH_SKILLS_SEQ_BY_CLIENT_KEY = "SkillsMstr.fetchSkillsSeqbyClientKey";
    public final String FETCH_INTERVIEW_STAGE_MSTR_BY_STATUS_CD_PRIORITY = "InterviewStageMstr.fetchInterviewStageMstrByStatusCdPriority";
    public final String JOB_CD = "jobCd";
    public final String FETCH_JOB_BY_JOB_CD = "Job.fetchJobByJobCd";
    public final String FETCH_CAMPAIGN_BY_JOB_ID = "Campaign.fetchCampaignByJobId";
    public final String CLIENT_CANDIDATE_ID = "clientCandidateId";
    public final String KENEXA_CODE = "kenexaCode";
    public final String KENEXA_CREDIT = "credit";
    public final String FETCH_KENEXA_APPLICATION_BY_KENEXA_CODE = "KenexaApplication.fetchKenexaApplicationByKenexaCode";
    public final String FETCH_PENDING_KENEXA_APPLICATION_BY_EMAIL = "KenexaApplication.fetchPendingKenexaApplicationByEmail";
    public final String FETCH_PENDING_KENEXA_APPLICATION_BY_EMAIL_OR_CODE = "KenexaApplication.fetchPendingKenexaApplicationByEmailOrCode";
    public final String FETCH_KENEXA_APPLICATION_BY_CLIENT_SEQ = "KenexaApplication.fetchKenexaApplicationByClientSeq";
    public final String FETCH_KENEXA_APPLICATION_BY_EMAIL = "KenexaApplication.fetchKenexaApplicationByEmail";
    public final String FIND_EMPL_REFRL_BY_CLIENT_SEQ = "EmplRefrl.findEmplRefrlByClientSeq";
    public final String FETCH_CANDIDATE_SEQ_BY_CLIENT_SEQ = "EmplRefrl.fetchCandidateSeqByClientSeq";
    public final String FIND_JOB_BY_JOB_CODE = "Job.findJobByJobCode";
    public final String FIND_JOB_BY_JOB_CODE_ALL_STATUS = "Job.findJobByJobCodeAllStatus";
    public final String FIND_CLIENT_INTERVIEW_STATUS_LANG = "ClientInterviewStatusLang.findClientInterviewStatusLang";
    public final String CLIENT_INTERVIEW_ROUND_CD = "clientInterviewRoundCd";
    public final String FIND_CLIENT_INTERVIEW_STATUS_BY_REFRL_STATUS_CD_AND_ROUND_CD = "ClientInterviewStatus.findClientInterviewStatusByRefrlCdAndRoundCd";
    public final String CLIENT_INTERVIEW_SUBSTATUS = "cleintInterviewSubstatus";
    public final String FIND_CLIENT_INTERVIEW_STATUS_BY_INTERVIEW_STAGE_MSTR_AND_SUBSTATUS_CD = "ClientInterviewStatus.findClientInterviewStatusByStageMstrAndSubstatus";
    public final String FIND_CLIENT_INTERVIEW_STATUS_BY_REFRL_STATUS_CD_ROUND_CD_AND_SUBSTATUS_CD = "ClientInterviewStatus.findClientInterviewStatusByRefrlCdRoundCdAndSubstatus";
    public final String FIND_CLIENT_INTERVIEW_STATUS_BY_ROUND_CD_AND_SUBSTATUS_CD = "ClientInterviewStatus.findClientInterviewStatusByRoundCdAndSubstatus";
    public final String FETCH_REFRL_DETAILS_BY_RIPPLEHIRE_ID_AND_CLIENT_ID = "EmplRefrl.fetchRefrlDetailsByRipplehireIdAndClientID";
    public final String GENDER_DESC = "genderDesc";
    public final String CURRENT_LOCATION_DESC = "currentLocationDesc";

    public final String COMPANY_CODE = "companyCd";
    public final String FIND_CANDIDATE_WHO_UNSUBSCRIBED = "CandidateSubscription.findCandidateWhoUnsubscribed";
    public final String FIND_JOB_LIST_FOR_CAMPAIGN_LINK_JOB = "CampaignJob.findJobListForCampaignLinkJob";
    public final String FIND_JOB_LIST_FOR_CONTEST_LINK_JOB = "ContestJob.findJobListForContestLinkJob";
    public final String FIND_USER_PROFILE_BY_ID_FOR_INACTIVE = "UserProfile.findUserProfileByIdForInactive";
    public final String CANDIDATE_SEARCH = "candidateSearch";
    public final String JOB_SEARCH = "jobSearch";
    public final String FIND_ALL_RECRUITER_EMP_REFRLS_BY_SEARCH = "EmplRefrl.findRecruiterEmpRefrlsBySearch";
    public final String FIND_RECRUITER_CONTEST_EMP_REFRLS_BY_SEARCH = "EmplRefrl.findContestRecruiterEmpRefrlsBySearch";
    public final String FIND_ALL_RECRUITER_EMP_REFRLS_RESULT_COUNT = "EmplRefrl.findRecruiterEmpRefrlsResultCount";
    public final String FIND_RECRUITER_CONTEST_EMP_REFRLS_RESULT_COUNT = "EmplRefrl.findContestRecruiterEmpRefrlsResultCount";
    public final String FIND_ALL_EMP_GOALS_LANG_FB = "EmplGoal.findAllGoalsLangfb";
    public final String FIND_ALL_GOALS_FB = "Goal.findAllGoalsfb";

    public final String FIND_REFERRAL_STATUS = "EmplRefrl.findReferralStatus";
    public final String FIND_TOP_PLAYERS_BY_LOCATION = "EmplReward.findTopPlayersbyLocation";
    public final String FIND_REWARD_LIST_FOR_CONTEST_BADGES = "EmplReward.findRewardListForContestBadges";
    public final String EMPL_REWARD_SEQ = "emplRwrdSeq";
    public final String FIND_REWARD_LIST_FOR_NEW_CONTEST_BADGES = "EmplReward.findRewardListForNewContestBadges";

    public final String FETCH_TRANSFERRED_REFRL_DETAILS_BY_RIPPLEHIRE_ID_AND_CLIENT_ID = "EmplRefrl.fetchTransferredRefrlDetailsByRipplehireIdAndClientID";
    public final String PARENT_EMPL_REFRL_SEQ = "parentEmplRefrlSeq";
    public final String FETCH_REFRL_DETAILS_BY_PARENT_REFRL_SEQ_ID_AND_CLIENT_ID = "EmplRefrl.fetchRefrlDetailsByParentRefrlSeqAndClientID";
    /**
     * Report queries
     */
    public final String FIND_SOURCERS_WITH_APPLIED_CAND = "EmplRefrl.findSourcersWithAppliedCandidates";
    public final String FIND_APPLIED_CAND_BY_SOURCER = "EmplRefrl.findAppliedCandidatesListBySourcer";
    public final String FIND_ALL_APPLIED_CAND_OF_PREVIOUS_DAY = "EmplRefrl.findAllAppliedCandidatesOfPreviousDay";
    public final String FETCH_EMP_CAND_CONV = "EmpCandConv.fetchBuddyConversation";
    public final String FETCh_EMP_CAND_CONV_WITH_STATUS_CODE = "EmpCandConv.fetchBuddyConversationWithRefrlStatusCode";
    public final String MESSAGE_SENDER = "sender";
    public final String FIND_EMPLOYEE_BY_USER_PROFILE_SEQ = "EmployeeMstr.findEmployeeByUserProfileSeq";
    public final String FIND_RECTR_USER_PROFILE_BY_JOB_SEQ = "UserProfile.findRectrUserProfileByJobSeq";
    public final String FIND_EMPL_REFRL_BY_JOB_SEQ = "EmplRefrl.findEmplRefrlByJobSeq";
    public final String FIND_EMPL_REFRL_BY_CAMPAIGN_JOB_SEQ = "EmplRefrl.findEmplRefrlByCampaignJobSeq";
    public final String FIND_EMPL_REFRL_BY_JOB_SEQ_AND_CAND_EMAIL_ADDR = "EmplRefrl.findEmplRefrlByJobSeqAndCandEmailAddr";
    public final String FIND_ALL_JOBS_OF_CONTEST = "ContestJob.findAllJobSeqOfContestWithClosedJobs";

    public final String FIND_CLIENT_CUSTOM_ITEMS = "ClientCustomItemsMstr.findClientCustomItems";
    public final String FIND_CLIENT_CUSTOM_ITEMS_BY_TYPE = "ClientCustomItemsMstr.findClientCustomItemsByType";
    public final String FIND_CLIENT_CUSTOM_ITEMS_BY_TYPE_AND_DISPLAY_PAGE = "ClientCustomItemsMstr.findClientCustomItemsByTypeAndDisplayPage";
    public final String FIND_CLIENT_CUSTOM_ITEMS_BY_TYPE_SUGGESTIONS = "ClientCustomItemsMstr.findClientCustomItemsByTypeSuggestions";
    public final String FIND_CLIENT_CUSTOM_ITEMS_BY_DISPLAY_PAGE = "ClientCustomItemsMstr.findClientCustomItemsByDisplayPage";
    public final String CUSTOM_ITEM_CLIENT_ID = "customItemClientId";
    public final String CUSTOM_ITEM_DESC = "customItemDesc";
    public final String CUSTOM_ITEM_TYPE = "customItemType";
    public final String CUSTOM_ITEM_DISPLAY_PAGE = "displayPage";
    public final String CLIENT_CUSTOM_MAP_TYPE_ROUNDS = "ROUND_MAPPING";
    public final String CLIENT_CUSTOM_MAP_TYPE = "type";
    public final String CLIENT_CUSTOM_MAP_EXT_KEY = "externalKey";
    public final String CLIENT_INTERNAL_MAP_TYPE = "type";

    public final String FIND_CLIENT_CUSTOM_MAP_BY_EXT_TYPE = "ClientCustomMap.findClientCustomMapByExtType";
    public final String FIND_ALL_CAMPAIGN_JOBS_TITLE_BY_SEARCH = "CampaignJob.findAllJobTitleCampaignSearch";
    public final String FIND_ALL_CAMPAIGN_ACTIVE_JOBS_TITLE_BY_SEARCH = "CampaignJob.findAllActiveJobTitleCampaignSearch";
    public final String FIND_ALL_CONTEST_JOBS_TITLE_BY_SEARCH = "ContestJob.findAllJobTitleOfContestBySearch";
    public final String FIND_ALL_CONTEST_ACTIVE_JOBS_TITLE_BY_SEARCH = "ContestJob.findAllActiveJobTitleOfContestBySearch";
    public final String FIND_ALL_JOBS_TITLE_BY_SEARCH = "Job.findAllJobsTitleBySearch";
    public final String FIND_VENDOR_BY_SEARCH = "VendorMstr.findVendorBySearch";
    public final String FIND_ALL_ACTIVE_JOBS_TITLE_BY_SEARCH = "Job.findAllActiveJobsTitleBySearch";
    public final String FIND_ALL_ACTIVE_JOBS = "Job.findAllActiveJobs";

    public final String FIND_ALL_CONTEST_CLOSED_JOB = "ContestJob.findAllContestClosedJob";
    public final String FIND_RECRUITER_CAMPAIGN_ALLOWED_LIST_SEQ = "JobRecruiter.findRecruiterCampaignAllowedListSeq";
    public final String FIND_RECRUITER_CONTEST_ALLOWED_LIST_SEQ = "JobRecruiter.findRecruiterContestAllowedListSeq";
    public final String FIND_CANDIDATE_RESUME_NAME_BY_UUID = "UserProfile.findCandidateResumeNameByUuid";
    public final String GET_ALL_RESUMES_SIZE = "EmplRefrl.getResumesDownloadSize";
    public final String GET_ALL_SELECTED_RESUMES = "EmplRefrl.getAllSelectedResumes";

    public final String FETCH_CURRENT_LOCATION_DETAILS_BY_DESC = "CurrentLocationDesc.fetchCurrentLocationDetailsDesc";
    public final String FETCH_FORM_FIELDS = "CandidateFormFields.fetchFormFields";
    public final String FETCH_CANDIDATE_FORM_FIELDS = "CandidateFormFields.fetchCandidateFormFields";
    public final String FETCH_INTERVIEWER_FORM_FIELDS = "CandidateFormFields.fetchInterviewerFormFields";

    public final String FIND_USERS_PENDING_FOR_MAIL = "EmailLog.findMailPendingUsers";

    public final String GET_FRAUD_CHECKLIST = "FraudChecklist.getChecklist";
    public final String RESUME_FILE_REF_ACTUAL_NM = "resumeFileRefActualNm";
    public final String FETCH_LIST_OF_RESUME_DATA = "EmplRefrl.fetchListOfResumeDataByCompanySeq";
    public final String FETCH_CANDIDATE_RESUME_NAMES_WITHIN_A_WEEK = "CandidateResumeDetails.fetchCandidateResumeNamesInAWeek";

    public final String FETCH_CANDIDATE_UPLOAD_RESUME_SIZE = "CandidateUploadResumeDetails.fetchCandidateUploadCount";
    public final String FETCH_REFERRAL_CHANNEL_CONFIG = "ReferralChannelConfig.fetchListOfReferralChannel";
    public final String FETCH_REFERRAL_SOCIAL_CHANNELS = "ReferralChannelConfig.fetchSocialReferralChannel";

    public final String FIND_NEW_JOBS = "findNewJobsByCompany";
    public final String FIND_CANDIDATES_AND_INTERVIEWSTAGE_BY_COMPANY = "findCandidatesAndInterviewstageByCompany";
    public final String FIND_DISTINCT_LOGIN_COUNT_BY_COMPANY = "findDistinctLoginCountByCompany";
    public final String FIND_DISTINCT_REFERREL_ACTIVITIES_BY_COMPANY = "findDistinctReferralActivities";
    public final String FIND_TOTAL_REFERREL_ACTIVITIES_BY_COMPANY = "findTotalReferralActivities";
    public final String FIND_NEWUSERS_BY_COMPANY = "findNewusersByCompany";
    public final String FETCH_SKILLS_DETAILS_LANG_BY_SEARCH = "SkillsMstr.fetchSkillsDetailsLangBySearch";
    public final String STR_YEAR = "year";
    public final String STR_MONTH = "month";
    public final String FETCH_JOB_VIEWES = "findCandidateJobViews";

    public final String FIND_ALLOWED_COMPANIES_FOR_JOBS = "Job.findAllowedCompaniesForJobs";
    public final String FIND_ETHNICITY_LIST_FOR_COMPANY = "CandidateEthnicity.findEthnicityListOfCompany";
    public final String FIND_COMPANY_FACEBOOK_CONFIG = "CompanyFacebookConfig.findCompanyFacebookConfig";
    public final String FIND_COMPANY_FACEBOOK_CONFIG_BY_COMPANY = "CompanyFacebookConfig.findCompanyFacebookConfigByCompany";

    public final String FIND_RH_ADMIN_USER = "Employee.findRhAdminUser";

    public final String DOMAIN_NAME = "domainName";

    public final String FIND_COUNTRY_PHONE_CODE = "CountryPhoneCode.fetchAllCountryPhoneCode";

    public final String FETCH_COMMON_TALENT_POOL_JOB = "job.fetchCommonTalentPoolJob";
    public final String FETCH_COMMON_TALENT_POOL_CAMPAIGN = "campaign.fetchCommonTalentPoolCampaign";
    public final String FETCH_JOB_WEBSERVICE_CONFIG = "JobWebserviceConfig.findJobWebServiceConfig";
    public final String FIND_ALL_JOBS_LIST = "Job.findAllJobsList";
    public final String FIND_ALL_JOBS_WITHIN_RANGE = "Job.findAllJobsListWithinRange";
    public final String ACCESS_KEY = "accessKey";
    public final String ACCESS_SECCRET = "accessSecret";

    public final String FETCH_CANDIDATE_RESUME_DATE_BY_CANDIDATE_RESUME_DETAILS = "CandidateResumeData.fetchCandidateResumeDataByCandidateResumeDetails";

    public final String VENDOR_EMAIL_ID = "vendorEmailId";
    public final String FIND_VENDOR_PROFILE = "VendorProfile.findVendorProfileByVendorEmailID";
    public final String FETCH_VENDOR_PROFILE_EMAIL_LIST_BY_COMPANY_SEQ = "VendorProfile.fetchVendorProfileEmailListByCompanyID";
    public final String FETCH_CAND_DETAILS_BY_VENDOR_EMAIL_ID = "EmplRefrl.fetchCandidateDetailsByVendorEmailID";
    public final String FIND_CANDIDATE_RECRUITERS = "Job.findCandidateRecruiters";
    public final String FIND_CANDIDATE_RECRUITERS_FROM_EMPL_REFRL = "EmplRefrl.findCandidateRecruitersByEmplRefrlSeq";


    //Employee Engagement mailer
    public final String ACTIVITY_TYPE = "activityType";
    public final String MAX_DIFFERENCE_BETWEEN_TWO_DATES = "maxDifference";
    public final String MIN_DIFFERENCE_BETWEEN_TWO_DATES = "minDifference";
    public final String FETCH_EMPLREFRL_BY_USERPROFILESEQ = "EmplRefrl.fetchEmpRefrlByUserProfileSequence";
    public final String FIND_USER_CREATION_RECORDS_BY_DATE_DIFF = "EmployeeMstr.fetchActivityLogforUserCreationByDateDiff";
    public final String FIND_NOT_REFERRED_RANDOM_JOBS_BY_USER = "Job.findNotReferredRandomJobsByUser";
    public final String FIND_NOT_REFERRED_MONETARY_REWARD_RANDOM_JOBS_BY_USER = "Job.findNotReferredMonetaryRewardRandomJobsByUser";
    public final String FIND_USER_CREATION_RECORDS_FOR_JOB_MAILER = "EmployeeMstr.fetchUserCreationRecordsForJobMailer";

    public final String FIND_ALL_USER_ROLE_PERMISSIONS = "PermissionsMstr.findAllUserRolePermissions";

    public final String FIND_REJECT_REASONS_BY_COMPANY = "ActionReasons.findRejectReasonsByCompany";

    public final String FIND_ALL_USER_COMPANIES = "UserCompanyConfig.findAllUserCompanies";

    public final String FIND_FORGOT_PASSWORD_TOKEN = "ForgotPasswordToken.finfFOrgotPasswordToken";

    public final String FIND_OLD_FORGOT_PASSWORD_TOKENS_BY_USER_ID = "ForgotPasswordToken.findOldForgotPasswordTokens";

    public final String FETCH_COMPANY_REPORTS = "ReportMstr.fetchCompanyReports";
    public final String FETCH_CHILD_REPORTS = "ReportMstr.fetchChildReports";
    public final String FETCH_REPORT_BY_CODE = "ReportMstr.fetchReportByCode";
    public final String FETCH_IMPL_CLASS_BY_CODE = "ReportMstr.fetchImplClassByCode";

    public final String FETCH_LATEST_JOB_OPENINGS = "JobHistory.fetchLatestJobOpenings";

    public final String FIND_LOGGED_IN_USERS_COUNT = "LoginHistory.findTotalLoggedInUsers";
    public final String FIND_LOGGED_IN_USERS_COUNT_BY_DATE = "LoginHistory.findTotalLoggedInUsersByDate";

    public final String FIND_EMP_ACTIVITY_RECORDS = "EmplActivity.FindEmpActivityRecords";
    public final String FIND_ACTIVITY_RECORDS_BETWEEN_TWO_DATES_BY_ENTITY = "ActivityLog.findActivityRecordsBetweenTwoDatesByEntity";

    public final String FETCH_EMP_FORM_FIELDS = "Employeeformfields.fetchEmpFormFields";
    public final String FIND_JOB_HISTORY_BY_JOB = "JobHistory.findJobHistoryByJobSeq";
    public final String CUSTOM_JOB_FORM_FIELDS = "JobFormFields.findJobFormFields";
    public final String CUSTOM_JOB_FORM_FIELDS_FOR_API = "JobFormFields.findJobFormFieldsforApi";
    public final String FIND_ALL_EMPLOYEE_PARTICIPATED_BY_COMPANY = "EmplRefrl.findAllEmpParticipationByCompany";
    public final String FIND_ALL_EMPLOYEE_PARTICIPATED_BY_COMPANY_BY_DATE = "EmplRefrl.findAllEmpParticipationByCompanyByDate";
    public final String FIND_TOTAL_EMPLOYEE_COUNT_BY_COMPANY = "EmployeeMstr.findTotalEmpCountByCompany";
    public final String FIND_TOTAL_EMPLOYEE_COUNT_BY_DATE = "EmployeeMstr.findTotalEmpCountByDate";
    public final String FIND_DIMENSION_REPORT_DATA = "ReportMstr.findDimensionReportData";

    //Added By Vikas//
    public final String REDEMPTION_REPORT_VERIFICATION = "RedemptionReport.fetchRecordsRedemptionVerification";
    public final String REDEMPTION_REPORT_PENDING_PAYMENT = "RedemptionReport.fetchRecordsRedemptionPendingPayment";
    public final String REDEMPTION_REPORT_READY_DISBURSEMENT = "RedemptionReport.fetchRecordsRedemptionReadyDisbursement";
    public final String REDEMPTION_REPORT_DISBURSEMENT = "RedemptionReport.fetchRecordsRedemptionDisbursement";
    public final String EMPLREWARD_FROM_IDLIST = "EmplReward.findEmpRewardFromIdList";
    public final String EMPLREWARD_FROM_IDLIST_PARAM = "emplRwrdSeqList";
    public final String CURRENCY_RATE_FROM_EMPLREFSEQ = "RedemptionReport.fetchCurrencyRateFromEmplRewardSeq";
    public final String REDEMPTION_PAYOUTDETAIL_EMPLSEQ = "RedemptionPayoutDetails.findRedemptionPayoutDetailsByEmplSeq";
    public final String FETCH_REDEMPTION_PAYOUT_DETAIL_BY_EMPLREFRL_SEQ  = "RedemptionPayoutDetails.findRedemptionPayoutDetailsByEmplRefrlSeq";
    public final String REDEMPTION_PAYOUTDETAIL_EMPLSEQ_PARAM = "empSeq";
    public final String REWARD_DETAILS_FROM_EMPREFRL_SEQ = "EmplRefrl.getRewardDetailsFromEmplReferral";
    public final String REWARD_DETAILS_FROM_EMPREFRL_SEQ_PARAM = "empSeqList";
    public final String EMPLREWARD_USER_CATEGORY = "EmplReward.findEmpRewardFromUserAndCategory";
    public final String JOBREWARD_FETCH_BY_JOBSEQ = "JobReward.fetchJobRewardFromJobSeq";
    public final String JOBREWARD_FETCH_BY_JOBSEQ_AND_REWARDTYPE_CD = "JobReward.fetchJobRewardFromJobSeqAndRewardCode";
    public final String JOBREWARD_FETCH_BY_JOBSEQ_AND_REWARDTYPE_CD_PARAM = "rewardTypeCdList";


    //End//

    public final String FIND_REFERRAL_INPROCESS_COUNT = "EmplRefrl.findInprocessCount";
    public final String FIND_EMP_JOBSHARE_VIEW_COUNT = "EmplRferl.findEmpShareViewCount";
    public final String GET_CANDIDATES_LISTING_FRACTAL = "EmplRefrl.getCandidateListingForFractal";
    public final String FETCH_EMP_REFRL_SEQ_LIST = "EmplRefrl.fetchEmplRefrlSeqList";

    public final String FIND_REFERAL_COUNT_BY_CHANNEL_CD = "EmplRefrl.findRefrlCountByChannelCd";
    public final String FIND_REFERAL_COUNT_BY_CHANNEL_TYPE = "EmplRefrl.findRefrlCountByChannelType";
    public final String FIND_REFERAL_COUNT_BY_VENDOR_ID = "EmplRefrl.findRefrlCountByVendorId";

    public final String FETCH_CHANNEL_LIMIT_BY_CHANNEL_TYPE = "JobChannelMstr.fetchChannelLimitByChannelType";
    public final String FETCH_CHANNEL_LIMIT_BY_CHANNEL_CD = "JobChannelMstr.fetchChannelLimitByChannelCd";
    public final String FETCH_JOB_BY_CHANNEL = "JobChannelMstr.fetchJobListByChannel";
    public final String FIND_SOCIAL_MESSAGE = "SocialMessages.findSocialMessageForChannel";
    public final String FIND_SOCIAL_MESSAGE_CANDIDATE = "SocialMessages.findSocialMessageForCandidate";

    public final String FIND_USER_COINS_HOSTORY = "UserCoinsHistory.fetchUserCoinsHistory";
    public final String FIND_JOB_REVIEW_ENTRY_BY_JOB_CODE = "JobReview.findJobReview";
    public final String FIND_JOB_REVIEW_LIST = "JobReview.findJobReviewList";
    public final String FIND_EMP_BY_EMAIL_IDS = "EmployeeMstr.findEmpByEmailIds";

    public final String FETCH_CANDIDATE_COUNT_BY_REFRL_STATUS_CD = "EmplRefrl.fetchCandidateCountByRefrlStatusCd";
    public final String FIND_COMPANY_HELP_CONFIG = "CompanyHelpConfig.fetchCompanyHelpConfig";
    public final String FIND_HELP_SECTIONS = "CompanyHelpConfig.findHelpSectionList";

    public final String FETCH_PENDING_EMPL_REWARDS = "EmplReward.fetchPendingEmplRewards";

    public final String FETCH_WIDGET_BY_PAGE_ID = "WidgetMstr.fetchWidgetByPageId";
    public final String FETCH_WIDGET_BY_CD = "WidgetMstr.fetchWidgetByCd";
    public final String FETCH_MPHASIS_CANDIDATE_STATUS = "MphasisCandImport.fetchMphasisCandidateStatus";
    public final String FETCH_EMPL_REFRL_BY_RH_ID_AND_COMPANY_CD = "EmplRefrl.fetchEmplRefrlByRhIdAndCompanyCd";
    public final String FETCH_EMPL_REFRL_BY_CLIENT_CADIDATE_ID_AND_COMPANY_CD = "EmplRefrl.fetchEmplRefrlByClientCandidateIdAndCompanyCd";
    public final String FETCH_EMPL_REFRL_BY_CANDIDATE_ID_AND_JOB_SEQ = "EmplRefrl.fetchEmplRefrlByCandidateIdAndJobSeq";
    public final String FETCH_CLIENT_CUSTOM_MAPPING_BY_EXT_KEY_AND_COMPANY_MSTR = "ClientCustomMapping.fetchClientCustomMappingByExtKeyAndCompanyMstrSeq";
    public final String RH_ID_LIST = "rhIdList";
    public final String IMPORT_STATUS = "iStatus";
    public final String JOB_RECRUITER_SEQ = "jobRecruiterSeq";
    public final String FIND_CANDIDATE_BY_USER_PROFILE_SEQ = "Candidate.findCandidateByUserProfileSeq";
    public final String FETCH_COINS_FAILED_REQUEST = "CoinsServiceLog.fetchFailedRequests";
    public final String FIND_CLIENT_INTERVIEW_STATUS_BY_COMPANY = "ClientInterviewStatus.findClientInterviewStatusByCompany";
    public final String FIND_INTERVIEW_STAGE_MSTR_BY_COMPANY = "InterviewStageMstr.findInterviewStageMstrByCompany";

    //Unsubscribe
    public final String FIND_EMPLOYEE_BY_EMAIL_ONLY = "EmployeeMstr.findEmpByEmailOnly";

    public final String FETCH_VENDOR_PROFILE_BY_USERPROFILE_SEQ = "VendorProfile.fetchVendorProfileByUserProfileSeq";
    public final String FETCH_VENDOR_JOB_CITY_COUNT = "Vendor.fetchVendorJobCityCount";
    public final String FIND_ALL_JOB_VENDORS = "Job.findAllJobVendors";
    public final String FIND_VENDOR_PROFILE_BY_VENDOR_MSTR_SEQ = "VendorProfile.findVendorProfileByVendorMstrSeq";

    public final String VENDOR_ID_LIST = "vendorIdList";
    public final String FIND_VENDOR_COMPANY_LIST = "VendorMstr.findAllVendorsById";
    public final String FIND_JOB_VENDORS = "JobChannelMstr.findJobVendors";
    public final String FIND_ALL_VENDORS_BY_JOB = "JobChannelMstr.findAllVendorsByJob";

    public final String FETCH_ALL_JOB_VENDORS_BY_CATEGORY = "JobChannelMstr.findAllVendorsByJobAndCategory";
    public final String FETCH_ALL_JOB_VENDORS_BY_LIST = "VendorMstr.findAllVendorsByJobAndInList";
    public final String FETCH_ALL_JOB_VENDORS_BY_LIST_AND_CATEGORY = "VendorMstr.findAllVendorsByJobAndCategoryInList";
    public final String FETCH_ALL_VENDORS_NOT_IN_LIST = "VendorMstr.fetchAllVendorsExceptList";
    public final String FETCH_ALL_VENDORS_NOT_IN_LIST_AND_BY_CATEGORY = "VendorMstr.fetchAllVendorsInCategoryExceptList";


    public final String FETCH_RESUME_DETAILS_BY_EMPL_REFRL = "CandidateUploadResumeDetails.fetchCandidateResumeDetailsByEmplRefrl";
    public final String FIND_ETL_LOGS = "EtlFileLog.getEtlFileLogs";
    public final String FIND_ETL_LOGS_COUNT = "EtlFileLog.getEtlFileLogsCount";
    public final String FETCH_MPHASIS_REPARSE_LIST = "MphasisCandReparse.fetchNewRecords";
    public final String FIND_PENDINF_ETL_LOGS = "EtlFileLog.findPendingEtlLogs";

    public final String FETCH_VENDOR_CATEGORIES = "VendorCategory.fetchVendorCategories";
    public final String STR_EXPORT_STATUS = "exportStatus";
    public final String FETCH_NEW_RAW_EXPORT_REQUEST = "ExportQueue.fetchNewRawExportRequest";
    public final String STR_PROCESSED = "PROCESSED";
    public final String STR_ERROR = "ERROR";
    public final String STR_EXPORT_TYPE = "exportType";
    public final String FIND_ACTIVE_EMPL_REFRL_BY_SEQ = "EmplRefrl.findActiveEmplRefrlBySeq";
    public final String FETCH_EMPL_REFRL_BY_CAND_SEQ_AND_SUB_STATUS = "EmplRefrl.fetchEmplRefrlByCandSeqAndSubStatus";
    public final String FETCH_NEW_KENEXA_OBJECT = "KenexaApplication.fetchNewKenexaObject";
    public final String FETCH_MAIL_DATA_SEQ_ON_FROM = "MailData.fetchMailDataSeqOnFrom";
    public final String FETCH_NEW_DIT_LOG = "KenexaDitLog.fetchNewDitLog";
    public final String FETCH_NEW_DIT_DATA = "KenexaDitData.fetchNewDitData";
    public final String DIT_LOG_SEQ = "ditLogSeq";

    String FETCH_RECRUITERBOX_JOB_STAGES = "RecruiterboxJobStages.fetchRecruiterboxJobStage";
    String RECRUITERBOX_JOB_SEQ = "jobSeq";
    String RECRUITERBOX_STAGE_SEQ = "stageSeq";

    public final String FETCH_VENDOR_PROFILES_FOR_COMPANY = "VendorProfile.fetchVendorProfilesForCompany";
    public final String FETCH_VENDOR_PROFILES_FOR_COMPANY_BY_STATUS = "VendorProfile.fetchVendorProfilesForCompanyByStatus";

    public final String FIND_CLIENT_CUSTOM_ITEMS_TYPE_BY_COMPANYID = "ClientCustomItemsMstr.findClientCustomItemsType";
    public final String FETCH_WEEKLY_VENDOR_EMAIL_LIST = "EmplRefrl.fetchWeeklyVendorEmailList";
    public final String FETCH_AGENCY_JOB_INFORMATION = "VendorProfile.fetchVendorInformation";
    public final String FETCH_TRANSFERRED_REFERRAL_LIST = "EmplRefrl.fetchTransferredReferralList";
    public final String FETCH_TRANSFERREDTO_REFERRAL_LIST = "EmplRefrl.fetchTransferredToReferralList";
    public final String FIND_PARENT_COMPANY_SEQ_BY_COMPANY_MSTR_SEQ = "ParentCompanyMstr.fetchParentCompanySeqByCompanyMstrSeq";
    public final String FETCH_VENDOR_CATEGORY_MAPPING_BY_VENDOR_SEQ = "VendorCategoryMapping.fetchVendorCategoryMappingByVendorSeq";
    public final String FETCH_VENDOR_CATEGORY_BY_SEARCH = "VendorCategoryMstr.fetchVendorCategoryBySearch";
    public final String FETCH_REFRALS_BY_COMPANY_SUBSTATUS = "EmplRefrl.findReferalsByCompanyandSubstatus";
    public final String FIND_JOB_OFFERED_HIRED_COUNT = "EmplRefrl.findJobHiredCount";

    public final String FETCH_JOB_AGENCY_LIST = "JobChannelMstr.fetchJobAgencyList";
    public final String FETCH_PREVIOUS_INTERVIEW_STAGE = "EmplRefrl.fetchPreviousInterviewStage";
    public final String FIND_EMP_ACTIVITY_BY_JOB_AND_USER = "EmplActivity.findEmplActivityByJobAndUser";
    public final String FIND_EMP_ACTIVITY_BY_EMPL_REFRL_JOB_AND_USER = "EmplActivity.findEmplActivityByEmplRefrJobAndUser";
    public final String FIND_EMP_GOAL_BY_USER_AND_ACTIVITY = "EmplGoal.findEmplGoalByUserAndActivity";
    public final String FIND_EMPL_REWARDS_BY_EMPL_REFRL_AND_JOB = "EmplRewards.findEmplRewardsByEmplRefrlRewardsAndJob";
    public final String FIND_GOAL_REWARD_BY_ACTIVITY_MSTR_SEQ = "GoalReward.findGoalRewardByActivityMstrSeq";
    public final String FIND_ACTIVITYSTAGE_REWARDS_BY_ACTIVITY = "ActivityStageRewards.findActivityStageRewardsByActivity";

    public final String FIND_USER_PROFILE_AI_BY_ID_ALL_COMPANY = "UserProfile.findAllUserProfileByIdAllCompany";
    public final String FIND_USER_PROFILE_BY_EMPLOYEE_ID = "UserProfile.findAllUserProfileByEmployeeId";
    public final String GET_VIEW_JOB_PAGE_DETAILS = "Job.getViewJobPageDetails";

    public final String FIND_JOB_AGENCIES = "JobAgency.findJobVendors";
    public final String FETCH_JOB_AGENCY_LIMIT = "JobAgency.fetchAgencyJobLimit";
    public final String FETCH_ALL_JOB_AGENCIES = "Job.findAllJobAgencies";
    public final String FETCH_AGENCY_BY_JOB_SEQ = "JobAgency.fetchJobAgencyByJobSeq";
    public final String FETCH_JOB_AGENCY_BY_JOB = "JobAgency.findAllAgenciesByJob";
    public final String FETCH_JOB_TO_AGENCY_LIST = "JobAgency.fetchJobAgencyList";
    public final String FETCH_AGENCY_JOB_LIST = "JobAgency.fetchJobList";
    public final String FETCH_AGENCY_BY_JOB_SEQ_ONLY = "JobAgency.fetchJobAgencyByJobSeqOnly";

    public final String CHECK_CANDIDATE_DUPLICATE_BY_EMAIL = "EmplRefrl.checkCandidateDuplicateByEmail";
    public final String CHECK_CANDIDATE_DUPLICATE_BY_PHONE = "EmplRefrl.checkCandidateDuplicateByPhone";
    public final String CHECK_CANDIDATE_DUPLICATE_BY_EMAIL_ON_SINGLE_JOB = "EmplRefrl.checkCandidateDuplicateByEmailOnSingleJob";
    public final String CHECK_CANDIDATE_DUPLICATE_BY_PHONE_ON_SINGLE_JOB = "EmplRefrl.checkCandidateDuplicateByPhoneOnSingleJob";

    public final String FIND_ALL_USER_PROFILE_PERMISSIONS = "UserProfilePermissions.findAllUserProfilePermissions";

    public final String FIND_REFERAL_BY_USER_AND_CLIENT_CANDID = "EmplRefrl.fetchEmplRefrlByReferedAndCandidateId";
    public final String ACTION = "action";

    public final String FIND_CLIENT_ROUND_MAPPING = "ClientExternalRoundMapping.findClientRoundMapping";
    public final String CLIENT_EXTERNAL_ROUND_CODE = "externalRoundCode";
    public final String CLIENT_EXTERNAL_SUB_ROUND_CODE = "externalSubRoundCode";
    public final String FETCH_JOB_DETAIL_BY_CUSTOM8 = "JobDetail.fetchJobDetailByCustom8";
    public final String CUSTOM8 = "custom8";
    public final String COMPANY_ENTITY_ID = "companyEntityId";
    public final String COMPANY_ENTITY_LOCATION = "companyEntityLocation";
    public final String FETCH_COMPANY_BY_ENTITY_ID = "CompanyMstr.fetchCompanyByEntityId";
    public final String FETCH_COMPANY_BY_ENTITY_ID_AND_LOCATION = "CompanyMstr.fetchCompanyByEntityIdAndLocation";

    String FIND_SCHEDULE_CANCEL_BY_COMPANY = "InterviewScheduleCancelReason.findScheduleCancelReasonsByCompany";
    String FIND_INTERVIEW_SCHEDULES_BY_COMPANY_REFRL = "InterviewSchedule.findInterviewScheduleByRefrl";
    String FIND_TIMEZONES = "TimezoneMstr.getTimezones";
    String FIND_TIMEZONE_WITH_DESCRIPTION = "TimezoneMstr.getTimezoneWithDescription";
    String FIND_INTERVIEW_SCHEDULE_ATTENDEE_BY_COMPANY_INTERVIEW_SCHEDULE = "InterviewScheduleAttendee.findInterviewScheduleAttendeeByInterviewSchedule";
    String FIND_OPEN_INTERVIEW_SCHEDULE_STATUS_MSTR = "InterviewScheduleStatusMstr.findOpenInterviewScheduleStatusMstr";
    String FIND_INTERVIEW_SCHEDULE_ATTENDEE_BY_INTERVIEW_SCHEDULE_AND_USER_TYPE = "InterviewScheduleAttendee.findInterviewScheduleAttendeeByInterviewScheduleAndUsertype";
    String FIND_ALL_INTERVIEW_SCHEDULE_ATTENDEE_BY_COMPANY_INTERVIEW_SCHEDULE = "InterviewScheduleAttendee.findAllInterviewScheduleAttendeeByInterviewSchedule";


    String TASK_STATUS_CD = "taskStatusCD";
    String INTERVIEW_STATUS_CD = "statusCD";
    String TASK_TYPE_CD = "taskTypeCD";

    String INTERVIEW_SCHEDULE_REASON_TYPE = "type";

    String TASK_CANCELLED = "CANCELLED";
    String TASK_COMPLETE_ON_TIME = "COMPLETE_IN_TIME";
    String TASK_ASSIGNED = "ASSIGNED";
    String TASK_PENDING = "PENDING";
    String TASK_COMPLETE_AUTO = "COMPLETE_AUTO";
    String INTERVIEW_TASK = "INTERVIEW";
    String REVIEW_TASK = "REVIEW";
    String REC_REVIEW_TASK = "REC_REVIEW";
    String APPROVAL_TASK = "APPROVAL";

    String FIND_TASK_STATUS_BY_CODE_AND_COMPANY = "TaskStatusMaster.findTaskStatusByCDAndCompany";
    String FIND_TASK_TYPE_BY_CODE_AND_COMPANY = "TaskTypeMaster.findTaskTypeByCDAndCompany";
    String FIND_INTERVIEW_TASK_BY_INTERVIEW_SEQ_AND_COMPANY = "InterviewTask.findInterviewTaskByInterviewSeqAndCompany";
    String FIND_INTERVIEW_TASK_BY_INTERVIEW_REVIEW_SEQ_AND_COMPANY = "InterviewReviewTask.findInterviewReviewTaskByInterviewReviewSeqAndCompany";
    String FIND_JOB_REQUEST_TASK_BY_JOB_SEQ_AND_COMPANY = "JobRequestTask.findJobRequestTaskByJobSeqAndCompany";
    String FIND_JOB_APPROVAL_TASK_BY_JOB_SEQ_AND_COMPANY = "JobApprovalTask.findJobApprovalTaskByJobSeqAndCompany";

    String FIND_INTERVIEW_REVIEW_TASK_BY_INTERVIEW_SEQ_AND_COMPANY = "InterviewTask.findInterviewReviewTaskByInterviewSeqAndCompany";

    String FIND_INTERVIEW_INFO_BY_TAB = "InterviewScheduleAttendee.findInterviewInfoByTab";

    public final String FETCH_EMPLOYEE_DETAIL_BY_USER_PROFILE = "EmployeeDetail.fetchEmployeeDetailByUserProfile";
    public final String FETCH_EMPLOYEE_DETAIL_MAPPER_BY_USER_PROFILE = "EmployeeDetailMapper.fetchEmployeeDetailMapperByUserProfile";
    public final String FETCH_USER_COINS_COUNT_BY_REQUEST_TYPE = "CoinsServiceLog.fetchUserCoinsCountByRequestType";

    public final String GET_EMP_BADGE_RECORD = "EmplBadge.getEmpBadgeRecord";
    public final String FIND_EMPLOYEE_EMAILS_FOR_JOB_MAILER = "EmployeeMstr.findEmployeeEmailForJobMailer";
    public final String FIND_EMPLOYEES_BY_EMAIL_FOR_JOB_MAILER = "EmployeeMstr.findEmployeesByEmailForJobMailer";
    public final String FETCH_SOCIAL_CHANNEL_COUNT = "ReferralChannelConfig.fetchSocialChannelCount";


    //interview feedback queries
    String GET_INTERVIEW_CANDIDATES_TODAY_COUNT = "InterviewScheduleAttendee.getInterviewCandidateTodayCount";
    String GET_INTERVIEW_CANDIDATES_UPCOMING_COUNT = "InterviewScheduleAttendee.getInterviewCandidateUpcomingCount";
    String GET_INTERVIEW_CANDIDATES_PENDING_FEEDBACK_COUNT = "InterviewScheduleAttendee.getInterviewCandidatePendingCount";
    String GET_INTERVIEW_CANDIDATES_COMPLETED_COUNT = "InterviewScheduleAttendee.getInterviewCandidateCompletedCount";

    String GET_INTERVIEW_CANDIDATES_TODAY_LIST_FOR_EMPL_REFRL = "InterviewScheduleAttendee.getInterviewCandidateTodayListForEmplRefrl";
    String GET_INTERVIEW_CANDIDATES_TODAY_LIST = "InterviewScheduleAttendee.getInterviewCandidateTodayList";
    String GET_INTERVIEW_CANDIDATES_UPCOMING_LIST_FOR_EMPL_REFRL = "InterviewScheduleAttendee.getInterviewCandidateUpcomingListForEmplRefrl";
    String GET_INTERVIEW_CANDIDATES_UPCOMING_LIST = "InterviewScheduleAttendee.getInterviewCandidateUpcomingList";
    String GET_INTERVIEW_CANDIDATES_PENDING_FEEDBACK_LIST_FOR_EMPL_REFRL = "InterviewScheduleAttendee.getInterviewCandidatePendingListForEmplRefrl";
    String GET_INTERVIEW_CANDIDATES_PENDING_FEEDBACK_LIST = "InterviewScheduleAttendee.getInterviewCandidatePendingList";
    String GET_INTERVIEW_CANDIDATES_COMPLETED_LIST_FOR_EMPL_REFRL = "InterviewScheduleAttendee.getInterviewCandidateCompletedListForEmplRefrl";
    String GET_INTERVIEW_CANDIDATES_COMPLETED_LIST = "InterviewScheduleAttendee.getInterviewCandidateCompletedList";
    //interview feedback queries end

    String GET_INTERVIEW_EMAIL_NOTIFY_LIST = "InterviewScheduleAttendee.getInterviewEmailNotifyList";
    String GET_REVIEW_EMAIL_NOTIFY_LIST = "InterviewReview.getReviewEmailNotifyList";

    String FIND_INTERVIEW_QUESTIONS_BY_COMPANY = "InterviewFeedbackQuestions.findInterviewQuestionByCompany";
    String FIND_INTERVIEW_ANSWERS_BY_EMP_REFRL_AND_INTERVIEW = "InterviewFeedbackAnswers.findInterviewAnswersByEmpRefrlAndInterview";
    String FIND_INTERVIEW_INFO_BY_TOKEN = "Interviewer.findInterviewerByToken";
    String FIND_MAX_INTERVIEW_INFO_BY_INTERVIEW_DETAILS = "Interview.findMaxInterviewInfoFromInterviewDetails";

    String FIND_INTERVIEW_SCHEDULE_BY_INTERVIEW_DETAIL_SEQ = "InterviewSchedule.findInterviewScheduleByInterviewDetailSeq";
    String FETCH_ALL_CHILD_COMPANY_MSTR_SEQ = "CompanyMstr.fetchAllChildCompanyMstrSeq";

    String FIND_CANDIDATE_RESUME_DETAILS_BY_EMPL_REFRL_SEQ = "CandidateResumeDetails.findCandidateResumeDetailsByEmplRefrlSeq";

    String FETCH_FORM_FIELDS_HEADERS_ALL = "CandidateFormFields.fetchFormFieldsHeadersAll";
    String FETCH_FORM_FIELDS_HEADERS_INTERVIEW = "CandidateFormFields.fetchInterviewerFormFieldsHeaders";
    String FIND_COMMENTS_FOR_INTERIVIEWER_BY_EMPL_REFRL_ALL_COLLAB = "InterviewComments.findCommentsForInterviewerByEmplRefrlAllCollab";
    String FIND_COMMENTS_FOR_INTERIVIEWER_BY_EMPL_REFRL_NO_COLLAB = "InterviewComments.findCommentsForInterviewerByEmplRefrlNoCollab";
    String FIND_INTERVIEW_INFO_BY_USER_INTERVIEW_DETAIL = "Interviewer.findInterviewerByUserAndInterviewDetailSeq";
    String INTERVIEW_FEEDBACK_QUESTIONS_SEQ = "interviewFeedbackQuestionsSeq";
    String FIND_INTERVIEW_QUESTIONS_BY_QUESTION_SEQ = "InterviewFeedbackQuestions.findInterviewQuestionByQuestionSeq";

    String FIND_INTERVIEW_BY_INTERVIEW_SEQ = "Interview.findInterviewByInterviewSeq";
    public final String FETCH_CONTEST_JOB_REWARD_BY_BAND = "ContestReward.findContestTotalContestRewardBandInJobs";

    String FIND_INTERVIEW_SCHEDULE_BY_INTERVIEW_SEQ = "InterviewSchedule.findInterviewScheduleByInterviewSeq";
    String FIND_EMPL_REFRL_BY_INTERVIEW_DETAILS_SEQ = "EmplRefrl.findEmplRefrlByInterviewDetailSeq";
    String FIND_INTERVIEW_BY_SCHEDULE_SEQ = "InterviewSchedule.findInterviewByScheduleSeq";
    String FIND_INTERVIEW_STAGE_MSTR_BY_INTERVIEW_DETAILS_SEQ = "InterviewStageMstr.findInterviewStageMstrByInterviewDetailSeq";
    String FIND_INTERVIEW_USER_INFO_BY_TOKEN = "Interviewer.findInterviewUserInfoByToken";

    String FIND_ATTENDEES_BY_INTERVIEW_SCHEDULE_SEQ = "InterviewScheduleAttendee.findAttendeesByScheduleSeq";

    //    interview review queries
    String GET_REVIEW_CANDIDATES_COUNT_PENDING = "InterviewReview.getReviewCandidateCountPending";
    String GET_REVIEW_CANDIDATES_COUNT_FOR_INTERVIEW_TOKEN = "InterviewReview.getReviewCandidateCountForInterviewToken";
    String GET_REVIEW_CANDIDATES_COUNT_COMPLETED = "InterviewReview.getReviewCandidateCountCompleted";

    String GET_REVIEW_CANDIDATES_LIST_PENDING = "InterviewReview.getReviewCandidateListPending";
    String GET_REVIEW_CANDIDATES_LIST_PENDING_FOR_EMPL_REFRL = "InterviewReview.getReviewCandidateListPendingForEmplRefrl";
    String GET_REVIEW_CANDIDATES_LIST_COMPLETED = "InterviewReview.getReviewCandidateListCompleted";
    String GET_REVIEW_CANDIDATES_LIST_COMPLETED_FOR_EMPL_REFRL = "InterviewReview.getReviewCandidateListCompletedForEmplRefrl";
//    interview review queries end

    String FIND_INTERVIEW_REVIEW_BY_INTERVIEW_SEQ = "InterviewReview.findReviewByInterview";
    String FIND_INTERVIEW_BY_INTERVIEW_DETAIL_SEQ = "Interview.findInterviewByInterviewDetailSeq";
    String FIND_ALL_INTERVIEW_BY_INTERVIEW_DETAIL_SEQ = "Interview.findAllInterviewByInterviewDetailSeq";
    String FETCH_IS_FEEDBACK_DONE = "Interview.getIsFeedbakDone";
    String FETCH_IS_REVIEW_DONE = "InterviewReview.getIsReviewDone";

    String FIND_EMPL_REFRL_BY_INTERVIEW_SEQ = "Interview.findEmplRefrlByInterviewSeq";
    String FIND_INTERVIEW_BY_JOB = "Interview.findInterviewForJob";
    String FIND_INTERVIEW_REVIEW_BY_INTERVIEW_DETAILS_SEQ = "InterviewReview.findInterviewReviewsByInterviewDetailSeq";
    String FIND_INTERVIEW_FEEDBACK_COMMENTS_BY_INTERVIEW_SEQ = "InterviewFeedbackComments.findInterviewFeedbackCommentsByInterviewSeq";

    String VALIDATE_REVIEWER_FOR_EXISITNG_INTERVIEW = "InterviewDetails.validateReviewerForExistingInterview";

    String GET_SCHEDULE_CANDIDATE_DETAILS = "InterviewSchedule.getScheduleCandidateDetails";
    String GET_REVIEW_CANDIDATE_DETAILS = "InterviewReview.getReviewCandidateDetails";
    String INTERVIEW_COMMENT_TYPE = "commentType";
    String GET_INTERVIEW_REVIEW_BY_REFRL = "InterviewReview.getInterviewReviewByRefrl";

    public final String FETCH_CURRENCY_CONVERSION_BY_COMPANY="CurrencyConversion.fetchCurrencyConversionByCompany";
    public final String FETCH_CURRENCY_CONVERSION_BY_COMPANY_AND_CURRENCY="CurrencyConversion.fetchCurrencyConversionByCompanyAndCurrency";
    public final String FETCH_USER_COINS_HISTORY="UserCoinsHistory.fetchUserCoinsHistory";

    String FETCH_JOB_FORM_FIELDS_VIEW_HEADERS_ALL = "JobFormField.getAllViewJobFieldHeaders";
    String FIND_APPROVER_DISPLAY_LIST="EmployeeMstr.findApproverDisplayList";

    String JOB_STATUS_CD = "jobStatusCd";
    String JOB_STATUS_LABEL = "jobStatusLabel";
    String GET_JOB_STATUS_MSTR = "JobStatusMstr.getJobStatusMstr";

    String GET_JOB_HISTORY_DATES = "Job.getJobHistoryDates";
    String REQUEST_JOB_FORM_FIELDS = "JobFormField.getRequestJobFields";
    String FIND_ALL_USER_EMAILS = "EmployeeMstr.findAllUserEmail";

    String RECRUITERBOX_IN_PROCESS = "in_process";
    String RECRUITERBOX_SCREENING = "Screening";
    String RECRUITERBOX_MAKE_CONTACT = "Make Contact";
    String RECRUITERBOX_MAKE_OFFER = "Make Offer";
    String FIND_JOB_SNAPSHOT_BY_JOB_SEQ = "JobSnapshot.findJobSnapshotByJobSeq";

    public final String JOB_APPROVAL_LEVEL = "level";
    public final String FIND_JOB_APPROVERS_BY_LEVEL = "Job.findJobApproversByLevel";
    String FETCH_JOB_APPROVAL_DETAILS_BY_JOB = "JobApprovalDetails.fetchJobApprovalDetailsByJob";
    String FETCH_JOB_APPROVER_BY_JOB_LEVEL = "JobApprover.fetchJobApproverByJobLevel";
    String FETCH_JOB_APPROVER_BY_USER_PROFILE_SEQ = "JobApprover.fetchJobApproverByUserProfileSeq";
    String FIND_USER_GROUP_MEMBER_BY_USER_GROUP_SEQ = "UserGroupMembers.findUserGroupMemberByUserGroupSeq";
    String FETCH_INACTIVE_JOB_APPROVAL_DETAILS_BY_JOB_LEVEL_SHIFT_STATUS = "JobApprovalDetails.fetchInactiveJobApprovalDetailsByJobLevelShiftStatus";
    String FETCH_JOB_APPROVER_BY_JOB_USER = "JobApprover.fetchJobApproverByJobUser";
    String FETCH_JOB_APPROVER_FOR_SOLR_VIEW_BY_JOB = "JobApprover.fetchJobApproverForSolrViewByJob";
    String FETCH_ALL_JOB_APPROVERS_BY_JOB="JobApprover.fetchAllJobApproversByJob";
    String FETCH_ALL_JOB_APPROVERS_DETAILS_BY_JOB= "JobApprovalDetails.fetchAllJobApproversDetailsByJob";
    String FIND_JOB_APPROVERS_COUNT="JobApprover.findJobApproversCount";
    String FIND_JOBS_BY_JOB_SEQ_LIST = "Job.findJobsByJobSeqList";
    String FIND_MAIL_DATA_PRESENT_OR_NOT = "MailData.findMailDataPresentOrNot";

    String FIND_ALL_JOBS_IN_CONTEST = "ContestJob.findAllJobsInContest";
    String FIND_ALL_ACTIVE_JOBS_LIST = "Job.findAllActiveJobsList";
    String FIND_ALL_ACTIVE_JOBS_COUNT = "Job.findAllActiveJobsCount";
    String GET_ALL_CHILD_COMPANIES_BY_COMPANY = "CompanyMstr.getAllChildCompanesByCompanyMstrSeq";
    String FETCH_WITHDRAWEE_NAME_BY_JOB = "EmployeeMstr.FetchWithdraweeName";
    String CHECK_EMP_BY_COMPANY_AND_EMAIL = "EmplRefrl.checkEmpbyCompanyAndEmail";
    String CHECK_EMP_BY_COMPANY_AND_PHONE_NO = "EmplRefrl.checkEmpbyCompanyAndPhoneNo";

    String FIND_INTERVIEW_KIT_BY_COMPANY = "InterviewKit.findInterviewKitByCompanyMstrSeq";
    String FIND_INTERVIEW_KIT_MAP_BY_INTERVIEW_SEQ = "InterviewKitMap.findInterviewKitMapByInterviewSeq";
    String FIND_INTERVIEW_QUESTIONS_BY_COMPANY_AND_KIT = "InterviewKitQuestion.findInterviewQuestionsByKit";
    String FIND_PREASSIGNED_STAGE_KIT_MAPPING = "InterviewKit.findPreassignedStageKitMapping";

    String INTERVIEW_KIT_DEFAULT = "DEFAULT";
    String INTERVIEW_KIT_OFF = "OFF";
    String INTERVIEW_KIT_ON_SCHEDULE_OFF = "OFF";

    String INTERVIEW_KIT_ON_JOB_OFF = "OFF";
    String INTERVIEW_KIT_ON_JOB_ON = "ON";

    String INTERVIEW_KIT_ON_HM_REQUEST_OFF = "OFF";

    String FIND_DEFAULT_INTERVIEW_KIT = "InterviewKit.findDefaultInterviewKit";
    String FIND_INTERVIEW_KIT_TAG_MSTR_WITH_TITLE = "InterviewKitTagMstr.findTagMstrWithTitle";
    String FIND_INTERVIEW_FEEDBACK_QUESTION_WITH_TOPIC_DETAILS = "InterviewFeedbackQuestion.findQuestionWithTopicDetails";
    String FIND_ALL_INTERVIEW_KIT_TAG_MSTR_LIKE_TITLE = "InterviewKitTagMstr.findAllTagMstrLikeTitle";
    String GET_JOB_STAGE_KIT_MAPPING = "InterviewKitJobStage.getJobStageKitMapping";
    String FIND_INTERVIEW_KIT_TAG_BY_INTERVIEW_KIT_AND_TAG_SEQ = "InterviewKitTag.getInterviewKitTagByInterviewKitSeqAndTagMstrSeq";
    String FIND_INTERVIEW_KIT_QUESTION_BY_INTERVIEW_KIT_AND_INTERVIEW_FEEDBACK_QUESTION_SEQ = "InterviewKitQuestion.getInterviewKitQuestionByInterviewKitSeqAndInterviewFeedbackSeq";
    String FIND_INTERVIEW_KITS_FOR_JOB_STAGE = "InterviewKitJobStage.findInterviewKitsForJobAndStage";
    String FIND_ASSIGNED_STAGE_KIT_MAPPING = "InterviewKitJobStage.findAssignedStageKitMapping";
    String FETCH_REMOVED_KITS_FROM_STAGE = "InterviewKitJobStage.fetchRemovedKitsFromStage";
    String FIND_KIT_COUNT_JOB_STAGE = "InterviewKitJobStage.findKitCountJobStage";
    String FIND_STAGE_FOR_KIT_MAPPING = "InterviewStageMstr.findStagesForKitMapping";
    String FIND_KIT_COUNT_BY_COMAPNY = "InterviewKit.getKitCountByCompany";

    String FETCH_PREVIOUS_DAY_IJP_JOB_CAND_DETAILS = "Job.fetchPreviousDayIjpJobCandDetails";
    String FETCH_RECRUITER_DETAILS_FOR_JOB = "JobRecruiter.fetchRecruiterDetailsForJob";

    String FETCH_NOTIFY_INTERNAL_JOB_BY_USER_PROFILE_AND_JOB = "NotifyInternalJob.fetchNotifyInternalJobByUserProfileAndJob";
    String FIND_INTERNAL_JOB_ELIGIBILITY_MAPPING="InternalJobEligibilityMapping.findINtrnalJobEligibilityMapping";
    public final String FIND_CLIENT_INTERNAL_MAPPING_BY_TYPE = "ClientCustomItemsMstr.findClientInternalMappingByType";
    public final String FETCH_COMPANIES_ALL_JOBS =  "Job.fetchCompaniesAllJobs";
    public final String FETCH_COMPANIES_ALL_JOBS_COUNT =  "Job.fetchCompaniesAllJobsCount";
    public final String FETCH_ALL_COMPANIES_BY_CODE =  "CompanyMstr.fetchAllCompaniesByCompanyCd";
    String FIND_EMPL_REWARDS_BY_EMPL_REFRL_AND_JOB_REWARD_RELESE = "EmplRewards.findEmplRewardsforEmplRefrlAndJob";
    String FIND_CANDIDATE_PAGE_LAYOUT_BY_COMPANY_AND_PAGE_CD = "CandidatePageLayout.findCandidatePageLayoutByCompanyAndPageCd";
    String FIND_CANDIDATE_PAGE_REGIONS_BY_COMPANY_AND_PAGE_LAYOUT = "CandidatePageRegions.findCandidatePageRegionsByCompanyAndPageLayout";
    String PAGE_CD = "pageCd";
    String CANDIDATE_PAGE_LAYOUT_SEQ = "candidatePageLayoutSeq";
    String FIND_REDEMPTION_PAYOUT_DETAIL_BY_SEQ = "RedemptionPayoutDetails.findRedemptionPayoutDetailsBySeq";
    String FETCH_ALL_NOT_RELEASED_REWARDS_BY_JOB = "EmplReward.fetchAllNotReleasedRewardsByJobseq";
    String FETCH_PENDING_SMS= "SmsLog.fetchPendingSms";
    String GET_JOB_SMS_TEMPLATES="SmsTemplateConfig.getJobSmsTemplatesByCompany";

    String FETCH_EMP_DETAILS_LIST="EmployeeMstr.fetchEmpDetailsList";
    String FETCH_EMP_COUNT="EmployeeMstr.fetchEmpCount";
    public final String FETCH_EMP_MSTR_BY_EMP_MSTR_SEQ = "EmployeeMstr.fetchEmployeeMstrByEmployeeMstrSeq";

    String FETCH_ALL_USER_PROFILES_CREATED_BY_USER = "UserProfile.fetchAllUserProfilesCreatedByUser";
    String FIND_EMPL_REFRL_BY_JOB_SEQ_ALL_ENTITY = "EmplRefrl.findEmplRefrlByJobSeqAllEntity";
    String FETCH_ALL_ATTACHMENTS_BY_EMPL_REFRL = "CandidateAttachment.fetchAllAttachmentsByEmplRefrl";

    String FETCH_SMS_SCHEDULE_COUNT_BY_COMPANY = "SmsScheduleDetails.fetchSmsScheduleCountByCompany";
    String FETCH_SMS_SCHEDULES_BY_COMPANY = "SmsScheduleDetails.fetchSmsScheduleByCompany";
    String FIND_PENDING_SMS_BY_SCHEDULE = "SmsLog.findPendingSmsBySchedule";
    String FIND_ALL_ER_JOBS_COMPANY = "Job.findAllErJobsCompany";
    String FETCH_SMS_LOGS_BY_SCHEDULE = "SmsLog.fetchSmsLogsBySchedule";
    String FIND_EMPLOYEE_BY_PHONE = "EmployeeMstr.findEmployeeByPhone";
    String FETCH_ER_JOB_COUNT_ALL_COMPANY="Job.fetchERJobCountAllCompany";
    String FETCH_JOB_COUNT_ALL_COMPANY="Job.fetchTotalJobCountAllCompany";
    String FIND_SMS_TEMPATE_BY_ID="SmsTemplateConfig.findSmsTemplateById";

    String FETCH_TALEO_CAND_BY_CLIENT_ID_AND_APPLICATION_STATUS = "TaleoPreApplication.fetchTaleoCandByClientIDAndApplicationStatus";
    String FIND_ETL_LOGS_BY_UPLOAD_STATUS = "EtlFileLog.getEtlFileLogsByUploadStatus";
    String FIND_DUPLICATE_CANDIDATE_BY_EMAIL = "TaleoPreApplication.findDuplicateCandidateByEmail";
    String FIND_DUPLICATE_CANDIDATE_BY_JOB_AND_EMAIL = "TaleoPreApplication.findDuplicateCandidateByJobAndEmail";
    String FIND_CANDIDATE_NOT_SENT_TO_TALEO = "TaleoPreApplication.findCandidateNotSentToTaleo";
    String FETCH_FIRST_REFERRER = "TaleoPreApplication.fetchFirstReferrer";
    String FETCH_TALEO_APPLICATION_BY_JOB_EMPLREFRL_CID = "TaleoPreApplication.FetchTaleoApplicationByJobEmplRefrlCID";
    String FIND_EMPL_REFRLS_BY_CAND_EMAIL = "EmplRefrl.findEmplRefrlsByCandEmail";
    String FETCH_INTRV_DETAILS_BY_RHID_AND_JOB_CD = "InterviewDetails.FetchRejectionEntryByRHIDAndJobCd";

    String GET_URL_MAPPING = "URLMapping.getURLMapping";
    String FETCH_PENDING_SMS_DETAILS_LOG = "SmsDetailsLog.fetchPendingSmsDetailsLog";
    String FETCH_LATEST_REAPPLY_DATE_FOR_CANDIDATE = "DuplicateCandidateLog.fetchLatestReapplyDateForCandidate";
    String FIND_VENDOR_MSTR_IN_VENDOR_PROFILE_BY_USER_PROFILE_SEQ = "VendorProfile.findVendorMstrByUserProfile";


    String FETCH_EMPLOYEE_BY_PHONE_AND_DOB="EmployeeMstr.fetchEmployeesByPhoneAndDOB";
    String FETCH_EMPLOYEE_BY_NAME_AND_DOB="EmployeeMstr.fetchEmployeesByNameAndDOB";
    String GET_ALL_IJP_EMPLOYEES="EmployeeMstr.GetAllIjpEmployees";

    // IJP
    String IJP_DUPLICACY_MESSAGE = "ijp_duplicacy_message";

    //ICICI Location Code
    String LOCATION_CODE = "locationCode";
    String FETCH_LOCATION_CODE_MAPPING_DATA = "IciciLocationCodeMapping.fetchLocationCodeMappingData";
}

