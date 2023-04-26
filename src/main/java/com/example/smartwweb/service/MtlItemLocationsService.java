package com.example.smartwweb.service;

import com.example.smartwweb.entity.MtlItemLocations;
import com.example.smartwweb.repository.MtlItemLocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MtlItemLocationsService {
    @Autowired
    MtlItemLocationsRepository mtlItemLocationsRepository;

    //list
    public List<MtlItemLocations>list(){
        return mtlItemLocationsRepository.findAll();
    }
    //add
    public MtlItemLocations addMtlItemLocations(MtlItemLocations mtlItemLocations){
        return mtlItemLocationsRepository.save(mtlItemLocations);
    }
    //update
    public MtlItemLocations updateMtlItemLocations(MtlItemLocations mtlItemLocations){
        return mtlItemLocationsRepository.save(mtlItemLocations);
    }
    //delete
    public boolean delete (Long inventoryLocationId){
        try {
            mtlItemLocationsRepository.deleteById(inventoryLocationId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
