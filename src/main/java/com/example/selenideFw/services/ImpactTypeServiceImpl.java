package com.example.selenideFw.services;

import com.example.selenideFw.entity.ImpactType;
import com.example.selenideFw.repositories.ImpactTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("impactTypeService")
public class ImpactTypeServiceImpl implements ImpactTypeService{
    @Autowired
    private ImpactTypeRepository impactTypeRepository;


    @Override
    public ImpactType create(ImpactType impactType) {
        return impactTypeRepository.insert(impactType);
    }

    @Override
    public List<ImpactType> createAll(List<ImpactType> impactTypes) {
        return impactTypeRepository.insert(impactTypes);
    }

    @Override
    public ImpactType update(ImpactType impactType) {
        return impactTypeRepository.insert(impactType);
    }

    @Override
    public void delete(ImpactType impactType) {
            impactTypeRepository.delete(impactType);
    }

    @Override
    public void deleteByManagementCompanyId(int managementCompanyId) {
        impactTypeRepository.deleteAllByManagementCompanyId(managementCompanyId);
    }

    @Override
    public void deleteAll(List<ImpactType> impactType) {
        impactTypeRepository.delete(impactType);
    }

    @Override
    public ImpactType findByName(String name) {
        return impactTypeRepository.findByName(name);
    }
}
