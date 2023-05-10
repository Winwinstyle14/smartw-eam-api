package com.example.smartwweb.controller;

import com.example.smartwweb.dto.ResponseObject;
import com.example.smartwweb.entity.CsiInstanceStatus;
import com.example.smartwweb.service.CsiInstanceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/csiInstanceStatus")
public class CsiInstanceStatusController {
    @Autowired
    CsiInstanceStatusService csiInstanceStatusService;

    //list
    @GetMapping
    public ResponseEntity<List<CsiInstanceStatus>>list(){
        List<CsiInstanceStatus>list = csiInstanceStatusService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //get id
    @GetMapping("/{instanceStatusId}")
    public ResponseEntity<CsiInstanceStatus>getByid(@PathVariable Long instanceStatusId){
        CsiInstanceStatus csiInstanceStatus = csiInstanceStatusService.getById(instanceStatusId).get();
        return new ResponseEntity<>(csiInstanceStatus,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<CsiInstanceStatus>add(@RequestBody CsiInstanceStatus csiInstanceStatus){
        CsiInstanceStatus newCsiInstanceStatus = csiInstanceStatusService.addCsiInstanceStatus(csiInstanceStatus);
        return new ResponseEntity<>(newCsiInstanceStatus,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<CsiInstanceStatus>update(@RequestBody CsiInstanceStatus csiInstanceStatus){
        CsiInstanceStatus newCsiInstanceStatus = csiInstanceStatusService.updateCsiInstanceStatus(csiInstanceStatus);
        return new ResponseEntity<>(newCsiInstanceStatus,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{instanceStatusId}")
    public ResponseEntity<?>delete(@PathVariable Long instanceStatusId){
        if(!csiInstanceStatusService.existsById(instanceStatusId))
            return new ResponseEntity<>(new ResponseObject(false,null),HttpStatus.NOT_FOUND);
        csiInstanceStatusService.delete(instanceStatusId);
        return new ResponseEntity<>(new ResponseObject(true,null),HttpStatus.OK);
    }
}
