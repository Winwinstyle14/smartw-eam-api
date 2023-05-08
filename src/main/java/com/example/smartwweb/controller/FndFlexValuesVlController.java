package com.example.smartwweb.controller;

import com.example.smartwweb.dto.ResponseObject;
import com.example.smartwweb.entity.FndFlexValueSets;
import com.example.smartwweb.entity.FndFlexValuesVl;
import com.example.smartwweb.service.FndFlexValuesVlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fndFlexValuesVl")
public class FndFlexValuesVlController {
    @Autowired
    FndFlexValuesVlService fndFlexValuesVlService;

    @GetMapping
    public ResponseEntity<List<FndFlexValuesVl>>list(){
        List<FndFlexValuesVl>list = fndFlexValuesVlService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //getById
    @GetMapping("/{flexValueId}")
    public ResponseEntity<FndFlexValuesVl>getById(@PathVariable Long flexValueId){
        FndFlexValuesVl fndFlexValuesVl = fndFlexValuesVlService.getById(flexValueId).get();
        return new ResponseEntity<>(fndFlexValuesVl,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<FndFlexValuesVl>add(@RequestBody FndFlexValuesVl fndFlexValuesVl){
        FndFlexValuesVl newFndFlexValuesVl = fndFlexValuesVlService.addFndFlexValuesVl(fndFlexValuesVl);
        return new ResponseEntity<>(newFndFlexValuesVl,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<FndFlexValuesVl>update(@RequestBody FndFlexValuesVl fndFlexValuesVl){
        FndFlexValuesVl newFndFlexValuesVl = fndFlexValuesVlService.updateFndFlexValuesVl(fndFlexValuesVl);
        return new ResponseEntity<>(newFndFlexValuesVl,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{flexValueId}")
    public ResponseEntity<ResponseObject>delete(@PathVariable Long flexValueId){
        Boolean test = fndFlexValuesVlService.delete(flexValueId);
        ResponseObject responseObject = new ResponseObject(test,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }
}
