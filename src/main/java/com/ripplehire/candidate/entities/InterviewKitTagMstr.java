package com.ripplehire.candidate.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "interview_kit_tag_mstr")
public class InterviewKitTagMstr implements Serializable {
    private Integer interviewKitTagMstrSeq;
    private Integer companyMstrSeq;
    private String tagTitle;
    private String tagCD;
    private String tagStatus;
    private Character status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;
    private Set<InterviewKitTag> interviewKitTags = new HashSet<InterviewKitTag>(0);

    public InterviewKitTagMstr() {
    }

    public InterviewKitTagMstr(Integer interviewKitTagMstrSeq, Integer companyMstrSeq, String tagTitle, String tagCD, String tagStatus, Character status, Integer createdBy, Date createDttm, Integer updatedBy, Date updateDttm, Set<InterviewKitTag> interviewKitTags) {
        this.interviewKitTagMstrSeq = interviewKitTagMstrSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.tagTitle = tagTitle;
        this.tagCD = tagCD;
        this.tagStatus = tagStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
        this.interviewKitTags = interviewKitTags;
    }

    public InterviewKitTagMstr(Integer interviewKitTagMstrSeq, Integer companyMstrSeq, String tagTitle, String tagCD, String tagStatus, Character status, Integer createdBy, Date createDttm) {
        this.interviewKitTagMstrSeq = interviewKitTagMstrSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.tagTitle = tagTitle;
        this.tagCD = tagCD;
        this.tagStatus = tagStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "INTERVIEW_KIT_TAG_MSTR_SEQ", unique = true, nullable = false)
    public Integer getInterviewKitTagMstrSeq() {
        return interviewKitTagMstrSeq;
    }

    public void setInterviewKitTagMstrSeq(Integer interviewKitTagMstrSeq) {
        this.interviewKitTagMstrSeq = interviewKitTagMstrSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "TAG_TITLE", nullable = false, length = 50)
    public String getTagTitle() {
        return tagTitle;
    }

    public void setTagTitle(String tagTitle) {
        this.tagTitle = tagTitle;
    }

    @Column(name = "TAG_CD", nullable = false, length = 50)
    public String getTagCD() {
        return tagCD;
    }

    public void setTagCD(String tagCD) {
        this.tagCD = tagCD;
    }

    @Column(name = "TAG_STATUS", nullable = false, length = 10)
    public String getTagStatus() {
        return tagStatus;
    }

    public void setTagStatus(String tagStatus) {
        this.tagStatus = tagStatus;
    }

    @Column(name = "STATUS", nullable = false, length = 1)
    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Column(name = "CREATED_BY", nullable = false)
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DTTM", nullable = false, length = 19)
    public Date getCreateDttm() {
        return createDttm;
    }

    public void setCreateDttm(Date createDttm) {
        this.createDttm = createDttm;
    }

    @Column(name = "UPDATED_BY")
    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DTTM", length = 19)
    public Date getUpdateDttm() {
        return updateDttm;
    }

    public void setUpdateDttm(Date updateDttm) {
        this.updateDttm = updateDttm;
    }

    @OneToMany(mappedBy = "interviewKitTagMstr")
    public Set<InterviewKitTag> getInterviewKitTags() {
        return interviewKitTags;
    }

    public void setInterviewKitTags(Set<InterviewKitTag> interviewKitTags) {
        this.interviewKitTags = interviewKitTags;
    }
}
