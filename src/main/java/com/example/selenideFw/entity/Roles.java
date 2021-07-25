package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.List;

@Getter
@Setter
public class Roles {
    private ObjectId id;
    private String role;
    private String type;
    private Integer propertyId;
    private List<Privileges> privileges;
}
