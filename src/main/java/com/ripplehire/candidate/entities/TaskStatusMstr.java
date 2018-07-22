package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "task_status_mstr")
public class TaskStatusMstr {
    private int taskStatusMstrSeq;
    private int companyMstrSeq;
    private int createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;
    private String taskCD;
    private String taskStatus;
    private char status;
    private Set<TaskDetails> taskDetailsSet = new HashSet<>();

    public TaskStatusMstr() {
    }

    public TaskStatusMstr(int taskStatusMstrSeq, int companyMstrSeq, int createdBy, Date createDttm, String taskCD, String taskStatus, char status) {
        this.taskStatusMstrSeq = taskStatusMstrSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.taskCD = taskCD;
        this.taskStatus = taskStatus;
        this.status = status;
    }

    public TaskStatusMstr(int taskStatusMstrSeq, int companyMstrSeq, int createdBy, Date createDttm, Integer updatedBy, Date updateDttm, String taskCD,
                          String taskStatus, char status, Set<TaskDetails> taskDetailsSet) {
        this.taskStatusMstrSeq = taskStatusMstrSeq;
        this.companyMstrSeq = companyMstrSeq;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
        this.taskCD = taskCD;
        this.taskStatus = taskStatus;
        this.status = status;
        this.taskDetailsSet = taskDetailsSet;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "TASK_STATUS_MSTR_SEQ", unique = true, nullable = false)
    public int getTaskStatusMstrSeq() {
        return taskStatusMstrSeq;
    }

    public void setTaskStatusMstrSeq(int taskStatusMstrSeq) {
        this.taskStatusMstrSeq = taskStatusMstrSeq;
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

    @Column(name = "TASK_CD", length = 10, nullable = false)
    public String getTaskCD() {
        return taskCD;
    }

    public void setTaskCD(String taskCD) {
        this.taskCD = taskCD;
    }

    @Column(name = "TASK_STATUS", length = 15, nullable = false)
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Column(name = "STATUS", length = 1, nullable = false)
    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "taskStatusMstr")
    public Set<TaskDetails> getTaskDetailsSet() {
        return taskDetailsSet;
    }

    public void setTaskDetailsSet(Set<TaskDetails> taskDetailsSet) {
        this.taskDetailsSet = taskDetailsSet;
    }
}
