package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.MtlCategories;
import vhc.smartw.eam.service.MtlCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mtlcategories")
public class MtlCategoriesController {
    @Autowired
    MtlCategoriesService mtlCategoriesService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlCategories>>list(){
        List<MtlCategories>list = mtlCategoriesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //getById
    @GetMapping("/{categoryId}")
    public ResponseEntity<MtlCategories>getById(@PathVariable Long categoryId){
        MtlCategories mtlCategories = mtlCategoriesService.getById(categoryId).get();
        return new ResponseEntity<>(mtlCategories,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MtlCategories>add(@RequestBody MtlCategories mtlCategories){
        MtlCategories newMtlCategories = mtlCategoriesService.addMtlCategories(mtlCategories);
        return new ResponseEntity<>(newMtlCategories,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<MtlCategories>update(@RequestBody MtlCategories mtlCategories){
        MtlCategories newMtlCategories = mtlCategoriesService.updateMtlCategories(mtlCategories);
        return new ResponseEntity<>(newMtlCategories,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{categoryId}")
    public ResponseEntity<ResponseObject>delete(@PathVariable Long categoryId){
        Boolean test = mtlCategoriesService.delete(categoryId);
        ResponseObject responseObject = new ResponseObject(test,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }
}
