package com.example.smartwweb.controller;

import com.example.smartwweb.dto.ResponseObject;
import com.example.smartwweb.entity.MtlParameters;
import com.example.smartwweb.service.MtlParametersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mtlParameters")
public class MtlParametersController {
    @Autowired
    MtlParametersService mtlParametersService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlParameters>>list(){
        List<MtlParameters>list = mtlParametersService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //getById
    @GetMapping("/{organizationId}")
    public ResponseEntity<MtlParameters>getById(@PathVariable Long organizationId){
        MtlParameters mtlParameters = mtlParametersService.getById(organizationId).get();
        return new ResponseEntity<>(mtlParameters,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MtlParameters>add(@RequestBody MtlParameters mtlParameters){
        MtlParameters newMtlParameters = mtlParametersService.addMtlParameters(mtlParameters);
        return new ResponseEntity<>(newMtlParameters,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<MtlParameters>update(@RequestBody MtlParameters mtlParameters){
        MtlParameters newMtlParameters = mtlParametersService.updateMtlParameters(mtlParameters);
        return new ResponseEntity<>(newMtlParameters,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{organizationId}")
    public ResponseEntity<ResponseObject>delete(@PathVariable Long organizationId){
        Boolean test = mtlParametersService.delete(organizationId);
        ResponseObject responseObject = new ResponseObject(test,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }
}
