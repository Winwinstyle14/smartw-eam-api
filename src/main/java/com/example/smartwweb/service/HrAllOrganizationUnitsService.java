package com.example.smartwweb.service;

import com.example.smartwweb.entity.HrAllOrganizationUnits;
import com.example.smartwweb.repository.HrAllOrganizationUnitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrAllOrganizationUnitsService {
    @Autowired
    HrAllOrganizationUnitsRepository hrAllOrganizationUnitsRepository;

    //list
    public List<HrAllOrganizationUnits>list(){
        return hrAllOrganizationUnitsRepository.findAll();
    }
    //add
    public HrAllOrganizationUnits addHrAllOrganizationUnits(HrAllOrganizationUnits hrAllOrganizationUnits){
        return hrAllOrganizationUnitsRepository.save(hrAllOrganizationUnits);
    }
    //update
    public HrAllOrganizationUnits updateHrAllOrganizationUnits(HrAllOrganizationUnits hrAllOrganizationUnits){
        return hrAllOrganizationUnitsRepository.save(hrAllOrganizationUnits);
    }
    //delete
    public boolean delete (Long organizationId){
        try {
            hrAllOrganizationUnitsRepository.deleteById(organizationId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
