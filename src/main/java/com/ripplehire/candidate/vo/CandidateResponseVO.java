package com.ripplehire.candidate.vo;

public class CandidateResponseVO implements java.io.Serializable{
    private String salutation;
    private String firstName;
    private String lastName;
    private String emailId;
    private String phone;
    private String alternatePhone;
    private JobVO job;

    public CandidateResponseVO() {
    }

    public CandidateResponseVO(String salutation, String firstName, String lastName, String emailId, String phone, String alternatePhone) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.phone = phone;
        this.alternatePhone = alternatePhone;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAlternatePhone() {
        return alternatePhone;
    }

    public void setAlternatePhone(String alternatePhone) {
        this.alternatePhone = alternatePhone;
    }

    public JobVO getJob() {
        return job;
    }

    public void setJob(JobVO job) {
        this.job = job;
    }
}
