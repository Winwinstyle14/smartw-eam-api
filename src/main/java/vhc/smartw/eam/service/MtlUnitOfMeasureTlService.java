package vhc.smartw.eam.service;

import vhc.smartw.eam.entity.MtlUnitOfMeasureTl;
import vhc.smartw.eam.repository.MtlUnitOfMeasureTlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MtlUnitOfMeasureTlService {
    @Autowired
    MtlUnitOfMeasureTlRepository mtlUnitOfMeasureTlRepository;

    //list
    public List<MtlUnitOfMeasureTl>list(){
        return mtlUnitOfMeasureTlRepository.findAll();
    }
    //lau du lieu theo id
    public Optional<MtlUnitOfMeasureTl> getById(String uomCode){
        return mtlUnitOfMeasureTlRepository.findById(uomCode);
    }
    //add
    public MtlUnitOfMeasureTl addMtlUnitOfMeasureTl(MtlUnitOfMeasureTl mtlUnitOfMeasureTl){
        return mtlUnitOfMeasureTlRepository.save(mtlUnitOfMeasureTl);
    }
    //update
    public MtlUnitOfMeasureTl updateMtlUnitOfMeasureTl(MtlUnitOfMeasureTl mtlUnitOfMeasureTl){
        return mtlUnitOfMeasureTlRepository.save(mtlUnitOfMeasureTl);
    }
    //delete
    public void delete(String uomCode){
        mtlUnitOfMeasureTlRepository.deleteById(uomCode);
    }
}
