package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "BusInfo")
@Data
public class BusInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="bus_id")
    private int busId;

    @Column(name = "bus_type", length = 50)
    private String busType;

    @Column(name = "bus_service_provider", length = 255)
    private String busServiceProvider;

    @Column(name = "no_of_seat")
    private int noOfSeat;



}
