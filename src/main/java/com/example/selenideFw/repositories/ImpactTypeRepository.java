package com.example.selenideFw.repositories;


import com.example.selenideFw.entity.ImpactType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ImpactTypeRepository  extends MongoRepository<ImpactType,String> {
    @Query("{ 'name' : ?0 }")
    ImpactType findByName(String name);

    void deleteAllByManagementCompanyId(int managementId);

}
