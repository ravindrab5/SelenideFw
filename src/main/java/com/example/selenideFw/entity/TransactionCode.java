package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionCode {

    private String id;
    private String correlationId;
    private Integer propertyId;
    private String tcGroup;
    private String tcGroupDescription;
    private String tcSubGroup;
    private String tcSubGroupDescription;
    private String trxCode;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getTcGroupDescription() {
        return tcGroupDescription;
    }

    public void setTcGroupDescription(String tcGroupDescription) {
        this.tcGroupDescription = tcGroupDescription;
    }

    public String getTcSubGroupDescription() {
        return tcSubGroupDescription;
    }

    public void setTcSubGroupDescription(String tcSubGroupDescription) {
        this.tcSubGroupDescription = tcSubGroupDescription;
    }

    public String getTrxCode() {
        return trxCode;
    }

    public void setTrxCode(String trxCode) {
        this.trxCode = trxCode;
    }

    public String getTcGroup() {
        return tcGroup;
    }

    public void setTcGroup(String tcGroup) {
        this.tcGroup = tcGroup;
    }

    public String getTcSubGroup() {
        return tcSubGroup;
    }

    public void setTcSubGroup(String tcSubGroup) {
        this.tcSubGroup = tcSubGroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
