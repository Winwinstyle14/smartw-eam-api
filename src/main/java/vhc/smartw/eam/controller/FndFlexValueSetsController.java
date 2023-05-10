package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.FndFlexValueSets;
import vhc.smartw.eam.service.FndFlexValueSetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/value_sets")
public class FndFlexValueSetsController {
    @Autowired
    FndFlexValueSetsService fndFlexValueSetsService;
    //list danh sach
    @GetMapping
    public ResponseEntity<List<FndFlexValueSets>>list(){
        List<FndFlexValueSets>list = fndFlexValueSetsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //getById
    @GetMapping("/{flexValueSetId}")
    public ResponseEntity<FndFlexValueSets>getById(@PathVariable Long flexValueSetId){
        FndFlexValueSets flexValueSets = fndFlexValueSetsService.getById(flexValueSetId).get();
        return new ResponseEntity<>(flexValueSets,HttpStatus.OK);
    }
    //them
    @PostMapping
    public ResponseEntity<FndFlexValueSets>add(@RequestBody FndFlexValueSets fndFlexValueSets){
        FndFlexValueSets newFndFlexValueSets = fndFlexValueSetsService.addFndFlexValueSets(fndFlexValueSets);
        return new ResponseEntity<>(newFndFlexValueSets,HttpStatus.OK);
    }
    //sua
    @PutMapping
    public ResponseEntity<FndFlexValueSets>update(@RequestBody FndFlexValueSets fndFlexValueSets){
        FndFlexValueSets newFlexValueSets  = fndFlexValueSetsService.updateFndFlexValueSets(fndFlexValueSets);
        return new ResponseEntity<>(newFlexValueSets,HttpStatus.OK);
    }
    //xoa
    @DeleteMapping("/{flexValueSetId}")
    public ResponseEntity<ResponseObject>delete(@PathVariable Long flexValueSetId){
        Boolean test = fndFlexValueSetsService.delete(flexValueSetId);
        ResponseObject responseObject = new ResponseObject(test,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }

}
