package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.LinkedHashSet;

@Getter
@Setter
@Document(collection="managementCompany")
public class ManagementCompany {

  @Id
  private Integer id;
  private String managementCompanyType;
  private String uniqueManagementCompanyName;
  private String managementCompanyName;
  private String managementCompanyDatabaseName;
  private String licenceContactInitial;
  private String licenceContactFirstName;
  private String licenceContactLastName;
  private String addressLine1;
  private String country;
  private String diallingPrefix;
  private String city;
  private String postalCode;
  private String areaCode;
  private String phoneNumber;
  private Date activationDate;
  private String chimpsId;
  private String uniqueClientCode;
  private String clientCode;
  private String contactTitle;
  private String contactEmail;
  private String addressLine2;
  private String state;
  private String timezone;
  private LinkedHashSet<String> admins;
  private Date deactivationDate;


}
