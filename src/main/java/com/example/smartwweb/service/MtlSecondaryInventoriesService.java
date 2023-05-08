package com.example.smartwweb.service;

import com.example.smartwweb.entity.MtlSecondaryInventories;
import com.example.smartwweb.repository.MtlSecondaryInventoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MtlSecondaryInventoriesService {
    @Autowired
    MtlSecondaryInventoriesRepository mtlSecondaryInventoriesRepository;


    //list
    public List<MtlSecondaryInventories>list(){
        return mtlSecondaryInventoriesRepository.findAll();
    }
    //lau du lieu theo id
    public Optional<MtlSecondaryInventories> getById(String secondaryinventoryName){
        return mtlSecondaryInventoriesRepository.findById(secondaryinventoryName);
    }
    //add
    public MtlSecondaryInventories addMtlSecondaryInventories(MtlSecondaryInventories mtlSecondaryInventories){
        return mtlSecondaryInventoriesRepository.save(mtlSecondaryInventories);
    }
    //update
    public MtlSecondaryInventories updateMtlSecondaryInventories(MtlSecondaryInventories mtlSecondaryInventories){
        return mtlSecondaryInventoriesRepository.save(mtlSecondaryInventories);
    }
    //delete
    public void delete(String secondaryinventoryName){
        mtlSecondaryInventoriesRepository.deleteById(secondaryinventoryName);
    }
}
