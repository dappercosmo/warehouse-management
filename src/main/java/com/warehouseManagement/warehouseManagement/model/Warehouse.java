package com.warehouseManagement.warehouseManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long warehouseId;
    private String warehouseName;

    @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL)
    private Set<Product> products;
}
