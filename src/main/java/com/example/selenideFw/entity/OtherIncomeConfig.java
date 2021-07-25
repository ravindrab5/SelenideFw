package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OtherIncomeConfig {

    private String id;
    private Integer managementCompanyId;
    private String category;
    private String categoryId;
    private Integer categoryViewOrder;
    private String subCategory;
    private String subCategoryId;
    private Integer subCategoryViewOrder;
    private Integer propertyId;
    private String department;
    private String departmentId;
    private Integer departmentViewOrder;
    private String revenueGroup;
    private String revenueGroupId;
    private Integer revenueGroupViewOrder;
    private String statistics;
    private Type type;
    private ForecastMethod forecastMethod;
    private List<String> txnCodes;

    public enum Type {
        REVENUE("Revenue Only"),
        STATISTICS("Statistics"),
        STATS_AND_REVENUE("Stats & Revenue");

        private String description;

        Type(String s) {
            this.description = s;
        }

        public String getDescription(){
            return this.description;
        }
    }

    public enum ForecastMethod {
        DAY("Per Day"),
        GUEST("Per Guest"),
        ROOM("Per Room");

        private String description;

        ForecastMethod(String s) {
            this.description = s;
        }

        public String getDescription(){
            return this.description;
        }
    }

}