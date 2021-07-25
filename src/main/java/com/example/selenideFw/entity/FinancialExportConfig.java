package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinancialExportConfig {

    private String id;
    private Integer propertyId;
    private String fieldType;
    private Boolean isActive;

    private String mappingCode;
    private String mappingName;
    private String mappingDesc;

    private String costCenterStatisticCode;
    private String glStatisticCode;
    private String costCenterRevenueCode;
    private String glRevenueCode;
}
