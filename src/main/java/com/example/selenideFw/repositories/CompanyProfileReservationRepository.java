package com.example.selenideFw.repositories;


import com.example.selenideFw.entity.CompanyProfileReservation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyProfileReservationRepository extends MongoRepository<CompanyProfileReservation,String> {
    void deleteAllByPropertyId(int propertyId);
}
