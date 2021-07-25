package com.example.selenideFw.repositories;


import com.example.selenideFw.entity.ReferenceDataPoints;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferenceDataPointsRepositiory extends MongoRepository<ReferenceDataPoints,String> {

    void deleteAllByPropertyId(int propertyId);
}
