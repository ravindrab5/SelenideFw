package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class WeekConfig {

    private String weekConfigurationId;
    private Integer propertyId;
    private Integer managementCompanyId;
    private Set<Integer> weekDays;
    private Set<Integer> weekEnds;
}
