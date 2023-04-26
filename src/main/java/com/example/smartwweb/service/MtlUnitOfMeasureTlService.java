package com.example.smartwweb.service;

import com.example.smartwweb.entity.MtlUnitOfMeasureTl;
import com.example.smartwweb.repository.MtlUnitOfMeasureTlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MtlUnitOfMeasureTlService {
    @Autowired
    MtlUnitOfMeasureTlRepository mtlUnitOfMeasureTlRepository;

    //list
    public List<MtlUnitOfMeasureTl>list(){
        return mtlUnitOfMeasureTlRepository.findAll();
    }
    //add
    public MtlUnitOfMeasureTl addMtlUnitOfMeasureTl(MtlUnitOfMeasureTl mtlUnitOfMeasureTl){
        return mtlUnitOfMeasureTlRepository.save(mtlUnitOfMeasureTl);
    }
    //update
    public MtlUnitOfMeasureTl updateMtlUnitOfMeasureTl(MtlUnitOfMeasureTl mtlUnitOfMeasureTl){
        return mtlUnitOfMeasureTlRepository.save(mtlUnitOfMeasureTl);
    }
    //delete
    public void delete(String uomCode){
        mtlUnitOfMeasureTlRepository.deleteById(uomCode);
    }
}
