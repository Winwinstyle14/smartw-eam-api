package com.example.smartwweb.service;

import com.example.smartwweb.entity.CsiItemInstance;
import com.example.smartwweb.repository.CsiItemInstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CsiItemInstanceService {
    @Autowired
    CsiItemInstanceRepository csiItemInstanceRepository;

    //list
    public List<CsiItemInstance>list(){
        return csiItemInstanceRepository.findAll();
    }
    //getid
    public Optional<CsiItemInstance> getById(String instanceNumber){
        return csiItemInstanceRepository.findById(instanceNumber);
    }
    //add
    public CsiItemInstance addCsiItemInstance(CsiItemInstance csiItemInstance){
        return csiItemInstanceRepository.save(csiItemInstance);
    }
    //update
    public CsiItemInstance updateCsiItemInstance(CsiItemInstance csiItemInstance){
        return csiItemInstanceRepository.save(csiItemInstance);
    }
    //delete
    public void delete(String instanceNumber){
        csiItemInstanceRepository.deleteById(instanceNumber);
    }
    public boolean existsById(String instanceNumber){
        return csiItemInstanceRepository.existsById(instanceNumber);
    }
}
