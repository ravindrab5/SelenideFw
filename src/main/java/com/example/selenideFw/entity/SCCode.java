package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SCCode {

    private String codeName;
    private String codeDescription;
    private Boolean includeInForecast;

    public SCCode(String codeName, Boolean includeInForecast) {
        this.codeName = codeName;
        this.includeInForecast = includeInForecast;
    }
}
