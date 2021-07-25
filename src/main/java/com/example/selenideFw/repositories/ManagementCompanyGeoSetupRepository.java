package com.example.selenideFw.repositories;


import com.example.selenideFw.entity.ManagementCompanyGeoSetup;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagementCompanyGeoSetupRepository extends MongoRepository<ManagementCompanyGeoSetup,String> {

    @Query("{ '_id' : ?0 }")
    ManagementCompanyGeoSetup findById(Integer id);

    @Query("{ 'managementCompanyId' : ?0 }")
    ManagementCompanyGeoSetup findByManagementCompanyId(Integer id);

    void deleteAllByManagementCompanyId(int managementCompanyId);

}
