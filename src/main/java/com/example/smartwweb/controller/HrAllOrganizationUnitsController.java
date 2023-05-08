package com.example.smartwweb.controller;

import com.example.smartwweb.dto.ResponseObject;
import com.example.smartwweb.entity.FndFlexValuesVl;
import com.example.smartwweb.entity.HrAllOrganizationUnits;
import com.example.smartwweb.service.HrAllOrganizationUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hrAllOrganizationUnits")
public class HrAllOrganizationUnitsController {
    @Autowired
    HrAllOrganizationUnitsService hrAllOrganizationUnitsService;

    //list
    @GetMapping
    public ResponseEntity<List<HrAllOrganizationUnits>>list(){
        List<HrAllOrganizationUnits>list = hrAllOrganizationUnitsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //getById
    @GetMapping("/{organizationId}")
    public ResponseEntity<HrAllOrganizationUnits>getById(@PathVariable Long organizationId){
        HrAllOrganizationUnits hrAllOrganizationUnits = hrAllOrganizationUnitsService.getById(organizationId).get();
        return new ResponseEntity<>(hrAllOrganizationUnits,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<HrAllOrganizationUnits>add(@RequestBody HrAllOrganizationUnits hrAllOrganizationUnits){
        HrAllOrganizationUnits newHrAllOrganizationUnits = hrAllOrganizationUnitsService.addHrAllOrganizationUnits(hrAllOrganizationUnits);
        return new ResponseEntity<>(newHrAllOrganizationUnits,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<HrAllOrganizationUnits>update(@RequestBody HrAllOrganizationUnits hrAllOrganizationUnits){
        HrAllOrganizationUnits newAllOrganizationUnits = hrAllOrganizationUnitsService.updateHrAllOrganizationUnits(hrAllOrganizationUnits);
        return new ResponseEntity<>(newAllOrganizationUnits,HttpStatus.OK);
    }
    @DeleteMapping("/{organizationId}")
    public ResponseEntity<ResponseObject>delete(@PathVariable Long organizationId){
        Boolean test = hrAllOrganizationUnitsService.delete(organizationId);
        ResponseObject responseObject = new ResponseObject(test,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }
}
