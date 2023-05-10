package com.example.smartwweb.service;

import com.example.smartwweb.entity.CsiIAssets;
import com.example.smartwweb.repository.CsiIAssetsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CsiIAssetsService {
    @Autowired
    CsiIAssetsRespository csiIAssetsRespository;

    //list
    public List<CsiIAssets>list(){
        return csiIAssetsRespository.findAll();
    }
    //getid
    public Optional<CsiIAssets> getById(Long instanceAssetId){
        return csiIAssetsRespository.findById(instanceAssetId);
    }
    //add
    public CsiIAssets addCsiIAssets(CsiIAssets csiIAssets){
        return csiIAssetsRespository.save(csiIAssets);
    }
    //update
    public CsiIAssets updateCsiIAssets(CsiIAssets csiIAssets){
        return csiIAssetsRespository.save(csiIAssets);
    }
    //delet
    public void delete(Long instanceAssetId){
        csiIAssetsRespository.deleteById(instanceAssetId);
    }
    public boolean existsById(Long instanceAssetId){
        return csiIAssetsRespository.existsById(instanceAssetId);
    }
}
