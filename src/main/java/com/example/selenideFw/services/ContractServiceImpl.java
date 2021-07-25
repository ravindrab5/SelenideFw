package com.example.selenideFw.services;

import com.example.selenideFw.entity.Contract;
import com.example.selenideFw.repositories.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("contractService")
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository;

    @Override
    public Contract create(Contract companyProfile) {
        return contractRepository.insert(companyProfile);
    }

    @Override
    public List<Contract> createAll(List<Contract> contracts) {
        return contractRepository.insert(contracts);
    }

    @Override
    public Contract update(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public void deleteAllByPropertyId(int propertyId) {
        contractRepository.deleteAllByPropertyId(propertyId);
    }
}
