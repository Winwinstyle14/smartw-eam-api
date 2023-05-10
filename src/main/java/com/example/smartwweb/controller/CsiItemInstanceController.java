package com.example.smartwweb.controller;

import com.example.smartwweb.dto.ResponseObject;
import com.example.smartwweb.entity.CsiItemInstance;
import com.example.smartwweb.service.CsiItemInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/csiItemInstance")
public class CsiItemInstanceController {
    @Autowired
    CsiItemInstanceService csiItemInstanceService;

    //list
    @GetMapping
    public ResponseEntity<List<CsiItemInstance>>list(){
        List<CsiItemInstance>list = csiItemInstanceService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //get id
    @GetMapping("/{instanceNumber}")
    public ResponseEntity<CsiItemInstance>getById(@PathVariable String instanceNumber){
        CsiItemInstance csiItemInstance = csiItemInstanceService.getById(instanceNumber).get();
        return new ResponseEntity<>(csiItemInstance,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<CsiItemInstance>add(@RequestBody CsiItemInstance csiItemInstance){
        CsiItemInstance newCsiItemInstance = csiItemInstanceService.addCsiItemInstance(csiItemInstance);
        return new ResponseEntity<>(newCsiItemInstance,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<CsiItemInstance>update(@RequestBody CsiItemInstance csiItemInstance){
        CsiItemInstance newCsiItemInstance = csiItemInstanceService.updateCsiItemInstance(csiItemInstance);
        return new ResponseEntity<>(newCsiItemInstance,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{instanceNumber}")
    public ResponseEntity<?>delete(@PathVariable String instanceNumber){
        if(!csiItemInstanceService.existsById(instanceNumber))
            return new ResponseEntity<>(new ResponseObject(false,null),HttpStatus.NOT_FOUND);
        csiItemInstanceService.delete(instanceNumber);
        return new ResponseEntity<>(new ResponseObject(true,null),HttpStatus.OK);
    }
}
