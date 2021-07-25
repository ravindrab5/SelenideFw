package com.example.selenideFw.datahelpers;

import com.example.selenideFw.entity.MarsEntity;
import com.example.selenideFw.services.*;
import com.example.selenideFw.util.GsonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AccountIntelDataHelper {
    @Autowired
    private MangementCompanyService managementCompanyService;

    @Autowired
    private ManagementCompanyGeoSetupHeaderService managementCompanyGeoSetupHeaderService;

    @Autowired
    private ManagementCompanyGeoSetupService managementCompanyGeoSetupService;

    @Autowired
    private OperationalSetupService operationalSetupService;

    @Autowired
    private ImpactTypeService impactTypeService;

    @Autowired
    private ImpactEventService impactEventService;

    @Autowired
    private MarketSegmentService marketSegmentService;

    @Autowired
    private CompanyProfileService companyProfileService;

    @Autowired
    private CompanyProfileReservationService companyProfileReservationService;

    @Autowired
    private PropertyService propertyService;

    private MarsEntity marsEntity;
    private Integer propertyId;
    private Integer managementCompanyId;

    public AccountIntelDataHelper(){
        try {
            marsEntity= GsonMapper.readJSONFileForAllCollections("testdata/CompanyProfiles.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        managementCompanyId=888;
        propertyId=692;
    }

    public void setupBasicData(){
        managementCompanyService.deleteByManagementCompanyId(managementCompanyId);
        managementCompanyService.create(marsEntity.getManagementCompanies().get(0));

        propertyService.deleteAllByManagementCompanyId(managementCompanyId);
        propertyService.createAll(marsEntity.getProperties());
        managementCompanyGeoSetupHeaderService.deleteAll(managementCompanyId);
        managementCompanyGeoSetupHeaderService.createAll(marsEntity.getManagementCompanyGeoSetupHeaders());
        managementCompanyGeoSetupService.deleteAll(managementCompanyId);
        managementCompanyGeoSetupService.createAll(marsEntity.getManagementCompanyGeoSetups());
        operationalSetupService.deleteOperationalSetupByManagementCompanyId(managementCompanyId);
        operationalSetupService.createAll(marsEntity.getOperationalSetups());
        impactTypeService.deleteByManagementCompanyId(managementCompanyId);
        impactTypeService.createAll(marsEntity.getImpactTypes());
        impactEventService.deleteAllByManagementId(managementCompanyId);
        impactEventService.createAll(marsEntity.getImpactEvents());
        marketSegmentService.deleteAllByManagementCompanyId(managementCompanyId);
        marketSegmentService.deleteAllByPropertyId(propertyId);
        marketSegmentService.createAll(marsEntity.getMarketSegments());
    }

    public void setupCompanyProfileData() {
        companyProfileService.deleteAllByPropertyId(propertyId);
        companyProfileService.createAll(marsEntity.getCompanyProfiles());

        companyProfileReservationService.deleteAllByPropertyId(propertyId);
        companyProfileReservationService.createAll(marsEntity.getCompanyProfileReservations());
    }

}
