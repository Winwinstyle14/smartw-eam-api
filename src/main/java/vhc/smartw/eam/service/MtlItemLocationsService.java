package vhc.smartw.eam.service;

import vhc.smartw.eam.entity.MtlItemLocations;
import vhc.smartw.eam.repository.MtlItemLocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MtlItemLocationsService {
    @Autowired
    MtlItemLocationsRepository mtlItemLocationsRepository;

    //list
    public List<MtlItemLocations>list(){
        return mtlItemLocationsRepository.findAll();
    }
    //lau du lieu theo id
    public Optional<MtlItemLocations> getById(Long inventoryLocationId){
        return mtlItemLocationsRepository.findById(inventoryLocationId);
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
