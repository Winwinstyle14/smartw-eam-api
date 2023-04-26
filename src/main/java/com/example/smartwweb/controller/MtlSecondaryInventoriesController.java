package com.example.smartwweb.controller;

import com.example.smartwweb.dto.ResponseObject;
import com.example.smartwweb.entity.MtlSecondaryInventories;
import com.example.smartwweb.service.MtlSecondaryInventoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mtlSecondaryInventories")
public class MtlSecondaryInventoriesController {
    @Autowired
    MtlSecondaryInventoriesService mtlSecondaryInventoriesService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlSecondaryInventories>>list(){
        List<MtlSecondaryInventories>list = mtlSecondaryInventoriesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MtlSecondaryInventories>add(@RequestBody MtlSecondaryInventories mtlSecondaryInventories){
        MtlSecondaryInventories newMtlSecondaryInventories = mtlSecondaryInventoriesService.addMtlSecondaryInventories(mtlSecondaryInventories);
        return new ResponseEntity<>(newMtlSecondaryInventories,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<MtlSecondaryInventories>update(@RequestBody MtlSecondaryInventories mtlSecondaryInventories){
        MtlSecondaryInventories newMtlSecondaryInventories1 = mtlSecondaryInventoriesService.updateMtlSecondaryInventories(mtlSecondaryInventories);
        return new ResponseEntity<>(newMtlSecondaryInventories1,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{organizationId}")
    public ResponseEntity<ResponseObject>delete(@PathVariable Long organizationId){
        Boolean test = mtlSecondaryInventoriesService.delete(organizationId);
        ResponseObject responseObject = new ResponseObject(test,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }
}
