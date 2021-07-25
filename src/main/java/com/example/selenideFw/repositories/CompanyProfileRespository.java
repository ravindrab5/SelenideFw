package com.example.selenideFw.repositories;


import com.example.selenideFw.entity.CompanyProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyProfileRespository extends MongoRepository<CompanyProfile,String> {
    CompanyProfile findByPropertyId(Integer propertyId);
    CompanyProfile findByCompanyProfileID(String companyProfileId);
    List<CompanyProfile> findByStatus(String status);
    void deleteAllByPropertyId(Integer propertyId);
    void deleteCompanyProfileByCompanyProfileID(String companyProfileId);
}
