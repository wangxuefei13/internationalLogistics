package com.crm.entity.po;

import java.io.Serializable;
import java.util.Date;

public class HouseEnquiryPO implements Serializable {
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

    private Date disposeTime;

    private Integer status;

    private String enquiryOrderNum;

    private Integer originalPrice;

    private Integer changePrice;

    private Integer enquiryPerson;

    private String transportationId;

    private String tHousePriceId;

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

    public Date getDisposeTime() {
        return disposeTime;
    }

    public void setDisposeTime(Date disposeTime) {
        this.disposeTime = disposeTime;
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

    public Integer getEnquiryPerson() {
        return enquiryPerson;
    }

    public void setEnquiryPerson(Integer enquiryPerson) {
        this.enquiryPerson = enquiryPerson;
    }

    public String getTransportationId() {
        return transportationId;
    }

    public void setTransportationId(String transportationId) {
        this.transportationId = transportationId == null ? null : transportationId.trim();
    }

    public String gettHousePriceId() {
        return tHousePriceId;
    }

    public void settHousePriceId(String tHousePriceId) {
        this.tHousePriceId = tHousePriceId == null ? null : tHousePriceId.trim();
    }
}