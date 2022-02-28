package com.api.parkingcontrol.services.validations;

import com.api.parkingcontrol.dtos.ParkingSpotInsertDto;
import com.api.parkingcontrol.services.ParkingSpotService;
import com.api.parkingcontrol.controllers.exceptions.FieldMessage;
import com.api.parkingcontrol.services.validations.annotations.ParkingSpotInsert;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class ParkingSpotInsertValidator implements ConstraintValidator<ParkingSpotInsert, ParkingSpotInsertDto> {

    @Autowired
    private ParkingSpotService parkingSpotService;

    @Override
    public boolean isValid(ParkingSpotInsertDto objDto, ConstraintValidatorContext context) {

        List<FieldMessage> list = new ArrayList<>();

        if(parkingSpotService.existByLicensePlateCar(objDto.getLicensePlateCar())){
           list.add(new FieldMessage("licensePlateCar", "LicensePlateCar já existente"));
        }

        if(parkingSpotService.existByParkingSpotNumber(objDto.getParkingSpotNumber())){
            list.add(new FieldMessage("parkingSpotNumber", "ParkingSpotNumber já existente"));
        }

        if(parkingSpotService.existsByApartmentAndBlock(objDto.getApartment(), objDto.getBlock())){
            list.add(new FieldMessage("apartment", "Já existente vaga para esse apartamento e bloco"));
        }

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
                    .addConstraintViolation();
        }

        return list.isEmpty();
    }
}
