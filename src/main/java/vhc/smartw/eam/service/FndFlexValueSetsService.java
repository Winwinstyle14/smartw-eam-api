package vhc.smartw.eam.service;

import vhc.smartw.eam.entity.FndFlexValueSets;
import vhc.smartw.eam.repository.FndFlexValueSetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FndFlexValueSetsService {
    @Autowired
    FndFlexValueSetsRepository fndFlexValueSetsRepository;
    //list
    public List<FndFlexValueSets> list(){
        return fndFlexValueSetsRepository.findAll();
    }
    //lay theo id
    public Optional<FndFlexValueSets> getById(Long flexValueSetId){
        return fndFlexValueSetsRepository.findById(flexValueSetId);
    }
    //add
    public FndFlexValueSets addFndFlexValueSets(FndFlexValueSets fndFlexValueSets){
        return fndFlexValueSetsRepository.save(fndFlexValueSets);
    }
    //update
    public FndFlexValueSets updateFndFlexValueSets(FndFlexValueSets fndFlexValueSets){
        return fndFlexValueSetsRepository.save(fndFlexValueSets);
    }
    //delete
    public boolean delete (Long flexValueSetId){
        try {
            fndFlexValueSetsRepository.deleteById(flexValueSetId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
