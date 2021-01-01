package com.crm.entity;

/**
 * 这是一个公司实体类
 */
public class Company {

    private Integer companyId;          //  公司ID

    private String company_name;        //  公司名称

    private String company_phone;       //  公司电话

    private Integer status;             //  公司状态    0-已注销   1-正常运营

    private String company_address;     //  公司地址

    private Territory territory;        //  公司所属地区

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_phone() {
        return company_phone;
    }

    public void setCompany_phone(String company_phone) {
        this.company_phone = company_phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public Territory getTerritory() {
        return territory;
    }

    public void setTerritory(Territory territory) {
        this.territory = territory;
    }
}
