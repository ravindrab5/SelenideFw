package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class ManagementCompanyGeoSetupHeader {

  @Id
  private Integer id;
  private Integer managementCompanyId;
  private String name;
}
