package com.example.smartwweb.service;

import com.example.smartwweb.entity.MtlParameters;
import com.example.smartwweb.repository.MtlParametersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MtlParametersService {
    @Autowired
    MtlParametersRepository mtlParametersRepository;

    //list
    public List<MtlParameters>list(){
        return mtlParametersRepository.findAll();
    }
    //add
    public MtlParameters addMtlParameters(MtlParameters mtlParameters){
        return mtlParametersRepository.save(mtlParameters);
    }
    //update
    public  MtlParameters updateMtlParameters(MtlParameters mtlParameters){
        return mtlParametersRepository.save(mtlParameters);
    }
    //delete
    public boolean delete (Long organizationId){
        try {
            mtlParametersRepository.deleteById(organizationId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
