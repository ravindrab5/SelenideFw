package com.example.selenideFw.repositories;


import com.example.selenideFw.entity.MarketSegment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarketSegmentRepository extends MongoRepository<MarketSegment,String> {

    List<MarketSegment> findByPropertyId(Integer propertyId);

    List<MarketSegment> findByCombineInto(String id);

    List<MarketSegment> findByForecastMethod(String forecastMethod);

    void deleteAllByManagementCompanyId(Integer managementId);

    void deleteAllByPropertyId(Integer propertyId);
}
