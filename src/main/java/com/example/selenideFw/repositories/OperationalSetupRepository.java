package com.example.selenideFw.repositories;

import com.example.selenideFw.entity.OperationalSetup;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationalSetupRepository extends MongoRepository<OperationalSetup,String> {

    @Query("{ 'operationTierName' : ?0 }")
    OperationalSetup findByOperationTierName(String operationTierName);

    void deleteAllByManagementCompanyId(Integer managementCompanyId);

}
