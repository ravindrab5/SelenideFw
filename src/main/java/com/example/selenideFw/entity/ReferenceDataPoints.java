package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "referenceDataPoints")
public class ReferenceDataPoints {
    private Date asOfDate;
    private Date occupancyDate;
    private Integer propertyId;
    private String segment;
    private String source;
    private String stream;
    private double rn;
    private double revenue;
}

