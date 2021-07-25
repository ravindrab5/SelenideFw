package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Set;

import static java.util.Objects.nonNull;

@Getter
@Setter
public class RoleInfo {

  private String roleId;
  private Integer managementCompanyId;
  private Integer propertyId;
  private Set<String> geoAreas;
  private Map<String, Set<String>> biAttr;
  private Boolean isPrimary;
  private Boolean status;

  public boolean getStatus() {
    return nonNull(status) && status;
  }

  public boolean getIsPrimary() {
    return nonNull(isPrimary) && isPrimary;
  }
}
