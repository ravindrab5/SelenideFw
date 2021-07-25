package com.example.selenideFw.repositories;

import com.example.selenideFw.entity.Property;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyRepository extends MongoRepository<Property,String> {
    List<Property> findByManagementCompanyId(Integer managementCompanyId);

    void deleteAllByManagementCompanyId(Integer managementCompanyId);

    void deleteById(int id);

}
