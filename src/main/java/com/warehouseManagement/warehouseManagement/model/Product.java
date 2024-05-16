package com.warehouseManagement.warehouseManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private String price;
    private int quantity;
    private String productDescription;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

}
