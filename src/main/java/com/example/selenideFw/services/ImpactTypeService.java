package com.example.selenideFw.services;


import com.example.selenideFw.entity.ImpactType;

import java.util.List;

public interface ImpactTypeService {
    public ImpactType create(ImpactType impactType);

    public List<ImpactType> createAll(List<ImpactType> impactTypes);

    public ImpactType update(ImpactType impactType);

    public void delete(ImpactType impactType);

    public void deleteByManagementCompanyId(int managementCompanyId);

    public void deleteAll(List<ImpactType> impactType);

    public ImpactType findByName(String name);
}
