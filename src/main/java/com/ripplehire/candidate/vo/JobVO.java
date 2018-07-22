package com.ripplehire.candidate.vo;

public class JobVO implements java.io.Serializable{

    private String jobSeq;
    private String jobCd;
    private String jobTitle;
    private String reqExpMin;
    private String reqExpMax;
    private String location;
    private String noOfOpenings;

    public JobVO() {
    }

    public JobVO(String jobSeq,String jobCd,String jobTitle, String reqExpMin, String reqExpMax, String location, String noOfOpenings) {
        this.jobSeq = jobSeq;
        this.jobCd = jobCd;
        this.jobTitle = jobTitle;
        this.reqExpMin = reqExpMin;
        this.reqExpMax = reqExpMax;
        this.location = location;
        this.noOfOpenings = noOfOpenings;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getReqExpMin() {
        return reqExpMin;
    }

    public void setReqExpMin(String reqExpMin) {
        this.reqExpMin = reqExpMin;
    }

    public String getReqExpMax() {
        return reqExpMax;
    }

    public void setReqExpMax(String reqExpMax) {
        this.reqExpMax = reqExpMax;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNoOfOpenings() {
        return noOfOpenings;
    }

    public void setNoOfOpenings(String noOfOpenings) {
        this.noOfOpenings = noOfOpenings;
    }

    public String getJobSeq() {
        return jobSeq;
    }

    public void setJobSeq(String jobSeq) {
        this.jobSeq = jobSeq;
    }

    public String getJobCd() {
        return jobCd;
    }

    public void setJobCd(String jobCd) {
        this.jobCd = jobCd;
    }
}
