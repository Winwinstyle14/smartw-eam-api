package com.example.smartwweb.service;

import com.example.smartwweb.entity.FndFlexValueSets;
import com.example.smartwweb.entity.FndFlexValuesVl;
import com.example.smartwweb.repository.FndFlexValuesVlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FndFlexValuesVlService {
    @Autowired
    FndFlexValuesVlRepository fndFlexValuesVlRepository;

    //list
    public List<FndFlexValuesVl>list(){
        return fndFlexValuesVlRepository.findAll();
    }
    //lau du lieu theo id
    public Optional<FndFlexValuesVl> getById(Long flexValueId){
        return fndFlexValuesVlRepository.findById(flexValueId);
    }
    //add
    public FndFlexValuesVl addFndFlexValuesVl(FndFlexValuesVl fndFlexValuesVl){
        return fndFlexValuesVlRepository.save(fndFlexValuesVl);
    }
    //update
    public FndFlexValuesVl updateFndFlexValuesVl(FndFlexValuesVl fndFlexValuesVl){
        return fndFlexValuesVlRepository.save(fndFlexValuesVl);
    }
    //delete
    public boolean delete (Long flexValueId){
        try {
            fndFlexValuesVlRepository.deleteById(flexValueId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
