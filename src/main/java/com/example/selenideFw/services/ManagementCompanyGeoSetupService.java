package com.example.selenideFw.services;


import com.example.selenideFw.entity.ManagementCompanyGeoSetup;

import java.util.List;

public interface ManagementCompanyGeoSetupService {
    public void create(ManagementCompanyGeoSetup managementCompanyGeoSetup);

    public void createAll(List<ManagementCompanyGeoSetup> managementCompanyGeoSetupLists);

    public void update(ManagementCompanyGeoSetup managementCompanyGeoSetup);

    public void delete(ManagementCompanyGeoSetup managementCompanyGeoSetup);

    public void deleteAll(int managementCompanyId);

    public ManagementCompanyGeoSetup find(ManagementCompanyGeoSetup managementCompanyGeoSetup);
}
