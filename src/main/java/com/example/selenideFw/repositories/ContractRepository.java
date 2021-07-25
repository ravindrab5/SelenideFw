package com.example.selenideFw.repositories;


import com.example.selenideFw.entity.Contract;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends MongoRepository<Contract,String> {

    void deleteAllByPropertyId(int propertyId);


}
