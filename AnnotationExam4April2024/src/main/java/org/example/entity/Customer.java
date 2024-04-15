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
@Table(name = "customer")
public class Customer {

    @Id
    private String custId;

    @Column(length = 100)
    private String custName;

    @Column(length =100)
    private String custEmail;

    @Column(length = 10)
    private Long custMobile;

    @Column(length = 100)
    private double finalProductPrice;


}
