package com.example.smartwweb.service;

import com.example.smartwweb.entity.CsiInstanceStatus;
import com.example.smartwweb.entity.MtlLocations;
import com.example.smartwweb.repository.MtlLocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MtlLocationsService {
    @Autowired
    MtlLocationsRepository mtlLocationsRepository;

    //list
    public List<MtlLocations> list(){
        return mtlLocationsRepository.findAll();
    }
    //getid
    public Optional<MtlLocations> getById(Long locationId){
        return mtlLocationsRepository.findById(locationId);
    }
    //add
    public MtlLocations addMtlLocations(MtlLocations mtlLocations){
        return mtlLocationsRepository.save(mtlLocations);
    }
    //update
    public MtlLocations updateMtlLocations(MtlLocations mtlLocations){
        return mtlLocationsRepository.save(mtlLocations);
    }
    //delete
    public void delete(Long locationId){
        mtlLocationsRepository.deleteById(locationId);
    }
    public boolean existsById(Long locationId){
        return mtlLocationsRepository.existsById(locationId);
    }
}
