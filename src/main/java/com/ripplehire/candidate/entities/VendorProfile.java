package com.ripplehire.candidate.entities;

// Generated Aug 10, 2015 4:05:11 PM by Hibernate Tools 4.0.0

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
 * VendorProfile generated by hbm2java
 */
@Entity
@Table(name = "vendor_profile")
public class VendorProfile implements java.io.Serializable {

	private Integer vendorProfileSeq;
	private VendorMstr vendorMstr;
	private UserProfile userProfile;
	private int companyMstrSeq;
	private String vendorEmailId;
	private String vendorPhoneNo;
	private char status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;
	private Set<CandidateResumedetails> candidateResumedetailses = new HashSet<CandidateResumedetails>(
			0);

	public VendorProfile() {
	}

	public VendorProfile(VendorMstr vendorMstr, int companyMstrSeq,
						 char status, int createdBy, Date createDttm) {
		this.vendorMstr = vendorMstr;
		this.companyMstrSeq = companyMstrSeq;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public VendorProfile(VendorMstr vendorMstr, UserProfile userProfile, int companyMstrSeq,
						 String vendorEmailId, String vendorPhoneNo, char status, int createdBy, Date createDttm,
						 Integer updatedBy, Date updateDttm,
						 Set<CandidateResumedetails> candidateResumedetailses) {
		this.vendorMstr = vendorMstr;
		this.userProfile = userProfile;
		this.companyMstrSeq = companyMstrSeq;
		this.vendorEmailId = vendorEmailId;
		this.vendorPhoneNo = vendorPhoneNo;
		this.status = status;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
		this.candidateResumedetailses = candidateResumedetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "VENDOR_PROFILE_SEQ", unique = true, nullable = false)
	public Integer getVendorProfileSeq() {
		return this.vendorProfileSeq;
	}

	public void setVendorProfileSeq(Integer vendorProfileSeq) {
		this.vendorProfileSeq = vendorProfileSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VENDOR_MSTR_SEQ", nullable = false)
	public VendorMstr getVendorMstr() {
		return this.vendorMstr;
	}

	public void setVendorMstr(VendorMstr vendorMstr) {
		this.vendorMstr = vendorMstr;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_PROFILE_SEQ", nullable = false)
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "VENDOR_EMAIL_ID", length = 100)
	public String getVendorEmailId() {
		return this.vendorEmailId;
	}

	public void setVendorEmailId(String vendorEmailId) {
		this.vendorEmailId = vendorEmailId;
	}

	@Column(name = "VENDOR_PHONE_NO", length = 20)
	public String getVendorPhoneNo() {
		return vendorPhoneNo;
	}

	public void setVendorPhoneNo(String vendorPhoneNo) {
		this.vendorPhoneNo = vendorPhoneNo;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vendorProfile")
	public Set<CandidateResumedetails> getCandidateResumedetailses() {
		return this.candidateResumedetailses;
	}

	public void setCandidateResumedetailses(
			Set<CandidateResumedetails> candidateResumedetailses) {
		this.candidateResumedetailses = candidateResumedetailses;
	}

}
