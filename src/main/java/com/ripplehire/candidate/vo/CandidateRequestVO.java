package com.ripplehire.candidate.vo;




public class CandidateRequestVO implements java.io.Serializable{


    private String ripplehireId;

    private Integer companyMstrSeq;

    private Integer emplRefrlSeq;

    public CandidateRequestVO() {
    }

    public CandidateRequestVO(String ripplehireId, Integer companyMstrSeq) {
        this.ripplehireId = ripplehireId;
        this.companyMstrSeq = companyMstrSeq;
    }

    public CandidateRequestVO(Integer companyMstrSeq,Integer emplRefrlSeq) {
        this.companyMstrSeq = companyMstrSeq;
        this.emplRefrlSeq = emplRefrlSeq;
    }

    public String getRipplehireId() {
        return ripplehireId;
    }

    public void setRipplehireId(String ripplehireId) {
        this.ripplehireId = ripplehireId;
    }

    public Integer getCompanyMstrSeq() {
        return companyMstrSeq;
    }

    public void setCompanyMstrSeq(Integer companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    public Integer getEmplRefrlSeq() {
        return emplRefrlSeq;
    }

    public void setEmplRefrlSeq(Integer emplRefrlSeq) {
        this.emplRefrlSeq = emplRefrlSeq;
    }
}
