package com.warehouseManagement.warehouseManagement.impl;

import com.warehouseManagement.warehouseManagement.Repository.WarehouseRepository;
import com.warehouseManagement.warehouseManagement.model.Warehouse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WarehouseServiceImpl {
    private final WarehouseRepository warehouseRepository;
    public WarehouseServiceImpl(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    public ResponseEntity<Warehouse> addWarehouse(Warehouse warehouse){
        Warehouse warehouseCreated = new Warehouse();
        warehouseRepository.save(warehouseCreated);
        return ResponseEntity.ok(warehouseCreated);
    }
}
