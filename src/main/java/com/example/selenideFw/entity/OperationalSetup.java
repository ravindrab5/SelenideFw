package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Collection;
import java.util.Map;

@Getter
@Setter
public class OperationalSetup {

  @Id
  private String id;
  private Integer managementCompanyId;
  private String operationTierName;
  private Boolean isPropertyDisplay;
  private Collection<OperationalSetupDetail> detailList;
  private Map<Integer, String> propertyOperationSetup;

}


