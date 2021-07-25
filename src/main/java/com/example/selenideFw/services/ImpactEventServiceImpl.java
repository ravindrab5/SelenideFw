package com.example.selenideFw.services;

import com.example.selenideFw.entity.ImpactEvent;
import com.example.selenideFw.repositories.ImpactEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("impactEventService")
public class ImpactEventServiceImpl implements ImpactEventService {

    @Autowired
    private ImpactEventRepository impactEventRepository;

    @Override
    public ImpactEvent create(ImpactEvent impactEvent) {
        return impactEventRepository.insert(impactEvent);
    }

    @Override
    public List<ImpactEvent> createAll(List<ImpactEvent> impactEvents) {
        return impactEventRepository.insert(impactEvents);
    }

    @Override
    public ImpactEvent update(ImpactEvent impactEvent) {
        return impactEventRepository.save(impactEvent);
    }

    @Override
    public void delete(ImpactEvent impactEvent) {
        impactEventRepository.delete(impactEvent);
    }

    @Override
    public void deleteByPropertyId(int propertyId) {
        impactEventRepository.deleteAllByPropertyId(propertyId);
    }

    @Override
    public void deleteAllByManagementId(Integer managementId) {
        impactEventRepository.deleteAllByManagementCompanyId(managementId);
    }

    @Override
    public void deleteAll(List<ImpactEvent> impactType) {

    }

    @Override
    public ImpactEvent findByName(String name) {
        return null;
    }
}
