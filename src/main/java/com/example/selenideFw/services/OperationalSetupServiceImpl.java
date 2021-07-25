package com.example.selenideFw.services;

import com.example.selenideFw.entity.OperationalSetup;
import com.example.selenideFw.repositories.OperationalSetupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("operationalSetupService")
public class OperationalSetupServiceImpl implements OperationalSetupService {

    @Autowired
    private OperationalSetupRepository operationalSetupRepository;

    @Override
    public OperationalSetup create(OperationalSetup operationalSetup) {
        return operationalSetupRepository.insert(operationalSetup);
    }

    @Override
    public List<OperationalSetup> createAll(List<OperationalSetup> operationalSetupList) {
        return operationalSetupRepository.insert(operationalSetupList);
    }

    @Override
    public OperationalSetup update(OperationalSetup operationalSetup) {
        return operationalSetupRepository.save(operationalSetup);
    }

    @Override
    public void delete(OperationalSetup operationalSetup) {
        operationalSetupRepository.delete(operationalSetup);
    }

    @Override
    public void deleteAll(List<OperationalSetup> operationalSetup) {
        operationalSetup.stream().forEach(data->operationalSetupRepository.delete(data));
    }



    @Override
    public OperationalSetup findByOperationTier(String operationTier) {
        return operationalSetupRepository.findByOperationTierName(operationTier);
    }

    @Override
    public void deleteOperationalSetupByManagementCompanyId(Integer id) {
        operationalSetupRepository.deleteAllByManagementCompanyId(id);
    }
}
