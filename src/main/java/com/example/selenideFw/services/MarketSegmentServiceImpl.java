package com.example.selenideFw.services;

import com.example.selenideFw.entity.MarketSegment;
import com.example.selenideFw.repositories.MarketSegmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("marketSegmentService")
public class MarketSegmentServiceImpl implements  MarketSegmentService{

    @Autowired
    private MarketSegmentRepository marketSegmentRepository;

    @Override
    public MarketSegment create(MarketSegment marketSegment) {
        return marketSegmentRepository.insert(marketSegment);
    }

    @Override
    public List<MarketSegment> createAll(List<MarketSegment> marketSegments) {
        return marketSegmentRepository.insert(marketSegments);
    }

    @Override
    public MarketSegment update(MarketSegment marketSegment) {
        return marketSegmentRepository.save(marketSegment);
    }

    @Override
    public void delete(MarketSegment marketSegment) {
        marketSegmentRepository.delete(marketSegment);
    }

    @Override
    public void deleteByPropertyId(int propertyId) {
        marketSegmentRepository.deleteAllByPropertyId(propertyId);
    }

    @Override
    public void deleteAll(List<MarketSegment> impactType) {
        marketSegmentRepository.delete(impactType);
    }

    @Override
    public List<MarketSegment> findByPropertyId(Integer propertyId) {
        return null;
    }

    @Override
    public List<MarketSegment> findByCombineInto(String id) {
        return marketSegmentRepository.findByCombineInto(id);
    }

    @Override
    public List<MarketSegment> findByForecastMethod(String forecastMethod) {
        return marketSegmentRepository.findByForecastMethod(forecastMethod);
    }

    @Override
    public void deleteAllByManagementCompanyId(Integer managementId) {
        marketSegmentRepository.deleteAllByManagementCompanyId(managementId);
    }

    @Override
    public void deleteAllByPropertyId(Integer propertyId) {
        marketSegmentRepository.deleteAllByPropertyId(propertyId);
    }
}
