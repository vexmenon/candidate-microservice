package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "task_type_mstr")
public class TaskTypeMstr {
    private int taskTypeMstrSeq;
    private int companyMstrSeq;
    private int createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;
    private String taskTypeCD;
    private String taskType;
    private char status;
    private Set<TaskDetails> taskDetailsSet = new HashSet<>();

    public TaskTypeMstr() {
    }

    public TaskTypeMstr(int taskTypeMstrSeq, int companyMstrSeq, int createdBy, Date createDttm, String taskTypeCD, String taskType, char status) {
        this.taskTypeMstrSeq = taskTypeMstrSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.taskTypeCD = taskTypeCD;
        this.taskType = taskType;
        this.status = status;
    }

    public TaskTypeMstr(int taskTypeMstrSeq, int companyMstrSeq, int createdBy, Date createDttm, Integer updatedBy,
                        Date updateDttm, String taskTypeCD, String taskType, char status, Set<TaskDetails> taskDetailsSet) {
        this.taskTypeMstrSeq = taskTypeMstrSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
        this.taskTypeCD = taskTypeCD;
        this.taskType = taskType;
        this.status = status;
        this.taskDetailsSet = taskDetailsSet;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "TASK_TYPE_MSTR_SEQ", unique = true, nullable = false)
    public int getTaskTypeMstrSeq() {
        return taskTypeMstrSeq;
    }

    public void setTaskTypeMstrSeq(int taskTypeMstrSeq) {
        this.taskTypeMstrSeq = taskTypeMstrSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public int getCompanyMstrSeq() {
        return this.companyMstrSeq;
    }

    public void setCompanyMstrSeq(int companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
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

    @Column(name = "TASK_TYPE_CD", length = 10, nullable = false)
    public String getTaskTypeCD() {
        return taskTypeCD;
    }

    public void setTaskTypeCD(String taskTypeCD) {
        this.taskTypeCD = taskTypeCD;
    }

    @Column(name = "TASK_TYPE", length = 15, nullable = false)
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    @Column(name = "STATUS", length = 1, nullable = false)
    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "taskTypeMstr")
    public Set<TaskDetails> getTaskDetailsSet() {
        return taskDetailsSet;
    }

    public void setTaskDetailsSet(Set<TaskDetails> taskDetailsSet) {
        this.taskDetailsSet = taskDetailsSet;
    }
}
