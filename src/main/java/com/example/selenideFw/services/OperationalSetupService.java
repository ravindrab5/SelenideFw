package com.example.selenideFw.services;



import com.example.selenideFw.entity.OperationalSetup;

import java.util.List;

public interface OperationalSetupService {
    public OperationalSetup create(OperationalSetup operationalSetup);

    public List<OperationalSetup> createAll(List<OperationalSetup> operationalSetupList);

    public OperationalSetup update(OperationalSetup operationalSetup);

    public void delete(OperationalSetup operationalSetup);

    public void deleteAll(List<OperationalSetup> operationalSetup);

    public OperationalSetup findByOperationTier(String operationTier);

    public void deleteOperationalSetupByManagementCompanyId(Integer id);
}
