package com.example.selenideFw.services;

import com.example.selenideFw.entity.Property;
import com.example.selenideFw.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("propertyService")
public class PropertyServiceImpl implements PropertyService{

    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public void createAll(List<Property> property) {
        propertyRepository.insert(property);
    }

    @Override
    public void update(Property property) {
        propertyRepository.save(property);
    }

    @Override
    public void deleteByPropertyId(int id) {
        propertyRepository.deleteById(id);
    }

    @Override
    public void deleteAllByManagementCompanyId(int id) {
        propertyRepository.deleteAllByManagementCompanyId(id);
    }


}
