package com.warehouseManagement.warehouseManagement.service;

import com.warehouseManagement.warehouseManagement.model.Product;
import org.springframework.http.ResponseEntity;

public interface ProductService {

    public ResponseEntity<Product> addProduct(Long warehouseId,Product product);
}
