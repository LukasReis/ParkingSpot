package com.ParkingControl.service;

import com.ParkingControl.model.ParkingSpotModel;
import com.ParkingControl.repository.CarParkingSpotRepository;
import com.ParkingControl.repository.ParkingSpotRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ParkingSpotService {

    final ParkingSpotRepository parkingSpotRepository;
    final CarParkingSpotRepository carParkingSpotRepository;

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){
        return parkingSpotRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licenseSpotPlateCar ){
        return carParkingSpotRepository.existsByLicensePlateCar(licenseSpotPlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

    public List<ParkingSpotModel>  findAll(){
        return parkingSpotRepository.findAll();
    }

    public Optional<ParkingSpotModel> findById(UUID id){
        return parkingSpotRepository.findById(id);
    }

    @Transactional
    public void deleted(ParkingSpotModel parkingSpotModel){
        parkingSpotRepository.delete(parkingSpotModel);

    }

}
