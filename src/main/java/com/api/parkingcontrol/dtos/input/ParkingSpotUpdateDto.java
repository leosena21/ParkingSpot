package com.api.parkingcontrol.dtos.input;

import com.api.parkingcontrol.services.validations.annotations.ParkingSpotUpdate;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@ParkingSpotUpdate
public class ParkingSpotUpdateDto {

    @NotNull(message = "id não pode ser nullo")
    private UUID id;

    @NotBlank(message = "licensePlateCar não pode ser nullo")
    @Size(max = 7, message = "Máximo de 7 caracteres")
    private String licensePlateCar;

    @NotBlank(message = "brandCar não pode ser nullo")
    private String brandCar;

    @NotBlank(message = "modelCar não pode ser nullo")
    private String modelCar;

    @NotBlank(message = "colorCar não pode ser nullo")
    private String colorCar;

}
