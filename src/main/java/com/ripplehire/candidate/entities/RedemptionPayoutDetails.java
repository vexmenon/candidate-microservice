package com.ripplehire.candidate.entities;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="redemption_payout_details")
public class RedemptionPayoutDetails implements java.io.Serializable{

    private Integer redemptionPayoutDetailsSeq;
    private EmplReward emplReward;
    private Character paymentPending;
    private Date verifiedDate;
    private Date referralPaymentDate;
    private Integer verifiedBy;

    private Date disbursedInitiatedDate;
    private Integer disbursedInitiatedBy;
    private Double provisionalCoinRate;
    private Integer provisionalCoin;
    private String comments;
    private Double disbursedCoinRate;
    private Integer disbursedCoin;
    private Character status;
    private Integer createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;
    private Character type;
    private Date disbursedDate;

    //Constructor for Pending payment
    public RedemptionPayoutDetails(Date referralPaymentDate,EmplReward emplReward,Character paymentPending,Integer createdBy,Date createDttm,
                                   Character type,Date verifiedDate,Integer verifiedBy,Integer provisionalCoin,Double provisionalCoinRate){
                this.referralPaymentDate = referralPaymentDate;
                this.emplReward = emplReward;
                this.paymentPending = paymentPending;
                this.createdBy = createdBy;
                this.createDttm = createDttm;
                this.type = type;
                this.verifiedDate = verifiedDate;
                this.verifiedBy = verifiedBy;
                this.provisionalCoin = provisionalCoin;
                this.provisionalCoinRate = provisionalCoinRate;
                this.status = 'A';

    }

    //Constructor for Ready to Disburse
    public RedemptionPayoutDetails( Integer redemptionPayoutDetailsSeq,Date disbursedInitiatedDate,
                                    Integer disbursedInitiatedBy,Character type,Double provisionalCoinRate,
                                    Integer provisionalCoin,Integer updatedBy,Date updateDttm){
        this.redemptionPayoutDetailsSeq = redemptionPayoutDetailsSeq;
        this.disbursedInitiatedDate = disbursedInitiatedDate;
        this.disbursedInitiatedBy = disbursedInitiatedBy;
        this.type = type;
        this.provisionalCoinRate = provisionalCoinRate;
        this.provisionalCoin = provisionalCoin;
        this.updatedBy = updatedBy;
        this.updateDttm = updateDttm;


    }

    //Constructor for Disbursed
    public RedemptionPayoutDetails( Integer redemptionPayoutDetailsSeq,Double disbursedCoinRate,
                                    Integer disbursedCoin,String comments,Date disbursedDate,Character type,
                                    Integer updatedBy,Date updateDttm){
            this.redemptionPayoutDetailsSeq = redemptionPayoutDetailsSeq;
            this.disbursedCoinRate = disbursedCoinRate;
            this.disbursedCoin = disbursedCoin;
            this.comments = comments;
            this.disbursedDate = disbursedDate;
            this.type = type;
            this.updatedBy = updatedBy;
            this.updateDttm = updateDttm;
    }



    public RedemptionPayoutDetails(){

    }




    @Temporal(TemporalType.DATE)
    @Column(name="DISBURSED_INITIATED_DATE")
    public Date getDisbursedInitiatedDate() {
        return disbursedInitiatedDate;
    }

    public void setDisbursedInitiatedDate(Date disbursedInitiatedDate) {
        this.disbursedInitiatedDate = disbursedInitiatedDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="REFERRAL_PAYMENT_DATE")
    public Date getReferralPaymentDate() {
        return referralPaymentDate;
    }

    public void setReferralPaymentDate(Date referralPaymentDate) {
        this.referralPaymentDate = referralPaymentDate;
    }

    @Column(name="DISBURSED_INITIATED_BY")
    public Integer getDisbursedInitiatedBy() {
        return disbursedInitiatedBy;
    }

    public void setDisbursedInitiatedBy(Integer disbursedInitiatedBy) {
        this.disbursedInitiatedBy = disbursedInitiatedBy;
    }

    @Column(name="PROVISIONAL_COIN_RATE")
    public Double getProvisionalCoinRate() {
        return provisionalCoinRate;
    }

    public void setProvisionalCoinRate(Double provisionalCoinRate) {
        this.provisionalCoinRate = provisionalCoinRate;
    }

    @Column(name="PROVISIONAL_COIN")
    public Integer getProvisionalCoin() {
        return provisionalCoin;
    }

    public void setProvisionalCoin(Integer provisionalCoin) {
        this.provisionalCoin = provisionalCoin;
    }


    @Column(name="COMMENTS",length=200)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Column(name="DISBURSED_COIN_RATE")
    public Double getDisbursedCoinRate() {
        return disbursedCoinRate;
    }

    public void setDisbursedCoinRate(Double disbursedCoinRate) {
        this.disbursedCoinRate = disbursedCoinRate;
    }


    @Column(name="DISBURSED_COIN")
    public Integer getDisbursedCoin() {
        return disbursedCoin;
    }

    public void setDisbursedCoin(Integer disbursedCoin) {
        this.disbursedCoin = disbursedCoin;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "REDEMPTION_PAYOUT_DETAILS_SEQ", unique = true, nullable = false)
    public Integer getRedemptionPayoutDetailsSeq() {
        return redemptionPayoutDetailsSeq;
    }

    public void setRedemptionPayoutDetailsSeq(Integer redemptionPayoutDetailsSeq) {
        this.redemptionPayoutDetailsSeq = redemptionPayoutDetailsSeq;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPL_RWRD_SEQ", nullable = false)
    public EmplReward getEmplReward() {
        return emplReward;
    }

    public void setEmplReward(EmplReward emplReward) {
        this.emplReward = emplReward;
    }




    @Column(name="PAYMENT_PENDING",length=1)
    public Character getPaymentPending() {
        return paymentPending;
    }

    public void setPaymentPending(Character paymentPending) {
        this.paymentPending = paymentPending;
    }


    @Temporal(TemporalType.DATE)
    @Column(name="VERIFIED_DATE")
    public Date getVerifiedDate() {
        return verifiedDate;
    }

    public void setVerifiedDate(Date verifiedDate) {
        this.verifiedDate = verifiedDate;
    }

    @Column(name="VERIFIED_BY",length=50)
    public Integer getVerifiedBy() {
        return verifiedBy;
    }

    public void setVerifiedBy(Integer verifiedBy) {
        this.verifiedBy = verifiedBy;
    }



    @Column(name = "CREATED_BY", nullable = false)
    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
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

    @Column(name="TYPE",length=5)
    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DISBURSED_DATE")
    public Date getDisbursedDate() {
        return disbursedDate;
    }

    public void setDisbursedDate(Date disbursedDate) {
        this.disbursedDate = disbursedDate;
    }

    @Column(name = "STATUS", nullable = false, length = 1)
    public char getStatus() {
        return this.status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RedemptionPayoutDetails{" +
                "redemptionPayoutDetailsSeq=" + redemptionPayoutDetailsSeq +
                ", emplReward=" + emplReward +
                ", paymentPending=" + paymentPending +
                ", verifiedDate=" + verifiedDate +
                ", verifiedBy='" + verifiedBy + '\'' +
                ", createdBy=" + createdBy +
                ", createDttm=" + createDttm +
                ", updatedBy=" + updatedBy +
                ", updateDttm=" + updateDttm +
                ", disbursedInitiatedDate=" + disbursedInitiatedDate +
                ", disbursedInitiatedBy=" + disbursedInitiatedBy +
                ", provisionalCoinRate=" + provisionalCoinRate +
                ", provisionalCoin=" + provisionalCoin +
                ", comments='" + comments + '\'' +
                ", disbursedCoinRate=" + disbursedCoinRate +
                ", disbursedCoin=" + disbursedCoin +
                '}';
    }

}
