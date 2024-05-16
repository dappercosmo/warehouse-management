package com.warehouseManagement.warehouseManagement.repository;

import com.warehouseManagement.warehouseManagement.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
