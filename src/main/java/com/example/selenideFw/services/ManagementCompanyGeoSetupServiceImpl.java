package com.example.selenideFw.services;

import com.example.selenideFw.entity.ManagementCompanyGeoSetup;
import com.example.selenideFw.repositories.ManagementCompanyGeoSetupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("managementCompanyGeoSetupService")
public class ManagementCompanyGeoSetupServiceImpl implements ManagementCompanyGeoSetupService{
    @Autowired
    private ManagementCompanyGeoSetupRepository managementCompanyGeoSetupRepository;

    @Override
    public void create(ManagementCompanyGeoSetup managementCompanyGeoSetup) {
        managementCompanyGeoSetupRepository.insert(managementCompanyGeoSetup);
    }

    @Override
    public void createAll(List<ManagementCompanyGeoSetup> managementCompanyGeoSetupLists) {
        managementCompanyGeoSetupRepository.insert(managementCompanyGeoSetupLists);
    }

    @Override
    public void update(ManagementCompanyGeoSetup managementCompanyGeoSetup) {
        managementCompanyGeoSetupRepository.save(managementCompanyGeoSetup);
    }

    @Override
    public void delete(ManagementCompanyGeoSetup managementCompanyGeoSetup) {
        managementCompanyGeoSetupRepository.delete(managementCompanyGeoSetup);
    }

    @Override
    public void deleteAll(int managementCompanyId){
        managementCompanyGeoSetupRepository.deleteAllByManagementCompanyId(managementCompanyId);
    }

    @Override
    public ManagementCompanyGeoSetup find(ManagementCompanyGeoSetup managementCompanyGeoSetup) {
        return managementCompanyGeoSetupRepository.findById(managementCompanyGeoSetup.getId());
    }
}
