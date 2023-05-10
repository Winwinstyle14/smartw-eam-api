package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.MtlUnitOfMeasureTl;
import vhc.smartw.eam.service.MtlUnitOfMeasureTlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mtlUnitOfMeasureTl")
public class MtlUnitOfMeasureTlController {
    @Autowired
    MtlUnitOfMeasureTlService mtlUnitOfMeasureTlService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlUnitOfMeasureTl>>list(){
        List<MtlUnitOfMeasureTl>list = mtlUnitOfMeasureTlService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/{uomCode}")
    public ResponseEntity<MtlUnitOfMeasureTl>getById(@PathVariable String uomCode){
        MtlUnitOfMeasureTl mtlUnitOfMeasureTl = mtlUnitOfMeasureTlService.getById(uomCode).get();
        return new ResponseEntity<>(mtlUnitOfMeasureTl,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MtlUnitOfMeasureTl>add(@RequestBody MtlUnitOfMeasureTl mtlUnitOfMeasureTl){
        MtlUnitOfMeasureTl newMtlUnitOfMeasureTl = mtlUnitOfMeasureTlService.addMtlUnitOfMeasureTl(mtlUnitOfMeasureTl);
        return new ResponseEntity<>(newMtlUnitOfMeasureTl,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<MtlUnitOfMeasureTl>update(@RequestBody MtlUnitOfMeasureTl mtlUnitOfMeasureTl){
        MtlUnitOfMeasureTl newMtlUnitOfMeasureTl1 = mtlUnitOfMeasureTlService.updateMtlUnitOfMeasureTl(mtlUnitOfMeasureTl);
        return new ResponseEntity<>(newMtlUnitOfMeasureTl1,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{uomCode}")
    public ResponseEntity<?>delete(@PathVariable String uomCode){
        mtlUnitOfMeasureTlService.delete(uomCode);
        ResponseObject responseObject = new ResponseObject(true,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }
}
