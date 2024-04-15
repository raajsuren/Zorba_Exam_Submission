package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
@Entity
@Table(name = "product")

public class Product_Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer prodTypeId;

    @Column(length = 255)
    private String productType;

    @Column(length = 100)
    private double rate;


}
