package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.MtlLocations;
import vhc.smartw.eam.service.MtlLocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mtlLocations")
public class MtlLocationsController {
    @Autowired
    MtlLocationsService mtlLocationsService;
    //list
    @GetMapping
    public ResponseEntity<List<MtlLocations>> list(){
        List<MtlLocations>list = mtlLocationsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //get id
    @GetMapping("/{locationId}")
    public ResponseEntity<MtlLocations>getById(@PathVariable Long locationId){
        MtlLocations mtlLocations = mtlLocationsService.getById(locationId).get();
        return new ResponseEntity<>(mtlLocations,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MtlLocations>add(@RequestBody MtlLocations mtlLocations){
        MtlLocations newMtlLocations = mtlLocationsService.addMtlLocations(mtlLocations);
        return new ResponseEntity<>(newMtlLocations,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<MtlLocations>update(@RequestBody MtlLocations mtlLocations){
        MtlLocations newMtlLocations  = mtlLocationsService.updateMtlLocations(mtlLocations);
        return new ResponseEntity<>(newMtlLocations,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{locationId}")
    public ResponseEntity<?>delete(@PathVariable Long locationId){
        if (!mtlLocationsService.existsById(locationId))
            return new ResponseEntity<>(new ResponseObject(false,null),HttpStatus.NOT_FOUND);
        mtlLocationsService.delete(locationId);
        return new ResponseEntity<>(new ResponseObject(true,null),HttpStatus.OK);
    }
}
