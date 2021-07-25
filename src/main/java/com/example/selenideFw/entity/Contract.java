package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Document(collection = "contract")
public class Contract {

    @Id
    private String id;
    private int propertyId;
    private String companyProfileID;
    private Date startDate;
    private Date endDate;
    private String contractStatus;
    private List<String> ratePlan;
    private int singleSplit;
    private int doubleSplit;
    private RateStrategy rateStrategy;
    private String primarySegment;
    private String contractManager;
    private int contractRN;
    private int contractREV;
    private List<ContractSeasons> contractSeasons;
    private Date createdDate;
    private Date lastModifiedDate;
    private boolean prospect;
}
