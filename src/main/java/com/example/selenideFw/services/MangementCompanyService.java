package com.example.selenideFw.services;


import com.example.selenideFw.entity.ManagementCompany;

public interface MangementCompanyService {
    public void create(ManagementCompany managementCompany);

    public void update(ManagementCompany managementCompany);

    public void delete(ManagementCompany managementCompany);

    public void deleteByManagementCompanyId(int id);

    public void deleteAll();

    public ManagementCompany find(ManagementCompany managementCompany);
}
