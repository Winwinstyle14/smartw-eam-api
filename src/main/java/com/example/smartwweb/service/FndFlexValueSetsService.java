package com.example.smartwweb.service;

import com.example.smartwweb.entity.FndFlexValueSets;
import com.example.smartwweb.repository.FndFlexValueSetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FndFlexValueSetsService {
    @Autowired
    FndFlexValueSetsRepository fndFlexValueSetsRepository;
    //list
    public List<FndFlexValueSets> list(){
        return fndFlexValueSetsRepository.findAll();
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
