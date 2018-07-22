package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "report_mstr")
public class ReportMstr implements java.io.Serializable {

	private Integer reportMstrSeq;
	private Integer companyMstrSeq;
	private String reportCd;
	private String implClass;
	private String title;
    private String desc;
    private Integer type;
    private Integer parentMstrSeq;
    private Integer priority;
	private String colour;
	private String circleColour;
	private String logo;
	private String dimensionCd;
	private String dimensionTitle;
	private String nextDimensionCd;
	private String showInView;
	private Character status;
	private Integer createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;
	private Integer subMenuParentSeq;

	public ReportMstr() {
	}


	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "REPORT_MSTR_SEQ", unique = true, nullable = false)
    public Integer getReportMstrSeq() {
        return reportMstrSeq;
    }

    public void setReportMstrSeq(Integer reportMstrSeq) {
        this.reportMstrSeq = reportMstrSeq;
    }


	@Column(name = "COMPANY_MSTR_SEQ")
	public Integer getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(Integer companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

    @Column(name = "TITLE", length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "DESC", length = 200)
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Column(name = "TYPE")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Column(name = "PARENT_MSTR_SEQ")
    public Integer getParentMstrSeq() {
        return parentMstrSeq;
    }

    public void setParentMstrSeq(Integer parentMstrSeq) {
        this.parentMstrSeq = parentMstrSeq;
    }

    @Column(name = "PRIORITY")
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Column(name = "STATUS", length = 1)
	public Character getStatus() {
		return this.status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	@Column(name = "CREATED_BY")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DTTM", length = 19)
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

	@Column(name = "REPORT_CD", length = 50)
	public String getReportCd() {
		return reportCd;
	}

	public void setReportCd(String reportCd) {
		this.reportCd = reportCd;
	}

	@Column(name = "IMPL_CLASS", length = 50)
	public String getImplClass() {
		return implClass;
	}

	public void setImplClass(String implClass) {
		this.implClass = implClass;
	}

	@Column(name = "COLOUR", length = 50)
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Column(name = "CIRCLE_COLOUR", length = 50)
	public String getCircleColour() {
		return circleColour;
	}

	public void setCircleColour(String circleColour) {
		this.circleColour = circleColour;
	}

	@Column(name = "LOGO", length = 50)
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Column(name = "DIMENSION_CD", length = 50)
	public String getDimensionCd() {
		return this.dimensionCd;
	}

	public void setDimensionCd(String dimensionCd) {
		this.dimensionCd = dimensionCd;
	}

	@Column(name = "NEXT_DIMENSION_CD", length = 50)
	public String getNextDimensionCd() {
		return this.nextDimensionCd;
	}

	public void setNextDimensionCd(String nextDimensionCd) {
		this.nextDimensionCd = nextDimensionCd;
	}

	@Column(name = "SHOW_IN_VIEW", length = 1)
	public String getShowInView() {
		return this.showInView;
	}

	public void setShowInView(String showInView) {
		this.showInView = showInView;
	}

	@Column(name = "DIMENSION_TITLE", length = 100)
	public String getDimensionTitle() {
		return this.dimensionTitle;
	}

	public void setDimensionTitle(String dimensionTitle) {
		this.dimensionTitle = dimensionTitle;
	}

	@Column(name = "SUBMENU_PARENT_SEQ")
	public Integer getSubMenuParentSeq() {
		return subMenuParentSeq;
	}

	public void setSubMenuParentSeq(Integer subMenuParentSeq) {
		this.subMenuParentSeq = subMenuParentSeq;
	}
}
