package com.warehouseManagement.warehouseManagement.impl;

import com.warehouseManagement.warehouseManagement.repository.ProductRepository;
import com.warehouseManagement.warehouseManagement.repository.WarehouseRepository;
import com.warehouseManagement.warehouseManagement.model.Product;
import com.warehouseManagement.warehouseManagement.model.Warehouse;
import com.warehouseManagement.warehouseManagement.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final WarehouseRepository warehouseRepository;
    public ProductServiceImpl(ProductRepository productRepository, WarehouseRepository warehouseRepository) {
        this.productRepository = productRepository;
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public ResponseEntity<Product> addProduct(Long warehouseId, Product product) {
        Warehouse warehouse = warehouseRepository.findById(warehouseId).orElse(null);
        if(warehouse!=null){
            product.setWarehouse(warehouse);
            Product productCreated = new Product();
            productCreated.setProductName(product.getProductName());
            productCreated.setPrice(product.getPrice());
            productCreated.setProductDescription(product.getProductDescription());
            productCreated.setQuantity(productCreated.getQuantity());
            productRepository.save(product);
            return ResponseEntity.ok(product);
        }
        else {
            return ResponseEntity.notFound().build();
        }

    }
}
