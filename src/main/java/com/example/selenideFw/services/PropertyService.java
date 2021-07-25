package com.example.selenideFw.services;

import com.example.selenideFw.entity.Property;

import java.util.List;

public interface PropertyService {
    public void createAll(List<Property> property);

    public void update(Property property);

    public void deleteByPropertyId(int id);

    public void deleteAllByManagementCompanyId(int id);

}
