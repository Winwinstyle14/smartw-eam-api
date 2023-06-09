package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.MtlItemCategories;
import vhc.smartw.eam.service.MtlItemCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mtlItemCategories")
public class MtlItemCategoriesController {
    @Autowired
    MtlItemCategoriesService mtlItemCategoriesService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlItemCategories>>list(){
        List<MtlItemCategories>list = mtlItemCategoriesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //getById
    @GetMapping("/{inventoryItemId}")
    public ResponseEntity<MtlItemCategories>getById(@PathVariable Long inventoryItemId){
        MtlItemCategories mtlItemCategories = mtlItemCategoriesService.getById(inventoryItemId).get();
        return new ResponseEntity<>(mtlItemCategories,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MtlItemCategories>add(@RequestBody MtlItemCategories mtlItemCategories){
        MtlItemCategories newMtlItemCategories = mtlItemCategoriesService.addMtlItemCategories(mtlItemCategories);
        return new ResponseEntity<>(newMtlItemCategories,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<MtlItemCategories>update(@RequestBody MtlItemCategories mtlItemCategories){
        MtlItemCategories newMtlItemCategories = mtlItemCategoriesService.updateMtlItemCategories(mtlItemCategories);
        return new ResponseEntity<>(newMtlItemCategories,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{inventoryItemId}")
    public ResponseEntity<ResponseObject>delete(@PathVariable Long inventoryItemId){
        Boolean test = mtlItemCategoriesService.delete(inventoryItemId);
        ResponseObject responseObject = new ResponseObject(test,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }
}
