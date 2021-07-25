package com.example.selenideFw.repositories;


import com.example.selenideFw.entity.ManagementCompany;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagementCompanyRepository extends MongoRepository<ManagementCompany,String> {
    @Query("{ '_id' : ?0 }")
    ManagementCompany findById(Integer id);

    void deleteAllById(Integer id);
}
