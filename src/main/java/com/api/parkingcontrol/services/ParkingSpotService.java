package com.api.parkingcontrol.services;

import com.api.parkingcontrol.dtos.ParkingSpotUpdateDto;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import com.api.parkingcontrol.services.exceptions.ObjectNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {

    private final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){
        return parkingSpotRepository.save(parkingSpotModel);
    }

    public Page<ParkingSpotModel> findAll(Pageable pageable) {
        return parkingSpotRepository.findAll(pageable);
    }

    public boolean existByLicensePlateCar(String licensePlateCar){
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public Optional<ParkingSpotModel> findByLicensePlateCar(String licensePlateCar){
        return parkingSpotRepository.findByLicensePlateCar(licensePlateCar);
    }

    public boolean existByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block){
        return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

    public ParkingSpotModel findById(UUID id) {
        Optional<ParkingSpotModel> model = parkingSpotRepository.findById(id);
        if(!model.isPresent()){
            throw new ObjectNotFoundException("ParkingSpotModel id: " + id + ", Tipo: " + ParkingSpotService.class.getName());
        }
        return model.get();
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        parkingSpotRepository.delete(parkingSpotModel);
    }

    @Transactional
    public ParkingSpotModel update(ParkingSpotModel parkingSpotModel, ParkingSpotUpdateDto parkingSpotUpdateDto) {
        parkingSpotModel.setLicensePlateCar(parkingSpotUpdateDto.getLicensePlateCar());
        parkingSpotModel.setBrandCar(parkingSpotUpdateDto.getBrandCar());
        parkingSpotModel.setModelCar(parkingSpotUpdateDto.getModelCar());
        parkingSpotModel.setColorCar(parkingSpotUpdateDto.getColorCar());
        return save(parkingSpotModel);
    }
}
