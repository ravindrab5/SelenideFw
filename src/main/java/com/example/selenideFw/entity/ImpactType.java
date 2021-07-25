package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection="ImpactType")
public class ImpactType {

    @Id
    private String id;
    private String name;
    private boolean isUserDefined;
    private Integer rank;
    private Integer managementCompanyId;
    private Integer propertyId;
}
