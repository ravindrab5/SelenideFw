package com.example.selenideFw.services;


import com.example.selenideFw.entity.CompanyProfileReservation;

import java.util.List;

public interface CompanyProfileReservationService {
    public CompanyProfileReservation create(CompanyProfileReservation companyProfileReservation);

    public List<CompanyProfileReservation> createAll(List<CompanyProfileReservation> companyProfileReservations);

    public CompanyProfileReservation update(CompanyProfileReservation companyProfileReservations);

    public void deleteAllByPropertyId(int propertyId);
}
