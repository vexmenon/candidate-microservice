package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "interview_kit_question")
public class InterviewKitQuestion implements Serializable {
    private Integer interviewKitQuestionSeq;
    private Integer companyMstrSeq;
    private InterviewKit interviewKit;
    private InterviewFeedbackQuestions interviewFeedbackQuestions;
    private String interviewKitQuestionStatus;
    private Character status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public InterviewKitQuestion() {
    }

    public InterviewKitQuestion(Integer interviewKitQuestionSeq, Integer companyMstrSeq, InterviewKit interviewKit, InterviewFeedbackQuestions interviewFeedbackQuestions, String interviewKitQuestionStatus, Character status, Integer createdBy, Date createDttm, Integer updatedBy, Date updateDttm) {
        this.interviewKitQuestionSeq = interviewKitQuestionSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.interviewKit = interviewKit;
        this.interviewFeedbackQuestions = interviewFeedbackQuestions;
        this.interviewKitQuestionStatus = interviewKitQuestionStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
    }

    public InterviewKitQuestion(Integer interviewKitQuestionSeq, Integer companyMstrSeq, InterviewKit interviewKit, InterviewFeedbackQuestions interviewFeedbackQuestions, String interviewKitQuestionStatus, Character status, Integer createdBy, Date createDttm) {
        this.interviewKitQuestionSeq = interviewKitQuestionSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.interviewKit = interviewKit;
        this.interviewFeedbackQuestions = interviewFeedbackQuestions;
        this.interviewKitQuestionStatus = interviewKitQuestionStatus;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "INTERVIEW_KIT_QUESTION_SEQ", unique = true, nullable = false)
    public Integer getInterviewKitQuestionSeq() {
        return interviewKitQuestionSeq;
    }

    public void setInterviewKitQuestionSeq(Integer interviewKitQuestionSeq) {
        this.interviewKitQuestionSeq = interviewKitQuestionSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @OneToOne
    @JoinColumn(name = "INTERVIEW_KIT_SEQ", nullable = false)
    public InterviewKit getInterviewKit() {
        return interviewKit;
    }

    public void setInterviewKit(InterviewKit interviewKit) {
        this.interviewKit = interviewKit;
    }

    @ManyToOne
    @JoinColumn(name = "INTERVIEW_FEEDBACK_QUESTIONS_SEQ", nullable = false)
    public InterviewFeedbackQuestions getInterviewFeedbackQuestions() {
        return interviewFeedbackQuestions;
    }

    public void setInterviewFeedbackQuestions(InterviewFeedbackQuestions interviewFeedbackQuestions) {
        this.interviewFeedbackQuestions = interviewFeedbackQuestions;
    }

    @Column(name = "INTERVIEW_KIT_QUESTION_STATUS", nullable = false, length = 10)
    public String getInterviewKitQuestionStatus() {
        return interviewKitQuestionStatus;
    }

    public void setInterviewKitQuestionStatus(String interviewKitQuestionStatus) {
        this.interviewKitQuestionStatus = interviewKitQuestionStatus;
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
}
