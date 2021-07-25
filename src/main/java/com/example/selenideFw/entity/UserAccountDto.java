package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
public class UserAccountDto {
  private String uniqueEmail;
  private String firstName;
  private String role;
  private String displayName;
  private List<String> userAccess;
  private Boolean status;
  private Integer managementCompanyId;
  private Set<Integer> propertyIds;
  private Map<Integer, UserMetadata> perPropertyMetadata;
}
