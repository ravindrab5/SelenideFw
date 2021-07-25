package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MarsEntity {
  private List<ManagementCompany> managementCompanies;
  private List<ManagementCompanyGeoSetupHeader> managementCompanyGeoSetupHeaders;
  private List<ManagementCompanyGeoSetup> managementCompanyGeoSetups;
  private List<OperationalSetup> operationalSetups;
  private List<MarketSegment> marketSegments ;
  private List<Property> properties;
  private List<UserAccount> userAccounts ;
  private List<ImpactType> impactTypes;
  private List<ImpactEvent> impactEvents;
  private List<OtherIncomeConfig> otherIncomes;
  private List<WeekConfig> weekConfigs;
  private List<FinancialExportConfig> financialExportConfigs;
  private List<SCStatusMapping> scStatusMappings;
  private List<SCMarketSegmentMapping> sCMarketSegmentMappings;
  private List<TransactionCode> transactionCodes;
  private List<CompanyProfile>  companyProfiles;
  private List<CompanyProfileReservation> companyProfileReservations;
  private List<OtherIncomeDataPoint> otherIncomeDataPoints;
  private List<ReferenceDataPoints> referenceDataPoints;
  private List<Occupancy> occupancy;
  private List<InventoryConfig> inventoryConfigs;
  private List<Submission> submissions;
  private List<ReasonType> reasonTypes;
  private List<PropertyFeatureConfig> propertyFeatureConfig;
  private List<Roles> roles;
  private List<Contract> contracts;
  private List<OtherIncomeForecastSession> otherIncomeForecastSessions;
  private List<OtherIncomeUtilityDepartmentLogicConfig> otherIncomeUtilityDepartmentLogicConfigs;
}
