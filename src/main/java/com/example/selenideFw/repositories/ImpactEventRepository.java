package com.example.selenideFw.repositories;


import com.example.selenideFw.entity.ImpactEvent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImpactEventRepository extends MongoRepository<ImpactEvent,String> {
    @Query("{ 'name' : ?0 }")
    ImpactEvent findByName(String name);

    @Query("{ 'propertyId' : ?0 }")
    List<ImpactEvent> findByPropertyId(Integer name);

    List<ImpactEvent> findByPropertyIdAndFrequency(Integer propertyId, ImpactEvent.Frequency frequency);

    void deleteAllByPropertyId(Integer propertyId);

    void deleteAllByManagementCompanyId(Integer managementId);
}
