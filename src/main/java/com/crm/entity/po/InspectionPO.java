package com.crm.entity.po;

import java.io.Serializable;

public class InspectionPO implements Serializable {
    private String id;

    private String domesicCode;

    private String internationalCode;

    private String portName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDomesicCode() {
        return domesicCode;
    }

    public void setDomesicCode(String domesicCode) {
        this.domesicCode = domesicCode == null ? null : domesicCode.trim();
    }

    public String getInternationalCode() {
        return internationalCode;
    }

    public void setInternationalCode(String internationalCode) {
        this.internationalCode = internationalCode == null ? null : internationalCode.trim();
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName == null ? null : portName.trim();
    }
}