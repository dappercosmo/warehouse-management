package com.warehouseManagement.warehouseManagement.controller;

import com.warehouseManagement.warehouseManagement.impl.WarehouseServiceImpl;
import com.warehouseManagement.warehouseManagement.model.Warehouse;
import com.warehouseManagement.warehouseManagement.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class WarehouseController {
    private @Autowired WarehouseServiceImpl warehouseService;
   /* public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }*/
    @PostMapping("addWarehouse")
    public ResponseEntity<Warehouse> addWarehouse(@RequestBody Warehouse warehouse){
        return warehouseService.addWarehouse(warehouse);
    }
}
