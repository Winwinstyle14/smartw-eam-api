package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.CsiIAssets;
import vhc.smartw.eam.service.CsiIAssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/csiIAssets")
public class CsiIAssetsController {
    @Autowired
    CsiIAssetsService csiIAssetsService;

    //list
    @GetMapping
    public ResponseEntity<List<CsiIAssets>>list(){
        List<CsiIAssets>list = csiIAssetsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //get id
    @GetMapping("/{instanceAssetId}")
    public ResponseEntity<CsiIAssets> getById(@PathVariable Long instanceAssetId){
        CsiIAssets csiIAssets = csiIAssetsService.getById(instanceAssetId).get();
        return new ResponseEntity<>(csiIAssets,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<CsiIAssets>add(@RequestBody CsiIAssets csiIAssets){
        CsiIAssets newCsiIAssets = csiIAssetsService.addCsiIAssets(csiIAssets);
        return new ResponseEntity<>(newCsiIAssets,HttpStatus.OK);
    }
    //update
    @PutMapping
    public ResponseEntity<CsiIAssets>update(@RequestBody CsiIAssets csiIAssets){
        CsiIAssets newCsiIAssets = csiIAssetsService.updateCsiIAssets(csiIAssets);
        return new ResponseEntity<>(newCsiIAssets,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{instanceAssetId}")
    public ResponseEntity<?>delete(@PathVariable Long instanceAssetId){
        if (!csiIAssetsService.existsById(instanceAssetId))
            return new ResponseEntity<>(new ResponseObject(false,null),HttpStatus.NOT_FOUND);
        csiIAssetsService.delete(instanceAssetId);
        return new ResponseEntity<>(new ResponseObject(true,null),HttpStatus.OK);
    }

}
