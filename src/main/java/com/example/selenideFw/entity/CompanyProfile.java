package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Document(collection="companyProfile")
public class CompanyProfile {
    private String companyProfileID;
    private Integer propertyId;
    private String companyProfileName;
    private boolean contract;
    private Date createdDate;
    private String dataType;
    private Date lastModifiedDate;
    private String status;
    private String masterCompanyProfileID;
}

