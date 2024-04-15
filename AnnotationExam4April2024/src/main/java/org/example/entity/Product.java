package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name= "product")

public class Product {
    @Id
    private String productId;

    @Column(length = 255)
    private String productName;

    @Column(length = 255)
    private double productQuantity;

    @Column(length = 255)
    private String custId;

    @Column(length = 255)
    private Integer prod_type_id;

}
