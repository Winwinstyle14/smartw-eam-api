package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.MtlSecondaryInventories;
import vhc.smartw.eam.service.MtlSecondaryInventoriesService;
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
    //getById
    @GetMapping("/{secondaryinventoryName}")
    public ResponseEntity<MtlSecondaryInventories>getById(@PathVariable String secondaryinventoryName){
        MtlSecondaryInventories mtlSecondaryInventories = mtlSecondaryInventoriesService.getById(secondaryinventoryName).get();
        return new ResponseEntity<>(mtlSecondaryInventories,HttpStatus.OK);
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
    @DeleteMapping("/{secondaryinventoryName}")
    public ResponseEntity<?>delete(@PathVariable String secondaryinventoryName){
        mtlSecondaryInventoriesService.delete(secondaryinventoryName);
        ResponseObject responseObject = new ResponseObject(true,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }
}
