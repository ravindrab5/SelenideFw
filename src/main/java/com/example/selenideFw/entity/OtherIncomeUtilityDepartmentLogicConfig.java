package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OtherIncomeUtilityDepartmentLogicConfig {
    private String id;
    private Integer propertyId;
    private Integer year;
    private String forecastPageId;
    private String departmentId;
    private String revenueGroupId;
    private Type type;
    private Integer rollingWeek;
    private List<String> historicalRange;
}
