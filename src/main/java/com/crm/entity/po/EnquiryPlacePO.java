package com.crm.entity.po;

import java.util.Date;

public class EnquiryPlacePO {
    private String id;

    private String productName;

    private String productCode;

    private String departName;

    private String destinationName;

    private String inspection;

    private String importsExports;

    private String transportationType;

    private Date sendTime;

    private String remark;

    private String userName;

    private Date enquiryTime;

    private Integer status;

    private Integer enquiryOrderNum;

    private Integer originalPrice;

    private Integer changePrice;

    private String transportationId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName == null ? null : destinationName.trim();
    }

    public String getInspection() {
        return inspection;
    }

    public void setInspection(String inspection) {
        this.inspection = inspection == null ? null : inspection.trim();
    }

    public String getImportsExports() {
        return importsExports;
    }

    public void setImportsExports(String importsExports) {
        this.importsExports = importsExports == null ? null : importsExports.trim();
    }

    public String getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(String transportationType) {
        this.transportationType = transportationType == null ? null : transportationType.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getEnquiryTime() {
        return enquiryTime;
    }

    public void setEnquiryTime(Date enquiryTime) {
        this.enquiryTime = enquiryTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEnquiryOrderNum() {
        return enquiryOrderNum;
    }

    public void setEnquiryOrderNum(Integer enquiryOrderNum) {
        this.enquiryOrderNum = enquiryOrderNum;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(Integer changePrice) {
        this.changePrice = changePrice;
    }

    public String getTransportationId() {
        return transportationId;
    }

    public void setTransportationId(String transportationId) {
        this.transportationId = transportationId == null ? null : transportationId.trim();
    }
}