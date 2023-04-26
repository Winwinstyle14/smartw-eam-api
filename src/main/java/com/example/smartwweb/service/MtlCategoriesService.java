package com.example.smartwweb.service;

import com.example.smartwweb.entity.MtlCategories;
import com.example.smartwweb.repository.MtlCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MtlCategoriesService {
    @Autowired
    MtlCategoriesRepository mtlCategoriesRepository;

    //list
    public List<MtlCategories>list(){
        return mtlCategoriesRepository.findAll();
    }
    //add
    public MtlCategories addMtlCategories(MtlCategories mtlCategories){
        return mtlCategoriesRepository.save(mtlCategories);
    }
    //update
    public MtlCategories updateMtlCategories(MtlCategories mtlCategories){
        return mtlCategoriesRepository.save(mtlCategories);
    }
    //delete
    public boolean delete (Long categoryId){
        try {
            mtlCategoriesRepository.deleteById(categoryId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
