package com.ripplehire.candidate.entities;

/**
 * Created by nikesh on 2/6/16.
 */
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

@Entity
@Table(name = "job_channel_mstr")
public class JobChannelMstr implements java.io.Serializable{
    private Integer jobChannelMstrSeq;
    private int jobSeq;
    private String channelType;
    private String channelSpecific;
    private int channelLimit;
    private char status;
    private int createdBy;
    private Date createdDttm;
    private Integer updatedBy;
    private Date updatedDttm;

    public JobChannelMstr() {
    }

    public JobChannelMstr(int jobSeq, int channelLimit) {
        this.jobSeq = jobSeq;
        this.channelLimit = channelLimit;
    }

    public JobChannelMstr(int jobSeq, String channelType, String channelSpecific, int channelLimit,
                          char status, int createdBy,
                          Date createdDttm, Integer updatedBy, Date updatedDttm) {
        this.jobSeq = jobSeq;
        this.channelType = channelType;
        this.channelSpecific = channelSpecific;
        this.channelLimit = channelLimit;
        this.status = status;
        this.createdBy = createdBy;
        this.createdDttm = createdDttm;
        this.updatedBy = updatedBy;
        this.updatedDttm = updatedDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "JOB_CHANNEL_MSTR_SEQ", unique = true, nullable = false)
    public Integer getJobChannelMstrSeq() {
        return this.jobChannelMstrSeq;
    }

    public void setJobChannelMstrSeq(Integer jobChannelMstrSeq) {
        this.jobChannelMstrSeq = jobChannelMstrSeq;
    }

    @Column(name = "JOB_SEQ", nullable = false)
    public int getJobSeq() {
        return this.jobSeq;
    }

    public void setJobSeq(int jobSeq) {
        this.jobSeq = jobSeq;
    }

    @Column(name = "CHANNEL_TYPE", length = 50)
    public String getChannelType() {
        return this.channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    @Column(name = "CHANNEL_SPECIFIC", length = 50)
    public String getChannelSpecific() {
        return this.channelSpecific;
    }

    public void setChannelSpecific(String channelSpecific) {
        this.channelSpecific = channelSpecific;
    }

    @Column(name = "CHANNEL_LIMIT", nullable = false)
    public int getChannelLimit() {
        return this.channelLimit;
    }

    public void setChannelLimit(int channelLimit) {
        this.channelLimit = channelLimit;
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
    @Column(name = "CREATED_DTTM", nullable = false, length = 19)
    public Date getCreatedDttm() {
        return this.createdDttm;
    }

    public void setCreatedDttm(Date createdDttm) {
        this.createdDttm = createdDttm;
    }

    @Column(name = "UPDATED_BY")
    public Integer getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_DTTM", length = 19)
    public Date getUpdateDttm() {
        return this.updatedDttm;
    }

    public void setUpdateDttm(Date updatedDttm) {
        this.updatedDttm = updatedDttm;
    }

}
