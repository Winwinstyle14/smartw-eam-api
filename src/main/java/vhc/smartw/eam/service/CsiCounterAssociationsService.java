package vhc.smartw.eam.service;

import vhc.smartw.eam.entity.CsiCounterAssociations;
import vhc.smartw.eam.repository.CsiCounterAssociationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CsiCounterAssociationsService {

    @Autowired
    CsiCounterAssociationsRepository csiCounterAssociationsRepository;

    //list
    public List<CsiCounterAssociations>list(){
        return csiCounterAssociationsRepository.findAll();
    }
    // get id
    public Optional<CsiCounterAssociations>getById(Long instanceAssociationId){
        return csiCounterAssociationsRepository.findById(instanceAssociationId);
    }
    //add
    public CsiCounterAssociations addCsiCounterAssociations(CsiCounterAssociations csiCounterAssociations){
        return csiCounterAssociationsRepository.save(csiCounterAssociations);
    }
    //update
    public CsiCounterAssociations updateCsiCounterAssociations(CsiCounterAssociations csiCounterAssociations){
        return csiCounterAssociationsRepository.save(csiCounterAssociations);
    }
    //delete
    public void  delete(Long instanceAssociationId){
        csiCounterAssociationsRepository.deleteById(instanceAssociationId);
    }
    public boolean existsById(Long instanceAssociationId){
        return csiCounterAssociationsRepository.existsById(instanceAssociationId);
    }
}
