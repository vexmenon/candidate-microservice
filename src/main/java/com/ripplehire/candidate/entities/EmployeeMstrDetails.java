package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by sagar on 4/6/18.
 */
@Entity
@Table(name = "employee_mstr_details")
public class EmployeeMstrDetails implements java.io.Serializable  {

    private Integer employeeMstrDetailsSeq;
    private int companyMstrSeq;
    private String custom1;
    private String custom2;
    private String custom3;
    private String custom4;
    private String custom5;
    private String custom6;
    private String custom7;
    private String custom8;
    private String custom9;
    private String custom10;
    private String custom11;
    private String custom12;
    private String custom13;
    private String custom14;
    private String custom15;
    private String custom16;
    private String custom17;
    private String custom18;
    private String custom19;
    private String custom20;
    private String custom21;
    private String custom22;
    private String custom23;
    private String custom24;
    private String custom25;
    private String custom26;
    private String custom27;
    private String custom28;
    private String custom29;
    private String custom30;
    private char status;
    private int createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;
    private Set<EmployeeMstr> employeeMstrs = new HashSet<EmployeeMstr>(0);

    public EmployeeMstrDetails(){

    }

    public EmployeeMstrDetails(int companyMstrSeq,char status, int createdBy, Date createDttm){
        this.companyMstrSeq = companyMstrSeq;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    public EmployeeMstrDetails(int companyMstrSeq, String custom1, String custom2, String custom3,
                               String custom4, String custom5, String custom6, String custom7, String custom8,
                               String custom9, String custom10, String custom11, String custom12,
                               String custom13, String custom14, String custom15, String custom16,
                               String custom17, String custom18, String custom19, String custom20,
                               String custom21, String custom22, String custom23, String custom24,
                               String custom25, char status, int createdBy, Date createDttm,
                               Set<EmployeeMstr> employeeMstrs) {
        this.companyMstrSeq = companyMstrSeq;
        this.custom1 = custom1;
        this.custom2 = custom2;
        this.custom3 = custom3;
        this.custom4 = custom4;
        this.custom5 = custom5;
        this.custom6 = custom6;
        this.custom7 = custom7;
        this.custom8 = custom8;
        this.custom9 = custom9;
        this.custom10 = custom10;
        this.custom11 = custom11;
        this.custom12 = custom12;
        this.custom13 = custom13;
        this.custom14 = custom14;
        this.custom15 = custom15;
        this.custom16 = custom16;
        this.custom17 = custom17;
        this.custom18 = custom18;
        this.custom19 = custom19;
        this.custom20 = custom20;
        this.custom21 = custom21;
        this.custom22 = custom22;
        this.custom23 = custom23;
        this.custom24 = custom24;
        this.custom25 = custom25;this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
        this.employeeMstrs = employeeMstrs;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "EMPLOYEE_MSTR_DETAILS_SEQ", unique = true, nullable = false)
    public Integer getEmployeeMstrDetailsSeq() {
        return employeeMstrDetailsSeq;
    }

    public void setEmployeeMstrDetailsSeq(Integer employeeMstrDetailsSeq) {
        this.employeeMstrDetailsSeq = employeeMstrDetailsSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public int getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(int companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "CUSTOM1", length = 50)
    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1;
    }

    @Column(name = "CUSTOM2", length = 50)
    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2;
    }

    @Column(name = "CUSTOM3", length = 50)
    public String getCustom3() {
        return custom3;
    }

    public void setCustom3(String custom3) {
        this.custom3 = custom3;
    }

    @Column(name = "CUSTOM4", length = 50)
    public String getCustom4() {
        return custom4;
    }

    public void setCustom4(String custom4) {
        this.custom4 = custom4;
    }

    @Column(name = "CUSTOM5", length = 50)
    public String getCustom5() {
        return custom5;
    }

    public void setCustom5(String custom5) {
        this.custom5 = custom5;
    }

    @Column(name = "CUSTOM6", length = 50)
    public String getCustom6() {
        return custom6;
    }

    public void setCustom6(String custom6) {
        this.custom6 = custom6;
    }

    @Column(name = "CUSTOM7", length = 50)
    public String getCustom7() {
        return custom7;
    }

    public void setCustom7(String custom7) {
        this.custom7 = custom7;
    }

    @Column(name = "CUSTOM8", length = 50)
    public String getCustom8() {
        return custom8;
    }

    public void setCustom8(String custom8) {
        this.custom8 = custom8;
    }

    @Column(name = "CUSTOM9", length = 50)
    public String getCustom9() {
        return custom9;
    }

    public void setCustom9(String custom9) {
        this.custom9 = custom9;
    }

    @Column(name = "CUSTOM10", length = 50)
    public String getCustom10() {
        return custom10;
    }

    public void setCustom10(String custom10) {
        this.custom10 = custom10;
    }

    @Column(name = "CUSTOM11", length = 50)
    public String getCustom11() {
        return custom11;
    }

    public void setCustom11(String custom11) {
        this.custom11 = custom11;
    }

    @Column(name = "CUSTOM12", length = 50)
    public String getCustom12() {
        return custom12;
    }

    public void setCustom12(String custom12) {
        this.custom12 = custom12;
    }

    @Column(name = "CUSTOM13", length = 50)
    public String getCustom13() {
        return custom13;
    }

    public void setCustom13(String custom13) {
        this.custom13 = custom13;
    }

    @Column(name = "CUSTOM14", length = 50)
    public String getCustom14() {
        return custom14;
    }

    public void setCustom14(String custom14) {
        this.custom14 = custom14;
    }

    @Column(name = "CUSTOM15", length = 50)
    public String getCustom15() {
        return custom15;
    }

    public void setCustom15(String custom15) {
        this.custom15 = custom15;
    }

    @Column(name = "CUSTOM16", length = 50)
    public String getCustom16() {
        return custom16;
    }

    public void setCustom16(String custom16) {
        this.custom16 = custom16;
    }

    @Column(name = "CUSTOM17", length = 50)
    public String getCustom17() {
        return custom17;
    }

    public void setCustom17(String custom17) {
        this.custom17 = custom17;
    }

    @Column(name = "CUSTOM18", length = 50)
    public String getCustom18() {
        return custom18;
    }

    public void setCustom18(String custom18) {
        this.custom18 = custom18;
    }

    @Column(name = "CUSTOM19", length = 50)
    public String getCustom19() {
        return custom19;
    }

    public void setCustom19(String custom19) {
        this.custom19 = custom19;
    }

    @Column(name = "CUSTOM20", length = 50)
    public String getCustom20() {
        return custom20;
    }

    public void setCustom20(String custom20) {
        this.custom20 = custom20;
    }

    @Column(name = "CUSTOM21", length = 50)
    public String getCustom21() {
        return custom21;
    }

    public void setCustom21(String custom21) {
        this.custom21 = custom21;
    }

    @Column(name = "CUSTOM22", length = 50)
    public String getCustom22() {
        return custom22;
    }

    public void setCustom22(String custom22) {
        this.custom22 = custom22;
    }

    @Column(name = "CUSTOM23", length = 50)
    public String getCustom23() {
        return custom23;
    }

    public void setCustom23(String custom23) {
        this.custom23 = custom23;
    }

    @Column(name = "CUSTOM24", length = 50)
    public String getCustom24() {
        return custom24;
    }

    public void setCustom24(String custom24) {
        this.custom24 = custom24;
    }

    @Column(name = "CUSTOM25", length = 50)
    public String getCustom25() {
        return custom25;
    }

    public void setCustom25(String custom25) {
        this.custom25 = custom25;
    }

    @Column(name = "CUSTOM26", length = 50)
    public String getCustom26() {
        return custom26;
    }

    public void setCustom26(String custom26) {
        this.custom26 = custom26;
    }

    @Column(name = "CUSTOM27", length = 50)
    public String getCustom27() {
        return custom27;
    }

    public void setCustom27(String custom27) {
        this.custom27 = custom27;
    }

    @Column(name = "CUSTOM28", length = 50)
    public String getCustom28() {
        return custom28;
    }

    public void setCustom28(String custom28) {
        this.custom28 = custom28;
    }

    @Column(name = "CUSTOM29", length = 50)
    public String getCustom29() {
        return custom29;
    }

    public void setCustom29(String custom29) {
        this.custom29 = custom29;
    }

    @Column(name = "CUSTOM30", length = 50)
    public String getCustom30() {
        return custom30;
    }

    public void setCustom30(String custom30) {
        this.custom30 = custom30;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeMstrDetails")
    public Set<EmployeeMstr> getEmployeeMstrs() {
        return this.employeeMstrs;
    }

    public void setEmployeeMstrs(Set<EmployeeMstr> employeeMstrs) {
        this.employeeMstrs = employeeMstrs;
    }
}
