package com.ripplehire.candidate.entities;

// Generated May 10, 2014 6:09:08 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * CurrencyMstr generated by hbm2java
 */
@Entity
@Table(name = "company_info")
public class CompanyInfo implements java.io.Serializable {

	private Integer companyInfoSeq;
	private String title;
	private String aboutUs;
	private String galleryImages;
	private String candidateLogoImage;
    private String candidateBackgroundImage;
    private String colour1;
    private String colour2;
    private String colour3;
    private String colour4;
    private Character viewPoweredByRipplehire;
	private Character status;
	private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;
    private int companyMstrSeq;

	public CompanyInfo() {
	}

    public CompanyInfo(String title, String aboutUs, String galleryImages, String candidateLogoImage, String candidateBackgroundImage, String colour1, String colour2, String colour3, String colour4, Character viewPoweredByRipplehire, Character status, int createdBy, Date createDttm, Integer updatedBy, Date updateDttm, int companyMstrSeq) {
        this.title = title;
        this.aboutUs = aboutUs;
        this.galleryImages = galleryImages;
        this.candidateLogoImage = candidateLogoImage;
        this.candidateBackgroundImage = candidateBackgroundImage;
        this.colour1 = colour1;
        this.colour2 = colour2;
        this.colour3 = colour3;
        this.colour4 = colour4;
        this.viewPoweredByRipplehire = viewPoweredByRipplehire;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
        this.companyMstrSeq = companyMstrSeq;
    }

    @Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "COMPANY_INFO_SEQ", unique = true, nullable = false)
	public Integer getCompanyInfoSeq() {
		return this.companyInfoSeq;
	}

	public void setCompanyInfoSeq(Integer companyInfoSeq) {
		this.companyInfoSeq = companyInfoSeq;
	}

	@Column(name = "TITLE", nullable = false, length = 50)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

    @Column(name = "ABOUT_US", nullable = false, length = 5000)
    public String getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs;
    }

    @Column(name = "GALLERY_IMAGES", nullable = false, length = 500)
    public String getGalleryImages() {
        return galleryImages;
    }

    public void setGalleryImages(String galleryImages) {
        this.galleryImages = galleryImages;
    }

    @Column(name = "CANDIDATE_LOGO_IMAGE", nullable = false, length = 50)
    public String getCandidateLogoImage() {
        return candidateLogoImage;
    }

    public void setCandidateLogoImage(String candidateLogoImage) {
        this.candidateLogoImage = candidateLogoImage;
    }

    @Column(name = "CANDIDATE_BACKGROUND_IMAGE", nullable = false, length = 50)
    public String getCandidateBackgroundImage() {
        return candidateBackgroundImage;
    }

    public void setCandidateBackgroundImage(String candidateBackgroundImage) {
        this.candidateBackgroundImage = candidateBackgroundImage;
    }

    @Column(name = "COLOUR_1", length = 20)
    public String getColour1() {
        return colour1;
    }

    public void setColour1(String colour1) {
        this.colour1 = colour1;
    }

    @Column(name = "COLOUR_2", length = 20)
    public String getColour2() {
        return colour2;
    }

    public void setColour2(String colour2) {
        this.colour2 = colour2;
    }

    @Column(name = "COLOUR_3", length = 20)
    public String getColour3() {
        return colour3;
    }

    public void setColour3(String colour3) {
        this.colour3 = colour3;
    }

    @Column(name = "COLOUR_4", length = 20)
    public String getColour4() {
        return colour4;
    }

    public void setColour4(String colour4) {
        this.colour4 = colour4;
    }

    @Column(name = "VIEW_POWERED_BY_RIPPLEHIRE", length = 1)
    public Character getViewPoweredByRipplehire() {
        return this.viewPoweredByRipplehire;
    }

    public void setViewPoweredByRipplehire(Character viewPoweredByRipplehire) {
        this.viewPoweredByRipplehire = viewPoweredByRipplehire;
    }

    @Column(name = "STATUS", length = 1)
	public Character getStatus() {
		return this.status;
	}

	public void setStatus(Character status) {
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

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public int getCompanyMstrSeq() {
        return this.companyMstrSeq;
    }

    public void setCompanyMstrSeq(int companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

}
