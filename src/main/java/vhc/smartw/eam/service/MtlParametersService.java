package vhc.smartw.eam.service;

import vhc.smartw.eam.entity.MtlParameters;
import vhc.smartw.eam.repository.MtlParametersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MtlParametersService {
    @Autowired
    MtlParametersRepository mtlParametersRepository;

    //list
    public List<MtlParameters>list(){
        return mtlParametersRepository.findAll();
    }
    //lau du lieu theo id
    public Optional<MtlParameters> getById(Long organizationId){
        return mtlParametersRepository.findById(organizationId);
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
