package com.example.selenideFw.services;

import com.example.selenideFw.entity.ManagementCompanyGeoSetupHeader;
import com.example.selenideFw.repositories.ManagementCompanyGeoSetupHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("managementCompanyGeoSetupHeader")
public class ManagementCompanyGeoSetupHeaderServiceImpl implements ManagementCompanyGeoSetupHeaderService {
    @Autowired
    ManagementCompanyGeoSetupHeaderRepository managementCompanyGeoSetupHeaderRepository;


    @Override
    public void create(ManagementCompanyGeoSetupHeader managementCompanyGeoSetupHeader) {
        managementCompanyGeoSetupHeaderRepository.insert(managementCompanyGeoSetupHeader);
    }

    @Override
    public void createAll(List<ManagementCompanyGeoSetupHeader> managementCompanyGeoSetupHeaderLists) {
        managementCompanyGeoSetupHeaderRepository.insert(managementCompanyGeoSetupHeaderLists);
    }

    @Override
    public void update(ManagementCompanyGeoSetupHeader managementCompanyGeoSetupHeader) {
        managementCompanyGeoSetupHeaderRepository.save(managementCompanyGeoSetupHeader);
    }

    @Override
    public void delete(ManagementCompanyGeoSetupHeader managementCompanyGeoSetupHeader) {
        managementCompanyGeoSetupHeaderRepository.delete(managementCompanyGeoSetupHeader);
    }

    @Override
    public void deleteAll(int managementCompanyId) {
        managementCompanyGeoSetupHeaderRepository.deleteAllByManagementCompanyId(managementCompanyId);
    }

    @Override
    public ManagementCompanyGeoSetupHeader find(ManagementCompanyGeoSetupHeader managementCompanyGeoSetupHeader) {
        return managementCompanyGeoSetupHeaderRepository.findById(managementCompanyGeoSetupHeader.getId());
    }


}
