package com.example.selenideFw.services;

import com.example.selenideFw.entity.CompanyProfile;
import com.example.selenideFw.repositories.CompanyProfileRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("companyProfileService")
public class CompanyProfileServiceImpl implements CompanyProfileService{
    @Autowired
    private CompanyProfileRespository companyProfileRespository;

    @Override
    public CompanyProfile create(CompanyProfile companyProfile) {
        return companyProfileRespository.insert(companyProfile);
    }

    @Override
    public List<CompanyProfile> createAll(List<CompanyProfile> companyProfile) {
        return companyProfileRespository.insert(companyProfile);
    }

    @Override
    public CompanyProfile update(CompanyProfile companyProfile) {
        return companyProfileRespository.save(companyProfile);
    }

    @Override
    public void delete(CompanyProfile companyProfile) {
        companyProfileRespository.delete(companyProfile);
    }

    @Override
    public void deleteAllByPropertyId(int propertyId) {
        companyProfileRespository.deleteAllByPropertyId(propertyId);
    }

    @Override
    public void deleteByCompanyProfileId(String companyProfileId) {
        companyProfileRespository.deleteCompanyProfileByCompanyProfileID(companyProfileId);
    }

    @Override
    public void deleteAll(List<CompanyProfile> companyProfile) {
        companyProfileRespository.delete(companyProfile);
    }

    @Override
    public CompanyProfile findByProfileId(String companyProfileId) {
        return companyProfileRespository.findByCompanyProfileID(companyProfileId);
    }
}
