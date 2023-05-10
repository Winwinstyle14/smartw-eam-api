package com.example.smartwweb.service;

import com.example.smartwweb.entity.CsiInstanceStatus;
import com.example.smartwweb.repository.CsiInstanceStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CsiInstanceStatusService{
    @Autowired
    CsiInstanceStatusRepository csiInstanceStatusRepository;

    //list
    public List<CsiInstanceStatus>list(){
        return csiInstanceStatusRepository.findAll();
    }
    //getid
    public Optional<CsiInstanceStatus> getById(Long instanceStatusId){
        return csiInstanceStatusRepository.findById(instanceStatusId);
    }
    //add
    public CsiInstanceStatus addCsiInstanceStatus(CsiInstanceStatus csiInstanceStatus){
        return csiInstanceStatusRepository.save(csiInstanceStatus);
    }
    //update
    public CsiInstanceStatus updateCsiInstanceStatus(CsiInstanceStatus csiInstanceStatus){
        return csiInstanceStatusRepository.save(csiInstanceStatus);
    }
    //delete
    public void delete(Long instanceStatusId){
        csiInstanceStatusRepository.deleteById(instanceStatusId);
    }
    public boolean existsById(Long instanceStatusId){
        return csiInstanceStatusRepository.existsById(instanceStatusId);
    }
}
