package com.example.selenideFw.repositories;


import com.example.selenideFw.entity.InventoryConfig;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends MongoRepository<InventoryConfig,String> {
    void deleteAllByPropertyId(int propertyId);
    void deleteAllByManagementCompanyId(int managementId);
}