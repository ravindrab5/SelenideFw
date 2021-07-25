package com.example.selenideFw.repositories;


import com.example.selenideFw.entity.ManagementCompanyGeoSetupHeader;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagementCompanyGeoSetupHeaderRepository extends MongoRepository<ManagementCompanyGeoSetupHeader,String> {
    @Query("{ '_id' : ?0 }")
    ManagementCompanyGeoSetupHeader findById(Integer id);

    @Query("{ 'managementCompanyId' : ?0 }")
    ManagementCompanyGeoSetupHeader findByManagementCompanyId(Integer managementCompanyId);

    @Query("{ 'name' : ?0 }")
    ManagementCompanyGeoSetupHeader findByName(String name);

    void deleteAllByManagementCompanyId(int managementCompanyId);


}
