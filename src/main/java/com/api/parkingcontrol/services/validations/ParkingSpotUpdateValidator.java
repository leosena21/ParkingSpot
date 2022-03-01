package com.api.parkingcontrol.services.validations;

import com.api.parkingcontrol.dtos.input.ParkingSpotUpdateDto;
import com.api.parkingcontrol.services.ParkingSpotService;
import com.api.parkingcontrol.controllers.exceptions.FieldMessage;
import com.api.parkingcontrol.services.validations.annotations.ParkingSpotUpdate;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class ParkingSpotUpdateValidator implements ConstraintValidator<ParkingSpotUpdate, ParkingSpotUpdateDto> {

    @Autowired
    private ParkingSpotService parkingSpotService;

    @Override
    public boolean isValid(ParkingSpotUpdateDto objDto, ConstraintValidatorContext context) {

        List<FieldMessage> list = new ArrayList<>();
        parkingSpotService.findByLicensePlateCar(objDto.getLicensePlateCar()).
                ifPresent(parking -> {
                    if(!parking.getId().equals(objDto.getId())){
                        list.add(new FieldMessage("licensePlateCar", "LicensePlateCar já existente"));
                    }
                });

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
                    .addConstraintViolation();
        }

        return list.isEmpty();
    }
}
