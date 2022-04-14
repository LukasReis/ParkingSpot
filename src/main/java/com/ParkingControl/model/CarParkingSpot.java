package com.ParkingControl.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "CAR_PARKING_SPOT")
public class CarParkingSpot implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 70)
    private String licensePlateCar;

    @Column(nullable = false, unique = true, length = 70)
    private String brandCar;

    @Column(nullable = false, unique = true, length = 70)
    private String modelCar;

    @Column(nullable = false, unique = true, length = 70)
    private String colorCar;


}
