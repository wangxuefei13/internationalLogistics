package com.crm.entity.po;

import java.io.Serializable;
import java.util.Date;

public class EntrustPO implements Serializable {
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

    private String disposePerson;

    private Date entrustTime;

    private Integer status;

    private String enquiryOrderNum;

    private String entrustNum;

    private Integer originalPrice;

    private Integer changePrice;

    private String tEnquiryPlaceId;

    private String tHouseEnquiryId;

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

    public String getDisposePerson() {
        return disposePerson;
    }

    public void setDisposePerson(String disposePerson) {
        this.disposePerson = disposePerson == null ? null : disposePerson.trim();
    }

    public Date getEntrustTime() {
        return entrustTime;
    }

    public void setEntrustTime(Date entrustTime) {
        this.entrustTime = entrustTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEnquiryOrderNum() {
        return enquiryOrderNum;
    }

    public void setEnquiryOrderNum(String enquiryOrderNum) {
        this.enquiryOrderNum = enquiryOrderNum == null ? null : enquiryOrderNum.trim();
    }

    public String getEntrustNum() {
        return entrustNum;
    }

    public void setEntrustNum(String entrustNum) {
        this.entrustNum = entrustNum == null ? null : entrustNum.trim();
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

    public String gettEnquiryPlaceId() {
        return tEnquiryPlaceId;
    }

    public void settEnquiryPlaceId(String tEnquiryPlaceId) {
        this.tEnquiryPlaceId = tEnquiryPlaceId == null ? null : tEnquiryPlaceId.trim();
    }

    public String gettHouseEnquiryId() {
        return tHouseEnquiryId;
    }

    public void settHouseEnquiryId(String tHouseEnquiryId) {
        this.tHouseEnquiryId = tHouseEnquiryId == null ? null : tHouseEnquiryId.trim();
    }
}