package com.example.selenideFw.entity;

import lombok.*;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OtherIncomeDataPoint {

    private String id;
    private Integer propertyId;
    private String departmentId;
    private String revenueGroupId;
    private Date trxDate;
    private Double value;
    private String type;
    private DataSource source;
    private DataType dataType;

    public enum DataSource {
        ACTUAL,
        OTB,
        ACTIVE,
        RMS,
        FORECAST,
        BUDGET,
        ACTUAL_STLY_PRIOR_ONE_YEAR,
        LAST_SUBMITTED,
        NONE,
        BLOCK,
        CONTRACTED,
        PICKUP,
        RECOMMENDED_WASH,
        ACTUAL_STLY,
        CALENDAR_LY,
        SYSTEM_RECCOM,
        LAST_SUBMITTEDDRAFT,
        BUDGETDRAFT;

        static Map<String, DataSource> dataSources = Arrays.stream(DataSource.values()).collect(Collectors.toMap(Enum::name, dp -> dp));

        public static DataSource search(String key) {
            return dataSources.get(key);
        }

    }

    public enum DataType {
        SYSTEM_DEFINED,
        USER_DEFINED;

        static Map<String, DataType> dataTypes = Arrays.stream(DataType.values()).collect(Collectors.toMap(Enum::name, dp -> dp));
        public static DataType search(String key) {
            return dataTypes.get(key);
        }

    }
}