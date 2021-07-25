package com.example.selenideFw.services;

import com.example.selenideFw.entity.ImpactEvent;

import java.util.List;

public interface ImpactEventService {
    public ImpactEvent create(ImpactEvent impactEvent);

    public List<ImpactEvent> createAll(List<ImpactEvent> impactEvents);

    public ImpactEvent update(ImpactEvent impactEvent);

    public void delete(ImpactEvent impactEvent);

    public void deleteByPropertyId(int propertyId);

    public void deleteAllByManagementId(Integer managementId);

    public void deleteAll(List<ImpactEvent> impactType);

    public ImpactEvent findByName(String name);
}
