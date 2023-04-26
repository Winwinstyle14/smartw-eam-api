package com.example.smartwweb.service;

import com.example.smartwweb.entity.MtlSecondaryInventories;
import com.example.smartwweb.repository.MtlSecondaryInventoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MtlSecondaryInventoriesService {
    @Autowired
    MtlSecondaryInventoriesRepository mtlSecondaryInventoriesRepository;


    //list
    public List<MtlSecondaryInventories>list(){
        return mtlSecondaryInventoriesRepository.findAll();
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
    public boolean delete (Long organizationId){
        try {
            mtlSecondaryInventoriesRepository.deleteById(organizationId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
