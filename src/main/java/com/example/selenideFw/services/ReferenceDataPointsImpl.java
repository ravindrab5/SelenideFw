package com.example.selenideFw.services;

import com.example.selenideFw.entity.ReferenceDataPoints;
import com.example.selenideFw.repositories.ReferenceDataPointsRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("referenceDataPoints")
public class ReferenceDataPointsImpl implements ReferenceDataPointsService {


    @Autowired
    private ReferenceDataPointsRepositiory referenceDataPointsRepositiory;

    @Override
    public void create(ReferenceDataPoints referenceDataPoints) {
        referenceDataPointsRepositiory.insert(referenceDataPoints);
    }

    @Override
    public void deleteAll(int propertyId) {
        referenceDataPointsRepositiory.deleteAllByPropertyId(propertyId);
    }

    @Override
    public void createAll(List<ReferenceDataPoints> referenceDataPointsList) {
        referenceDataPointsRepositiory.insert(referenceDataPointsList);
    }
}
