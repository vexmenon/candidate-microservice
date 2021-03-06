package com.ripplehire.candidate.entities;

// Generated Nov 21, 2014 4:27:12 PM by Hibernate Tools 3.6.0

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

/**
 * Campaign generated by hbm2java
 */
@Entity
@Table(name = "campaign")
public class Campaign implements java.io.Serializable {

	private Integer campaignSeq;
	private int companyMstrSeq;
	private String campaignCd;
	private String campaignStatus;
	private String campaignTile;
	private String campaignDesc;
	private String isPublished;
    private String campaignType;
	private String isDefault = "N";
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;
	private Set<JobMailer> jobMailers = new HashSet<JobMailer>(0);
	private Set<CampaignLocation> campaignLocations = new HashSet<CampaignLocation>(
			0);
	private Set<EmplRefrl> emplRefrls = new HashSet<EmplRefrl>(0);
	private Set<CampaignRecruiter> campaignRecruiters = new HashSet<CampaignRecruiter>(
			0);
	private Set<CampaignJob> campaignJobs = new HashSet<CampaignJob>(0);

	public Campaign() {
	}

	public Campaign(int companyMstrSeq, String campaignStatus,
					String campaignTile, String isDefault, char status, int createdBy,
					Date createDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.campaignStatus = campaignStatus;
		this.campaignTile = campaignTile;
		this.isDefault = isDefault;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public Campaign(int companyMstrSeq, String campaignCd,
					String campaignStatus, String campaignTile, String campaignDesc,
					String isPublished, String isDefault, char status, int createdBy,
					Date createDttm, Integer updatedBy, Date updateDttm,
					Set<JobMailer> jobMailers, Set<CampaignLocation> campaignLocations,
					Set<EmplRefrl> emplRefrls,
					Set<CampaignRecruiter> campaignRecruiters,
					Set<CampaignJob> campaignJobs) {
		this.companyMstrSeq = companyMstrSeq;
		this.campaignCd = campaignCd;
		this.campaignStatus = campaignStatus;
		this.campaignTile = campaignTile;
		this.campaignDesc = campaignDesc;
		this.isPublished = isPublished;
		this.isDefault = isDefault;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
		this.jobMailers = jobMailers;
		this.campaignLocations = campaignLocations;
		this.emplRefrls = emplRefrls;
		this.campaignRecruiters = campaignRecruiters;
		this.campaignJobs = campaignJobs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CAMPAIGN_SEQ", unique = true, nullable = false)
	public Integer getCampaignSeq() {
		return this.campaignSeq;
	}

	public void setCampaignSeq(Integer campaignSeq) {
		this.campaignSeq = campaignSeq;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "CAMPAIGN_CD", length = 20)
	public String getCampaignCd() {
		return this.campaignCd;
	}

	public void setCampaignCd(String campaignCd) {
		this.campaignCd = campaignCd;
	}

	@Column(name = "CAMPAIGN_STATUS", nullable = false, length = 10)
	public String getCampaignStatus() {
		return this.campaignStatus;
	}

	public void setCampaignStatus(String campaignStatus) {
		this.campaignStatus = campaignStatus;
	}

	@Column(name = "CAMPAIGN_TILE", nullable = false, length = 50)
	public String getCampaignTile() {
		return this.campaignTile;
	}

	public void setCampaignTile(String campaignTile) {
		this.campaignTile = campaignTile;
	}

	@Column(name = "CAMPAIGN_DESC", length = 3000)
	public String getCampaignDesc() {
		return this.campaignDesc;
	}

	public void setCampaignDesc(String campaignDesc) {
		this.campaignDesc = campaignDesc;
	}

	@Column(name = "IS_PUBLISHED", length = 1)
	public String getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(String isPublished) {
		this.isPublished = isPublished;
	}

	@Column(name = "IS_DEFAULT", columnDefinition="varchar(1) default N",  nullable = false, length = 1)
	public String getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campaign")
	public Set<JobMailer> getJobMailers() {
		return this.jobMailers;
	}

	public void setJobMailers(Set<JobMailer> jobMailers) {
		this.jobMailers = jobMailers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campaign")
	public Set<CampaignLocation> getCampaignLocations() {
		return this.campaignLocations;
	}

	public void setCampaignLocations(Set<CampaignLocation> campaignLocations) {
		this.campaignLocations = campaignLocations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campaign")
	public Set<EmplRefrl> getEmplRefrls() {
		return this.emplRefrls;
	}

	public void setEmplRefrls(Set<EmplRefrl> emplRefrls) {
		this.emplRefrls = emplRefrls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campaign")
	public Set<CampaignRecruiter> getCampaignRecruiters() {
		return this.campaignRecruiters;
	}

	public void setCampaignRecruiters(Set<CampaignRecruiter> campaignRecruiters) {
		this.campaignRecruiters = campaignRecruiters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campaign")
	public Set<CampaignJob> getCampaignJobs() {
		return this.campaignJobs;
	}

	public void setCampaignJobs(Set<CampaignJob> campaignJobs) {
		this.campaignJobs = campaignJobs;
	}


    @Column(name = "CAMPAIGN_TYPE", nullable = true, length = 10)
    public String getCampaignType() {
        return this.campaignType;
    }

    public void setCampaignType(String campaignType) {
        this.campaignType = campaignType;
    }

}