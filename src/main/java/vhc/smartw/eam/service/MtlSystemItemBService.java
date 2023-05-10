package vhc.smartw.eam.service;

import vhc.smartw.eam.entity.MtlSystemItemB;
import vhc.smartw.eam.repository.MtlSystemItemBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MtlSystemItemBService {
    @Autowired
    MtlSystemItemBRepository mtlSystemItemBRepository;

    //list
    public List<MtlSystemItemB>list(){
        return mtlSystemItemBRepository.findAll();
    }
    //lau du lieu theo id
    public Optional<MtlSystemItemB> getById(Long inventoryItemId){
        return mtlSystemItemBRepository.findById(inventoryItemId);
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
