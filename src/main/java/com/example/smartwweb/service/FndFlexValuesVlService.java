package com.example.smartwweb.service;

import com.example.smartwweb.entity.FndFlexValuesVl;
import com.example.smartwweb.repository.FndFlexValuesVlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FndFlexValuesVlService {
    @Autowired
    FndFlexValuesVlRepository fndFlexValuesVlRepository;

    //list
    public List<FndFlexValuesVl>list(){
        return fndFlexValuesVlRepository.findAll();
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
