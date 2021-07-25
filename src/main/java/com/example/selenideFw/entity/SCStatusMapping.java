package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.List;

@Getter
@Setter
public class SCStatusMapping {

    private ObjectId id;
    private Integer propertyId;
    private String status;
    private List<SCCode> scCodeList;
    private Boolean displayInForecast;

    SCStatusMapping(String status, Boolean displayInForecast) {
        this.status = status;
        this.displayInForecast = displayInForecast;
    }
}
