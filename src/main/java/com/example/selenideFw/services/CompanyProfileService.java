package com.example.selenideFw.services;


import com.example.selenideFw.entity.CompanyProfile;

import java.util.List;

public interface CompanyProfileService {
    public CompanyProfile create(CompanyProfile companyProfile);

    public List<CompanyProfile> createAll(List<CompanyProfile> companyProfile);

    public CompanyProfile update(CompanyProfile companyProfile);

    public void delete(CompanyProfile companyProfile);

    public void deleteAllByPropertyId(int propertyId);

    public void deleteByCompanyProfileId(String companyProfileId);

    public void deleteAll(List<CompanyProfile> companyProfile);

    public CompanyProfile findByProfileId(String companyProfileId);
}
