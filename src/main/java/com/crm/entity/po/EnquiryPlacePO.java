package com.crm.entity.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 询价单
 *          0 ： 不需要用户填写，自动生成
 *          1 :  需要用户填写
 */
public class EnquiryPlacePO implements Serializable {
    private String id;                      //  uuid            0

    private String productName;             //  品名            1

    private String productCode;             //  商品编码         0

    private String departName;              //  发站名           1

    private String destinationName;         //  到站名           1

    private String inspection;              //  口岸             0

    private String importsExports;          //  陆运方向         1

    private String transportationType;      //  运输类型         1

    private Date sendTime;                  //  发运时间         0

    private String remark;                  //  备注             1

    private String userName;                //  操作者           0

    private Date enquiryTime;               //  询价时间         0

    private Integer status;                 //  状态             0

    private Integer enquiryOrderNum;        //  询单号           0

    private Integer originalPrice;          //  原始价格         0

    private Integer changePrice;            //  变动价格         0

    private String transportationId;        //  运输表主键       0

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