package com.example.smartwweb.controller;

import com.example.smartwweb.dto.ResponseObject;
import com.example.smartwweb.entity.CsiCounterAssociations;
import com.example.smartwweb.entity.FndFlexValueSets;
import com.example.smartwweb.service.CsiCounterAssociationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/csiCounterAssociations")
public class CsiCounterAssociationsController {
    @Autowired
    CsiCounterAssociationsService csiCounterAssociationsService;

    //list
    @GetMapping
    public ResponseEntity<List<CsiCounterAssociations>>list(){
        List<CsiCounterAssociations>list = csiCounterAssociationsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //get id
    @GetMapping("/{instanceAssociationId}")
    public ResponseEntity<CsiCounterAssociations>getById(@PathVariable Long instanceAssociationId){
        CsiCounterAssociations csiCounterAssociations = csiCounterAssociationsService.getById(instanceAssociationId).get();
        return new ResponseEntity<>(csiCounterAssociations,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<CsiCounterAssociations>add(@RequestBody CsiCounterAssociations csiCounterAssociations){
        CsiCounterAssociations newCsiCounterAssociations = csiCounterAssociationsService.addCsiCounterAssociations(csiCounterAssociations);
        return new ResponseEntity<>(newCsiCounterAssociations,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<CsiCounterAssociations>update(@RequestBody CsiCounterAssociations csiCounterAssociations){
        CsiCounterAssociations newCsiCounterAssociations1  = csiCounterAssociationsService.updateCsiCounterAssociations(csiCounterAssociations);
        return new ResponseEntity<>(newCsiCounterAssociations1,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{instanceAssociationId}")
    public ResponseEntity<?>delete(@PathVariable Long instanceAssociationId){
        if (!csiCounterAssociationsService.existsById(instanceAssociationId))
            return new ResponseEntity<>(new ResponseObject(false,null),HttpStatus.NOT_FOUND);
        csiCounterAssociationsService.delete(instanceAssociationId);
        return new ResponseEntity<>(new ResponseObject(true,null),HttpStatus.OK);
    }
}
