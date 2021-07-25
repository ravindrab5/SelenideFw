package com.example.selenideFw.services;

import com.example.selenideFw.entity.ManagementCompany;
import com.example.selenideFw.repositories.ManagementCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("managementCompanyService")
public class ManagementCompanyServiceImpl implements MangementCompanyService{

    @Autowired
    ManagementCompanyRepository managementCompanyRepository;

    @Override
    public void create(ManagementCompany managementCompany) {
        managementCompanyRepository.insert(managementCompany);
    }

    @Override
    public void update(ManagementCompany managementCompany) {
        managementCompanyRepository.save(managementCompany);
    }

    @Override
    public void delete(ManagementCompany managementCompany) {
        managementCompanyRepository.delete(managementCompany);
    }

    @Override
    public void deleteByManagementCompanyId(int id) {
        managementCompanyRepository.deleteAllById(id);
    }

    @Override
    public void deleteAll() {
        managementCompanyRepository.deleteAll();
    }

    @Override
    public ManagementCompany find(ManagementCompany managementCompany) {
        return managementCompanyRepository.findById(managementCompany.getId());
    }
}
