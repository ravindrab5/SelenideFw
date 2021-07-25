package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Map;

@Getter
@Setter
@Document(collection = "property")
public class Property {

    @Id
    private Integer id;
    private Integer managementCompanyId;
    private String uniquePropertyName;
    private String propertyName;
    private String licenceContactInitial;
    private String licenceContactFirstName;
    private String licenceContactLastName;
    private String addressLine1;
    private String country;
    private Integer diallingPrefix;
    private String city;
    private String postalCode;
    private String areaCode;
    private String phoneNumber;
    private String chimpsId;
    private String contactTitle;
    private String contactEmail;
    private String addressLine2;
    private String state;
    private String mobileNumber;
    private Date activationStartDate;
    private Date activationEndDate;
    private String selectedTypeOfBussiness;
    private String selectedSubTypeOfBussiness;
    private String timezone;
    private LinkedHashSet<String> admins;
    private String measurementName;
    private String fiscalCurrency;
    private String timeFormat;
    private String dateFormat;
    private String systemLanguage;
    private String selectedPmsList;
    private String pmsId;
    private String selectedSnCList;
    private String snCId;
    private String selectedRmsList;
    private String rmsId;
    private String selectedFrsList;
    private String frsId;
    private String snCCurrency;
    private Integer hotelCapacity;
    private String frsStructure;
    private String complex;
    private String complexRegion;
    private String linkToComplex;
    private Map<String, String> propertyOperationSetups;
    private Integer geoId;

  }

