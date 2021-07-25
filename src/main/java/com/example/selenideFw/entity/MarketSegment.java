package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "marketSegment")
public class MarketSegment {

  @Id
  private String id;
  private Integer managementCompanyId;
  private Integer propertyId;
  private Integer typeId;
  private String typeName;
  private Integer virtualType;
  private String virtualTypeName;
  private String nameSpace;
  private String categoryName;
  private Integer categoryRank;
  private String subCategoryName;
  private Integer subcategoryRank;
  private String companySegmentCode;
  private String propertySegmentCode;
  private String segmentDescription;
  private List<String> erpCodeUnit;
  private List<String> erpCodeRev;
  private String forecastMethod;
  private Boolean showCheck;
  private String combineInto;
  private Integer segmentRank;
  private Boolean disabled;
  private Integer propertySegmentRank;
  private Boolean mappedToAccIntelRateAnalytics;
}
