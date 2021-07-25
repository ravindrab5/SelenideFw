package com.example.selenideFw.entity;


public enum CollectionNames {

  MANAGEMENT_COMPANY("managementCompany"), MANAGEMENT_COMPANY_GEO_SETUP("managementCompanyGeoSetup"),
  MANAGEMENT_COMPANY_GEO_SETUP_HEADER("managementCompanyGeoSetupHeader"), OPERATIONAL_SETUP("operationalSetup"),
  MARKET_SEGMENT("marketSegment"), PROPERTY("property"),
  USER_ACCOUNT("userAccount"),
  OTHER_INCOME_CONFIG("otherIncomeConfig"), OTHER_INCOME_DATA_POINT("otherIncomeDataPoint"), OTHER_INCOME_FORECAST_SESSION("otherIncomeForecastSession"),
  SUBMISSION("Submission"), SUBMISSION_CRITERIA("SubmissionCriteria"), OTHER_INCOME_UTILITY_DEPARTMENT_LOGIC_CONFIG("otherIncomeUtilityDepartmentLogicConfig"),
  AVAILABLE_ROOMS("AvailableRooms"), REASON_TYPE("ReasonType"), IMPACT_TYPE("ImpactType"), IMPACT_EVENT("ImpactEvent"),
  GUEST_FORECAST_SESSION("guestForecastSession"), ROOMS_FORECAST_SESSION("forecastSession"),
  WEEK_CONFIG("weekConfiguration"), FINANCIAL_EXPORT_CONFIG("financialExportConfig"),
  CONFIG_PARAMS("configParam"),
  SC_STATUS_MAPPING("scStatusMapping"), TRANSACTION_CODE("transactionCode"),
  COMPANY_PROFILE("companyProfile"),
  CONTRACTS("contract"),
  COMPANY_PROFILE_RESERVATION("companyProfileReservation"),
  PMS_STAY_RAW("pmsStayRaw"),
  INVENTORY_CONFIG("inventoryConfig"),
  REFERENCE_DATA_POINTS("referenceDataPoints"),
  OCCUPANCY("occupancy"), MESSAGE("message"),GUEST_OCCUPANCY_RATIO("guestOccupancyRatio"),
  ROLES("roles"),

  FNB_UTILITY_OUTLET_LOGIC_CONFIG("fnBUtilityOutletLogicConfig"), FNB_BANQUET_OPERATING_PARAMETERS("fnbBanquetOperatingParameters"),
  FNB_BANQUET_OPERATIONAL_AVAILABILITY("fnbBanquetOperationalAvailability"), FNB_BOOKING_TYPE_CONFIG("fnbBookingTypeConfig"),
  FNB_DATAPOINT("fnbDataPoint"), FNB_DEPARTMENT_FORECAST_SESSION("fnbDepartmentForecastSession"),
  FNB_FORECAST_OVERRIDE("fnbForecastOverride"), FNB_FORECAST_SYSTEM_OVERRIDE("fnbForecastSystemOverride"),
  FNB_MANAGEMENT_COMPANY_CONFIG("fnbManagementCompanyConfig"), FNB_MANAGEMENT_COMPANY_OPERATIONAL_CONFIG("fnbManagementCompanyOperationalConfig"),
  FNB_MARKET_SEGMENT_CONFIG("fnbMarketSegmentConfig"), FNB_MEAL_PERIOD_CONFIG("fnbMealPeriodConfig"),
  FNB_PROPERTY_CONFIG("fnbPropertyConfig"), FNB_PROPERTY_OPERATIONAL_CONFIG("fnbPropertyOperationalConfig"),
  FNB_REVENUE_GROUP_CONFIG("fnbRevenueGroupConfig"), FNB_SYSTEM_RECOMMENDATION_CONFIG("fnbSystemRecommendationConfig"),

  SALES_AND_CATERING("salesAndCatering"), SALES_AND_CATERING_PACE("salesAndCateringPace"), SALES_AND_CATERING_BOOKING("salesAndCateringBooking"),
  SALES_AND_CATERING_EVENT("salesAndCateringEvent"), SALES_AND_CATERING_EVENT_PACE("salesAndCateringEventPace"),
  SNC_MARKET_SEG_MAPPING("SnCMarketSegmentMapping"), SNC_EVENT_STATUS_MAPPING("scEventStatusMapping"),
  SNC_EVENT_REVENUE_GROUP("snCEventRevenueGroup"), SALES_AND_CATERING_FUNCTION_ROOM("salesAndCateringFunctionRoom"),
  ETL_CONFIGURATIONS("ETLConfigurations");


  private String stringValue;
  public String getStringValue(){
    return this.stringValue;
  }
  CollectionNames(String value){
    this.stringValue = value;
  }
}
