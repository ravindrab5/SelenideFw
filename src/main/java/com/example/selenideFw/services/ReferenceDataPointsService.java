package com.example.selenideFw.services;

import com.example.selenideFw.entity.ReferenceDataPoints;

import java.util.List;

public interface ReferenceDataPointsService {

    void create(ReferenceDataPoints referenceDataPoints);
    void deleteAll(int propertyId);
    void createAll(List<ReferenceDataPoints> referenceDataPointsList);
}
