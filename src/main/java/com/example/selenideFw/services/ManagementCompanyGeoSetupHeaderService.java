package com.example.selenideFw.services;


import com.example.selenideFw.entity.ManagementCompanyGeoSetupHeader;

import java.util.List;

public interface ManagementCompanyGeoSetupHeaderService {
    public void create(ManagementCompanyGeoSetupHeader managementCompanyGeoSetupHeader);

    public void createAll(List<ManagementCompanyGeoSetupHeader> managementCompanyGeoSetupHeaderLists);

    public void update(ManagementCompanyGeoSetupHeader managementCompanyGeoSetupHeader);

    public void delete(ManagementCompanyGeoSetupHeader managementCompanyGeoSetupHeader);

    public void deleteAll(int managementCompanyId);

    public ManagementCompanyGeoSetupHeader find(ManagementCompanyGeoSetupHeader managementCompanyGeoSetupHeader);
}
