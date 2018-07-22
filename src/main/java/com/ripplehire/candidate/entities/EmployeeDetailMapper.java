package com.ripplehire.candidate.entities;

// Generated Mar 6, 2014 7:42:21 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EmployeeMstr generated by hbm2java
 */
@Entity
@Table(name = "employee_detail_mapper")
public class EmployeeDetailMapper implements java.io.Serializable {

    private Integer employeeDetailMapperSeq;
    private UserProfile userProfile;
    private int companyMstrSeq;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    private String attribute6;
    private String attribute7;
    private String attribute8;
    private String attribute9;
    private String attribute10;
    private String attribute11;
    private String attribute12;
    private String attribute13;
    private String attribute14;
    private char status;
    private int createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public EmployeeDetailMapper() {
    }

    public EmployeeDetailMapper(UserProfile userProfile, int companyMstrSeq,
                          char status, int createdBy, Date createDttm) {
        this.userProfile = userProfile;
        this.companyMstrSeq = companyMstrSeq;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    public EmployeeDetailMapper(UserProfile userProfile, int companyMstrSeq,
                          String attribute1, String attribute2, String attribute3, String attribute4, String attribute5, String attribute6,
                          String attribute7, String attribute8, String attribute9, String attribute10, String attribute11, String attribute12, String attribute13,
                          String attribute14, char status, int createdBy, Date createDttm,
                          Integer updatedBy, Date updateDttm) {
        this.userProfile = userProfile;
        this.companyMstrSeq = companyMstrSeq;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
        this.attribute5 = attribute5;
        this.attribute6 = attribute6;
        this.attribute7 = attribute7;
        this.attribute8 = attribute8;
        this.attribute9 = attribute9;
        this.attribute10 = attribute10;
        this.attribute11 = attribute11;
        this.attribute12 = attribute12;
        this.attribute13 = attribute13;
        this.attribute14 = attribute14;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "EMPLOYEE_DETAIL_MAPPER_SEQ", unique = true, nullable = false)
    public Integer getEmployeeDetailMapperSeq() {
        return this.employeeDetailMapperSeq;
    }

    public void setEmployeeDetailMapperSeq(Integer employeeDetailMapperSeq) {
        this.employeeDetailMapperSeq = employeeDetailMapperSeq;
    }

    @ManyToOne
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

    @Column(name = "ATTRIBUTE_1", length = 500)
    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    @Column(name = "ATTRIBUTE_2", length = 500)
    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    @Column(name = "ATTRIBUTE_3", length = 500)
    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    @Column(name = "ATTRIBUTE_4", length = 500)
    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    @Column(name = "ATTRIBUTE_5", length = 500)
    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    @Column(name = "ATTRIBUTE_6", length = 500)
    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    @Column(name = "ATTRIBUTE_7", length = 500)
    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    @Column(name = "ATTRIBUTE_8", length = 500)
    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    @Column(name = "ATTRIBUTE_9", length = 500)
    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    @Column(name = "ATTRIBUTE_10", length = 500)
    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    @Column(name = "ATTRIBUTE_11", length = 500)
    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }

    @Column(name = "ATTRIBUTE_12", length = 500)
    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }

    @Column(name = "ATTRIBUTE_13", length = 500)
    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }

    @Column(name = "ATTRIBUTE_14", length = 500)
    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
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

}
