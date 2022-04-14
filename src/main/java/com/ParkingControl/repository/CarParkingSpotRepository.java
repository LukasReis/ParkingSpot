package com.ParkingControl.repository;

import com.ParkingControl.model.CarParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarParkingSpotRepository extends JpaRepository<CarParkingSpot, UUID> {
    boolean existsByLicensePlateCar(String LicensePlateCar);
}
