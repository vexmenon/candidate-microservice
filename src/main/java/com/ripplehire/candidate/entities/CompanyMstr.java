package com.ripplehire.candidate.entities;

// Generated Nov 24, 2014 2:19:28 PM by Hibernate Tools 3.6.0

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
 * CompanyMstr generated by hbm2java
 */
@Entity
@Table(name = "company_mstr")
public class CompanyMstr implements java.io.Serializable {

	private Integer companyMstrSeq;
	private ParentCompanyMstr parentCompanyMstr;
	private CurrencyMstr currencyMstr;
	private String companyCd;
	private String companyName;
	private String multiCompanyName;
	private String logoImage;



	//added new my Vikas//
	private String loginlogoImageName;
	private String mobileLogoImageName;
	private String typeOfLogin;
	//End//
	private String empLogoImage;



	private String domainName;
	private String pointOfContact;
	private String primaryPhone;
	private String secondaryPhone;
	private String primaryEmail;
	private String secondaryEmail;
	private String employeeGroupEmail;
	private String recruiterGroupEmail;
	private String defaultEmailTemplate;
	private char status;
	private String mobileAccess;
	private String isSsoEnabled;
	private String ssoUrl;
    private String companyRefCd;
    private String companyRefId;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;
	private String socialMediaLogoImage;
	private Character candidatePage;
	private String timeZone;
	private String twitterHandle;
	private char advanceSearch;
	private String referalSubstatus;
	private int probationPeriod;
	private String accessToken;
	private String defaultBanner;
	private String defaultPassword;
	private Set<CompanyConfig> companyConfigs = new HashSet<CompanyConfig>(0);
	private String integrationImpl;
	private String parserCode;
	private String companyEntityId;
	private String companyEntityLocation;
	private String programName;

	public CompanyMstr() {
	}

	public CompanyMstr(ParentCompanyMstr parentCompanyMstr,
					   CurrencyMstr currencyMstr, char status, String mobileAccess,
					   String isSsoEnabled, int createdBy, Date createDttm,
					   char advanceSearch, int probationPeriod) {
		this.parentCompanyMstr = parentCompanyMstr;
		this.currencyMstr = currencyMstr;
		this.status = status;
		this.mobileAccess = mobileAccess;
		this.isSsoEnabled = isSsoEnabled;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.advanceSearch = advanceSearch;
		this.probationPeriod = probationPeriod;
	}

	public CompanyMstr(ParentCompanyMstr parentCompanyMstr,
					   CurrencyMstr currencyMstr, String companyCd, String companyName, String multiCompanyName,
					   String logoImage,String loginlogoImageName,String mobileLogoImageName,String typeOfLogin,String domainName, String pointOfContact,
					   String primaryPhone, String secondaryPhone, String primaryEmail,
					   String secondaryEmail, String employeeGroupEmail,
					   String recruiterGroupEmail, String defaultEmailTemplate,
					   char status, String mobileAccess, String isSsoEnabled, String ssoUrl,
					   int createdBy, Date createDttm, Integer updatedBy, Date updateDttm,
					   String socialMediaLogoImage, Character candidatePage,
					   String timeZone, String twitterHandle, char advanceSearch,
					   String referalSubstatus, int probationPeriod, String accessToken,
					   String defaultBanner, String defaultPassword, Set<CompanyConfig> companyConfigs, String parserCode, String companyEntityId, String companyEntityLocation) {
		this.parentCompanyMstr = parentCompanyMstr;
		this.currencyMstr = currencyMstr;
		this.companyCd = companyCd;
		this.companyName = companyName;
		this.multiCompanyName = multiCompanyName;
		this.logoImage = logoImage;
		this.loginlogoImageName = loginlogoImageName;
		this.mobileLogoImageName = mobileLogoImageName;
		this.typeOfLogin = typeOfLogin;
		this.domainName = domainName;
		this.pointOfContact = pointOfContact;
		this.primaryPhone = primaryPhone;
		this.secondaryPhone = secondaryPhone;
		this.primaryEmail = primaryEmail;
		this.secondaryEmail = secondaryEmail;
		this.employeeGroupEmail = employeeGroupEmail;
		this.recruiterGroupEmail = recruiterGroupEmail;
		this.defaultEmailTemplate = defaultEmailTemplate;
		this.status = status;
		this.mobileAccess = mobileAccess;
		this.isSsoEnabled = isSsoEnabled;
		this.ssoUrl = ssoUrl;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
		this.socialMediaLogoImage = socialMediaLogoImage;
		this.candidatePage = candidatePage;
		this.timeZone = timeZone;
		this.twitterHandle = twitterHandle;
		this.advanceSearch = advanceSearch;
		this.referalSubstatus = referalSubstatus;
		this.probationPeriod = probationPeriod;
		this.accessToken = accessToken;
		this.defaultBanner = defaultBanner;
		this.defaultPassword = defaultPassword;
		this.companyConfigs = companyConfigs;
		this.parserCode = parserCode;
		this.companyEntityId = companyEntityId;
		this.companyEntityLocation = companyEntityLocation;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "COMPANY_MSTR_SEQ", unique = true, nullable = false)
	public Integer getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(Integer companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PARENT_COMPANY_MSTR_SEQ", nullable = false)
	public ParentCompanyMstr getParentCompanyMstr() {
		return this.parentCompanyMstr;
	}

	public void setParentCompanyMstr(ParentCompanyMstr parentCompanyMstr) {
		this.parentCompanyMstr = parentCompanyMstr;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CURRENCY_MSTR_SEQ", nullable = false)
	public CurrencyMstr getCurrencyMstr() {
		return this.currencyMstr;
	}

	public void setCurrencyMstr(CurrencyMstr currencyMstr) {
		this.currencyMstr = currencyMstr;
	}

	@Column(name = "COMPANY_CD", length = 20)
	public String getCompanyCd() {
		return this.companyCd;
	}



	public void setCompanyCd(String companyCd) {
		this.companyCd = companyCd;
	}

	@Column(name = "LOGIN_LOGO_IMAGE_NAME", length = 100)
	public String getLoginlogoImageName() {
		return loginlogoImageName;
	}

	public void setLoginlogoImageName(String loginlogoImageName) {
		this.loginlogoImageName = loginlogoImageName;
	}

	@Column(name = "TYPE_OF_LOGIN", length = 10)
	public String getTypeOfLogin() {
		return typeOfLogin;
	}

	public void setTypeOfLogin(String typeOfLogin) {
		this.typeOfLogin = typeOfLogin;
	}



	@Column(name = "MOBILE_LOGO_IMAGE_NAME", length = 100)
	public String getMobileLogoImageName() {
		return mobileLogoImageName;
	}

	public void setMobileLogoImageName(String mobileLogoImageName) {
		this.mobileLogoImageName = mobileLogoImageName;
	}



	@Column(name = "COMPANY_NAME", length = 100)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "MULTI_COMPANY_NAME", length = 100)
	public String getMultiCompanyName() {
		return this.multiCompanyName;
	}

	public void setMultiCompanyName(String multiCompanyName) {
		this.multiCompanyName = multiCompanyName;
	}

	@Column(name = "LOGO_IMAGE", length = 100)
	public String getLogoImage() {
		return this.logoImage;
	}

	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}

	@Column(name = "EMP_LOGO_IMAGE", length = 100)
	public String getEmpLogoImage() {
		return empLogoImage;
	}

	public void setEmpLogoImage(String empLogoImage) {
		this.empLogoImage = empLogoImage;
	}

	@Column(name = "DOMAIN_NAME", length = 30)
	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	@Column(name = "POINT_OF_CONTACT", length = 50)
	public String getPointOfContact() {
		return this.pointOfContact;
	}

	public void setPointOfContact(String pointOfContact) {
		this.pointOfContact = pointOfContact;
	}

	@Column(name = "PRIMARY_PHONE", length = 15)
	public String getPrimaryPhone() {
		return this.primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	@Column(name = "SECONDARY_PHONE", length = 15)
	public String getSecondaryPhone() {
		return this.secondaryPhone;
	}

	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}

	@Column(name = "PRIMARY_EMAIL", length = 100)
	public String getPrimaryEmail() {
		return this.primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	@Column(name = "SECONDARY_EMAIL", length = 100)
	public String getSecondaryEmail() {
		return this.secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	@Column(name = "EMPLOYEE_GROUP_EMAIL", length = 100)
	public String getEmployeeGroupEmail() {
		return this.employeeGroupEmail;
	}

	public void setEmployeeGroupEmail(String employeeGroupEmail) {
		this.employeeGroupEmail = employeeGroupEmail;
	}

	@Column(name = "RECRUITER_GROUP_EMAIL", length = 100)
	public String getRecruiterGroupEmail() {
		return this.recruiterGroupEmail;
	}

	public void setRecruiterGroupEmail(String recruiterGroupEmail) {
		this.recruiterGroupEmail = recruiterGroupEmail;
	}

	@Column(name = "DEFAULT_EMAIL_TEMPLATE", length = 1)
	public String getDefaultEmailTemplate() {
		return this.defaultEmailTemplate;
	}

	public void setDefaultEmailTemplate(String defaultEmailTemplate) {
		this.defaultEmailTemplate = defaultEmailTemplate;
	}

	@Column(name = "STATUS", nullable = false, length = 1)
	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@Column(name = "MOBILE_ACCESS", nullable = false, length = 1)
	public String getMobileAccess() {
		return this.mobileAccess;
	}

	public void setMobileAccess(String mobileAccess) {
		this.mobileAccess = mobileAccess;
	}

	@Column(name = "IS_SSO_ENABLED", nullable = false, length = 1)
	public String getIsSsoEnabled() {
		return this.isSsoEnabled;
	}

	public void setIsSsoEnabled(String isSsoEnabled) {
		this.isSsoEnabled = isSsoEnabled;
	}

	@Column(name = "SSO_URL", length = 300)
	public String getSsoUrl() {
		return this.ssoUrl;
	}

	public void setSsoUrl(String ssoUrl) {
		this.ssoUrl = ssoUrl;
	}

    @Column(name = "COMPANY_REF_CD", length = 300)
    public String getCompanyRefCd() {
        return companyRefCd;
    }

    public void setCompanyRefCd(String companyRefCd) {
        this.companyRefCd = companyRefCd;
    }

    @Column(name = "COMPANY_REF_ID", length = 300)
    public String getCompanyRefId() {
        return companyRefId;
    }

    public void setCompanyRefId(String companyRefId) {
        this.companyRefId = companyRefId;
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

	@Column(name = "SOCIAL_MEDIA_LOGO_IMAGE", length = 100)
	public String getSocialMediaLogoImage() {
		return this.socialMediaLogoImage;
	}

	public void setSocialMediaLogoImage(String socialMediaLogoImage) {
		this.socialMediaLogoImage = socialMediaLogoImage;
	}

	@Column(name = "CANDIDATE_PAGE", length = 1)
	public Character getCandidatePage() {
		return this.candidatePage;
	}

	public void setCandidatePage(Character candidatePage) {
		this.candidatePage = candidatePage;
	}

	@Column(name = "TIME_ZONE", length = 100)
	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	@Column(name = "TWITTER_HANDLE", length = 100)
	public String getTwitterHandle() {
		return this.twitterHandle;
	}

	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}

	@Column(name = "ADVANCE_SEARCH", nullable = false, length = 1)
	public char getAdvanceSearch() {
		return this.advanceSearch;
	}

	public void setAdvanceSearch(char advanceSearch) {
		this.advanceSearch = advanceSearch;
	}

	@Column(name = "REFERAL_SUBSTATUS", length = 1)
	public String getReferalSubstatus() {
		return this.referalSubstatus;
	}

	public void setReferalSubstatus(String referalSubstatus) {
		this.referalSubstatus = referalSubstatus;
	}

	@Column(name = "PROBATION_PERIOD", nullable = false)
	public int getProbationPeriod() {
		return this.probationPeriod;
	}

	public void setProbationPeriod(int probationPeriod) {
		this.probationPeriod = probationPeriod;
	}

	@Column(name = "ACCESS_TOKEN", length = 100)
	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	@Column(name = "DEFAULT_BANNER", length = 200)
	public String getDefaultBanner() {
		return this.defaultBanner;
	}

	public void setDefaultBanner(String defaultBanner) {
		this.defaultBanner = defaultBanner;
	}

	@Column(name = "DEFAULT_PASSWORD", length = 200)
	public String getDefaultPassword() {
		return this.defaultPassword;
	}

	public void setDefaultPassword(String defaultPassword) {
		this.defaultPassword = defaultPassword;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "companyMstr")
	public Set<CompanyConfig> getCompanyConfigs() {
		return this.companyConfigs;
	}

	public void setCompanyConfigs(Set<CompanyConfig> companyConfigs) {
		this.companyConfigs = companyConfigs;
	}

	@Column(name = "INTEGRATION_IMPL", length = 200)
	public String getIntegrationImpl() {
		return integrationImpl;
	}

	public void setIntegrationImpl(String integrationImpl) {
		this.integrationImpl = integrationImpl;
	}

	@Column(name = "PARSER_CODE", length = 100)
	public String getParserCode() {
		return parserCode;
	}

	public void setParserCode(String parserCode) {
		this.parserCode = parserCode;
	}

	@Column(name = "COMPANY_ENTITY_ID", length = 100)
	public String getCompanyEntityId() {
		return companyEntityId;
	}

	public void setCompanyEntityId(String companyEntityId) {
		this.companyEntityId = companyEntityId;
	}

	@Column(name = "COMPANY_ENTITY_LOCATION", length = 100)
	public String getCompanyEntityLocation() {
		return companyEntityLocation;
	}

	public void setCompanyEntityLocation(String companyEntityLocation) {
		this.companyEntityLocation = companyEntityLocation;
	}

	@Column(name = "RH_PROGRAM_NAME", length = 100)
	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}
}
