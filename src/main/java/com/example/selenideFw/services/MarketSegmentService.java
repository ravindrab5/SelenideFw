package com.example.selenideFw.services;



import com.example.selenideFw.entity.MarketSegment;

import java.util.List;

public interface MarketSegmentService {
    public MarketSegment create(MarketSegment marketSegment);

    public List<MarketSegment> createAll(List<MarketSegment> marketSegments);

    public MarketSegment update(MarketSegment marketSegment);

    public void delete(MarketSegment marketSegment);

    public void deleteByPropertyId(int propertyId);

    public void deleteAll(List<MarketSegment> impactType);

    public List<MarketSegment> findByPropertyId(Integer propertyId);

    List<MarketSegment> findByCombineInto(String id);

    List<MarketSegment> findByForecastMethod(String forecastMethod);

    void deleteAllByManagementCompanyId(Integer managementId);

    void deleteAllByPropertyId(Integer propertyId);
}
