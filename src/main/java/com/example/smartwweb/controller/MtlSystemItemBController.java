package com.example.smartwweb.controller;

import com.example.smartwweb.dto.ResponseObject;
import com.example.smartwweb.entity.FndFlexValuesVl;
import com.example.smartwweb.entity.MtlSystemItemB;
import com.example.smartwweb.service.MtlSystemItemBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mtlSystemItemB")
public class MtlSystemItemBController {
    @Autowired
    MtlSystemItemBService mtlSystemItemBService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlSystemItemB>>list(){
        List<MtlSystemItemB>list = mtlSystemItemBService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //getById
    @GetMapping("/{inventoryItemId}")
    public ResponseEntity<MtlSystemItemB>getById(@PathVariable Long inventoryItemId,Long organizationId){
        MtlSystemItemB mtlSystemItemB = mtlSystemItemBService.getById(inventoryItemId).get();
        mtlSystemItemB = mtlSystemItemBService.getById(organizationId).get();
        return new ResponseEntity<>(mtlSystemItemB,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MtlSystemItemB>add(@RequestBody MtlSystemItemB mtlSystemItemB){
        MtlSystemItemB newMtlSystemItemB = mtlSystemItemBService.addMtlSystemItemB(mtlSystemItemB);
        return new ResponseEntity<>(newMtlSystemItemB,HttpStatus.OK);
    }
    //update
    public ResponseEntity<MtlSystemItemB>update(@RequestBody MtlSystemItemB mtlSystemItemB){
        MtlSystemItemB newMtlSystemItemB1 = mtlSystemItemBService.updateMtlSystemItemB(mtlSystemItemB);
        return new ResponseEntity<>(newMtlSystemItemB1,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{inventoryItemId}")
    public ResponseEntity<ResponseObject>delete(@PathVariable Long inventoryItemId){
        Boolean test = mtlSystemItemBService.delete(inventoryItemId);
        ResponseObject responseObject = new ResponseObject(test,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }
}
