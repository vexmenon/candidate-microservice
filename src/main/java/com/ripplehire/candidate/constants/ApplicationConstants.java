
package com.ripplehire.candidate.constants;

import java.util.ArrayList;
import java.util.List;

public interface ApplicationConstants {

    public final char CHAR_A = 'A';
    public final char CHAR_I = 'I';
    public final String FORM_TYPE_REFER = "REFER";
    public final String FORM_TYPE_APPLY = "APPLY";
    public final String FORM_TYPE_CTP = "CTP";
    public final String STR_Y = "Y";
    public final String STR_N = "N";
    public final String STR_EMPTY = "";
    public final String STR_A = "A";
    public final String STR_C = "C";
    public final String STR_I = "I";
    public final String STR_ZERO = "0";
    public final String STR_PERCENT_SYMBOL = "%";
    public final String STR_CONTEST = "CONTEST";
    public final String STR_CAMPAIGN = "CAMPAIGN";
    public final String STR_FIRSTSOURCE = "FIRSTSOURCE";
    public final String STR_HOTJOB = "H";
    public final String STR_CONTESTJOB = "C";
    public final String STR_REGULARJOB = "R";
    public final String STR_SYSTEMJOB = "S";
    public final String STR_FORWARD_SLASH = "/";
    public final String STR_PLUS = "+";
    public final String STR_ZERO_FORWARD_SLASH_ZERO = "0/0";
    public final String STR_EQUAL_TO = "=";
    public final String STR_SPACE = " ";
    public final String STR_NEW_LINE = "\n";
    public final String STR_NEWJOB = "NEW";
    public final String STR_LINKEDJOB = "LINKED";
    public final String STR_SINGLE = "SINGLE";
    public final String STR_COMMA = ",";
    public final String STR_DOUBLE_QUOTES = "\"";
    public final String STR_COMMA_AND_SPACE = ", ";
    public final String STR_EDIT = "EDIT";
    public final String STR_LINKJOB = "LINK";
    public final String STR_EMPLOYEE = "EMPLOYEE";
    public final String STR_EMP = "Employee";
    public final String STR_RECRUITER = "RECRUITER";
    public final String QUESTION_MARK = "?";
    public final String AMPERSON = "&";
    public final String STR_REDIRECT = "redirect:";
    public final String UNDER_SCORE = "_";
    public final String STR_DEFAULT = "DEFAULT";
    public final String STR_CUSTOM_SPLITTER = "%%%";

    public final String STR_EXPERIENCE = "Experience : ";
    public final String STR_SKILLS = "Skills : ";
    public final String UNHOLD = "UNHOLD";

    public final String STR_YEARS = " Years";
    public final String STR_MULTIPLE = "Multiple";
    public final String STR_YEAR = "Year";
    public final String STR_MONTH = "Month";

    public final String SKILL_TEXT_OVERALL = "Overall";

    public final String ALL_CANDIDATES = "All Candidates";
    public final String RS_CAND_REFERRED = "RS_CAND_REFERRED";
    public final String RS_CAND_SUGGESTED = "RS_CAND_SUGGESTED";
    public final String RS_CAND_RESPONDED = "RS_CAND_RESPONDED";
    public final String RS_CAND_INPROCESS = "RS_CAND_INPROCESS";
    public final String RS_CAND_REJECTED = "RS_CAND_REJECTED";
    public final String RS_CAND_JOBOFFERED = "RS_CAND_JOBOFFERED";
    public final String RS_CAND_HIRED = "RS_CAND_HIRED";
    public final String RS_CAND_ONHOLD = "RS_CAND_ONHOLD";
    public final String RS_CAND_ROUND_TWO = "RS_CAND_ROUND_TWO";

    public final String REFERRAL_TYPE_RESUME = "RESUME";
    public final String REFERRAL_TYPE_FACEBOOK = "FACEBOOK";
    public final String REFERRAL_TYPE_WHATSAPP = "WHATSAPP";
    public final String REFERRAL_TYPE_LINKEDIN = "LINKEDIN";
    public final String REFERRAL_TYPE_TWITTER = "TWITTER";
    public final String REFERRAL_TYPE_GOOGLE_PLUS = "GOOGLE_PLUS";
    public final String REFERRAL_TYPE_EMAIL = "EMAIL";
    public final String REFERRAL_TYPE_LINK = "ERLINK";
    public final String REFERRAL_TYPE_SMS = "SMS";

    public final String REFERRAL_MODE_REFER = "REFER";
    public final String REFERRAL_MODE_SHARE = "SHARE";

    public final String RFRL_TYPE_DESC_DIRECT = "Direct";
    public final String RFRL_TYPE_DESC_OTHER = "Other";
    public final String RFRL_TYPE_DESC_FACEBOOK = "Facebook";
    public final String RFRL_TYPE_DESC_LINKEDIN = "LinkedIn";
    public final String RFRL_TYPE_DESC_TWITTER = "Twitter";
    public final String RFRL_TYPE_DESC_GOOGLEPLUS = "Google+";
    public final String RFRL_TYPE_DESC_EMAIL = "Email";

    public final String SESSION_ATTR_LINKEDIN_PEOPLE_SEARCH_DATA = "LIPPLSRCH";
    public final String SESSION_ATTR_FACET_MATCHES_LINKEDIN = "FACETMTCHLI";
    public final String SESSION_ATTR_JOB_MATCHES_FACEBOOK = "JOBMTCHFB";
    public final String SESSION_ATTR_USER_PROFILE = "USERPROFILE";
    public final String SESSION_ATTR_REFERRAL_TOKEN = "REFERRALTOKEN";
    public final String SESSION_ATTR_JOB_SEQ_PROFILE_MATCH = "JOBSEQPROFMTCH";
    public final String SESSION_ATTR_COMPANY_INFO = "COMPANYINFO";
    public final String SESSION_ATTR_REDIRECT = "REDIRECT";
    public final String SESSION_ATTR_PAGE = "PAGE";
    public final String SESSION_ATTR_JOBSEQ = "JOBSEQ";
    public final String SESSION_ATTR_EMAIL_ADDR = "EMAIL_ADDR";
    public final String SESSION_ATTR_JOB_TITLE = "JOBTITLE";
    public final String SESSION_ATTR_JOB_TITLE_LABEL = "jobLabel";
    public final String SESSION_ATTR_RH_INFO = "RH_SESSION_INFO";
    public final String SESSION_ATTR_FEATURE_VISIB = "featureVisible";
    public final String SESSION_ATTR_CONFIG_PARAM = "configParams";
    public final String SESSION_ATTR_EXCEPTION_COUNT = "max_exception";
    public final String SESSION_ATTR_USER_PERMISSIONS = "userPermissions";
    public final String SESSION_EXPIRED = "expired";
    public final String SESSION_ALIVE = "alive";
    public final String SESSION_LAST_LOGIN_DTTM = "lastLoginDttm";
    public final String SESSION_ALLOW_IFRAME = "allowIframe";
    public final String SESSION_SCHEDULE_MESSAGE = "scheduleMsg";
    String SESSION_ATTR_EMAIL_UNSUBSCRIBE_TYPE = "UNSUBSCRIBE_TYPE";

    public final Character ACTIVE = 'A';
    public final Character INACTIVE = 'I';
    public final Character CHAR_Y = 'Y';
    public final Character CHAR_N = 'N';

    public final String JOB_REFERRAL_TYPE_INDIVIDUAL = "I";

    public final String REFRL_STATUS_REFERRED = "Contacted";
    public final String REFRL_STATUS_SUGGESTED = "Suggested";
    public final String REFRL_STATUS_HIRED = "Hired";
    public final String REFRL_STATUS_ONHOLD = "On Hold";
    public final String REFRL_STATUS_INPROCESS = "In Process";
    public final String REFRL_STATUS_RESPONDED = "Applied";
    public final String REFRL_STATUS_JOBOFFERED = "Offered";
    public final String REFRL_STATUS_REJECTED = "Rejected";
    public final String STATUS_MOVE = "MOVE";

    public final String REWARD_TYPE_AMT_RS = "AMT_RS";
    public final String REWARD_TYPE_POINTS = "POINTS";
    public final String REWARD_TYPE_GIFT = "GIFT";
    public final String REWARD_TYPE_BADGE = "BADGES";
    public final String REWARD_TYPE_MEDAL = "MEDAL";
    public final String REWARD_TYPE_COINS = "COINS";

    public final String PROVIDER_ID_LINKEDIN = "linkedin";
    public final String PROVIDER_ID_FACEBOOK = "facebook";
    public final String PROVIDER_ID_TWITTER = "twitter";
    public final String PROVIDER_ID_LINKEDIN_IMPORT = "linkedinimport";

    public final String GOAL_NOT_COMPLETE = "NC";
    public final String GOAL_COMPLETE = "C";

    public final String VIEW_CHANGEPASSWORD = "changepassword";
    public final String VIEW_EMPLOYEEDASHBOARD = "employeedashboard";
    public final String VIEW_MYREFERRALS = "myreferrals";
    public final String VIEW_JOB_DESCRIPTION = "jobdescription";
    public final String VIEW_MYREWARDS = "myrewards";
    public final String VIEW_LINKEDIN_PROFILES = "linkedinprofiles";
    public final String VIEW_FACEBOOK_PROFILES = "facebookprofiles";
    public final String VIEW_JOBDASHBOARD = "jobdashboard";
    public final String VIEW_CAMPAIGN_DASHBOARD = "campaigndashboard";
    public final String VIEW_CAMPAIGN_DETAILS = "campaigndetails";
    public final String VIEW_CAMPAIGN_CREATE = "createcampaign";
    public final String VIEW_CAMPAIGN_ADDJOBS = "campaignaddjobs";
    public final String VIEW_CAMPAIGN_LINKJOBS = "linkcampaignjobpopup";
    public final String VIEW_CAMPAIGN_PUBLISH = "campaignpublish";
    public final String VIEW_CAMPAIGN_PUBLISH_PREVIEW = "campaignpublishpreview";
    public final String VIEW_CONTEST_DASHBOARD = "eventdashboard";
    public final String VIEW_CONTEST_DETAILS = "eventdetails";
    public final String VIEW_CONTEST_CREATE = "createevent";
    public final String VIEW_CONTEST_ADDJOBS = "eventaddjobs";
    public final String VIEW_LINKJOBS = "linkjobspopup";
    public final String LINKJOBS_JOBTABLE = "jobtablelist";
    public final String VIEW_CONTEST_PUBLISH = "eventpublish";
    public final String VIEW_CONTEST_PUBLISH_PREVIEW = "eventpublishpreview";
    public final String VIEW_CONTEST_REWARDPOPUP = "addcontestrewardpopup";
    public final String VIEW_CONTEST_WINNER = "contestwinners";
    public final String VIEW_EMP_CONTEST_DETAIL = "empeventdetail";
    public final String VIEW_EMP_CONTEST_REWARDS = "empcontestrewards";
    public final String VIEW_CONTEST_LEADERBOARD = "contestleaderboard";
    public final String ATRRIBUTE_MODEL = "model";
    public final String ATRRIBUTE_LISIGNEDIN = "lisignedin";
    public final String ATRRIBUTE_TWTRSIGNEDIN = "twtrsignedin";
    public final String ATRRIBUTE_LIAPIACCESS = "liapiaccess";
    public final String ATRRIBUTE_LICONTACTSIMPORTED = "licontactsimported";
    public final String ATRRIBUTE_SOCIALREFVO = "socialRefVO";
    public final String ATRRIBUTE_UPLOADREFVO = "uploadRefVO";
    public final String ATRRIBUTE_EMAILREFVO = "emailRefVO";
    public final String ATRRIBUTE_FBSIGNEDIN = "fbsignedin";
    public final String ATRRIBUTE_JOBPAGE = "jobPage";
    public final String ATRRIBUTE_LINKEDIN_PROFILE_BATCH_INDEX = "lastLiProfileIndex";
    public final String ATRRIBUTE_LAST_FACEBOOK_PROFILE_INDEX = "lastFbProfileIndex";
    public final String ATRRIBUTE_JOB_REFERRAL_TYPE = "jobReferralTypeCd";
    public final String ATRRIBUTE_RELATIONSHIPS = "relationships";
    public final String ATRRIBUTE_FULLNAME = "FULLNAME";
    public final String ATRRIBUTE_FIRSTNAME = "FIRSTNAME";
    public final String ATRRIBUTE_LASTNAME = "LASTNAME";
    public final String ATRRIBUTE_EMAIL = "EMAIL";
    public final String ATRRIBUTE_FULLNAMEEMAIL = "FULLNAMEEMAIL";
    public final String ATRRIBUTE_NEXT = "next";
    public final String ATRRIBUTE_SYNC_POINTS_PRE_SYNC = "preSyncPoints";
    public final String ATRRIBUTE_SYNC_LEVEL_PRE_SYNC = "preSyncLevel";
    public final String ATRRIBUTE_SYNC_POINTS_POST_SYNC = "postSyncPoints";
    public final String ATRRIBUTE_SYNC_LEVEL_POST_SYNC = "postSyncLevel";
    public final String VIEW_ADMIN_CONSOLE = "adminconsole";

    public final String CONST_LINKEDIN = "linkedin";
    public final String CONST_FACEBOOK = "facebook";
    public final String CONST_TWITTER = "twitter";

    public final String CONTEST_JOB = "CONTEST_JOB";
    public final String CAMPAIGN_JOB = "CAMPAIGN_JOB";
    public final String JOB_LOCATION = "JOB_LOCATION";
    public final String USER_LOCATION = "USER_LOCATION";
    public final String MIN_JOB_AND_USER = "MIN_JOB_AND_USER";
    public final String MAX_JOB_AND_USER = "MAX_JOB_AND_USER";

    public final Integer INT_ZERO = 0;
    public final Float FLOAT_ZERO = 0.0f;
    public final Integer LINKEDIN_MAX_RESULTS_PER_FETCH = 12;
    public final Integer FACEBOOK_MAX_RESULTS_PER_FETCH = 12;

    public final String REFERRAL_DEFAULT_MESSAGE = "Hi, I have an excellent job opportunity for you.";
    public final String APPLY_MESSAGE = ". Click on the below URL to apply for this job. ";
    public final String REFERRAL_MESSAGE_SUBJECT = "Job opening at ";
    public final String CONTEST_INVITE = "Hello! You have been included in a Contest.";
    public final String INVITE_FOR_JOB = "Hello! You have been included in a job.";
    public final String INVITE_FOR_INTERVIEW = "Interview Request.";
    public final String INVITE_FOR_INTERVIEW_ROUNDS = "Interview Request.";
    public final String JOBS_IN_CAMPAIGN = "Jobs in campaign.";

    public final String STR_ACTIVE = "Active";
    public final String STR_ACTIVATE = "Activate";
    public final String STR_DEACTIVATE = "Deactivate";
    public final String STR_INACTIVE = "Inactive";
    public final String STR_ONHOLD = "Onhold";
    public final String STR_DRAFT = "Draft";
    public final String STR_CLOSED = "Closed";

    public final String STR_ACTIVE_CD = "ACTIVE";
    public final String STR_INACTIVE_CD = "INACTIVE";
    public final String STR_ONHOLD_CD = "ONHOLD";
    public final String STR_DRAFT_CD = "DRAFT";
    public final String STR_CLOSED_CD = "CLOSED";
    public final String STR_DELETED_CD = "DELETED";

    public final String WEBSERVICE_SUCCESS_CD = "100";
    public final String WEBSERVICE_AUTH_ERR_CD = "101";
    public final String WEBSERVICE_SERVER_ERR_CD = "102";
    public final String WEBSERVICE_FAILURES_CD = "103";

    public final String WEBSERVICE_SUCCESS_MSG = "Successfully imported all jobs";
    public final String WEBSERVICE_AUTH_ERR_MSG = "Authentication error";
    public final String WEBSERVICE_SERVER_ERR_MSG = "Technical Error";
    public final String WEBSERVICE_FAILURES_MSG = "One or more jobs failed during import.";

    public final String WEBSERVICE_JOB_TECH_ERR_CD = "200";
    public final String WEBSERVICE_JOB_INVALID_CD = "201";
    public final String WEBSERVICE_JOB_NOT_FOUND_CD = "202";
    public final String WEBSERVICE_JOB_CLOSED_CD = "203";

    public final String INTERVIEW_RESULT_ACCEPT = "ACCEPT";
    public final String INTERVIEW_RESULT_REJECT = "REJECT";
    public final String INTERVIEW_RESULT_ONHOLD = "ONHOLD";
    public final String INTERVIEW_RESULT_OFFERED = "OFFERED";
    public final String INTERVIEW_RESULT_HIRED = "HIRED";


    public final String INTERVIEW_ROUND_ROUND1 = "Round 1";
    public final String INTERVIEW_ROUND_ROUND2 = "Round 2";
    public final String INTERVIEW_ROUND_ROUND3 = "Round 3";
    public final String INTERVIEW_ROUND_HRROUND = "HR Round";
    public final String INTERVIEW_ROUND_ONHOLD = "On Hold";
    public final String INTERVIEW_ROUND_FINALROUND = "Final Round";


    public final Integer FIRST_BATCH_INDEX = 1;

    public final Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_REFERRED = 1;
    public final Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_RESPONDED = 2;
    public final Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_INPROCESS = 3;
    public final Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_REJECTED = 4;
    public final Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_JOBOFFERED = 5;
    public final Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_HIRED = 6;
    public final Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_ONHOLD = 7;

    public final String ACTIVITY_CD_FB_REF = "EMP_FB_REFR";
    public final String ACTIVITY_CD_LI_REF = "EMP_LKDN_REFR";
    public final String ACTIVITY_CD_UPL_RESUME = "EMP_RESUME_REFR";
    public final String ACTIVITY_CD_EMAIL_REF = "EMP_EMAIL_REFR";
    public final String ACTIVITY_CD_FB_SHARE = "EMP_FB_WALL";
    public final String ACTIVITY_CD_LI_SHARE = "EMP_LKDN_WALL";
    public final String ACTIVITY_CD_FB_SYNC = "EMP_FB_SYNC";
    public final String ACTIVITY_CD_LI_SYNC = "EMP_LKDN_SYNC";
    public final String ACTIVITY_CD_LI_IMPORT = "EMP_LKDN_IMPORT";
    public final String ACTIVITY_CD_TWITTER_CONNECT = "EMP_TWTR_CONNECT";
    public final String ACTIVITY_CD_FB_WALL = "EMP_FB_WALL";
    public final String ACTIVITY_CD_LI_WALL = "EMP_LKDN_WALL";
    public final String ACTIVITY_CD_TWITTER_WALL = "EMP_TWTR_WALL";
    public final String ACTIVITY_CD_FIRST_LOGIN = "EMP_FIRST_LOGIN";
    public final String ACTIVITY_CD_EMP_REFR_REPOND = "EMP_REFR_REPOND";
    public final String ACTIVITY_CD_EMP_REFR = "EMP_REFR";
    public final String ACTIVITY_CD_EMP_REFR_INPROC = "EMP_REFR_INPROC";
    public final String ACTIVITY_CD_EMP_REFR_INPROC_4 = "EMP_REFR_INPROC_4";
    public final String ACTIVITY_CD_EMP_REFR_INPROC_3 = "EMP_REFR_INPROC_3";
    public final String ACTIVITY_CD_FB_SUGG = "EMP_FB_SUGGEST";
    public final String ACTIVITY_CD_LI_SUGG = "EMP_LKDN_SUGGEST";
    public final String ACTIVITY_CD_EMAIL_SUGG = "EMP_EMAIL_SUGGEST";
    public final String ACTIVITY_CD_RESUME_SUGG = "EMP_RESUME_SUGGEST";

    public final String ACTIVITY_CD_FB_REF_CONT = "EMP_FB_REFR_CONT";
    public final String ACTIVITY_CD_LI_REF_CONT = "EMP_LKDN_REFR_CONT";
    public final String ACTIVITY_CD_UPL_RESUME_CONT = "EMP_RESUME_REFR_CONT";
    public final String ACTIVITY_CD_EMAIL_REF_CONT = "EMP_EMAIL_REFR_CONT";
    public final String ACTIVITY_CD_FB_SHARE_CONT = "EMP_FB_WALL_CONT";
    public final String ACTIVITY_CD_LI_SHARE_CONT = "EMP_LKDN_WALL_CONT";
    public final String ACTIVITY_CD_FB_SYNC_CONT = "EMP_FB_SYNC_CONT";
    public final String ACTIVITY_CD_LI_SYNC_CONT = "EMP_LKDN_SYNC_CONT";
    public final String ACTIVITY_CD_FB_WALL_CONT = "EMP_FB_WALL_CONT";
    public final String ACTIVITY_CD_LI_WALL_CONT = "EMP_LKDN_WALL_CONT";
    public final String ACTIVITY_CD_TWITTER_WALL_CONT = "EMP_TWTR_WALL_CONT";
    public final String ACTIVITY_CD_FB_SUGG_CONT = "EMP_FB_SUGGEST_CONT";
    public final String ACTIVITY_CD_LI_SUGG_CONT = "EMP_LKDN_SUGGEST_CONT";
    public final String ACTIVITY_CD_EMAIL_SUGG_CONT = "EMP_EMAIL_SUGGEST_CONT";
    public final String ACTIVITY_CD_RESUME_SUGG_CONT = "EMP_RESUME_SUGGEST_CONT";

    public final String ACTIVITY_CD_ACTIVITYSTAGE_RWD = "EMP_WON_ACTRWD";
    public final String ACTIVITY_CD_GOAL_RWD = "EMP_WON_GOLRWD";
    public final String ACTIVITY_CD_LEVEL_RWD = "EMP_WON_LVLRWD";
    public final String ACTIVITY_CD_JOB_RWD = "EMP_WON_JOBRWD";
    public final String ACTIVITY_CD_CONTEST_RWD = "EMP_WON_CONTRWD";

    public final String ACTIVITY_CD_EMP_REFR_HIRE = "EMP_REFR_HIRE";
    public final String ACTIVITY_CD_EMP_REFR_OFFER = "EMP_REFR_OFFER";
    //public final String ACTIVITY_CD_EMP_JOB_REFER = "EMP_JOB_REFER";
    public final String ACTIVITY_CD_EMP_WIN_CONT = "EMP_WIN_CONT";

    public final String ACTIVITY_CD_EMP_FB_DISCONNECT = "EMP_FB_DISCONNECT";
    public final String ACTIVITY_CD_EMP_LKDN_DISCONNECT = "EMP_LKDN_DISCONNECT";
    public final String ACTIVITY_CD_EMP_TWTR_DISCONNECT = "EMP_TWTR_DISCONNECT";

    public final String SKILL_1 = "Skill 1";
    public final String SKILL_2 = "Skill 2";
    public final String SKILL_3 = "Skill 3";
    public final String SKILL_4 = "Skill 4";

    public final String PROP_KEY_FACEBOOK_APP_ID = "facebook.clientId";

    public final String SYSTEM_PROPERTY_DEV_ENV = "dev";
    public final String SYSTEM_PROPERTY_QA_ENV = "qa";
    public final String SYSTEM_PROPERTY_DEMO_ENV = "test";

    public final int MAX_WINNER_COUNT = 5;

    public final String POPUP_INVITE_COLLEAGUE = "I";
    public final String POPUP_ACCEPT = "A";
    public final String POPUP_REJECT = "R";
    public final String POPUP_ONHOLD = "O";
    public final String ON = "on";

    public final String UNAVAILABLE = "UNAVAILABLE";

    public final String CONTEST_WINNER_SEL_CRIT_REF = "REFERRAL";
    public final String CONTEST_WINNER_SEL_CRIT_HIRE = "HIRE";

    public final String PROP_LINKEDIN_CONN_DIR_PATH = "linkedin.connections.directoryPath";
    public final String PROP_JOB_MAILER_BANNER_DIR_PATH = "jobmailer.banner.directoryPath";
    public final String PROP_EMPLOYEE_IMAGE_DIR_PATH = "employee.image.directoryPath";

    public final String PROP_S3_ENABLED = "aws.s3.enabled";
    public final String PROP_S3_BUCKET_NAME = "aws.s3.bucket.name";
    public final String PROP_S3_ACCESSKEY = "aws.s3.accessKey";
    public final String PROP_S3_SECRETKEY = "aws.s3.secretKey";
    public final String PROP_S3_KMS_MASTER_KEY = "aws.s3.kms.master.key";

    //AWS SQS Mail Queue
    public final String PROP_SQS_ACCESSKEY = "aws.sqs.accessKey";
    public final String PROP_SQS_SECRETKEY = "aws.sqs.secretKey";
    public final String PROP_SQS_ENDPOINT = "aws.sqs.endpoint";
    public final String PROP_SQS_QUEUE_NAME = "aws.sqs.queue.name";
    public final String SQS_QUEUE_ATTRIBUTE_VISIBLE_MESSAGE = "ApproximateNumberOfMessages";
    public final String SQS_QUEUE_ATTRIBUTE_NON_VISIBLE_MESSAGE = "ApproximateNumberOfMessagesNotVisible";

    //AWS SNS
    public final String PROP_SNS_ACCESSKEY = "aws.sns.accessKey";
    public final String PROP_SNS_SECRETKEY = "aws.sns.secretKey";

    public final String STATIC_FILE_TYPE_RESUME = "resume";
    public final String STATIC_FILE_TYPE_DOWNLOAD_RESUME = "downloadresume";
    public final String STATIC_FILE_TYPE_CONTESTBANNER = "contestbanner";
    public final String STATIC_FILE_TYPE_CANDIDATE_IMAGE = "candidateimage";
    public final String STATIC_FILE_TYPE_EMPLOYEE_IMAGE = "employeeimage";
    public final String STATIC_FILE_TYPE_ETL_FILE = "etlfile";
    public final String STATIC_FILE_TYPE_EXPORT = "exportcandidate";
    public final String STATIC_FILE_TYPE_KENEXA_DIT_REPORT = "kenexaditreport";
    public final String STATIC_FILE_TYPE_ADDITIONAL_DOC = "additionaldoc";

    public final String PARTICIPATED = "PARTICIPATED";
    public final String NOT_PARTICIPATED = "NOT PARTICIPATED";

    public final String REWARD_CATEGORY_ACTIVITY = "ACTIVITY";
    public final String REWARD_CATEGORY_LEVEL = "LEVEL";
    public final String REWARD_CATEGORY_GOAL = "GOAL";
    public final String REWARD_CATEGORY_JOB = "JOB";
    public final String REWARD_CATEGORY_CONTEST = "CONTEST";
    public final String EMPL_RWRD_CAT_ACTIVITYSTAGE_REWARD = "ACTIVITYSTAGE_REWARD";
    public final String EMPL_RWRD_CAT_GOAL_REWARD = "GOAL_REWARD";
    public final String EMPL_RWRD_CAT_LEVEL_REWARD = "LEVEL_REWARD";
    public final String EMPL_RWRD_CAT_JOB_REWARD = "JOB_REWARD";
    public final String EMPL_RWRD_CAT_CONTEST_REWARD = "CONTEST_REWARD";

    public final String USER_ROLE_CODE_CANDIDATE = "CANDT";
    public final String USER_ROLE_CODE_EMPLOYEE = "EMP";
    public final String USER_ROLE_CODE_RECRUITER = "RECTR";
    public final String USER_ROLE_CODE_ADMIN = "ADMIN";
    public final String USER_ROLE_CODE_OWNER = "OWNER";
    public final String USER_ROLE_CODE_HIRING_USR = "HIRING_USR";
    public final String USER_ROLE_CODE_HIRING_USR_NON_ER = "HIRING_USR_NON_ER";
    public final String USER_ROLE_CODE_HIRING_ADMIN = "HIRING_ADMIN";
    public final String USER_ROLE_CODE_HIRING_APPROVER = "HIRING_APPROVER";
    public final String USER_ROLE_CODE_VENDOR = "VENDOR";

    public final String USER_ROLE_RECRUITER = "Recruiter Role";
    public final String USER_ROLE_EMPLOYEE = "Employee Role";


    public final String JOB_STATUS_ACTIVE = "ACTIVE";
    public final String JOB_STATUS_CLOSED = "CLOSED";
    public final String JOB_STATUS_CANCELLED = "CANCELLED";
    public final String JOB_STATUS_WITHDRAWN = "WITHDRAWN";
    public final String TEMPLATE_CONTEST_WINNER_EMAIL = "template/contestWinner.vm";
    public final String BULK_RESUME_DOWNLOAD = "bulkresumedownload";
    public final String BULK_UPLOAD_RESUME_PATH = "bulkresumeupload.directoryPath";
    public final String DOWNLOAD_EXCEL_PATH = "bulkuser.directoryPath";
    public final String BULK_UPLOAD_LIST = "bulkupload.directoryPath";
    public final String JOB_OPEN = "OPEN";
    public final String JOB_UPDATE_OPENINGS = "UPDATE_OPENINGS";
    public final String ACTIVITY_TYPE_CLOSE_MANUAL = "CLOSE_MANUAL";
    public final String ACTIVITY_TYPE_CLOSE_AUTO = "CLOSE_AUTO";
    public final String ACTIVITY_TYPE_WITHDRAWN = "CLOSE_WITHDRAWN";
    public final String JOB_ACTIVITY_TYPE_CREATE_REQUEST = "CREATE_REQUEST";
    public final String JOB_ACTIVITY_TYPE_CREATE_JOB = "CREATE_JOB";
    public final String JOB_ACTIVITY_TYPE_AUTO_CREATE_REQUEST = "AUTO_CREATE_REQUEST";
    public final String JOB_REOPEN = "REOPEN";
    public final String JOB_UPDATE = "UPDATE";

    public final String DOT = ".";
    public final String CAMPAIGN_CODE_STR = "C-";
    public final String JOB_CODE_STR = "J-";
    public final String ALL_CAMPAIGNS_OPTION = "All Campaigns";
    public final String ALL_CAMPAIGNS_OPTION_VALUE = "A-1";
    public final String ALL_JOBS_OPTION = "All Jobs";
    public final String ALL_JOBS_OPTION_VALUE = "A-1";

    public final String REWARD_CRITERIA_CD_REFERRAL = "REFERRAL";
    public final String REWARD_CRITERIA_CD_HIRE = "HIRE";

    public final String REFERS = "Refers";
    public final String HIRES = "Hires";

    public final String SMTP_FROM_ADMIN = "smtp.from";
    public final String SMTP_FROM_NOREPLY = "smtp.from.noreply";
    public final String MAIL_STORE_TYPE_IMAP = "imap";
    public final String PROP_IMAP_HOST = "mail.imap.host";
    public final String PROP_IMAP_PORT = "mail.imap.port";
    public final String PROP_MAIL_STORE_TYPE = "mail.storetype";
    public final String PROP_MAIL_BOX = "mail.mailBox";
    public final String PROP_MAIL_PASSWORD = "mail.mailBox.password";


    public final String PROP_KEY_ACCESS_LINKEDIN_API = "api.linkedin.access";

    public final String ROUND_CODE_CD_STATUS_ROUND = "CD_STATUS_ROUND";
    public final String ROUND_CODE_CD_INPROCESS_ROUND = "CD_INPROCESS_ROUND";
    public final String ROUND_CODE_CD_OTHER_ROUND = "CD_OTHER_ROUND";

    public final String ACTION_STATUS_SUCCESS = "success";
    public final String ACTION_STATUS_ERROR = "error";
    public final String ACTION_STATUS_NO_CHANGE = "nochange";
    public final String ACTION_STATUS_ACTIVITY_REACHED_LIMIT = "activity reached limit";
    public final String ACTIVITY_PERDAY = "PER_DAY";
    public final String ACTIVITY_PERJOB_PERDAY = "PER_JOB_PER_DAY";
    public final String RESPONSE_HEADER_REQUESTED_WITH = "X-Requested-With";
    public final String TIME_OUT = "timeout";
    public final String MULTIPLE_SESSION = "multiple";
    public final String XML_HTTP_REQUEST = "XMLHttpRequest";
    String CANDIDATE_UNSUBSCRIBED = "unsubscribed";

    public final String SESSION_ATTR_REDIRECT_PAGE = "redirectPage";
    public final String SESSION_ATTR_PROVIDER_ID = "providerId";
    public final String SESSION_ATTR_FROM_AUTH = "fromAuth";
    public final String SESSION_ATTR_IS_CAMPAIGN = "isCampaign";
    public final String SESSION_ATTR_BUILD_NUMBER = "buildNumber";

    public final String SHIFT_STATUS_CANDIDATE_POOL = "CANDIDATE_POOL";
    public final String SHIFT_STATUS_TRANSFERRED = "TRANSFERRED";
    public final String TAB_TEXT_CANIDATE_POOL = "Candidate Pool";
    public final String ALL_Rounds = "All Rounds";
    public final String Talent_Pool = "Talent Pool +J-0";

    public final String CAMPAIGN_SHARE_MSG = "Your Company Jobs in ";

    public final String TEXT_CONT = "_CONT";
    public final String DISABLED = "disabled";
    String SMS_DISABLED = "DISABLED";

    public final String MEDAL_CD_GOLD = "GOLD";
    public final String MEDAL_CD_SILVER = "SILVER";
    public final String MEDAL_CD_BRONZE = "BRONZE";

    public final String JOB_REFER_URL = "?redirect=Y&page=profilematch&jobSeq=";

    public final String FACEBOOK_USER_AGENT = "facebookexternalhit";
    public final String LINKEDIN_USER_AGENT = "LinkedInBot";
    public final String TWITTER_USER_AGENT = "Twitterbot";
    public final String GOOGLE_USER_AGENT = "Googlebot";
    public final String WHATSAPP_AGENT = "WhatsApp";
    public final String SLACK_AGENT = "Slackbot";

    public final String EMP_ONLY_ONBOARDING = "empOnlyOnboarding";
    public final String LI_CD = "LI";
    public final String FB_CD = "FB";
    public final String TW_CD = "TW";
    public final String EMP_SHOW_FEEDBACK = "empshowfeedback";
    public final String VIEW_CANDIDATE_JOBDASHBOARD = "candidatejobdashboard";
    public final String PAGE_NOT_FOUND = "pagenotfound";

    public final String EMP_JOB_SHARE_COUNT = "EMP_JOB_SHARE_COUNT";
    public final String EMP_JOB_REFER_COUNT = "EMP_JOB_REFER_COUNT";

    public final String CANDT = "CANDT";

    public final String ACTIVITIES = "activities";
    public final String SUCCESS_MESSAGE = "successMsg";
    public final String CAND_EMAIL = "CandEmailAddr";
    public final String CAND_FIRST_NAME = "candFirstName";
    public final String CAND_LAST_NAME = "candLastName";
    public final String EMP_LEVEL_UP = "levelUp";

    public final String JOB_SEQ = "JOB_SEQ";
    public final String COMPANY_MSTR_SEQ = "COMPANY_MSTR_SEQ";
    public final String ALLOW_EMP_REF = "ALLOW_EMP_REF";
    public final String PARENT_COMPANY_MSTR_SEQ = "PARENT_COMPANY_MSTR_SEQ";
    public final String JOB_TITLE = "JOB_TITLE";
    public final String JOB_CD = "JOB_CD";
    public final String JOB_OPEN_DATE = "OPEN_DATE";
    public final String REQ_EXP_MIN = "REQ_EXP_MIN";
    public final String REQ_EXP_MAX = "REQ_EXP_MAX";
    public final String JOB_DESC = "JOB_DESC";
    public final String TOTAL_POSITIONS = "TOTAL_POSITIONS";
    public final String CITY = "CITY";
    public final String CITY_LOWER = "CITY_LOWER";
    public final String SOLR_FACET_JOB_STATUS = "JOB_STATUS";
    public final String JOB_STATUS = "JOB_STATUS";
    public final String HIRING_STATUS = "HIRING_STATUS";
    public final String JOB_TYPE = "JOB_TYPE";
    public final String JOB_TYPE_CTP = "CTP";
    public final String REWARD_TYPE_CD = "REWARD_TYPE_CD";
    public final String REWARD_QTY = "REWARD_QTY";
    public final String BAND_CD = "BAND_CD";
    public final String IS_HOT_JOB = "IS_HOT_JOB";
    public final String TOTAL_CLOSED_POSITIONS = "TOTAL_CLOSED_POSITIONS";
    public final String JOB_OTHEDETAILS = "JOB_OTHEDETAILS";
    public final String JOB_SKILLS = "JOB_SKILLS";
    public final String CREATE_DTTM = "CREATE_DTTM";
    public final String CREATED_BY = "CREATED_BY";
    public final String ASSIGNED_TO = "ASSIGNED_TO";
    public final String ASSIGNED_ON = "ASSIGNED_ON";
    public final String RESUME_UPDATE_DTTM = "RESUME_UPDATE_DTTM";
    public final String RESUME_DATA = "RESUME_DATA";
    public final String COUNTRY = "COUNTRY";
    public final String OPENINGS = "OPENINGS";
    public final String SEARCH = "search";
    public final String VIEW_CONTESTSEARCH = "empcontestsearch";
    public final String INTERVIEW_STAGE_APPLIED = "APPLIED";
    public final String INTERVIEW_STAGE_INPROCESS = "INPROCESS";
    public final String INTERVIEW_STAGE_OFFERED = "OFFERED";
    public final String IS_CAREER_SITE = "IS_CAREER_SITE";
    String IS_ALLOW_AGENCY = "ALLOW_AGENCY";
    public final String IS_REQUEST_AVAILABLE = "REQUEST_AVAILABLE";

    public final String CHAR_P = "P";
    public final String CHAR_S = "S";
    public final String OTHERS = "Others";
    public final String OTHERS_CHANNELS = "Other channels";
    public final String STR_NA = "NA";
    public final String CAPGEMINI = "capgemini";
    public final String FIRSTSOURCE = "firstsource";
    public final String FRACTAL = "fractal";
    public final String INFOBEANS = "infobeans";
    public final String MPHASIS = "mphasis";
    public final String PAYU = "payu";
    public final String CAPILLARYTECH = "capillarytech";
    public final String INMOBI = "inmobi";
    public final String HOTSTAR = "hotstar";
    public final String ICICIPRULIFE = "iciciprulife";
    public final String CAPGEMINI_UPPERCASE = "CAPGEMINI";
    public final String MPHASIS_UPPERCASE = "MPHASIS";
    public final String RIPPLEHIRE_SEQ = "RH";
    public final String ADITYABIRLA_UPPERCASE = "ADITYABIRLA";
    public final String ICICIP_UPPERCASE = "ICICIP";
    public final String CIPLA = "cipla";

    public final String ROLE_EMPLOYEE = "ROLE_EMPLOYEE";
    public final String ROLE_RECRUITER = "ROLE_RECRUITER";
    public final String ROLE_CANDIDATE = "ROLE_CANDIDATE";
    public final String ROLE_ADMIN = "ROLE_ADMIN";
    public final String ROLE_OWNER = "ROLE_OWNER";
    public final String ROLE_HIRING_USR = "ROLE_HIRING_USR";
    public final String ROLE_HIRING_USR_NON_ER = "ROLE_HIRING_USR_NON_ER";
    public final String ROLE_HIRING_ADMIN = "ROLE_HIRING_ADMIN";
    public final String ROLE_HIRING_APPROVER = "ROLE_HIRING_APPROVER";
    public final String ROLE_VENDOR = "ROLE_VENDOR";


    public final String CAPG_CONTACTED = "CONTACTED";
    public final String CAPG_REJECT = "REJECT";
    public final String CAPG_APPLIED = "APPLIED";
    public final String CAPG_TECHNICAL = "TECHNICAL";
    public final String CAPG_MANAGER = "MANAGER";
    public final String CAPG_CLIENT = "CLIENT";
    public final String CAPG_HR = "HR";
    public final String CAPG_OFFER = "OFFER";
    public final String CAPG_HIRED = "HIRED";
    public final String CAPG_SCHEDULED = "SCHEDULED";
    public final String CAPG_ONHOLD = "ONHOLD";
    public final String CAPG_DROPPED = "DROPPED";
    public final String CAPG_WITHDRAW = "WITHDRAWN";


    public final String ANONYMOUS_USER = "anonymousUser";
    public final String CAPG_LEGACY = "LEGACY";
    public final String EMAIL_JOB_REQUESTER = "JOB_REQUESTER_MAIL";
    public final String CAPG_INPROCESS = "INPROCESS";


    public final String REFERRED = "REFERRED";
    public final String SUGGESTED = "SUGGESTED";
    public final String PROVIDER_ID_EMAIL = "email";
    public final String PROVIDER_ID_RESUME = "resume";
    public final String FACEBOOK = "FACEBOOK";
    public final String BUSSINESS_UNIT = "BUSSINESS_UNIT";

    public final String REFER_ONLY = "refer_only";
    public final String BOOLEAN_TRUE = "TRUE";
    public final String BOOLEAN_FALSE = "FALSE";
    public final String BACK_BUTTON = "backButton";

    public final String HYPHEN = "-";

    //Job Mailer
    public final String JOB_MAILER_STATUS_DRAFT = "DRAFT";
    public final String JOB_MAILER_STATUS_SENT = "SENT";

    public final String STR_PAGE = "page";
    public final String CAPG_SHORTLISTED = "SHORTLISTED";
    public final String DEFAULT_SEARCH = "*:*";
    public final Integer MAX_MESSAGE_REMINDERS = 2;

    public final String EMPL_REFRL_SEQ = "EMPL_REFRL_SEQ";
    public final String EMPL_REFRL = "emplRefrl";
    public final String RH_SEQ = "RIPPLEHIRE_SEQ";
    public final String CANDIDATE_SEQ = "CANDIDATE_SEQ";
    public final String CANDIDATE_RESUMEDETAILS_SEQ = "CANDIDATE_RESUMEDETAILS_SEQ";
    public final String CLIENT_CANDIDATE_ID = "CLIENT_CANDIDATE_ID";
    public final String SOLR_CAND_FIRST_NAME = "CAND_FIRST_NAME";
    public final String SOLR_CAND_LAST_NAME = "CAND_LAST_NAME";
    public final String SOLR_CAND_FULL_NAME = "CAND_FULL_NAME";
    public final String SOLR_CAND_MIDDLE_NAME = "CAND_MIDDLE_NAME";
    public final String CAND_EMAIL_ADDR = "CAND_EMAIL_ADDR";
    public final String CAND_PHONE_NO = "CAND_PHONE_NO";
    public final String CAND_LANDLINE_NO = "CAND_LANDLINE_NO";
    public final String ADDRESS_LINE_1 = "ADDRESS_LINE_1";
    public final String ADDRESS_LINE_2 = "ADDRESS_LINE_2";
    public final String SKILLS = "SKILLS";
    public final String YEARS_TOTAL_EXP = "YEARS_TOTAL_EXP";
    public final String YEARS_RELEVANT_EXP = "YEARS_RELEVANT_EXP";
    public final String SOLR_DAY = "DAY";
    public final String SOLR_MONTH = "MONTH";
    public final String SOLR_YEAR = "YEAR";
    public final String SOLR_CITY = "CITY";
    public final String SOLR_CAND_STATE = "STATE";
    public final String SOLR_CAND_PINCODE = "PIN_CODE";
    public final String SOLR_CAND_COUNTRY = "COUNTRY";
    public final String CURRENT_CTC = "CURRENT_CTC";
    public final String EXPECTED_CTC = "EXPECTED_CTC";
    public final String NOTICE_PERIOD = "NOTICE_PERIOD";
    public final String QUALIFICATION_DESC = "QUALIFICATION_DESC";
    public final String OTHER_QUALIFICATION = "OTHER_QUALIFICATION";
    public final String GENDER_DESC = "GENDER_DESC";
    public final String CURRENT_EMPLOYER_DESC = "CURRENT_EMPLOYER_DESC";
    public final String OTHER_EMPLOYER = "OTHER_EMPLOYER";
    public final String SKILLS_DESC = "SKILLS_DESC";
    public final String SKILL_TYPE = "SKILL_TYPE";
    public final String RESUME_SYNOPSIS = "RESUME_SYNOPSIS";
    public final String CURRENT_LOCATION_DESC = "CURRENT_LOCATION_DESC";
    public final String PASSION = "PASSION";
    public final String PREVIOUS_ROUND = "PREVIOUS_ROUND";
    public final String COUNTRY_DESC = "COUNTRY_DESC";
    public final String HIGHEST_DEG = "HIGHEST_DEG";
    public final String HIGHEST_DEG_STREAM = "HIGHEST_DEG_STREAM";
    public final String HIGHEST_DEG_YEAR = "HIGHEST_DEG_YEAR";
    public final String HIGHEST_DEG_PERC = "HIGHEST_DEG_PERC";
    public final String HIGHEST_DEG_BACKLOGS = "HIGHEST_DEG_BACKLOGS";
    public final String CERTIFICATIONS = "CERTIFICATIONS";
    public final String SSC_AGG_PERC = "SSC_AGG_PERC";
    public final String HSC_AGG_PERC = "HSC_AGG_PERC";
    public final String FB_URL = "FB_URL";
    public final String LI_URL = "LI_URL";
    public final String INFO_BY_EMP = "INFO_BY_EMP";
    public final String NOTETO_RECRUTER = "NOTETO_RECRUTER";
    public final String STAGE_DESC = "STAGE_DESC";
    public final String REFRL_STATUS_CD = "REFRL_STATUS_CD";
    public final String INTERVIEW_STAGE_SEQ = "INTERVIEW_STAGE_MSTR_SEQ";
    public final String CLIENT_INTERVIEW_STATUS_DESC = "CLIENT_INTERVIEW_STATUS_DESC";
    public final String EMP_FIRST_NAME = "EMP_FIRST_NAME";
    public final String EMP_LAST_NAME = "EMP_LAST_NAME";
    public final String CAND_RELATIONSHIP_DESC = "CAND_RELATIONSHIP_DESC";
    public final String EMP_RELATIONSHIP_DESC = "EMP_RELATIONSHIP_DESC";
    public final String HIGHEST_EDUCATION = "HIGHEST_EDUCATION";
    public final String APPLY_DATE = "APPLY_DATE";
    public final String RE_APPLY_DTTM = "RE_APPLY_DTTM";
    public final String CONTEST_SEQ = "CONTEST_SEQ";
    public final String CAMPAIGN_SEQ = "CAMPAIGN_SEQ";
    public final String RECRUITERS = "RECRUITERS";
    public final String APPROVERS = "APPROVERS";
    public final String CLIENT_CUSTOM_MSTR_INDUSTRY = "INDUSTRY";
    public final String CLIENT_CUSTOM_MSTR_SUB_INDUSTRY = "SUBINDUSTRY";
    public final String CLIENT_CUSTOM_MSTR_EMPLOYER = "EMPLOYER";
    public final String CLIENT_CUSTOM_MSTR_LOCATION = "LOCATION";
    public final String CLIENT_CUSTOM_MSTR_EDUCATION_DETAILS = "educationDetails";
    public final String CLIENT_CUSTOM_MSTR_NATIONALITY = "NATIONALITY";
    public final String CLIENT_CUSTOM_1 = "customSelect1";
    public final String SOLR_LIFE_CYCLE_STATE = "LIFE_CYCLE_STATE";
    String SOLR_SOURCE_ID = "SOURCE_ID";
    String SOLR_SOURCE_EMAIL = "SOURCE_EMAIL";

    public final String CLIENT_ROUND_MAPPING = "ROUND_MAPPING";

    public final String VIEW_REPORTDASHBOARD = "report";
    public final String STR_COLON = ":";
    public final String STR_PIPE = "|";
    public final String STR_HIRING = "is Hiring";

    public final String BATCH_PROCESS_STATUS_STARTED = "STARTED";
    public final String BATCH_PROCESS_STATUS_COMPLETED = "COMPLETED";
    public final String BATCH_PROCESS_TYPE_CAND_STATUS_SYNC = "CAND_STATUS_SYNC";
    public final String BATCH_PROCESS_TYPE_JOB_SYNC = "JOB_SYNC";
    public final String BATCH_PROCESS_TYPE_EMP_IMPORT = "EMP_IMPORT";
    public final String BATCH_PROCESS_TYPE_EMP_DETAIL_IMPORT = "EMP_DETAIL_IMPORT";
    public final String BATCH_PROCESS_TYPE_REJECT_REASON_SYNC = "REJECT_REASON_SYNC";

    public final String FILENAME = "fileName";
    public final String EXCEL_REPORT_LOCATION = "temp.directoryPath";
    public final String TEMP_DIRECTORY_PATH = "temp.directoryPath";
    public final String COMPRESS_DIRECTORY_LOCATION = "compress.directoryPath";
    public final String RAW_EXPORT_DIRECTORY = "rawexport.directoryPath";
    public final String EXPORT_TYPE_JOB = "JOB";
    public final String EXPORT_TYPE_INTERVIEW_REPORT = "INTERVIEW_REPORT";
    public final String EXPORT_CD_JOB_EXPORT = "job_export";
    public final String EXPORT_CD_INTERVIEW_REPORT = "interview_report";
    public final String EXPORT_STATUS_NEW = "NEW";


    public final String STR_ADD = "ADD";
    public final String IS_FAKE_EMPLOYER = "IS_FAKE_EMPLOYER";
    public final String IS_FAKE_QUALIFICATION = "IS_FAKE_QUALIFICATION";
    public final String FRAUD_CHECK_TYPE_EMPLOYER = "EMPLOYER";
    public final String FRAUD_CHECK_TYPE_QUALIFICATION = "QUALIFICATION";
    public final String STR_EMP_CD = "EMP";
    public final String STR_ALL = "ALL";
    public final String STR_EXPORT = "EXPORT";
    public final String SOLR_CHANNEL = "CHANNEL";
    public final String SOLR_USER_PROFILE_SEQ = "USER_PROFILE_SEQ";
    public final String JOB_BOARD = "JOB_BOARD";
    public final String REGULAR = "REGULAR";
    public final String REFRL_TYPE_SOCIAL_MEDIA = "SOCIAL_MEDIA";
    public final String AGENCY = "AGENCY";
    public final String CHANNEL_TYPE_CUSTOM = "CUSTOM";
    String KIT_TYPE_CUSTOM = "CUSTOM";
    public final String SUBSOURCE = "SUBSOURCE";
    public final String CAREERSITE = "CAREERSITE";
    public final String REFERAL_TYPE_FBCAREER = "FBCAREER";
    public final String DIRECTCHANNEL = "DIRECTCHANNEL";
    public final String WALKIN = "WALKIN";
    public final String FILTER_JOB_BOARD = "Job board";
    public final String FILTER_EMP_REFERRAL = "Employee Referral";
    public final String FILTER_SOCIAL_SOURCING = "Social Sourcing";
    public final String FILTER_SOURCED_BY_ME = "Sourced by me";
    public final String ACTION_UPDATE_DTTM = "ACTION_UPDATE_DTTM";

    public final String INTERNAL_JOB_POSTING = "IJP";
    public final String ALLOW_IJP = "ALLOW_IJP";

    public final String INVALID_FILE = "INVALID_FILE";
    public final String DEV_MAIL_ALERT = "ERROR";
    public final String DEV_MAIL_UPDATE = "Update";
    public final String MAX_FILE_SIZE = "MAX_FILE_SIZE";
    public final String DEFAULT_APPLY_MODE = "DEFAULT";
    public final String UPLOAD_APPLY_MODE = "UPLOAD";
    public final String NOMAIL_APPLY_MODE = "NOMAIL";
    public final String GOOGLE_FROM = "googlebot";
    public final String ADMIN_STATUS_UPDATE = "STATUS";

    public final String REFERAL_SOURCE_TYPE_EMP = "EMPLOYEE";
    public final String REFERAL_SOURCE_TYPE_AGENCY = "AGENCY";
    public final Character MAIL_STATUS_PENDING = 'P';
    public final Character MAIL_STATUS_SUCCESS = 'Y';
    public final Character MAIL_STATUS_FAILED = 'F';
    public final Character MAIL_STATUS_UNSUB = 'U';
    public final Character MAIL_STATUS_RUNNING = 'R';
    public final String ACTIVITY_TYPE_CREATE = "CREATE";
    public final String ACTIVITY_TYPE_UPDATE = "UPDATE";
    public final String ACTIVITY_TYPE_DELETE = "DELETE";
    public final String ACTIVITY_TYPE_UPLOAD = "UPLOAD";
    public final String ACTIVITY_TYPE_ARCHIVE = "ARCHIVE";
    public final String ENTITY_JOB = "JOB";
    public final String ENTITY_CANIDATE_IMAGE = "CANDIDATE_IMAGE";
    public final String ENTITY_JOB_REWARD = "JOB_REWARD";
    public final String ENTITY_EMP_JOB_REWARD = "EMP_JOB_REWARD";
    public final String ENTITY_USER_PASSWORD = "USER.PASSWORD";
    public final String ENTITY_USER = "USER";
    public final String ENTITY_CONTEST = "CONTEST";
    public final String ENTITY_CANDIDATE = "CANDIDATE";
    public final String ENTITY_CANDIDATE_APPLICATION = "CANDIDATE_APPLICATION";
    public final String ENTITY_CAMPAIGN_JOB_MAILER = "CAMPAIGN_JOB_MAILER";
    public final String STR_SYSTEM_ENTITY = "S";
    public final String CTP_TYPE_CODE = "CTP";
    public final String MY_JOBS_TYPE_CODE = "MY_JOBS";
    public final String ADMIN_RECRUITER_TYPE_CODE = "ADMINRECRUITER";
    public final String AGENCY_EMAIL_ID = "AGENCY_EMAIL_ID";
    public final String AGENCY_PHONE_NO = "AGENCY_PHONE_NO";
    public final String ACTIVITY_FIRST_LOGIN = "FIRST_LOGIN";
    public final String STR_SHOW = "show";

    public final String GOOGLE_CAPTCHA_KEY = "google.captcha.key";
    public final String GOOGLE_CAPTCHA_SECRET = "google.captcha.secret";
    public final String PERSONAL_DETAILS = "PERSONAL_DETAILS";
    public final String PROFESSIONAL_DETIALS = "PROFESSIONAL_DETIALS";
    public final String DUPLICATE_FIELDS = "DUPLICATE_FIELDS";

    public final String ACTIVITY_NOBLE_DEED_MAILER = "NOBLE_DEED_MAILER";

    public final String MANAGED_CANDIDATE = "REL_MANAGED_CAND";
    public final String JOB_RECRUITER_ROLE_CREATOR = "O";
    public final String JOB_RECRUITER_ROLE_RECRUITER = "R";
    public final String JOB_RECRUITER_ROLE_RECRUITING_HEAD = "RH";
    public final String JOB_RECRUITER_ROLE_RECRUITER_LEAD = "RL";
    public final String JOB_RECRUITER_ROLE_SOURCER = "S";
    public final String JOB_RECRUITER_ROLE_SOURCER_LEAD = "SL";
    public final String JOB_RECRUITER_ROLE_HIRING_MANGER = "HM";
    public final String JOB_RECRUITER_ROLE_REPLACEMENT_FOR = "RPF";
    public final String JOB_RECRUITER_ROLE_RECRUITING_MANAGER = "RM";
    public final String JOB_RECRUITER_ROLE_RECRUITING_TEAM_REVIEWER = "RTR";
    public final String JOB_RECRUITER_ROLE_MANAGER = "M";
    public final String JOB_RECRUITER_ROLE_RHR = "RHR";
    public final String JOB_RECRUITER_ROLE_SHR = "SHR";
    public final String JOB_RECRUITER_ROLE_ZHR = "ZHR";

    public final String SESSION_COOKIE = "rhsessioncookie";
    public final String LOGIN_SALT = "loginSalt";
    public final String LOGIN_SESSION_IDENTITY = "loginSessionIdentity";


    public final String SHOW_ALL_JOBS = "SHOW_ALL_JOBS";
    public final String SHOW_ALL_CAMPAIGNS = "SHOW_ALL_CAMPAIGNS";
    public final String SHOW_ALL_EVENTS = "SHOW_ALL_EVENTS";
    public final String APOSTROPHE = "'";
    public final String JOB_TITLE_CD = "job_title";
    public final String CURRENT_POSITION = "current_positions";
    public final String RECR_SHARE = "RECRSHARE";

    public final String CLIENT_CUSTOM_BUSINESS_UNIT = "jobbusinessunit";
    public final String CLIENT_CUSTOM_OPERATING_UNIT = "custom1";
    public final String CLIENT_CUSTOM_CLIENT_GROUP = "custom2";
    public final String CLIENT_CUSTOM_JOB_TYPE = "custom3";
    public final String CLIENT_CUSTOM_DEPARTMENT = "department";
    public final String CLIENT_CUSTOM_CLIENT = "client";
    public final String ENTITY_WEEKLY_JOB_MAILER = "WEEKLY_JOB_MAILER";

    public final String REPORT_NODATA = "---";

    public final String EMP_FORM_CANDIDATE_DETAILS_GROUP = "candidate_details";
    public final String EMP_FORM_REFERRAL_DETAILS_GROUP = "referral_details";
    public final String EMP_FORM_REC_REFER_SUB_GROUP = "recruiter_refer";
    public final String EMP_FORM_CAND_REFER_SUB_GROUP = "candidate_refer";

    public final String STR_DISPLAY_COL = "DISPLAY_COLUMN";
    public final String STR_EXPORT_N_DISPLAY = "EXPORT_N_DISPLAY";

    public final String STR_EMPLOYER = "EMPLOYER";
    public final String STR_QUALIFICATION = "QUALIFICATION";

    public final String STR_HOURS = "Hrs";
    public final String STR_MINS = "mins";


    /************Import File Columns*************************/
    public final String IMPORT_VENDOR_ID = "vendor id";
    public final String IMPORT_VENDOR_NAME = "vendor name";
    public final String IMPORT_VENDOR_STATUS = "status";

    public final String IMPORT_FRAUD_TYPE = "checktype";
    public final String IMPORT_FRAUD_KEYWORD = "keywords";
    public final String IMPORT_FRAUD_STATUS = "status";

    public final String IMPORT_USER_FNAME = "first name";
    public final String IMPORT_USER_LNAME = "last name";
    public final String IMPORT_USER_EMAILID = "email id";
    public final String IMPORT_USER_LOGINID = "login id";
    public final String IMPORT_USER_TYPE = "user type";
    public final String IMPORT_USER_STATUS = "status";

    public final String IMPORT_COMPANY_EMPLOYEE_ID = "company employee id";
    public final String IMPORT_EMPLOYEE_LEVEL = "employee level";
    public final String IMPORT_LOCATION = "location";
    public final String IMPORT_DEPARTMENT = "department";
    public final String IMPORT_PHONE_NO = "phone no";


    public final String DATE_DIFFERENCE = "difference";
    public final String WEEKLY = "weekly";
    public final String MONTHLY = "monthly";
    public final String UI_EMPL_REFERRAL_CHANNEL = "Employee Referrals";
    public final String UI_OTHERS_CHANNEL = "Others";
    public final String UI_JOB_BOARD_CHANNEL = "Job Board";
    public final String UI_AGENCY_CHANNEL = "Agency";
    public final String UI_NON_AGENCY_CHANNEL = "Non Agency";
    public final String UI_CAREER_SITES_CHANNEL = "Career Sites";
    public final String UI_SOCIAL_MEDIA_CHANNEL = "Social Media";

    public final String SOURCE_FILTER_ALL_CHANNELS = "ALL_CHANNELS";
    public final String SOURCE_FILTER_A_NA = "A_NA";

    public final String CAND_ETL_POSITION_NUMBER = "POSITION_NO";
    public final String CAND_ETL_JOB_ID = "JOB_ID";
    public final String CAND_ETL_APPLICANT_ID = "APPLICANT_ID";
    public final String CAND_ETL_EMPLID = "EMPL_ID";
    public final String CAND_ETL_FIRST_NAME = "FIRST_NAME";
    public final String CAND_ETL_LAST_NAME = "LAST_NAME";
    public final String CAND_ETL_DOB = "DOB";
    public final String CAND_ETL_EMAIL_ID = "EMAIL_ID";
    public final String CAND_ETL_RECRUITER_EMAIL = "REC_EMAIL";
    public final String CAND_ETL_STATUS = "STATUS";
    public final String CAND_ETL_JOINING_DATE = "JOINING_DATE";
    public final String CAND_ETL_PS_UPDATE_DATE = "PS_UPDATE_DATE";
    public final String CAND_ETL_RH_ID = "RH_ID";

/*EEO-CONSTANTS*/

    //mphasis
    public final String ETHINICITY_1 = "Hispanic or Latino";
    public final String ETHINICITY_2 = "White (Not Hispanic or Latino)";
    public final String ETHINICITY_3 = "Black or African American (Not Hispanic or Latino)";
    public final String ETHINICITY_4 = "Native Hawaiian or Other Pacific Islander (Not Hispanic or Latino)";
    public final String ETHINICITY_5 = "Asian (Not Hispanic or Latino)";
    public final String ETHINICITY_6 = "American Indian or Alaska Native (Not Hispanic or Latino)";
    public final String ETHINICITY_7 = "Two or More Races (Not Hispanic or Latino)";
    public final String ETHINICITY_8 = "Decline to Identify";

    //fractal
    public final String ETHINICITY_9 = "White (Not Hispanic)";
    public final String ETHINICITY_10 = "African American/Black (Not Hispanic)";
    public final String ETHINICITY_11 = "Hispanic";
    public final String ETHINICITY_12 = "Asian";
    public final String ETHINICITY_13 = "Pacific Islander";
    public final String ETHINICITY_14 = "American Indian";
    public final String ETHINICITY_15 = "Native Alaskan";
    public final String ETHINICITY_16 = "Native Hawaiian";
    public final String ETHINICITY_17 = "Multi-racial";


    public final String DISABLITY1 = "I dont't wish to answer";
    public final String DISABLITY2 = "Yes, i have a disability (or previously had a disability)";
    public final String DISABLITY3 = "No, i don't have a disability";

    //mphasis
    public final String VETERAN1 = "Disabled Veteran";
    public final String VETERAN2 = "Recently seperated Veteran";
    public final String VETERAN3 = "Armed force Services Medal Veteran";
    public final String VETERAN4 = "Other protected Veteran";

    //fractal
    public final String VETERAN5 = "Disabled Veteran";
    public final String VETERAN5_FOOTER = "A veteran of the U.S. military, ground, naval or air service who is entitled to compensation (or who but for the receipt of military retired pay would be entitled to compensation) under laws administered by the Secretary of Veterans Affairs; or a person who was discharged or released from active duty because of a service-connected disability";
    public final String VETERAN6 = "Recently separated veteran";
    public final String VETERAN6_FOOTER = "Any veteran during the three-year period beginning on the date of such veteran's discharge or release from active duty in the U.S.military, ground, naval, or air service";
    public final String VETERAN7 = "Active duty wartime or campaign badge veteran";
    public final String VETERAN7_FOOTER = "A veteran who served on active duty in the U.S. military, ground, naval or air service during a war, or in a campaign or expedition for which a campaign badge has been authorized under the laws administered by the Department of Defense";
    public final String VETERAN8 = "Armed forces service medal veteran";
    public final String VETERAN8_FOOTER = "A veteran who, while serving on active duty in the U.S. military, ground, naval or air service, participated in a United States military operation for which an Armed Forces service medal was awarded pursuant to Executive Order 12985";
    public final String VETERAN9 = "Not a Protected Veteran";
    public final String VETERAN10 = "I dont't wish to answer";
    String VETERAN11 = "Protected Veteran";

    public final String MALE = "MALE";
    public final String FEMALE = "FEMALE";

    public final String STR_COMPETENCY = "COMPETENCY";

    public final String SAME_ROUND_CAND_MOVEMENT = "Success: Candidate in Same Round";

    public final String JOB_SOURCER_STR = "jobSourcerStr";
    public final String HIRING_DEADLINE = "HIRING_DEADLINE";
    public final String PRIMARY_SKILLS_STR = "primarySkillsStr";
    public final String SECONDARY_SKILLS_STR = "secondarySkillsStr";
    public final String REC_CUSTOM1 = "recCustom1";
    public final String REC_CUSTOM2 = "recCustom2";
    public final String REC_CUSTOM3 = "recCustom3";
    public final String REC_CUSTOM4 = "recCustom4";
    public final String TYPE_CUSTOM1 = "typeCustom1";
    public final String TYPE_CUSTOM2 = "typeCustom2";
    public final String TYPE_CUSTOM3 = "typeCustom3";
    public final String TYPE_CUSTOM4 = "typeCustom4";
    public final String TYPE_CUSTOM5 = "typeCustom5";
    public final String TYPE_CUSTOM6 = "typeCustom6";
    public final String TYPE_CUSTOM7 = "typeCustom7";
    public final String TYPE_CUSTOM8 = "typeCustom8";
    public final String TYPE_CUSTOM9 = "typeCustom9";
    public final String TYPE_CUSTOM10 = "typeCustom10";
    public final String TYPE_CUSTOM11 = "typeCustom11";
    public final String TYPE_CUSTOM12 = "typeCustom12";
    public final String TYPE_CUSTOM13 = "typeCustom13";
    public final String TYPE_CUSTOM14 = "typeCustom14";
    public final String TYPE_CUSTOM15 = "typeCustom15";
    public final String TYPE_CUSTOM16 = "typeCustom16";
    public final String TYPE_CUSTOM17 = "typeCustom17";
    String CUSTOM1 = "custom1";
    String CUSTOM2 = "custom2";
    String CUSTOM3 = "custom3";
    String CUSTOM4 = "custom4";
    String CUSTOM5 = "custom5";
    String CUSTOM6 = "custom6";
    String CUSTOM7 = "custom7";
    String CUSTOM8 = "custom8";
    String CUSTOM9 = "custom9";
    String CUSTOM10 = "custom10";
    String CUSTOM11 = "custom11";
    String CUSTOM12 = "custom12";
    String CUSTOM13 = "custom13";
    String CUSTOM14 = "custom14";
    String CUSTOM15 = "custom15";
    String CUSTOM16 = "custom16";
    String CUSTOM17 = "custom17";
    String CUSTOM18 = "custom18";
    String CUSTOM19 = "custom19";
    String CUSTOM20 = "custom20";
    public final String REQUEST_DATE = "requestDate";
    public final String RECR_START_DATE = "recruitmentStartDate";

    public final String JOB_STATUS_REVIEW = "REVIEW";
    public final String REVIEW_JOB = "REVIEW_JOB";
    public final String CITIZENSHIP0 = "No answer";
    public final String CITIZENSHIP1 = "I am a U.S. Citizen/Permanent Resident";
    public final String CITIZENSHIP2 = "Non-citizen allowed to work for any employer";
    public final String CITIZENSHIP3 = "Non-citizen allowed to work for current employer";
    public final String CITIZENSHIP4 = "Non-citizen seeking work authorization";

    public final String RELOCATION0 = "No answer";
    public final String RELOCATION1 = "Yes";
    public final String RELOCATION2 = "No";

    public final String DUPLICATE = "Duplicate";
    public final String EMP_IMAGE_SRC_UPLOAD = "UPLOAD";
    public final String EMP_IMAGE_SRC_FB = "FB";
    public final String INTERNAL_TRACKING_DETAILS = "Internal Tracking Details";

    public final String TW_REPLACE_TWITTER_HANDLE = "<twitter_handle>";
    public final String TW_REPLACE_JOB_TITLE = "<job_title>";

    public final String KWENCH_API_KEY = "kwench.api.key";
    public final String FILE_SCANNER = "file.scanner";

    public final String WS_JOB_OPEN = "OPEN";
    public final String WS_JOB_CLOSE = "CLOSE";
    public final String WS_JOB_CANCELLED = "CANCELLED";

    public final String WS_JOB_CLIENT_INTERVIEW_YES = "YES";
    public final String WS_JOB_CLIENT_INTERVIEW_NO = "NO";
    public final String FRACTAL_INVALID_RESUME_ERROR = "error: file type is not supported";

    public final String JOB_LEVEL = "jobLevel";

    public final String EMP_REWARD_TYPE_CASH = "CASH";
    public final String EMP_REWARD_TYPE_COIN = "COIN";
    public final String EMP_REWARD_TYPE_ALL = "ALL";


    public final String HELP_SECTION_TYPE_GENERAL = "GENERAL";
    public final String CHANNEL_TYPE_SOCIAL = "SOCIAL";
    public final String HELP_SECTION_TYPE_REWARD = "REWARD";
    public final String HELP_SECTION_TYPE_COIN = "COIN";
    public final String HELP_SECTION_TYPE_IJP = "IJP";

    public final String TRANSACTION_PENDING = "P";
    public final String TRANSACTION_SUCCESS = "S";
    public final String TRANSACTION_FAILED = "F";
    public final String TRANSACTION_TYPE_TRANSFER = "TRANSFER";
    public final String TRANSACTION_TYPE_REDEEM = "REDEEM";
    public final String TRANSACTION_TYPE_REFUND = "REFUND";
    public final String TRANSACTION_TYPE_POINTS_QUERY = "POINTSQUERY";
    public final String TRANSACTION_TYPE_USER_DEACTIVATION = "USERSTATUS";

    public final String REWARD_RELEASE_TYPE_INSTANT = "INSTANT";
    public final String REWARD_RELEASE_TYPE_DEFERRED = "DEFERRED";

    //    mongo activity type
    public final String MONGO_ACTIVITY_CAMPAIGN_UPDATE = "CAMPAIGN_UPDATE";
    public final String MONGO_ACTIVITY_SAVE_CANDIDATE = "SAVE_CANDIDATE";
    public final String MONGO_ACTIVITY_CONTEST_UPDATE = "CONTEST_UPDATE";
    public final String MONGO_ACTIVITY_EMP_REFERALL = "EMP_REFERALL";
    public final String MONGO_ACTIVITY_JOB_UPDATE = "JOB_UPDATE";
    public final String MONGO_ACTIVITY_JOB_REVIEW_UPDATE = "JOB_REVIEW_UPDATE";
    public final String MONGO_ACTIVITY_CANDIDATE_UPDATE = "CANDIDATE_UPDATE";


    public final String RUPEE_SYMBOL = "Rs.";
    public final String DOLLAR_SYMBOL = "$";

    public final String MPHASIS_ENCRYPTION_KEY = "mphasis.encryption.key";
    public final String EMIDS_ENCRYPTION_KEY = "emids.encryption.key";

    public final String EMIDS_SECRET_KEY = "emids.secret.key";

    public final String MICROSOFT_SSO_CLIENT_KEY = "microsoft.sso.client.id";
    public final String MICROSOFT_SSO_CLIENT_SECRET = "microsoft.sso.client.secret";
    public final String MICROSOFT_SSO_REDIRECT_URL = "microsoft.sso.redirect.url";
    public final String MICROSOFT_SSO_TOKEN_URL = "microsoft.sso.token.url";
    public final String MICROSOFT_SSO_AUTHORIZATION_URL = "microsoft.sso.authorize.url";
    public final String QUERY_PARAMETER_CODE = "code";
    public final String AUTHORIZATION_CODE = "authorization_code";
    public final String REDIRECT_URI = "redirect_uri";
    public final String RESPONSE_TYPE = "response_type";
    public final String CLIENT_ID = "client_id";
    public final String REQUEST_SCOPE = "scope";
    public final String REQUEST_STATE = "state";
    public final String REQUEST_NOUNCE = "nounce";

    public final String COINS_DEV_EMAIL = "coins.dev.email";

    public final String REQUEST_METHOD_POST = "POST";
    public final String REQUEST_METHOD_GET = "GET";
    public final String REQUEST_METHOD_PUT = "PUT";
    public final String REQUEST_API_KEY = "app-key";
    public final String REQUEST_ACCESS_TOKEN = "access-token";
    public final String REQUEST_CONTENT_TYPE = "Content-Type";

    public final Integer HTTP_RESPONSE_OK = 200;
    public final Integer HTTP_RESPONSE_REDIRECT = 304;
    public final Integer HTTP_RESPONSE_ERROR = 400;
    public final Integer HTTP_RESPONSE_INTERNAL_SERVER_ERROR = 500;

    public final String KWENCH_POINTS_URL = "kwench.points.url";
    public final String KWENCH_USER_POINTS_URL = "kwench.user.points.api";
    public final String KWENCH_USER_DEACTIVATION_URL = "kwench.user.deactivate.api";
    public final String KWENCH_ACCESS_TOKEN = "kwench.api.accesstoken";
    public final String KWENCH_LANDING_PAGE = "kwench.sso.landingpage";
    public final String KWENCH_POINTS_HISTORY_PAGE = "pointsHistory";

    public final String JOB_ETL = "JOB_ETL";
    public final String CANDIDATE_ETL = "CANDIDATE_ETL";
    public final String REJECTION_ETL = "REJECTION_ETL";
    public final String ETL_PROCESSING = "Processing";
    public final String ETL_PROCESSED = "Processed";
    public final String ETL_ERROR = "Error";
    public final String ETL_INVALID_FILE = "Invalid file";
    public final String ETL_FAILED = "Failed";
    public final String ETL_INPUT_FILE = "etl_input";
    public final String ETL_OUTPUT_FILE = "etl_output";

    public final String RAW_JOB_EXPORT = "RAW_JOB_EXPORT";
    public final String ACTION_STATUS_DUPLICATE = "duplicate";


    public final String JOB_DISPLAY_STATUS_OPEN = "OPEN";
    public final String JOB_DISPLAY_STATUS_CLOSED = "CLOSED";
    public final String JOB_DISPLAY_STATUS_CANCELLED = "CANCELLED";
    public final String JOB_DISPLAY_STATUS_DRAFT = "DRAFT";
    public final String CANDIDATE_EXPORT_MAIL = "candidate.export.mail";
    public final String JOB_EDIT = "JOB_EDIT";
    public final String CANDIDATE_EDIT = "CANDIDATE_EDIT";
    public final String APP_JOB_SEQ = "jobSeq";
    public final String LnTINFOTECH = "L&T Infotech - ";

    public final String CROLE = "CROLE*";
    public final String LEVEL_A = "LEVEL_A*";
    public final String LEVEL_S = "LEVEL_S*";
    public final String WITHDRAWN_BY = "WITHDRAWN_BY";
    public final String WITHDRAWN_LEVEL = "WITHDRAWN_LEVEL";
    public final String DEPARTMENT = "DEPARTMENT";
    public final String ACCOUNT_CLIENT = "ACCOUNT_CLIENT";
    public final String SOLR_CUSTOM1 = "CUSTOM1";
    public final String SOLR_CUSTOM2 = "CUSTOM2";
    public final String SOLR_CUSTOM8 = "CUSTOM8";
    public final String SOLR_CUSTOM11 = "CUSTOM11";
    public final String SOLR_CUSTOM11_LOWER = "CUSTOM11_LOWER";
    public final String OVERDUE_DATE = "OVERDUE_DATE";
    public final String OVERDUE = "OVERDUE";
    public final String IN_PROGRESS_OVERDUE = "IN PROGRESS & OVERDUE";
    public final String IN_PROGRESS = "IN PROGRESS";
    public final String OFFERED = "OFFERED";
    public final String OFFERED_OVERDUE = "OFFERED & OVERDUE";
    public final String CANDIDATE_DETAILS_ACTION = "CAND_DETAILS";
    public final String RIPPLEHIRE_PRIVATE_KEY = "ripplehire.signing.key.private";
    public final String ABG_PUBLIC_KEY = "abg.signing.key.public";
    public final String RIPPLEHIRE_ABG_APP_NAME = "ripplehire.abg.appname";
    public final String SCHEDULED = "SCHEDULED";
    public final String FEEDBACK_QUESTION_TYPE_SCHEDULE = "SCHEDULE";
    public final String IS_REVIEW_DONE = "IS_REVIEW_DONE";
    public final String IS_FEEDBACK_DONE = "IS_FEEDBACK_DONE";
    public final int JOB_DATA_COLUMN_COUNT = 59;
    public final String SOURCE_CHANGE = "source_change";
    public final String MOVEMENT_ACTIONS = "move_actions";
    public final String HIRE_ROUND_MOVEMENT = "HIRE_ROUND_MOVEMENT";
    public final String CHANGE_SOURCE = "CHANGE_SOURCE";
    public final String REWARD_DEACTIVATION = "REWARD_DEACTIVATION_FOR_EMPLOYEES";
    public final String UPDATE_LOGIN_ATTEMPT = "update";
    public final String RESET_LOGIN_ATTEMPT = "reset";

    public final String LOCK_USER = "LOCK_USER";
    public final String UNLOCK_USER = "UNLOCK_USER";
    public final String RESET_PASSWORD = "RESET_PASSWORD";
    public final String CAND_AGE_STAGE = "candidate-ageing-stages";
    public final String MAIL_FOLDER_INBOX = "inbox";
    public final String MAIL_STATUS_READ = "read";
    public final String MAIL_STATUS_UNREAD = "unread";
    public final String WALMART_DIT_REPORT = "walmartDitReport";
    public final String WALMART_SENDER_MAILID = "walmart.sender.mailId";
    public final String JOB_LOCATION_STR = "jobLocationStr";
    public final String COMPANY_CD_WALMART = "WALMARTLABS";

    public final String DUP_CHECK_BY_EMAIL = "EMAIL";
    public final String DUP_CHECK_BY_EMAIL_ON_SINGLE_JOB = "EMAIL_SINGLE_JOB";
    public final String DUP_CHECK_BY_PHONE = "PHONE";
    public final String DUP_CHECK_BY_PHONE_ON_SINGLE_JOB = "PHONE_SINGLE_JOB";
    public final String APPLICATION_ERROR_MSG = "error_msg";
    public final List<Integer> CTP_JOB_SEQ_LIST = new ArrayList<Integer>() {{
        add(4947);
        add(9839);
        add(12498);
        add(16087);
        add(12622);
        add(28162);
        add(28163);
        add(12498);
        add(12622);
        add(28164);
    }};

    public final String PS_ID_REQUESTED = "Applicant Id Requested";
    public final String PS_ID_INPROCESS = "Applicant Id Requested-Inprocess";
    public final String OFFERED_POSITION = "offered_positions";
    public final String STR_REQUIRED = "required.";
    public final String ACTION_STATUS_INVALID = "invalid";
    public final String CLIENT_CUSTOM_MSTR_MARTIAL_STATUS = "martialStatus";

    public final String RIPPLEHIRE_ENCRYPTION_KEY = "ripplehire.encryption.key";
    public final String RIPPLEHIRE_ENCRYPTION_MAPPER_KEY = "ripplehire.encryption.mapper.key";
    public final String DEFAULT_SMTP = "DEFAULT_SMTP";
    public final String DEFAULT_JOB_REWARD_BAND = "DEFAULT_BAND";
    public final String INTERVIEW_SCHEDULE_INTERVIEWER = "INTERVIEWER";
    public final String INTERVIEW_SCHEDULE_ORGANIZER = "ORGANIZER";
    public final String INTERVIEW_SCHEDULE_RECRUITER = "RECRUITER";
    public final String END_TIME_SCHEDULED = "END_TIME_SCHEDULED";
    public final String PENDINGMAIL_FETCH_SIZE = "pendingmail.fetchsize";
    public final String OTHER_UPPERCASE = "OTHER";
    public final String SOCIAL_EXPLORER_BADGE_CODE = "Social Explorer";

    String CANCEL_REASON = "CANCEL_REASON";


    public final String INTERVIEW_SCHEDULE = "SCHEDULE";
    public final String INTERVIEW_REVIEW = "REVIEW";

    public final String INTERVIEW_CANDIDATES_TODAY = "CT";
    public final String INTERVIEW_CANDIDATES_UPCOMING = "CU";
    public final String INTERVIEW_CANDIDATES_PENDING_FEEDBACK = "CPF";
    public final String INTERVIEW_CANDIDATES_COMPLETED = "CD";
    String REVIEW_CANDIDATES_PENDING = "RCP";
    String REVIEW_CANDIDATES_COMPLETED = "RCD";

    public final String FACE_TO_FACE_INTERVIEW_CODE = "FTF";
    public final String TELEPHONIC_INTERVIEW_CODE = "TEL";
    public final String VIDEO_INTERVIEW_CODE = "VED";
    public final String REVIEW_INTERVIEW_CODE = "REVIEW";

    public final String INTERVIEW_FEEDBACK_ACTION_ACCEPT_REJECT = "ACCEPT-REJECT";
    public final String INTERVIEW_FEEDBACK_ACTION_FEEDBACK = "FEEDBACK";

    String COMMENT_TYPE_ALL = "ALL";
    String COMMENT_TYPE_INTERVIEWER_COMMENT = "INTERVIEWER_COMMENT";
    String COMMENT_TYPE_INTERVIEWER_ONLY_COMMENT = "INTERVIEWER_ONLY_COMMENT";
    String COMMENT_TYPE_RECRUITER_COMMENT = "RECRUITER_COMMENT";
    String COMMENT_TYPE_FEEDBACK_COMMENT = "FEEDBACK_COMMENT";
    String COMMENT_TYPE_RECRUITER_ONLY_COMMENT = "RECRUITER_ONLY_COMMENT";

    String FIELD_TYPE_CANDIDATE = "candidate";
    String FIELD_TYPE_INTERVIEW = "interviewer";
    String FIELD_TYPE_JOB_VIEW = "job_view";
    String STR_DASH = "-";
    String STR_DASH_WITH_SPACE = " - ";
    String STR_DAYS = "Days";
    Integer CONVERT_TO_TIME = 60000;

    String MPHASIS_DEADLINE_CONFIG_START = "mphasis.deadline.startdate";
    String STR_YES = "yes";
    String STR_NO = "no";

    String INTERVIEW_NOTIFICATION_1 = "INTERVIEW_NOTIFICATION_1";
    String INTERVIEW_NOTIFICATION_2 = "INTERVIEW_NOTIFICATION_2";
    String INTERVIEW_NOTIFICATION_3 = "INTERVIEW_NOTIFICATION_3";
    String INTERVIEW_COMPLETED_NOTIFICATION = "INTERVIEW_FEEDBACK_DONE_NOTIFICATION";

    String REVIEW_NOTIFICATION_1 = "REVIEW_NOTIFICATION_1";
    String REVIEW_NOTIFICATION_2 = "REVIEW_NOTIFICATION_2";
    String REVIEW_NOTIFICATION_3 = "REVIEW_NOTIFICATION_3";

    String INTERVIEW_NOTIFY_1_CD = "INTERVIEW_NOTIFY_1";
    String INTERVIEW_NOTIFY_2_CD = "INTERVIEW_NOTIFY_2";
    String INTERVIEW_NOTIFY_3_CD = "INTERVIEW_NOTIFY_3";
    String INTERVIEW_FEEDBACK_DONE_NOTIFY = "INTERVIEW_FEEDBACK_DONE_NOTIFY";

    String REVIEW_NOTIFY_1_CD = "REVIEW_NOTIFY_1";
    String REVIEW_NOTIFY_2_CD = "REVIEW_NOTIFY_2";
    String REVIEW_NOTIFY_3_CD = "REVIEW_NOTIFY_3";

    String INTERVIEW_HISTORY_SCHEDULE_CHANGE = "SCHEDULE_CHANGE";

    public final String CANDIDATE_PAGE_FIELD_TYPE_AUTO_COMPLETE = "autocomplete";

    String STR_YES_FIRST_LETTER_CAP = "Yes";
    String STR_NO_FIRST_LETTER_CAP = "No";

    public final String JOB_STATUS_MSTR_ACTIVE = "ACTIVE";
    public final String JOB_STATUS_MSTR_CLOSED = "CLOSED";
    public final String JOB_STATUS_MSTR_DRAFT = "DRAFT";
    public final String JOB_STATUS_MSTR_CANCELLED = "CANCELLED";
    public final String JOB_STATUS_MSTR_DELETED = "DELETED";
    public final String JOB_STATUS_MSTR_RECRUITER_REVIEW = "RECRUITER_REVIEW";
    public final String JOB_STATUS_MSTR_HIRING_APPROVAL = "APPROVAL";
    public final String JOB_STATUS_MSTR_APPROVAL_REJECTED = "APPROVAL_REJECTED";
    public final String JOB_STATUS_MSTR_WITHDRAWN = "WITHDRAWN";

    public final String JOB_STATUS_MSTR_CUSTOM_REVIEW = "REVIEW";
    public final String JOB_STATUS_MSTR_NEW_JOB = "NEW_JOB";
    public final String JOB_STATUS_MSTR_NEW_JOB_REQUEST = "NEW_JOB_REQUEST";

    public final String JOB_STATUS_ACTION_SAVE = "SAVE_PUBLISH";
    public final String JOB_STATUS_ACTION_DRAFT = "SAVE_DRAFT";

    String NEW_JOB_REQUEST = "NEW_JOB_REQUEST";
    String HIRING_TEAM = "HIRING_TEAM";
    String RECRUITING_TEAM = "RECRUITING_TEAM";
    public final String JOB_STATUS_MSTR_TYPE_REQUEST = "JOB_REQUEST";
    public final String JOB_STATUS_MSTR_TYPE_JOB = "JOB";

    String JOB_APPROVAL_TYPE_DEFAULT = "DEFAULT";
    String JOB_APPROVAL_TYPE_GROUP = "GROUP";
    String JOB_APPROVAL_TYPE_CUSTOM = "CUSTOM";
    String APPROVER_LABEL = "Approver #";
    String APPROVER_NAME = "jobApprover";
    String APPROVER_TEAM = "APPROVER_TEAM";
    String RECRUITER_REVIEWER_TEAM = "RECRUITER_REVIEWER_TEAM";
    String TYPE_REJECT_REASON_CANDIDATE_REJECT = "CANDIDATE_REJECT";
    String TYPE_REJECT_REASON_APPROVAL_REJECT = "APPROVAL_REJECT";
    String TYPE_REJECT_REASON_TYPE_WITHDRAW_JOB_REQUEST = "WITHDRAW_JOB_REQUEST";

    public final String RECR_BOX_JOB_STATE_PUBLISHED = "Published";
    final String HTML_BREAK = "<br/>";

    public final String REFERRAL_CHANNEL_CAREERSITE = "CAREERSITE";
    public final String REFERRAL_CHANNEL_ALUMNI = "ALUMNI";
    String ADDITIONAL_INFO = "ADDITIONAL INFO";
    public String WALMART_MAIL_SUBJECT = "walmart.mail.subject";

    public final String SMS_SENDER_BASE_URL = "sms.kap.baseurl";
    public final String SMS_SENDER_INTERNATIONAL_BASE_URL = "sms.kap.international.baseurl";

    public final String EMPLOYEE_PHONE_NUMBER = "PhoneNo";
    public final String EMPLOYEE_COMPANY_NUMBER = "CompanyId";
    public final String EMPLOYEE_SMS_TYPE = "SMSType";
    public final String EMPLOYEE_USER_ID = "UserId";
    public final String EMPLOYEE_JOB_ID = "JobId";
    public final String EMPLOYEE_SMS_TEMPLATE = "SmsTemplate";
    public final String CANDIDATE_USER_ID = "CandUserId";
    public final String EMP_USER_ID = "EmpUserId";
    public final String CANDIADTE_INTERVIEW_LOCATION = "Location";
    public final String CANDIADTE_INTERVIEW_TIME = "Time";
    public final String CANDIADTE_INTERVIEW_DAY = "Day";
    public final String CANDIDATE_MESSAGE = "Message";

    public final String SMS_TYPE_WELCOME = "welcome";
    public final String SMS_TYPE_JOB = "job";
    String JOB_VIEW_GROUP_REQUEST_DETAILS = "Request Details";
    String DEFAUKT_KIT_TYPE = "DEFAULT";
    public final String BAND_OTHERS = "OTHERS";

    public final String IJP_CONFIG_1 = "IJP_CONFIG_1";
    public final String IJP_CONFIG_2 = "IJP_CONFIG_2";
    public final String IJP_CONFIG_3 = "IJP_CONFIG_3";
    String STRING_OR_WITH_SPACES = " OR ";
    String STRING_AND_WITH_SPACES = " AND ";
    public final String IJP_ALLOW = "IJP_ALLOW";
    public final String IJP_DENY = "IJP_DENY";
    public final String IJP_CONFIG_TYPE_ALLOW_SAME = "ALLOW_SAME";
    public final String IJP_CONFIG_TYPE_DISALLOW_SAME = "DISALLOW_SAME";
    public final String IJP_CONFIG_TYPE_CUSTOM = "CUSTOM";
    String IJP_ALLOW_CRITERIA = "ALLOW";
    String IJP_DENY_CRITERIA = "DENY";
    public final String SOLR_JOB_LEVEL = "JOB_LEVEL";
    String CLIENT_INTERNAL_MAPPING_TYPE_DEPARTMENT = "DepartmentMapping";

    String EMAIL_SUBJECT_JOB_REPLACE = "<jobtitle>";
    String EMAIL_SUBJECT_COMPANY_REPLACE = "<company>";
    public final String TALEO_ER_JOBS = "Epsilon India Referral Site ONLY";
    String STR_SUCCESS = "SUCCESS";
    String STR_FAIL = "FAIL";
    String STR_UPDATE_ERROR = "UPDATE-ERROR";
    String STR_UPDATE_NOMOVE = "UPDATE-NOMOVE";
    String STR_UPDATE_ERROR_MOVE = "UPDATE-ERROR-MOVE";
    String STR_UPDATE_SUCCESS = "UPDATE-SUCCESS";
    String STR_UPDATE_IGNORE = "UPDATE-IGNORE";
    String STR_UPDATE_EXCEPTION = "UPDATE-EXCEPTION";
    String STR_APPLY_SUCCESS = "APPLY-SUCCESS";
    String STR_APPLY_FAILED = "APPLY-FAILED";
    String STR_ASC = "ASC";
    String STR_DESC = "DESC";
    String ATTACHMENT_CREATED = "CREATED";
    String ATTACHMENT_DELETED = "DELETED";
    String ATTACHMENT_TYPE_OTHER = "OTHER";
    String JOB_UPLOAD = "jobupload";
    String CAND_UPLOAD = "candupload";
    String REFERRAL_PAYOUT_REPORT_CD = "REFERRAL_PAYOUT";
    String SYSTEM_ADMIN_USER = "system.admin";


    //Added By Vikas//
    String VERIFICATION_REPORT = "VERIFICATION_REPORT";
    String PENDING_PAYMENT_REPORT = "PENDING_PAYMENT_REPORT";
    String READY_DISBURSEMENT_REPORT = "READY_DISBURSEMENT_REPORT";
    String DISBURSEMENT_REPORT = "DISBURSEMENT_REPORT";
    String REPORT_CD_REDEMPTION_VERIFICATION = "redemption-verification-report";
    String REPORT_CD_REDEMPTION_READY_FOR_DISBURSEMENT = "redemption-ready-for-disbursment-report";
    String REPORT_CD_REDEMPTION_DISBURSED = "redemption-disbursed-report";
    String REPORT_CD_REDEMPTION_PENDING_PAYMENT = "redemption-pending-payment-report";
    String DOLLAR = "USD";
    String RUPEE = "INR";
    char REDEMPTION_PAYOUT_TYPE_VERIFICATION = 'V';
    char REDEMPTION_PAYOUT_TYPE_PENDING_PAYMENT = 'P';
    char REDEMPTION_PAYOUT_TYPE_DISBURSED = 'D';
    char REDEMPTION_PAYOUT_TYPE_READY_DISBURSED = 'R';


    //End//

    String DATA_COUNT = "COUNT";
    String DATA_ALL = "ALL";

    String LIST_PAGE = "list";
    String DETAIL_PAGE = "detail";
    String JOB_LIST_CD = "JOB_LIST";
    String JOB_DESC_CD = "JOB_DESC";
    String MAX_SMS_FETCH = "pendingsms.fetchsize";
    String TRANSACTION_ERROR = "E";
    String SMS_TEMPLATE_TYPE_JOB = "JOB_SMS";
    String SOLR_JOB_SEQ = "JOB_SEQ";
    String SMS_SCHEDULE_BULK_JOB = "Bulk Job Share";
    String SMS_SCHEDULE_PROCESS = "IN_PROCESS";
    String SMS_SCHEDULE_DONE = "DONE";
    String STR_HTTPS = "https://";

    String SMS_API_INDIA = "IND";
    String SMS_API_INTERNATIONAL = "INTRN";
    String SMS_API_AWS_SNS = "AWS_SNS";

    String RIPPLEHIRE_URL = "ripplehire.url";
    Character CHARACTER_P = 'P';
    Character CHARACTER_S = 'S';
    Character CHAR_PERCENT_SYMBOL = '%';
    String SMS_FETCH_SIZE = "sms.fetchsize";

    String DELETED_CANDIDATE_EMAIL_ADDRESS = "deleted@candidate.com";
    String DELETED_CANDIDATE_FULL_NAME = "Deleted Candidate";
    String MAIL_TYPE_JOB_REFERRAL_MAIL = "JOB_REFERRAL";
    String MAIL_TYPE_JOB_APPLICATION_PROGRESS_MAIL = "JOB_APPLICATION_PROGRESS";
    public final String S3_SYNC_LOCAL_FOLDER = "s3.sync.localfolder";

    //Export Types for Excel Export Log
    String EXPORT_TYPE_USER_MANAGEMENT = "User Management Export";
    String EXPORT_TYPE_CANDIDATE_MPHASIS_DAILY = "Mphasis Daily Candidate Export";
    String EXPORT_TYPE_CANDIDATE = "Candidate Export";
    String EXPORT_TYPE_BULK_SMS = "Bulk SMS Export";
    String EXPORT_TYPE_JOB_EXPORT = "Job Export";
    String EXPORT_TYPE_INTERVIEW_REPORT_EXPORT = "Interview Report Export";
    String WALMART_6_MONTH_ISSUE = "WALMART 6 MONTH ISSUE";
}
