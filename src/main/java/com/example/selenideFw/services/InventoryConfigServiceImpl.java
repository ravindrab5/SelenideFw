package com.example.selenideFw.services;

import com.example.selenideFw.entity.InventoryConfig;
import com.example.selenideFw.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("inventoryConfigService")
public class InventoryConfigServiceImpl implements InventoryConfigService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public InventoryConfig create(InventoryConfig inventoryConfig) {
        return inventoryRepository.insert(inventoryConfig);
    }

    @Override
    public List<InventoryConfig> createAll(List<InventoryConfig> inventoryConfig) {
        return inventoryRepository.insert(inventoryConfig);
    }

    @Override
    public InventoryConfig update(InventoryConfig inventoryConfig) {
        return inventoryRepository.save(inventoryConfig);
    }

    @Override
    public void deleteAllByPropertyId(int propertyId) {
        inventoryRepository.deleteAllByPropertyId(propertyId);
    }

    @Override
    public void deleteAllByManagementId(int managementId) {
        inventoryRepository.deleteAllByManagementCompanyId(managementId);
    }
}
