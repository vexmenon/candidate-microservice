package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "interview_kit")
public class InterviewKit implements Serializable {
    private Integer interviewKitSeq;
    private Integer companyMstrSeq;
    private String title;
    private String description;
    private String kitType;
    private String kitStatus;
    private Character status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;
    private Set<InterviewKitTag> interviewKitTags = new HashSet<InterviewKitTag>(0);
    private Set<InterviewKitStage> interviewKitStages = new HashSet<InterviewKitStage>(0);
    private Set<InterviewKitJobStage> interviewKitJobStages = new HashSet<InterviewKitJobStage>(0);
    private Set<InterviewKitInterviewMap> interviewKitInterviewMap = new HashSet<InterviewKitInterviewMap>(0);
    private Set<InterviewKitQuestion> interviewKitQuestion = new HashSet<InterviewKitQuestion>(0);
    ;

    public InterviewKit() {
    }


    public InterviewKit(Integer interviewKitSeq, Integer companyMstrSeq, String title, String kitType, String kitStatus, Character status, Integer createdBy, Date createDttm) {
        this.interviewKitSeq = interviewKitSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.title = title;
        this.kitType = kitType;
        this.kitStatus = kitStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    public InterviewKit(Integer interviewKitSeq, Integer companyMstrSeq, String title, String description, String kitType, String kitStatus, Character status, Integer createdBy, Date createDttm, Integer updatedBy, Date updateDttm, Set<InterviewKitTag> interviewKitTags, Set<InterviewKitStage> interviewKitStages, Set<InterviewKitJobStage> interviewKitJobStages, Set<InterviewKitInterviewMap> interviewKitInterviewMap, Set<InterviewKitQuestion> interviewKitQuestion) {
        this.interviewKitSeq = interviewKitSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.title = title;
        this.description = description;
        this.kitType = kitType;
        this.kitStatus = kitStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
        this.interviewKitTags = interviewKitTags;
        this.interviewKitStages = interviewKitStages;
        this.interviewKitJobStages = interviewKitJobStages;
        this.interviewKitInterviewMap = interviewKitInterviewMap;
        this.interviewKitQuestion = interviewKitQuestion;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "INTERVIEW_KIT_SEQ", unique = true, nullable = false)
    public Integer getInterviewKitSeq() {
        return interviewKitSeq;
    }

    public void setInterviewKitSeq(Integer interviewKitSeq) {
        this.interviewKitSeq = interviewKitSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "TITLE", nullable = false, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "DESCRIPTION", nullable = false, length = 300)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "KIT_TYPE", nullable = false, length = 50)
    public String getKitType() {
        return kitType;
    }

    public void setKitType(String kitType) {
        this.kitType = kitType;
    }

    @Column(name = "KIT_STATUS", nullable = false, length = 10)
    public String getKitStatus() {
        return kitStatus;
    }

    public void setKitStatus(String kitStatus) {
        this.kitStatus = kitStatus;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewKit")
    public Set<InterviewKitTag> getInterviewKitTags() {
        return interviewKitTags;
    }

    public void setInterviewKitTags(Set<InterviewKitTag> interviewKitTags) {
        this.interviewKitTags = interviewKitTags;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewKit")
    public Set<InterviewKitStage> getInterviewKitStages() {
        return interviewKitStages;
    }

    public void setInterviewKitStages(Set<InterviewKitStage> interviewKitStages) {
        this.interviewKitStages = interviewKitStages;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewKit")
    public Set<InterviewKitJobStage> getInterviewKitJobStages() {
        return interviewKitJobStages;
    }

    public void setInterviewKitJobStages(Set<InterviewKitJobStage> interviewKitJobStages) {
        this.interviewKitJobStages = interviewKitJobStages;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewKit")
    public Set<InterviewKitInterviewMap> getInterviewKitInterviewMap() {
        return interviewKitInterviewMap;
    }

    public void setInterviewKitInterviewMap(Set<InterviewKitInterviewMap> interviewKitInterviewMap) {
        this.interviewKitInterviewMap = interviewKitInterviewMap;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "interviewKit")
    public Set<InterviewKitQuestion> getInterviewKitQuestion() {
        return interviewKitQuestion;
    }

    public void setInterviewKitQuestion(Set<InterviewKitQuestion> interviewKitQuestion) {
        this.interviewKitQuestion = interviewKitQuestion;
    }
}
