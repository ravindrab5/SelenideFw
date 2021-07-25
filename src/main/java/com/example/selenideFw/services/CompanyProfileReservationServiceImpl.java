package com.example.selenideFw.services;

import com.example.selenideFw.entity.CompanyProfileReservation;
import com.example.selenideFw.repositories.CompanyProfileReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("companyProfileReservationService")
public class CompanyProfileReservationServiceImpl implements CompanyProfileReservationService {
    @Autowired
    private CompanyProfileReservationRepository companyProfileReservationRepository;

    @Override
    public CompanyProfileReservation create(CompanyProfileReservation companyProfileReservation) {
        return companyProfileReservationRepository.insert(companyProfileReservation);
    }

    @Override
    public List<CompanyProfileReservation> createAll(List<CompanyProfileReservation> companyProfileReservations) {
        return companyProfileReservationRepository.insert(companyProfileReservations);
    }

    @Override
    public CompanyProfileReservation update(CompanyProfileReservation companyProfileReservations) {
        return companyProfileReservationRepository.save(companyProfileReservations);
    }

    @Override
    public void deleteAllByPropertyId(int propertyId) {
        companyProfileReservationRepository.deleteAllByPropertyId(propertyId);
    }
}
