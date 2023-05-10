package vhc.smartw.eam.service;

import vhc.smartw.eam.entity.MtlItemCategories;
import vhc.smartw.eam.repository.MtlItemCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MtlItemCategoriesService {
    @Autowired
    MtlItemCategoriesRepository mtlItemCategoriesRepository;

    //list
    public List<MtlItemCategories>list(){
        return mtlItemCategoriesRepository.findAll();
    }
    //lau du lieu theo id
    public Optional<MtlItemCategories> getById(Long inventoryItemId){
        return mtlItemCategoriesRepository.findById(inventoryItemId);
    }
    //add
    public MtlItemCategories addMtlItemCategories(MtlItemCategories mtlItemCategories){
        return mtlItemCategoriesRepository.save(mtlItemCategories);
    }
    //update
    public MtlItemCategories updateMtlItemCategories(MtlItemCategories mtlItemCategories){
        return mtlItemCategoriesRepository.save(mtlItemCategories);
    }
    //delete
    public boolean delete (Long inventoryItemId){
        try {
            mtlItemCategoriesRepository.deleteById(inventoryItemId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
