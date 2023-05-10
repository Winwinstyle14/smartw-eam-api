package vhc.smartw.eam.service;

import vhc.smartw.eam.entity.HrAllOrganizationUnits;
import vhc.smartw.eam.repository.HrAllOrganizationUnitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HrAllOrganizationUnitsService {
    @Autowired
    HrAllOrganizationUnitsRepository hrAllOrganizationUnitsRepository;

    //list
    public List<HrAllOrganizationUnits>list(){
        return hrAllOrganizationUnitsRepository.findAll();
    }
    //lau du lieu theo id
    public Optional<HrAllOrganizationUnits> getById(Long organizationId){
        return hrAllOrganizationUnitsRepository.findById(organizationId);
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
