package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class ManagementCompanyGeoSetup {

  @Id
  private Integer id;
  private Integer sequenceNo;
  private Integer managementCompanyId;
  private String name;
  private String path;

}
