package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.MtlItemLocations;
import vhc.smartw.eam.service.MtlItemLocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mtlItemLocations")
public class MtlItemLocationsController {
    @Autowired
    MtlItemLocationsService mtlItemLocationsService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlItemLocations>>list(){
        List<MtlItemLocations>list = mtlItemLocationsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //getById
    @GetMapping("/{inventoryLocationId}")
    public ResponseEntity<MtlItemLocations>getById(@PathVariable Long inventoryLocationId){
        MtlItemLocations mtlItemLocations = mtlItemLocationsService.getById(inventoryLocationId).get();
        return new ResponseEntity<>(mtlItemLocations,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MtlItemLocations>add(@RequestBody MtlItemLocations mtlItemLocations){
        MtlItemLocations newMtlItemLocations = mtlItemLocationsService.addMtlItemLocations(mtlItemLocations);
        return new ResponseEntity<>(newMtlItemLocations,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<MtlItemLocations>update(@RequestBody MtlItemLocations mtlItemLocations){
        MtlItemLocations newMtlItemLocations = mtlItemLocationsService.updateMtlItemLocations(mtlItemLocations);
        return new ResponseEntity<>(newMtlItemLocations,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{inventoryLocationId}")
    public ResponseEntity<ResponseObject>delete(@PathVariable Long inventoryLocationId){
        Boolean test = mtlItemLocationsService.delete(inventoryLocationId);
        ResponseObject responseObject = new ResponseObject(test,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }
}
