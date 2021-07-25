package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
public class UserAccount {

  private ObjectId id;
  private String userAccountId;
  private String externalId;
  private String cognitoSubId;
  private String uniqueEmail;
  private String email;
  private String firstName;
  private String lastName;
  private String password;
  private String role;
  private List<Role> roles;
  private List<RoleInfo> rolesInfo;
  private String passwordResetToken;
  private Date lastSetPasswordLink;
  private Integer managementCompanyId;
  private Set<Integer> propertyIds;
  private String title;
  private String displayName;
  private Boolean status;
  private List<String> userAccess;
  private Map<String, Set<String>> biAttr;
  private List<Map<String, List<ModuleAccess>>> moduleLevelAccessInfo;
  private List<String> authTokens;
  private Set<String> geoAreas;
  private Boolean isPrimaryUser;
  private Map<Integer, UserMetadata> perPropertyMetadata;
  private Date createDate;
  private Date lastModifiedDate;


}
