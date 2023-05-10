package com.example.smartwweb.controller;

import com.example.smartwweb.dto.ResponseObject;
import com.example.smartwweb.entity.CsiIiGeolocations;
import com.example.smartwweb.service.CsiIiGeolocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/csiIiGeolocations")
public class CsiIiGeolocationsController {
    @Autowired
    CsiIiGeolocationsService csiIiGeolocationsService;
    //list
    @GetMapping
    public ResponseEntity<List<CsiIiGeolocations>>list(){
        List<CsiIiGeolocations>list = csiIiGeolocationsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //getid
    @GetMapping("/{instanceId}")
    public ResponseEntity<CsiIiGeolocations>getById(@PathVariable Long instanceId){
        CsiIiGeolocations csiIiGeolocations = csiIiGeolocationsService.getById(instanceId).get();
        return new ResponseEntity<>(csiIiGeolocations,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<CsiIiGeolocations>add(@RequestBody CsiIiGeolocations csiIiGeolocations){
        CsiIiGeolocations newCsiIiGeolocations = csiIiGeolocationsService.addCsiIiGeolocations(csiIiGeolocations);
        return new ResponseEntity<>(csiIiGeolocations,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<CsiIiGeolocations>update(@RequestBody CsiIiGeolocations csiIiGeolocations){
        CsiIiGeolocations newCsiIiGeolocations = csiIiGeolocationsService.updateCsiIiGeolocations(csiIiGeolocations);
        return new ResponseEntity<>(newCsiIiGeolocations,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{instanceId}")
    public ResponseEntity<?>delete(Long instanceId){
        csiIiGeolocationsService.delete(instanceId);
        ResponseObject responseObject = new ResponseObject(true,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }
}
