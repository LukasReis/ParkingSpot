package com.ParkingControl.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 7)
    private String parkingSpotNumber;

    @OneToOne
    private CarParkingSpot carParkingSpot;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Column(nullable = false, unique = true, length = 130)
    private String responsibleName;

    @Column(nullable = false, unique = true, length = 30)
    private String apartment;

    @Column(nullable = false, unique = true, length = 30)
    private String block;

}
