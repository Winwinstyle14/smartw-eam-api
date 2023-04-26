package com.example.smartwweb.service;

import com.example.smartwweb.entity.MtlSystemItemB;
import com.example.smartwweb.repository.MtlSystemItemBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MtlSystemItemBService {
    @Autowired
    MtlSystemItemBRepository mtlSystemItemBRepository;

    //list
    public List<MtlSystemItemB>list(){
        return mtlSystemItemBRepository.findAll();
    }
    //add
    public MtlSystemItemB addMtlSystemItemB(MtlSystemItemB mtlSystemItemB){
        return mtlSystemItemBRepository.save(mtlSystemItemB);
    }
    //update
    public MtlSystemItemB updateMtlSystemItemB(MtlSystemItemB mtlSystemItemB){
        return mtlSystemItemBRepository.save(mtlSystemItemB);
    }
    //delete
    public boolean delete (Long inventoryItemId){
        try {
            mtlSystemItemBRepository.deleteById(inventoryItemId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
