package vhc.smartw.eam.service;

import vhc.smartw.eam.entity.CsiIiGeolocations;
import vhc.smartw.eam.repository.CsiIiGeolocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CsiIiGeolocationsService {
    @Autowired
    CsiIiGeolocationsRepository csiIiGeolocationsRepository;

    //list
    public List<CsiIiGeolocations>list(){
        return csiIiGeolocationsRepository.findAll();
    }
    //getid
    public Optional<CsiIiGeolocations>getById(Long instanceId){
        return csiIiGeolocationsRepository.findById(instanceId);
    }
    //add
    public CsiIiGeolocations addCsiIiGeolocations(CsiIiGeolocations csiIiGeolocations){
        return csiIiGeolocationsRepository.save(csiIiGeolocations);
    }
    //update
    public CsiIiGeolocations updateCsiIiGeolocations(CsiIiGeolocations csiIiGeolocations){
        return csiIiGeolocationsRepository.save(csiIiGeolocations);
    }
    //delete
    public void delete(Long instanceId){
        csiIiGeolocationsRepository.deleteById(instanceId);
    }
    public boolean existsById(Long instanceId){
        return csiIiGeolocationsRepository.existsById(instanceId);
    }
}
