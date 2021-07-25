package com.example.selenideFw.services;



import com.example.selenideFw.entity.Contract;

import java.util.List;

public interface ContractService {
    public Contract create(Contract companyProfile);

    public List<Contract> createAll(List<Contract> contracts);

    public Contract update(Contract contract);

    public void deleteAllByPropertyId(int propertyId);


}
