package com.example.selenideFw.datahelpers;

import com.example.selenideFw.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseDataHelper {
    @Autowired
    protected MangementCompanyService managementCompanyService;

    @Autowired
    protected ManagementCompanyGeoSetupHeaderService managementCompanyGeoSetupHeaderService;

    @Autowired
    protected ManagementCompanyGeoSetupService managementCompanyGeoSetupService;

    @Autowired
    protected OperationalSetupService operationalSetupService;

    @Autowired
    protected ImpactTypeService impactTypeService;

    @Autowired
    protected ImpactEventService impactEventService;

    @Autowired
    protected MarketSegmentService marketSegmentService;

    @Autowired
    protected CompanyProfileService companyProfileService;

    @Autowired
    protected CompanyProfileReservationService companyProfileReservationService;



}
