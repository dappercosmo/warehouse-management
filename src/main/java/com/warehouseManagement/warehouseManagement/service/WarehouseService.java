package com.warehouseManagement.warehouseManagement.service;

import com.warehouseManagement.warehouseManagement.model.Warehouse;
import org.springframework.http.ResponseEntity;

public interface WarehouseService {

    public ResponseEntity<Warehouse> addWarehouse(Warehouse warehouse);
}
