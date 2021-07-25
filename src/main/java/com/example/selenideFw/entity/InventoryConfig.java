package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document(collection = "inventoryConfig")
public class InventoryConfig {
    @Id
    private String id;
    private Integer propertyId;
    private Integer managementCompanyId;
    private String roomCategory;
    private String roomCategoryId;
    private int roomCategoryViewOrder;
    private String roomClass;
    private String roomClassId;
    private int roomClassViewOrder;
    private String pmsCode;
    private String pmsCodeId;
    private int pmsCodeViewOrder;
    private String roomTypeDescription;
    private int roomsCount;
    private InventoryDateRange inventoryDateRange;
    private String categoryType;
    private Date createDate;
    private Date lastModifiedDate;
}
