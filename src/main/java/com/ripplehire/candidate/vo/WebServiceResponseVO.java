package com.ripplehire.candidate.vo;

public class WebServiceResponseVO implements java.io.Serializable{

    private boolean isSuccess;
    private Integer responseCode;
    private String responseMessage;

    public WebServiceResponseVO() {
    }

    public WebServiceResponseVO(boolean isSuccess,Integer responseCode, String responseMessage) {
        this.isSuccess = isSuccess;
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
