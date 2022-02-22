package com.api.parkingcontrol.dtos;

import com.api.parkingcontrol.services.validations.annotations.ParkingSpotInsert;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@ParkingSpotInsert
public class ParkingSpotInsertDto {

    @NotBlank(message = "parkingSpotNumber não pode ser nullo")
    private String parkingSpotNumber;

    @NotBlank(message = "licensePlateCar não pode ser nullo")
    @Size(max = 7, message = "Máximo de 7 caracteres")
    private String licensePlateCar;

    @NotBlank(message = "brandCar não pode ser nullo")
    private String brandCar;

    @NotBlank(message = "modelCar não pode ser nullo")
    private String modelCar;

    @NotBlank(message = "colorCar não pode ser nullo")
    private String colorCar;

    @NotBlank(message = "responsibleName não pode ser nullo")
    private String responsibleName;

    @NotBlank(message = "apartment não pode ser nullo")
    private String apartment;

    @NotBlank(message = "block não pode ser nullo")
    private String block;
}
