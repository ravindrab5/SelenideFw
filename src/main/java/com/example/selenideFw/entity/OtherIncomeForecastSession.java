package com.example.selenideFw.entity;

import lombok.*;

import java.util.LinkedHashMap;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OtherIncomeForecastSession {

    private String id;
    private Integer propertyId;
    private String startDate;
    private String endDate;
    private LinkedHashMap<String, OtherIncomeForecast> sessions = new LinkedHashMap<>();
}
