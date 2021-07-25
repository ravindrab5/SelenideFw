package com.example.selenideFw.services;


import com.example.selenideFw.entity.InventoryConfig;

import java.util.List;


public interface InventoryConfigService {
    public InventoryConfig create(InventoryConfig inventoryConfig);

    public List<InventoryConfig> createAll(List<InventoryConfig> inventoryConfig);

    public InventoryConfig update(InventoryConfig inventoryConfig);

    public void deleteAllByPropertyId(int propertyId);

    public void deleteAllByManagementId(int managementId);


}
